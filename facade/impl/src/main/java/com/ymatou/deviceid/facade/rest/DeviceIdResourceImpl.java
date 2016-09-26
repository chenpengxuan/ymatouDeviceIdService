package com.ymatou.deviceid.facade.rest;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.infrastructure.config.BizConfig;
import com.ymatou.deviceid.repository.DeviceIdRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;


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

    private final int MD5VerifiedUnknow=1;
    private final int MD5VerifiedOK=2;
    private final int MD5VerfiedFail=3;

    @POST
    @Path("/save")
    @Consumes("application/json")
    @Override
    public BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap) {
        logger.info("activedeviceid:"+ PrintFriendliness.toJson(dataMap));

        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        String deviceId = null;
        try {
            deviceId = (String)dataMap.get("deviceid");

            int verified = verifyMD5(dataMap);
            logger.info(deviceId+",md5verfied:"+verified);
            dataMap.put("signVerified",verified);
            dataMap.put("activeTime",new Date());

            deviceIdRepository.save(dataMap);
            response.setBcode(0);
            response.setCode(0);
            response.setMsg("saved ok");
            logger.info("save deviceid ok:"+deviceId);
        }catch(Exception e)
        {
            logger.error("activedeviceid exception:"+deviceId+","+e.getMessage(),e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        return response;
    }

    private String getEntryValue(HashMap<String,Object> map,String key)
    {
       return  map.containsKey(key)?(String) map.get(key):"";

    }


    private int verifyMD5(HashMap<String,Object> map)
    {

        if(map.containsKey("signVerified")) {

            //如果传入了签名结果，以传入的为准
            int md5Sign = (int) map.get("signVerified");
            if (md5Sign== MD5VerifiedOK || md5Sign == MD5VerfiedFail || md5Sign == MD5VerifiedUnknow)
                return md5Sign;
        }

        //如果没传，老接口数据
        String sign = getEntryValue(map,"sign");
        if(org.springframework.util.StringUtils.isEmpty(sign)) return MD5VerifiedUnknow;


        StringBuilder sb =new StringBuilder();
        sb.append(getEntryValue(map,"appkey"));
        sb.append(getEntryValue(map,"appversion"));
        sb.append(getEntryValue(map,"deviceid"));
        sb.append(getEntryValue(map,"acceptversion"));
        sb.append(getEntryValue(map,"timestamp"));


        char[] array = sb.toString().toCharArray();
        Arrays.sort(array);

        logger.info("signString:"+String.valueOf(array));
        String signString = String.valueOf(array).concat(bizConfig.getMd5key());

        String md5 = DigestUtils.md5Hex(signString);
        return md5.equalsIgnoreCase(sign)?MD5VerifiedOK:MD5VerfiedFail;

        //["app-key", "app-version", "deviceid", "accept-version", "timestamp"]


    }

    @GET
    @Path("/get")
    @Consumes("*/*")
    @Override
    public BaseNetCompatibleResp get(@QueryParam("deviceId") String deviceId) {
        logger.info("getdeviceId:"+deviceId);
        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if(StringUtils.isEmpty(deviceId)){
            response.setCode(100);
            response.setMsg("参数不能为空");

            return response;
        }

        try {
            DeviceInfo deviceInfo= deviceIdRepository.getDeviceInfo(deviceId);

            if(deviceInfo==null)
            {
                response.setCode(102);
                response.setMsg(deviceId+"  not exists");
            }
            else
            {
                DeviceInfoResp resp = new DeviceInfoResp();
                resp.setActiveTime(deviceInfo.getActiveTime());
                resp.setUserId(deviceInfo.getUserid());
                resp.setSignVerified(deviceInfo.getSignVerified());

                response.setData(resp);
                response.setMsg(deviceId+" exists");
            }
       }catch(Exception e)
        {

            logger.error("getdeviceid exception:"+deviceId+","+e.getMessage(),e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        logger.info("getdeviceId:"+deviceId+" resp:"+response.toString());
        return response;
    }
}
