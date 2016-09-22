package com.ymatou.deviceid.facade.rest;

import com.alibaba.dubbo.config.annotation.Service;
import com.ymatou.deviceid.repository.DeviceIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
@Component("deviceIdResource")
@Service(protocol = "rest")
@Produces({"application/json; charset=UTF-8"})
@Consumes({"application/json; charset=UTF-8"})
@Path("/")
public class DeviceIdResourceImpl implements DeviceIdResource {

    @Autowired
    private DeviceIdRepository deviceIdRepository;

    @POST
    @Path("/save")
    @Override
    public BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap) {
        BaseNetCompatibleResp respnose = new BaseNetCompatibleResp();

        try {
            deviceIdRepository.save(dataMap);
            respnose.setBcode(0);
            respnose.setMsg("saved ok");

        }catch(Exception e)
        {


            respnose.setBcode(101);
            respnose.setMsg(e.getMessage());

        }

        return respnose;
    }
}
