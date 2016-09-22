package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderSummaryInfoResp extends BaseResponse {


    /**
     * 订单相关物流信息
     */
    private String orderSummaryInfo;


    public String getOrderSummaryInfo() {
        return orderSummaryInfo;
    }

    public void setOrderSummaryInfo(String orderSummaryInfo) {
        this.orderSummaryInfo = orderSummaryInfo;
    }
}

