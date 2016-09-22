/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */
package com.ymatou.deviceid.test;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

/**
 * 必须保证始终都通过的用例
 * 
 * @author tuwenjie 2016年5月25日 下午2:33:03
 *
 */
@RunWith(WildcardPatternSuite.class)
@SuiteClasses({"**/*Test.class",
        "!WithDubboConsumerBaseTest.class",
        "!WithDubboProviderBaseTest.class",
        "!**/*RestClientTest.class",
})
public class GuardTestSuite {

}
