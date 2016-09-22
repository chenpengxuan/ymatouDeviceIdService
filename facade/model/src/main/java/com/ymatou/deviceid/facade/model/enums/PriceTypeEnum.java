
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum PriceTypeEnum {


    /**
     * 原价
     */
    QuotePrice (0),


    /**
     * 新客价=1
     */
    NewPersonPrice (1),


    /**
     * Vip价=2
     */
    VipPrice (2),


    /**
     * 活动价=3
     */
    ActivityPrice (3),


    /**
     * 活动-新人价=4
     */
    ActivityNewPersonPrice (4),


    ;

    private PriceTypeEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

