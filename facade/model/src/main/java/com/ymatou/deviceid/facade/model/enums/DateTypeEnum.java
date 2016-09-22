
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */



/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum DateTypeEnum {


    /**
     * 查询全部
     */
    ALL(0),


    /**
     * 今日
     */
    TODAY(1),


    /**
     * 昨日
     */
    YESTERDAY(2),


    /**
     * 本周
     */
    THIS_WEEK(3),


    /**
     * 本月
     */
    THIS_MONTH(4),


    /**
     * 本季度
     */
    THIS_QUARTER(5),


    /**
     * 本年
     */
    THIS_YEAR(6),


    ;

    DateTypeEnum(int code) {
        this.code = code;
    }

    private int code;

    public int getCode() {
        return code;
    }

    public static DateTypeEnum findByCode(int code) {
        for (DateTypeEnum type : DateTypeEnum.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }
}

