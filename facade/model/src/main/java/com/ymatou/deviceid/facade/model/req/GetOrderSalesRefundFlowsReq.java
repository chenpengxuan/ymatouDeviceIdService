package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.enums.SalesRefundStatusEnum;

import javax.validation.constraints.Min;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderSalesRefundFlowsReq extends BaseRequest {


    /**
     * 订单ID
     */
    @Min(value = 1, message = "订单号不能为0")
    private long orderId;


    /**
     * 退款退货状态
     * @see SalesRefundStatusEnum
     */
    private List<Integer> status;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public List<Integer> getStatus() {
        return status;
    }

    public void setStatus(List<Integer> status) {
        this.status = status;
    }
}

