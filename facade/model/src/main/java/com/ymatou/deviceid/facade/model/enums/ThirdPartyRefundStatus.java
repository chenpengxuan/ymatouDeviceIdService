
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum ThirdPartyRefundStatus {


    /**
     * 未知状态
     */
    Unknown (0),


    /**
     * 退款中。若长时间处于此状态表示需人工干预
     */
    Processing (1),


    /**
     * 退款成功
     */
    Success (10),


    ;

    private ThirdPartyRefundStatus(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

