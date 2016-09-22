
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

public class GetAppSellerOrderReq extends BaseRequest {

    /**
     * 订单号
     */
    @QueryParam("OrderId")
    @Min(value = 1, message = "订单号不能为空")
    private long OrderId;

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        this.OrderId = orderId;
    }
}

