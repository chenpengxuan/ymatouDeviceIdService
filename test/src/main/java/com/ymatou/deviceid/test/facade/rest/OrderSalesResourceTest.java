/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */
package com.ymatou.deviceid.test.facade.rest;


import com.google.common.collect.Maps;
import com.ymatou.deviceid.infrastructure.util.HttpClientUtil;
import com.ymatou.deviceid.test.TestConstants;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


/**
 * @author luoshiqian 2016/9/1 17:42
 *
 */
public class OrderSalesResourceTest {


    @Test
    public void getSellerSalesInfo() throws Exception {

        Map<String,String> map = Maps.newHashMap();
        map.put("SellerId","288484");

        String str = HttpClientUtil.requestGet(TestConstants.domain + "/api/app/GetSellerSalesInfoV2", map);

        Assert.assertNotNull(str);
        System.out.println(str);

    }

    @Test
    public void getSellerSalesDetail() throws Exception {

        Map<String,String> map = Maps.newHashMap();
        map.put("SellerId","288484");

        String str = HttpClientUtil.requestGet(TestConstants.domain + "/api/app/GetSellerSalesDetailV2", map);

        Assert.assertNotNull(str);
        System.out.println(str);

    }
}
