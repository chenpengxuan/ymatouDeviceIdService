
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.math.BigDecimal;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class AmountInfo extends PrintFriendliness {


    /**
     * 扫货金额
     */
    private BigDecimal shangou;


    /**
     * 现货金额
     */
    private BigDecimal spot;


    /**
     * 卖家优惠券金额
     */
    private BigDecimal sellerCoupon;

    public AmountInfo(BigDecimal shangou, BigDecimal spot, BigDecimal sellerCoupon) {
        this.shangou = shangou;
        this.spot = spot;
        this.sellerCoupon = sellerCoupon;
    }

    public BigDecimal getShangou() {
        return shangou;
    }

    public void setShangou(BigDecimal shangou) {
        this.shangou = shangou;
    }

    public BigDecimal getSpot() {
        return spot;
    }

    public void setSpot(BigDecimal spot) {
        this.spot = spot;
    }

    public BigDecimal getSellerCoupon() {
        return sellerCoupon;
    }

    public void setSellerCoupon(BigDecimal sellerCoupon) {
        this.sellerCoupon = sellerCoupon;
    }
}

