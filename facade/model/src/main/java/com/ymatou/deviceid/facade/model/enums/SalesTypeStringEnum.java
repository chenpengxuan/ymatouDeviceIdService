
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum SalesTypeStringEnum {


    /**
     * 现货
     */
    AlreadyInStock (1),


    /**
     * 直播
     */
    Live (2),


    ;

    private SalesTypeStringEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

    public static SalesTypeStringEnum findByCode(int code) {
        for (SalesTypeStringEnum type : SalesTypeStringEnum.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }
}

