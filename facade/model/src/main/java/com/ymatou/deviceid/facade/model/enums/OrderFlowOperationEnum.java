
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum OrderFlowOperationEnum {


    /**
     * 无操作
     */
    None (0),


    /**
     * 首付款：M端付款或C端订金
     */
    FirstPay (1),


    /**
     * 支付尾款
     */
    Postpay (2),


    /**
     * 退货退款
     */
    SalesRefund (3),


    /**
     * 取消订单
     */
    Cancel (4),


    ;

    private OrderFlowOperationEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

