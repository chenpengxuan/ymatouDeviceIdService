/*
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.ymatou.deviceid.facade.model.enums;

/**
 * 订单类型枚举
 *
 * @author tuwenjie 2016年5月7日 下午5:12:59
 *
 */
public enum OrderTypeEnum {

    // 全款
    FullPay(0),

    // 定金+尾款
    AdvAndRestPay(1),

    ;

    private int code;

    private OrderTypeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderTypeEnum findByCode(int code) {
        for (OrderTypeEnum type : OrderTypeEnum.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }

}
