/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */
package com.ymatou.deviceid.test.facade.rest;


import org.junit.Assert;
import org.junit.Test;

import com.ymatou.deviceid.infrastructure.util.HttpClientUtil;
import com.ymatou.deviceid.test.TestConstants;


/**
 * @author luoshiqian 2016/9/1 17:42
 *
 */
public class RefundBillResourceTest {


    @Test
    public void getRefundBillAndProductInfos() throws Exception {

        String str = HttpClientUtil.requestPostJsonStr(TestConstants.domain + "/api/OrderQuery/GetRefundBill",
                "{\"refundBillNo\":\"TK105913829\"}");

        Assert.assertNotNull(str);
        System.out.println(str);

    }
}
