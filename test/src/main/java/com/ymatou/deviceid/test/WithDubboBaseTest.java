/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.*;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author luoshiqian 2016/8/30 19:17
 */
@ImportResource("classpath:spring/dubbo-provider.xml")
@RunWith(SpringTestRunner.class)
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.ymatou",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WithoutDubboBaseTest.class),
}
)
@ContextConfiguration(classes = WithDubboBaseTest.class)
public class WithDubboBaseTest extends BaseTest {

//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("deviceid");
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("zookeeper://172.16.101.126:2181");
//        return registryConfig;
//    }
//
//    @Bean(name = "dubboProtocol")
//    public ProtocolConfig dubboProtocolConfig(){
//        ProtocolConfig protocol = new ProtocolConfig();
//        protocol.setName("dubbo");
//        protocol.setPort(28080);
//        protocol.setThreads(10);
//        return protocol;
//    }
//
//    @Bean(name = "restProtocol")
//    public ProtocolConfig restProtocolConfig(){
//        ProtocolConfig protocol = new ProtocolConfig();
//        protocol.setServer("tomcat");
//        protocol.setName("rest");
//        protocol.setPort(8080);
//        protocol.setThreads(10);
//        return protocol;
//    }
//
//    @Bean
//    public AnnotationBean annotationBean() {
//        AnnotationBean annotationBean = new AnnotationBean();
//        annotationBean.setPackage("com.ymatou.deviceid.facade.impl");
//        return annotationBean;
//    }

    @Test
    public void testStartable() throws Exception {

//        System.in.read();
    }
}
