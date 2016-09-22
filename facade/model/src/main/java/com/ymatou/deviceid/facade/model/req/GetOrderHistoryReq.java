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


public class GetOrderHistoryReq extends BaseRequest {


    /**
     * 用户id
     */
    @QueryParam("UserId")
    @Min(value = 1, message = "用户号不能为0")
    private int userId;


    /**
     * 订单id
     */
    @QueryParam("OrderId")
    @Min(value = 1, message = "订单号不能为0")
    private int orderId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

