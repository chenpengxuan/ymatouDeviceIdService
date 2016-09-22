
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum OrderInfoTypeEnum {


    /**
     * 报价
     */
    Catalog (0),


    /**
     * 定金
     */
    Earnest (1),


    /**
     * 其他
     */
    Generic (2),


    ;

    private OrderInfoTypeEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

