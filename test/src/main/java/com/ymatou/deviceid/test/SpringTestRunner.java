/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.test;

import mockit.internal.startup.Startup;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author luoshiqian 2016/6/14 17:42
 */
public class SpringTestRunner extends SpringJUnit4ClassRunner {

    static {

        Startup.initializeIfPossible();
    }

    public SpringTestRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

}
