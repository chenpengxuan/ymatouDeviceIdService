/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ymatou.deviceid.infrastructure.constants.Constants;


/**
 * @author luoshiqian 2016/8/31 12:31
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.ymatou")
public class Application {
    public static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
         Constants.ctx = new AnnotationConfigApplicationContext(Application.class);

        try {
            Constants.shutdownLatch.await();
        } catch (Exception e) {
            logger.warn("shut down ", e);
        }
    }
}
