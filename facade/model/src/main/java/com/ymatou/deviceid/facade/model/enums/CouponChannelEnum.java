
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum CouponChannelEnum {


    /**
     * 未知
     */
    Unknown (0),


    /**
     * 码头自有优惠券=1
     */
    Ymt (1),


    /**
     * 商家优惠券=2
     */
    Seller (2),


    /**
     * 同时使用平台和商家优惠券
     */
    BothYmtAndSeller (3),


    ;

    private CouponChannelEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

