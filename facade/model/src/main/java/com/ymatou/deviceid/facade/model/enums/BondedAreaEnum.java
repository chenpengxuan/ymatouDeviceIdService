
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum BondedAreaEnum {


    /**
     * 未知
     */
    Unkown (0),


    /**
     * 广州保税区=1
     */
    GuangZhou (1),


    /**
     * 宁波保税区=2
     */
    NingBo (2),


    /**
     * 杭州保税区=3
     */
    HangZhou (3),


    /**
     * 郑州保税区=4
     */
    ZhengZhou (4),


    /**
     * 天津保税区=5
     */
    TianJin (5),


    /**
     * 重庆保税区=6
     */
    ChongQing (6),


    /**
     * 深圳保税区=7
     */
    ShenZhen (7),


    /**
     * 上海保税区=8
     */
    ShangHai (8),


    ;

    private BondedAreaEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

