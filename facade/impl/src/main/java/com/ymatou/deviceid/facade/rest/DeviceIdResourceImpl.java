package com.ymatou.deviceid.facade.rest;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.repository.DeviceIdRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
@Component("deviceIdResource")
@Service(protocol = "rest")
@Produces({"application/json; charset=UTF-8"})
@Path("/")
public class DeviceIdResourceImpl implements DeviceIdResource {
    public static final Logger logger = LoggerFactory.getLogger(DeviceIdResourceImpl.class);

    @Autowired
    private DeviceIdRepository deviceIdRepository;

    @POST
    @Path("/save")
    @Consumes("application/json")
    @Override
    public BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap) {
        logger.info("activedeviceid:"+ PrintFriendliness.toJson(dataMap));

        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        String deviceId = (String)dataMap.get("deviceid");
        try {
            dataMap.put("activeTime",new Date());
            dataMap.put("signVerified",true);
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



    @GET
    @Path("/get")
    @Consumes("*/*")
    @Override
    public BaseNetCompatibleResp get(@QueryParam("deviceId") String deviceId) {
        logger.info("getdeviceId:"+deviceId);
        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if(StringUtils.isEmpty(deviceId))
        {
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
                resp.setSignVerified(deviceInfo.isSignVerified());

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
