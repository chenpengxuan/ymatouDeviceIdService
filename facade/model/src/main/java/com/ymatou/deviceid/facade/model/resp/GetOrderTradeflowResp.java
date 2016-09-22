package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.OrderTradeflow;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderTradeflowResp extends BaseResponse {


    /**
     * 订单支付补款退款取消信息
     */
    private OrderTradeflow orderTradeflow;


    public OrderTradeflow getOrderTradeflow() {
        return orderTradeflow;
    }

    public void setOrderTradeflow(OrderTradeflow orderTradeflow) {
        this.orderTradeflow = orderTradeflow;
    }
}

