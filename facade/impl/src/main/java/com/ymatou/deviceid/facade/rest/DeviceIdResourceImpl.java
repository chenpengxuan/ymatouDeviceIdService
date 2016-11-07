package com.ymatou.deviceid.facade.rest;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.req.UpdateDeviceIdReq;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoSimple;
import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.infrastructure.config.BizConfig;
import com.ymatou.deviceid.repository.DeviceIdRepository;


/**
 * Created by liangzhonghua on 2016/9/22.
 */
@Component("deviceIdResource")
@Service(protocol = "rest")
@Produces({"application/json"})
@Path("/")
public class DeviceIdResourceImpl implements DeviceIdResource {
    public static final Logger logger = LoggerFactory.getLogger(DeviceIdResourceImpl.class);

    @Autowired
    private DeviceIdRepository deviceIdRepository;
    @Autowired
    private BizConfig bizConfig;

    private final int MD5VerifiedUnknow = 1;
    private final int MD5VerifiedOK = 2;
    private final int MD5VerfiedFail = 3;

    // 取出最新的DeviceId
    private final int BY_ACTIVETIME_DESC = 1;

    @POST
    @Path("/save")
    @Consumes("application/json")
    @Override
    public BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap) {
        logger.info("activedeviceid:" + PrintFriendliness.toJson(dataMap));

        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        String deviceId = null;
        try {
            deviceId = (String) dataMap.get("deviceid");

            int verified = verifyMD5(dataMap);
            logger.info(deviceId + ",md5verfied:" + verified);
            dataMap.put("signVerified", verified);
            dataMap.put("activeTime", new Date());
            dataMap.put("updateTime", new Date());

            deviceIdRepository.insert(dataMap);
            response.setBcode(0);
            response.setCode(0);
            response.setMsg("saved ok");
            logger.info("save deviceid ok:" + deviceId);
        } catch (Exception e) {
            logger.error("activedeviceid exception:" + deviceId + "," + e.getMessage(), e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        return response;
    }

    private String getEntryValue(HashMap<String, Object> map, String key) {
        return map.containsKey(key) ? (String) map.get(key) : "";

    }


    private int verifyMD5(HashMap<String, Object> map) {

        if (map.containsKey("signVerified")) {

            // 如果传入了签名结果，以传入的为准
            int md5Sign = (int) map.get("signVerified");
            if (md5Sign == MD5VerifiedOK || md5Sign == MD5VerfiedFail || md5Sign == MD5VerifiedUnknow)
                return md5Sign;
        }

        // 如果没传，老接口数据
        String sign = getEntryValue(map, "sign");
        if (org.springframework.util.StringUtils.isEmpty(sign))
            return MD5VerifiedUnknow;


        StringBuilder sb = new StringBuilder();
        sb.append(getEntryValue(map, "appkey"));
        sb.append(getEntryValue(map, "appversion"));
        sb.append(getEntryValue(map, "deviceid"));
        sb.append(getEntryValue(map, "acceptversion"));
        sb.append(getEntryValue(map, "timestamp"));


        char[] array = sb.toString().toCharArray();
        Arrays.sort(array);

        logger.info("signString:" + String.valueOf(array));
        String signString = String.valueOf(array).concat(bizConfig.getMd5key());

        String md5 = DigestUtils.md5Hex(signString);
        return md5.equalsIgnoreCase(sign) ? MD5VerifiedOK : MD5VerfiedFail;

        // ["app-key", "app-version", "deviceid", "accept-version", "timestamp"]


    }

    @GET
    @Path("/get")
    @Consumes("*/*")
    @Override
    public BaseNetCompatibleResp get(@QueryParam("deviceId") String deviceId, @QueryParam("type") int type) {
        logger.info("getdeviceId:" + deviceId + ", type:" + type);
        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if (StringUtils.isEmpty(deviceId)) {
            response.setCode(100);
            response.setMsg("参数不能为空");

            return response;
        }

        try {
            DeviceInfo deviceInfo = deviceIdRepository.getDeviceInfo(deviceId, type);

            if (deviceInfo == null) {
                response.setCode(102);
                response.setMsg(deviceId + "  not exists");
            } else {
                DeviceInfoResp resp = new DeviceInfoResp();
                resp.setActiveTime(deviceInfo.getActiveTime());
                resp.setUserId(deviceInfo.getUserid());
                resp.setSignVerified(deviceInfo.getSignVerified());
                resp.setOsversion(deviceInfo.getOsversion());
                resp.setClienttype(deviceInfo.getClienttype());

                response.setData(resp);
                response.setMsg(deviceId + " exists");
            }
        } catch (Exception e) {

            logger.error("getdeviceid exception:" + deviceId + "," + e.getMessage(), e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        logger.info("getdeviceId:" + deviceId + " resp:" + response.toString());
        return response;
    }

    @GET
    @Path("/getList")
    @Consumes("*/*")
    @Override
    public BaseNetCompatibleResp getList(@QueryParam("userid") int userid, @QueryParam("type") int type,
            @QueryParam("limit") int limit) {

        long startTime = System.currentTimeMillis();
        logger.info("getList userid:{}, type:{}, limit:{}.", userid, type, limit);

        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if (userid <= 0) {
            response.setCode(100);
            response.setMsg("userid必须大于零");

            return response;
        }

        if (type != 0 && type != 1) {
            response.setCode(100);
            response.setMsg("type必须是0或者1");

            return response;
        }

        if (limit < 1 || limit > 20) {
            response.setCode(100);
            response.setMsg("limit必须是1到20之间的数");

            return response;
        }


        try {
            List<DeviceInfo> deviceInfoList = deviceIdRepository.getDeviceInfoList(userid, type, limit);

            if (deviceInfoList == null || deviceInfoList.isEmpty()) {
                response.setCode(102);
                response.setMsg(userid + " not exists");
            } else {

                List<DeviceInfoSimple> lstDeviceInfo = new ArrayList<DeviceInfoSimple>();
                for (DeviceInfo deviceInfo : deviceInfoList) {
                    DeviceInfoSimple resp = new DeviceInfoSimple();
                    resp.setDeviceid(deviceInfo.getDeviceid());
                    resp.setDid(deviceInfo.getDid());
                    resp.setActiveTime(deviceInfo.getActiveTime());
                    resp.setSignVerified(deviceInfo.getSignVerified());

                    lstDeviceInfo.add(resp);
                }

                response.setData(lstDeviceInfo);
                response.setMsg(userid + " exists");
            }
        } catch (Exception e) {

            logger.error("getList deviceid exception:" + userid + "," + e.getMessage(), e);
            response.setCode(101);
            response.setMsg(e.getMessage());
        }

        long consumedTime = System.currentTimeMillis() - startTime;
        logger.info("getList userid:{}, consume:{}ms.", userid, consumedTime);
        return response;
    }

    @GET
    @Path("/getFirst")
    @Consumes("*/*")
    @Override
    public BaseNetCompatibleResp getFirst(@QueryParam("deviceId") String deviceId, @QueryParam("did") String did) {
        logger.info("getFirst deviceId:" + deviceId + ", did:" + did);
        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if (StringUtils.isEmpty(deviceId)) {
            response.setCode(100);
            response.setMsg("参数不能为空");

            return response;
        }

        if (StringUtils.isEmpty(did)) {
            response.setCode(100);
            response.setMsg("参数不能为空");

            return response;
        }

        try {
            DeviceInfo deviceInfo = deviceIdRepository.getFirstDeviceInfo(deviceId, did);

            if (deviceInfo == null) {
                response.setCode(102);
                response.setMsg(deviceId + " or " + did + "  not exists");
            } else {
                DeviceInfoResp resp = new DeviceInfoResp();
                resp.setActiveTime(deviceInfo.getActiveTime());
                resp.setUserId(deviceInfo.getUserid());
                resp.setSignVerified(deviceInfo.getSignVerified());
                resp.setOsversion(deviceInfo.getOsversion());
                resp.setClienttype(deviceInfo.getClienttype());

                response.setData(resp);
                response.setMsg(deviceId + " or " + did + " exists");
            }
        } catch (Exception e) {

            logger.error("getFirst deviceid exception:" + deviceId + ", did:" + did + "," + e.getMessage(), e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        logger.info("getFirst deviceid:" + deviceId + ", did:" + did + " resp:" + response.toString());
        return response;
    }

    @POST
    @Path("/update")
    @Consumes("application/json")
    @Override
    public BaseNetCompatibleResp updateDeviceId(UpdateDeviceIdReq req) {
        logger.info("updateDeviceId:" + PrintFriendliness.toJson(req));

        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if (StringUtils.isEmpty(req.getDeviceid())) {
            response.setCode(100);
            response.setMsg("DeviceId不能为空.");
            return response;
        }

        try {
            DeviceInfo deviceInfo = deviceIdRepository.getDeviceInfo(req.getDeviceid(), BY_ACTIVETIME_DESC);

            if (deviceInfo == null) {
                logger.info("deviceId:{} not found, gen new deviceId.", req.getDeviceid());
                genDeviceId(req, deviceInfo);

            } else if (deviceInfo.getUserid() > 0 && deviceInfo.getUserid() == req.getUserid()) {
                logger.info("deviceId:{} allready have userid, do nothing.", req.getDeviceid());

            } else if (deviceInfo.getUserid() > 0 && deviceInfo.getUserid() != req.getUserid()) {
                logger.info("deviceId:{} allready have userid, and not equal to req.Userid, gen new deviceId.",
                        req.getDeviceid());
                genDeviceId(req, deviceInfo);

            } else if (deviceInfo.getUserid() <= 0) {
                logger.info("deviceId:{} have not userid, update userid.", req.getDeviceid());
                deviceInfo.setUserid(req.getUserid());
                deviceInfo.setUpdateTime(new Date());
                deviceIdRepository.save(deviceInfo);
            }
            response.setBcode(0);
            response.setCode(0);

        } catch (Exception e) {
            logger.error(String.format("update deviceid:%s failed.", req.getDeviceid()), e);
            response.setCode(101);
            response.setMsg(String.format("update deviceid:%s failed.", req.getDeviceid()));
        }
        return response;
    }

    /**
     * 生成DeviceId信息
     * 
     * @param req
     */
    private void genDeviceId(UpdateDeviceIdReq req, DeviceInfo oldDeviceInfo) {
        DeviceInfo deviceInfo = new DeviceInfo();
        if (oldDeviceInfo != null) {
            deviceInfo = oldDeviceInfo;
            deviceInfo.setId(null);
        }

        deviceInfo.setDeviceid(req.getDeviceid());
        deviceInfo.setDid(req.getDid());
        deviceInfo.setUserid(req.getUserid());
        deviceInfo.setActiveTime(new Date());
        deviceInfo.setUpdateTime(new Date());
        deviceInfo.setSignVerified(MD5VerifiedUnknow);

        deviceIdRepository.save(deviceInfo);
    }
}
