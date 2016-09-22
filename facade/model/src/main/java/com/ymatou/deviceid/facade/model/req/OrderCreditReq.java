/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.model.req;

import javax.validation.constraints.Min;
import javax.ws.rs.QueryParam;

/**
 * @author luoshiqian 2016/6/16 10:15
 */
public class OrderCreditReq extends BaseRequest {


    private static final long serialVersionUID = -626727822180190652L;

    @QueryParam("OrderId")
    @Min(value = 1, message = "订单号未提供")
    private long orderId;

    @Override
    public boolean requireAppId() {
        return false;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
