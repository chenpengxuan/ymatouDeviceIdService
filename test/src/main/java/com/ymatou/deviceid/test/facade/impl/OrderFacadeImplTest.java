package com.ymatou.deviceid.test.facade.impl;


import com.ymatou.deviceid.facade.model.req.GetAppSellerOrderReq;
import com.ymatou.deviceid.facade.model.resp.GetAppSellerOrderResp;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangzhiqiang on 2016/9/5.
 */
public class OrderFacadeImplTest extends WithoutDubboBaseTest {
   /*
    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void getAppSellerOrdersByOrderId () {
        long orderId = 112443916;
        GetAppSellerOrderReq req = new GetAppSellerOrderReq();
        req.setOrderId(orderId);

        GetAppSellerOrderResp resp = orderFacade.getAppSellerOrdersByOrderId(req);
        Assert.assertTrue(resp != null);
        Assert.assertEquals(orderId,resp.getOrder().getOrderId());
    }

    */
}
