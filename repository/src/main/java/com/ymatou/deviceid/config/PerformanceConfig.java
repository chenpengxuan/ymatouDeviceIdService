/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ymatou.performancemonitorclient.PerformanceMonitorAdvice;

/**
 * 性能监控配置
 * 
 * @author luoshiqian
 *
 */
@Aspect
@Configuration
public class PerformanceConfig {

    @Bean(name = "performanceMonitorAdvice")
    public PerformanceMonitorAdvice performanceMonitorAdvice(){
        PerformanceMonitorAdvice performanceMonitorAdvice = new PerformanceMonitorAdvice();
        performanceMonitorAdvice.setAppId("deviceid");
        performanceMonitorAdvice.setServerUrl("http://172.16.100.13:8089/api/perfmon");
        return performanceMonitorAdvice;
    }

    @Bean(name = "performancePointcut")
    public AspectJExpressionPointcut aspectJExpressionPointcut(){
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();

        aspectJExpressionPointcut.setExpression(
                "execution(* com.ymatou.deviceid.facade.*Facade.*(..))"+
                "|| execution(* com.ymatou.deviceid.facade.rest.*Resource.*(..))"+
                "|| execution(* com.ymatou.deviceid.infrastructure.db.mapper.*Mapper.*(..))"+
                "|| execution(* com.ymatou.deviceid.infrastructure.db.query.*Query.*(..))"+
                "|| execution(* com.ymatou.deviceid..*Repository.*(..))"
        );

        return aspectJExpressionPointcut;
    }


    /**
     * 对应xml
     *  <aop:config>
     *    <aop:advisor advice-ref="performanceMonitorAdvice"
     *        pointcut-ref="performancePointcut" />
     *   </aop:config>
     * @return
     */
    @Bean
    public Advisor performanceMonitorAdvisor(){
        return new DefaultPointcutAdvisor(aspectJExpressionPointcut(),performanceMonitorAdvice());
    }

}
