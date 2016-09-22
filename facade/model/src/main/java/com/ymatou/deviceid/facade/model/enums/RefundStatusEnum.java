
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum RefundStatusEnum {


    /**
     * 退款失败
     */
    Fail (-1),


    /**
     * 退款中
     */
    Processing (0),


    /**
     * 退款成功
     */
    Success (1),


    ;

    private RefundStatusEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

