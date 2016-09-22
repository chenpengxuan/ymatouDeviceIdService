package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderTradeflow extends PrintFriendliness {


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 付款时间
     */
    private Date paidTime;


    /**
     * 补款付款时间
     */
    private Date postPaidTime;


    /**
     * 取消时间
     */
    private Date cancelTime;


    /**
     * 商家优惠券Code
     */
    private String sellerCouponCode;


    /**
     * 商家优惠券金额(+)
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 码头平台优惠券Code
     */
    private String ymtCouponCode;


    /**
     * 码头平台优惠券金额(+)
     */
    private BigDecimal ymtCouponAmount;


    /**
     * 运费(+)
     */
    private BigDecimal freight;


    /**
     * 调整金额(+-)
     */
    private BigDecimal discount;


    /**
     * 补款调整金额(+-)
     */
    private BigDecimal postDiscount;


    /**
     * 订单成交价
     */
    private BigDecimal totalPrice;


    /**
     * 支付渠道
     */
    private String payChannel;


    /**
     * 订单状态
     */
    private int tradingStatus;


    /**
     * 付款金额
     */
    private BigDecimal paidAmountOfCash;


    /**
     * 补款金额
     */
    private BigDecimal postPaidAmountOfCash;


    /**
     * 付款金额(红包)
     */
    private BigDecimal paidAmountOfGift;


    /**
     * 补款金额(红包)
     */
    private BigDecimal postPaidAmountOfGift;


    /**
     * 退款信息
     */
    private List<OrderTradeflowRefund> orderTradeflowRefundList;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getPostPaidTime() {
        return postPaidTime;
    }

    public void setPostPaidTime(Date postPaidTime) {
        this.postPaidTime = postPaidTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getSellerCouponCode() {
        return sellerCouponCode;
    }

    public void setSellerCouponCode(String sellerCouponCode) {
        this.sellerCouponCode = sellerCouponCode;
    }

    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    public String getYmtCouponCode() {
        return ymtCouponCode;
    }

    public void setYmtCouponCode(String ymtCouponCode) {
        this.ymtCouponCode = ymtCouponCode;
    }

    public BigDecimal getYmtCouponAmount() {
        return ymtCouponAmount;
    }

    public void setYmtCouponAmount(BigDecimal ymtCouponAmount) {
        this.ymtCouponAmount = ymtCouponAmount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPostDiscount() {
        return postDiscount;
    }

    public void setPostDiscount(BigDecimal postDiscount) {
        this.postDiscount = postDiscount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public int getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(int tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public BigDecimal getPaidAmountOfCash() {
        return paidAmountOfCash;
    }

    public void setPaidAmountOfCash(BigDecimal paidAmountOfCash) {
        this.paidAmountOfCash = paidAmountOfCash;
    }

    public BigDecimal getPostPaidAmountOfCash() {
        return postPaidAmountOfCash;
    }

    public void setPostPaidAmountOfCash(BigDecimal postPaidAmountOfCash) {
        this.postPaidAmountOfCash = postPaidAmountOfCash;
    }

    public BigDecimal getPaidAmountOfGift() {
        return paidAmountOfGift;
    }

    public void setPaidAmountOfGift(BigDecimal paidAmountOfGift) {
        this.paidAmountOfGift = paidAmountOfGift;
    }

    public BigDecimal getPostPaidAmountOfGift() {
        return postPaidAmountOfGift;
    }

    public void setPostPaidAmountOfGift(BigDecimal postPaidAmountOfGift) {
        this.postPaidAmountOfGift = postPaidAmountOfGift;
    }

    public List<OrderTradeflowRefund> getOrderTradeflowRefundList() {
        return orderTradeflowRefundList;
    }

    public void setOrderTradeflowRefundList(List<OrderTradeflowRefund> orderTradeflowRefundList) {
        this.orderTradeflowRefundList = orderTradeflowRefundList;
    }
}

