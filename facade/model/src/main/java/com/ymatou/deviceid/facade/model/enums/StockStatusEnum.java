
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum StockStatusEnum {


    /**
     * 现货商品，包括买手发布的代购商品
     */
    Spot (0),


    /**
     * 代购商品，这里特指下单器可用
     */
    Purchasing (1),


    /**
     * 贝海
     */
    FBX (2),


    ;

    private StockStatusEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

