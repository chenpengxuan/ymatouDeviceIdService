package com.ymatou.deviceid.facade.model.enums;

/**
 * Created by zhangzhiqiang on 2016/9/6.
 */
public enum ProductRefundChannelEnum {
    /**
     * 不需要
     */
    None (0),

    /**
     * 官方(1)
     */
    Official (1),

    /**
     * 卖家(2)
     */
    Seller (2);

    private ProductRefundChannelEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }
}
