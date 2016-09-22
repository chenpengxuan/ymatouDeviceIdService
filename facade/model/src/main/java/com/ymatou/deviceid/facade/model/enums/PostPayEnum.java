/*
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 */
package com.ymatou.deviceid.facade.model.enums;

/**
 * @author qianmin 2016年7月14日 上午11:36:19
 */
public enum PostPayEnum {

    CANCELED_BY_SELLER(-1),

    APPLYING(0),

    PAID(1),

    CANCELED(2),

    REJECTED(3);

    private int code;

    private PostPayEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
