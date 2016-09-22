
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum OrderStatusEnum {


    /**
     * 未知
     */
    UNKOWN (0),


    /**
     * 未付款
     */
    ORDER_ESTABLISH (1),


    /**
     * 已付款待接单
     */
    ACCOUNT_PAID (2),


    /**
     * 已发货
     */
    SHIPPED (3),


    /**
     * 确认收货
     */
    RECEIVED (4),


    /**
     * 买家取消订单
     */
    USER_ACCEPT_CANCEL (12),


    /**
     * 卖家取消订单
     */
    SELLER_ACCEPT_CANCEL (13),


    /**
     * 系统自动取消
     */
    SYSTEM_CANCEL (18),


    /**
     * 补款中
     */
    APPLY_FOR_POSTPAY (16),


    /**
     * 已接单
     */
    SELLER_ACCEPT (17),


    /**
     * 自动取消订单
     */
    AUTO_CANCEL (100),


    /**
     * 已确认接单(等待发起补款)
     */
    ORDER_POST_PAY (101),


    /**
     * 客服取消订单
     */
    CUSTOMER_CANCEL (102),


    /**
     * 修改订单折扣
     */
    CHANGE_DISCOUNT (103),


    /**
     * 卖家退款
     */
    SELLER_REFUND (104),


    /**
     * 买家延长收货
     */
    BUYER_DELAY_RECEIVE_TIME (105),


    ;

    OrderStatusEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

    public static OrderStatusEnum findEnumByCode(int code){
        for (OrderStatusEnum orderStatus : OrderStatusEnum.values()){
            if (orderStatus.getCode() == code){
                return orderStatus;
            }
        }
        return null;
    }
}

