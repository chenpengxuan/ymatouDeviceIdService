/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */
package com.ymatou.deviceid.test.facade.rest;


import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ymatou.deviceid.facade.model.vo.KeyValue;
import com.ymatou.deviceid.infrastructure.util.HttpClientUtil;
import com.ymatou.deviceid.test.TestConstants;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;


/**
 * @author luoshiqian 2016/9/1 17:42
 *
 */
public class OrderResourceTest {

    @Test
    public void getLatestPaidOrderInfo()throws Exception {

        String str = HttpClientUtil.requestPostJsonStr(TestConstants.domain+"/api/app/GetLatestPaidOrders","{\"pageSize\":20}");
        System.out.println(str);
    }

    @Test
    public void getOrderFundInfo()throws Exception {

        String str = HttpClientUtil.requestPostJsonStr(TestConstants.domain+"/api/order/getOrderFundInfo","{\"orderId\":105860790}");

        Assert.assertNotNull(str);

        System.out.println(str);
    }

    @Test
    public void getOrderProductAmountInfos()throws Exception {

        Map<String,List> map = Maps.newHashMap();

        List<String> productId = Lists.newArrayList("7A02BDF0-4408-4D2D-9F5A-25FBA25186A4",
                "93E074BB-7AFF-4910-B138-F84AF7E42A9E", "D99BA85C-9138-46AB-9025-AA857037C4D1");
        map.put("productIds",productId);

        String str = HttpClientUtil.requestPostJson(TestConstants.domain+"/api/Order/GetOrderProductAmountInfos",map);

        Assert.assertNotNull(str);

        System.out.println(str);
    }

    @Test
    public void getBlackBuyerListBySellerId()throws Exception {

        String str = HttpClientUtil.requestPostJsonStr(TestConstants.domain+"/api/OrderQuery/GetBlackBuyerList","{\"sellerId\":288484}");

        Assert.assertNotNull(str);
        System.out.println(str);
    }

    @Test
    public void getSellerOrdersListSummary()throws Exception {

        Map<String,Object> map = Maps.newHashMap();
        map.put("dateList",Lists.newArrayList(0,3));
        map.put("sellerUserId",288484L);
        map.put("orderStatusList",Lists.newArrayList(1,2,16,17));
        map.put("filter", new KeyValue(1,"1"));

        String str = HttpClientUtil.requestPostJsonStr(TestConstants.domain+"/api/AppQuery/GetSellerOrdersListSummaryV2", JSON.toJSONString(map));

        Assert.assertNotNull(str);
        System.out.println(str);
    }

    @Test
    public void getAppSellerOrdersByOrderId () throws Exception{
        Map<String, String> paramsMap = Maps.newHashMap();
        paramsMap.put("orderId","112443916");

        String str = HttpClientUtil.requestGet(TestConstants.domain+"/api/Seller/GetAppSellerOrder",paramsMap);
        Assert.assertNotNull(str);
        System.out.println(str);
    }
}
