
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import javax.validation.constraints.Min;
import javax.ws.rs.QueryParam;

/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderFundInfoReq extends BaseRequest {


    /**
     * 订单号
     */
    @Min(1)
    @QueryParam("OrderId")
    private long orderId;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}

