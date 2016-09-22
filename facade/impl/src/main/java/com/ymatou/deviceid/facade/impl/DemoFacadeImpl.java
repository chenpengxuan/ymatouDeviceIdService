/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.ymatou.deviceid.facade.DemoFacade;

/**
 * @author luoshiqian 2016/8/31 14:13
 */
@Service(protocol = "dubbo")
@Component
public class DemoFacadeImpl implements DemoFacade {

    @Override
    public String sayHello(String name) {
        return "hello world:"+name;
    }
}
