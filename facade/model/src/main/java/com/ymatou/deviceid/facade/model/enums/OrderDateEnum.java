
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum OrderDateEnum {


    /**
     * 未知
     */
    Unknown (0),


    /**
     * 下单时间
     */
    CreateDate (1),


    /**
     * 支付时间
     */
    PayDate (2),


    /**
     * 发货时间
     */
    DispatchDate (3),


    /**
     * 申请补款时间
     */
    ApplyPostyPayDate (4),


    ;

    private OrderDateEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

