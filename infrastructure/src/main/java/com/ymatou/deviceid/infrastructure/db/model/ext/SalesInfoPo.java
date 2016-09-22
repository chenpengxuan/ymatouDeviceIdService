/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.math.BigDecimal;

/**
 * @author luoshiqian 2016/9/5 17:23
 */
public class SalesInfoPo extends PrintFriendliness{

    private String timeSpan;
    private BigDecimal spot = BigDecimal.ZERO;
    private BigDecimal shangou = BigDecimal.ZERO;
    private BigDecimal sellerCoupon = BigDecimal.ZERO;

    public String getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
    }

    public BigDecimal getSpot() {
        return spot;
    }

    public void setSpot(BigDecimal spot) {
        this.spot = spot;
    }

    public BigDecimal getShangou() {
        return shangou;
    }

    public void setShangou(BigDecimal shangou) {
        this.shangou = shangou;
    }

    public BigDecimal getSellerCoupon() {
        return sellerCoupon;
    }

    public void setSellerCoupon(BigDecimal sellerCoupon) {
        this.sellerCoupon = sellerCoupon;
    }
}
