/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */
package com.ymatou.deviceid.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tuwenjie 2016年5月12日 上午11:41:32
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ImportResource("classpath:spring/without_dubbo-provider.xml")
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.ymatou",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WithDubboBaseTest.class),
})
@ContextConfiguration(classes = WithoutDubboBaseTest.class)
public class WithoutDubboBaseTest extends BaseTest {

    @Test
    public void testStartable() throws Exception {

       // System.in.read();
    }

}
