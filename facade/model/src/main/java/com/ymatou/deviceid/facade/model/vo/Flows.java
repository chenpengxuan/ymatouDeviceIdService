package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.math.BigDecimal;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class Flows extends PrintFriendliness {


    /**
     * 总额
     */
    private BigDecimal total;


    /**
     * 现金
     */
    private BigDecimal cash;


    /**
     * 红包
     */
    private BigDecimal gift;


    /**
     * 平台优惠券
     */
    private BigDecimal coupon;


    /**
     * 商家优惠券
     */
    private BigDecimal sellerCoupon;


    /**
     * 运费
     */
    private BigDecimal freight;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getGift() {
        return gift;
    }

    public void setGift(BigDecimal gift) {
        this.gift = gift;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public BigDecimal getSellerCoupon() {
        return sellerCoupon;
    }

    public void setSellerCoupon(BigDecimal sellerCoupon) {
        this.sellerCoupon = sellerCoupon;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
}

