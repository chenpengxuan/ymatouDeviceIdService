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
import java.util.List;

public class OrderInfoForRelated extends PrintFriendliness {


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 订单状态
     */
    private Integer tradingStatus;


    /**
     * 买家id
     */
    private long userId;


    /**
     * 卖家id
     */
    private long buyerId;


    /**
     * 买家名称
     */
    private String buyerLoginId;


    /**
     * 卖家名称
     */
    private String sellerLoginId;


    /**
     * 订单总应付金额
     */
    private BigDecimal payableAmount;


    /**
     * 码头平台优惠券Code
     */
    private String ymtCouponCode;


    /**
     * 码头平台优惠券金额
     */
    private BigDecimal ymtCouponAmount;


    /**
     * 商家优惠券Code
     */
    private String sellerCouponCode;


    /**
     * 卖家优惠券金额
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 主单ID
     */
    private Long mainOrderId;


    /**
     * 商品列表
     */
    private List<OrderItemInfoForRelated> orderItemInfoList;


    /**
     * 优惠活动金额
     */
    private BigDecimal promotionReducedAmount;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Integer getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(Integer tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerLoginId() {
        return buyerLoginId;
    }

    public void setBuyerLoginId(String buyerLoginId) {
        this.buyerLoginId = buyerLoginId;
    }

    public String getSellerLoginId() {
        return sellerLoginId;
    }

    public void setSellerLoginId(String sellerLoginId) {
        this.sellerLoginId = sellerLoginId;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
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

    public Long getMainOrderId() {
        return mainOrderId;
    }

    public void setMainOrderId(Long mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    public List<OrderItemInfoForRelated> getOrderItemInfoList() {
        return orderItemInfoList;
    }

    public void setOrderItemInfoList(List<OrderItemInfoForRelated> orderItemInfoList) {
        this.orderItemInfoList = orderItemInfoList;
    }

    public BigDecimal getPromotionReducedAmount() {
        return promotionReducedAmount;
    }

    public void setPromotionReducedAmount(BigDecimal promotionReducedAmount) {
        this.promotionReducedAmount = promotionReducedAmount;
    }
}

