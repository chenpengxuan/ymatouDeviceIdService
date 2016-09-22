
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum SalesRefundStatusEnum {


    /**
     * 终止(如拒绝退货)
     */
    Fail (-10),


    /**
     * 处理中
     */
    Processing (1),


    /**
     * 处理成功
     */
    Success (10),


    ;

    private SalesRefundStatusEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

