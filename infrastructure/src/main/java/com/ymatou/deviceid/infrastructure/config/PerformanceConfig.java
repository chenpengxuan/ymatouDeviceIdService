package com.ymatou.deviceid.infrastructure.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.org.eclipse.jdt.internal.compiler.batch.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ymatou.performancemonitorclient.PerformanceMonitorAdvice;
import org.springframework.context.annotation.DependsOn;

/**
 * 性能监控配置
 *
 * @author luoshiqian
 *
 */
@Aspect
@Configuration
@DependsOn("disconfMgrBean2")
public class PerformanceConfig {

    public static final Logger logger = LoggerFactory.getLogger(PerformanceConfig.class);
    @Value("${appId}")
    private String appId;

    @Value("${performance.server.url}")
    private String performanceUrl;


    @Bean(name = "performanceMonitorAdvice")
    public PerformanceMonitorAdvice performanceMonitorAdvice(){
        logger.info("create PerformanceMonitorAdvice,appId:"+appId+",performanceUrl:"+performanceUrl);
        PerformanceMonitorAdvice performanceMonitorAdvice = new PerformanceMonitorAdvice();
        performanceMonitorAdvice.setAppId(appId);
        performanceMonitorAdvice.setServerUrl(performanceUrl);
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
