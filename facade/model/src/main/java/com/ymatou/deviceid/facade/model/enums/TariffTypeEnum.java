package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum TariffTypeEnum {


    /**
     * 由卖家交税
     */
    BySeller(0),


    /**
     * 由买家交税
     */
    ByBuyer(1),;

    private int code;

    private TariffTypeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}

