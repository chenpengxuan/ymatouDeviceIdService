
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum PlatformEnum {


    /**
     * 未知(0)
     */
    Unknown (0),


    /**
     * M商品在M2C-PC成交
     */
    Ymt_PC (1),


    /**
     * M商品在M2C-WAP成交
     */
    Ymt_WAP (2),


    /**
     * M商品在M2C-APP成交
     */
    Ymt_APP (3),


    /**
     * C商品在C2C-APP成交
     */
    Shangou_APP (4),


    /**
     * C商品在C2C-WAP成交
     */
    Shangou_WAP (5),


    /**
     * C商品在C2C-PC成交
     */
    Shangou_PC (6),


    /**
     * C商品通过C2C分享到Wechat成交
     */
    Shangou_Wechat (7),


    /**
     * M商品在C2C-APP成交
     */
    Ymt_C2CAPP (8),


    /**
     * M商品在C2C-WAP成交
     */
    Ymt_C2CWAP (9),


    /**
     * M商品在C2C分享到Wechat成交
     */
    Ymt_C2CWechat (10),


    /**
     * M商品在其它产品分享到Wechat成交
     */
    Ymt_Wechat (11),


    /**
     * 在PC使用下单器生成订单
     */
    Purchasing_PC (12),


    /**
     * M商品在其它渠道成交
     */
    Ymt_Other (13),


    /**
     * C商品在其它渠道成交
     */
    Shangou_Other (14),


    ;

    private PlatformEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

}

