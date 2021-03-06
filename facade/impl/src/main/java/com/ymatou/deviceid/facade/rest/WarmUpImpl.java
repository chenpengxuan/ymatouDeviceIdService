package com.ymatou.deviceid.facade.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.ymatou.deviceid.infrastructure.util.NetUtil;

/**
 * Created by liangzhonghua on 2016/9/26.
 */
@Component("warmUp")
@Service(protocol = "rest")
@Produces({"application/json"})
@Path("/")
public class WarmUpImpl implements WarmUp {

    @Override
    @GET
    @Path("/version")
    public String version() {
        return "{"
                + "\"port\":9900,"
                + "\"ip\":\"" + NetUtil.getHostIp() + "\","
                + "\"1.0.0\":\"2016-09-30.1 created\","
                + "\"1.0.1\":\"2016-10-09.1 get method add param type\","
                + "\"1.0.2\":\"2016-10-09.3 add update method\","
                + "\"1.0.3\":\"2016-10-21.1 add getFirst method\","
                + "\"1.0.4\":\"2016-10-22.1 turn getFirst method when did=00000000-0000-0000-0000-000000000000\","
                + "\"1.0.5\":\"2016-11-02.1 add updateTime\","
                + "\"1.0.6\":\"2016-11-07.2 add getList\","
                + "\"1.0.7\":\"2016-11-09.1 set signVerified ok before 2016-11-01\","
                + "\"1.0.8\":\"2016-11-16.3 modify updateDeviceId api when deviceid exist and userid not equals req\","
                + "\"1.0.9\":\"2016-12-02.1 modify save api ensure idempotent\","
                + "\"1.0.10\":\"2017-02-21.1 add getUserIdList api\","
                + "\"1.0.11\":\"2017-03-06.1 change dubbo serialization to hession\","
                + "\"1.0.12\":\"2017-05-22.1 api get compatible Upper deviceId\""
                + "}";
    }

    @Override
    @GET
    @Path("/warmup")
    public String warmup() {
        return "ok";
    }
}
