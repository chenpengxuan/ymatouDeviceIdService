
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum RiskVerifiedStatusEnum {


    /**
     * 风控初始状态
     */
    Init (0),


    /**
     * 风控审核中
     */
    Auditing (1),


    /**
     * 风控检测通过
     */
    Pass (2),


    /**
     * 风控检测未通过，取消订单
     */
    Rejected (-1),


    ;

    private RiskVerifiedStatusEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

