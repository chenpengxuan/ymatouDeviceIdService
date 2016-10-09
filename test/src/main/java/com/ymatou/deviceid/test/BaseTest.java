/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 * All rights reserved.
 *
 */

package com.ymatou.deviceid.test;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author tuwenjie
 *
 */
@ImportResource("classpath:spring/dubbo-provider.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.ymatou", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BaseTest.class),
})
@ContextConfiguration(classes = BaseTest.class)
public class BaseTest {

    protected void println(Object obj) {
        System.out.println(obj);
    }

}
