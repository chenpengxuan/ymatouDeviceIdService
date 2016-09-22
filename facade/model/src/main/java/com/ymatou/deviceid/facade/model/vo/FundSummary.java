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

public class FundSummary extends PrintFriendliness {


    /**
     * 首付款现金金额
     */
    private BigDecimal paidCash;


    /**
     * 首付款红包金额
     */
    private BigDecimal paidGift;


    /**
     * 首付款免运卡金额
     */
    private BigDecimal paidFreeCard;


    /**
     * 首付款平台优惠券金额
     */
    private BigDecimal paidYmtCoupon;


    /**
     * 首付款卖家优惠券金额
     */
    private BigDecimal paidSellerCoupon;


    /**
     * 尾款现金金额
     */
    private BigDecimal postPaidCash;


    /**
     * 尾款红包金额
     */
    private BigDecimal postPaidGift;


    /**
     * 订单商品总价
     */
    private BigDecimal totalProductPrice;


    /**
     * 订单商品首付款金额
     */
    private BigDecimal firstPayProductPrice;


    /**
     * 运费
     */
    private BigDecimal freight;


    /**
     * 订单调价
     */
    private BigDecimal orderDiscount;


    /**
     * 尾款调价
     */
    private BigDecimal postPayDiscount;


    /**
     * 退款现金总额
     */
    private BigDecimal totalRefundedCash;


    /**
     * 退款红包总额
     */
    private BigDecimal totalRefundedGift;


    /**
     * 退款平台优惠券总额
     */
    private BigDecimal totalRefundedYmtCoupon;


    /**
     * 活动优惠总金额
     */
    private BigDecimal totalActivityPrice;


    /**
     * 取消现金总额
     */
    private BigDecimal totalCanceledCash;


    /**
     * 取消平台优惠券总额
     */
    private BigDecimal totalCanceledYmtCoupon;

    public BigDecimal getPaidCash() {
        return paidCash;
    }

    public void setPaidCash(BigDecimal paidCash) {
        this.paidCash = paidCash;
    }

    public BigDecimal getPaidGift() {
        return paidGift;
    }

    public void setPaidGift(BigDecimal paidGift) {
        this.paidGift = paidGift;
    }

    public BigDecimal getPaidFreeCard() {
        return paidFreeCard;
    }

    public void setPaidFreeCard(BigDecimal paidFreeCard) {
        this.paidFreeCard = paidFreeCard;
    }

    public BigDecimal getPaidYmtCoupon() {
        return paidYmtCoupon;
    }

    public void setPaidYmtCoupon(BigDecimal paidYmtCoupon) {
        this.paidYmtCoupon = paidYmtCoupon;
    }

    public BigDecimal getPaidSellerCoupon() {
        return paidSellerCoupon;
    }

    public void setPaidSellerCoupon(BigDecimal paidSellerCoupon) {
        this.paidSellerCoupon = paidSellerCoupon;
    }

    public BigDecimal getPostPaidCash() {
        return postPaidCash;
    }

    public void setPostPaidCash(BigDecimal postPaidCash) {
        this.postPaidCash = postPaidCash;
    }

    public BigDecimal getPostPaidGift() {
        return postPaidGift;
    }

    public void setPostPaidGift(BigDecimal postPaidGift) {
        this.postPaidGift = postPaidGift;
    }

    public BigDecimal getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(BigDecimal totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public BigDecimal getFirstPayProductPrice() {
        return firstPayProductPrice;
    }

    public void setFirstPayProductPrice(BigDecimal firstPayProductPrice) {
        this.firstPayProductPrice = firstPayProductPrice;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public BigDecimal getPostPayDiscount() {
        return postPayDiscount;
    }

    public void setPostPayDiscount(BigDecimal postPayDiscount) {
        this.postPayDiscount = postPayDiscount;
    }

    public BigDecimal getTotalRefundedCash() {
        return totalRefundedCash;
    }

    public void setTotalRefundedCash(BigDecimal totalRefundedCash) {
        this.totalRefundedCash = totalRefundedCash;
    }

    public BigDecimal getTotalRefundedGift() {
        return totalRefundedGift;
    }

    public void setTotalRefundedGift(BigDecimal totalRefundedGift) {
        this.totalRefundedGift = totalRefundedGift;
    }

    public BigDecimal getTotalRefundedYmtCoupon() {
        return totalRefundedYmtCoupon;
    }

    public void setTotalRefundedYmtCoupon(BigDecimal totalRefundedYmtCoupon) {
        this.totalRefundedYmtCoupon = totalRefundedYmtCoupon;
    }

    public BigDecimal getTotalActivityPrice() {
        return totalActivityPrice;
    }

    public void setTotalActivityPrice(BigDecimal totalActivityPrice) {
        this.totalActivityPrice = totalActivityPrice;
    }

    public BigDecimal getTotalCanceledCash() {
        return totalCanceledCash;
    }

    public void setTotalCanceledCash(BigDecimal totalCanceledCash) {
        this.totalCanceledCash = totalCanceledCash;
    }

    public BigDecimal getTotalCanceledYmtCoupon() {
        return totalCanceledYmtCoupon;
    }

    public void setTotalCanceledYmtCoupon(BigDecimal totalCanceledYmtCoupon) {
        this.totalCanceledYmtCoupon = totalCanceledYmtCoupon;
    }
}

