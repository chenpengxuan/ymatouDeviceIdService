/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.rest;

import javax.ws.rs.*;

import com.ymatou.deviceid.infrastructure.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.ymatou.deviceid.facade.DemoFacade;

import java.util.concurrent.TimeUnit;


@Component("demoResource")
@Service(protocol = "rest")
@Produces({"application/json; charset=UTF-8"})
@Path("/{api:(?i:api)}")
public class DemoResourceImpl implements DemoResource {

    public static final Logger logger = LoggerFactory.getLogger(DemoResourceImpl.class);

    @Autowired
    private DemoFacade demoFacade;


    @GET
    @Path("/{sayHello:(?i:sayHello)}")
    @Override
    public String sayHello(@QueryParam("name") String name) {
        return demoFacade.sayHello(name);
    }

    @GET
    @Path("/{testShutdownGracefully:(?i:testShutdownGracefully)}")
    @Override
    public String testShutdownGracefully() {

        logger.info("------------test begin start sleep 5 seconds -----------------");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            logger.info("eception:",e);
        }

        logger.info("------------end test request success -----------------");
        return null;
    }

    @POST
    @Path("/{shutdown:(?i:shutdown)}")
    @Override
    public String shutdown() {
        Constants.ctx.close();
        return Constants.shutdownLatch.shutdown();
    }
}
