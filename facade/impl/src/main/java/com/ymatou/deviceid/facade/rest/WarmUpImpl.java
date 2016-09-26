package com.ymatou.deviceid.facade.rest;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

/**
 * Created by liangzhonghua on 2016/9/26.
 */
@Component("warmUp")
@Service(protocol = "rest")
@Produces({"application/json"})
@Path("/")
public class WarmUpImpl implements  WarmUp {

    @Override
    @GET
    @Path("/version")
    public String version() {
        return "created 1.0";
    }

    @Override
    @GET
    @Path("/warmup")
    public String warmup() {
        return "ok";
    }
}
