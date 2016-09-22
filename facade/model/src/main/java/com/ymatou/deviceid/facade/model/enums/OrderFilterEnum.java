
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum OrderFilterEnum {


    /**
     * 空
     */
    NONE (0),


    /**
     * 订单号
     */
    ORDERID (1),


    /**
     * 买家昵称
     */
    CONSUMER_NICKNAME (2),


    /**
     * 收货人姓名
     */
    CONSIGNEE_NAME (3),


    /**
     * 物流单号
     */
    TRACKING_NO (4),


    ;

    OrderFilterEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

