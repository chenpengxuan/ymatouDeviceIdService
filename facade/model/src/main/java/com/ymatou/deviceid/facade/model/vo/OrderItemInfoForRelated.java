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

public class OrderItemInfoForRelated extends PrintFriendliness {


    /**
     * 商品标题
     */
    private String title;


    /**
     * 商品id
     */
    private String productId;


    /**
     * 商品规格id
     */
    private String catalogId;


    /**
     * 商品个数
     */
    private int amount;


    /**
     * 商品成交价
     */
    private BigDecimal productPrice;


    /**
     * 平摊商家优惠券金额
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 平摊码头平台优惠券金额
     */
    private BigDecimal ymtCouponAmount;


    /**
     * 平摊调整金额
     */
    private BigDecimal discount;


    /**
     * 平摊运费
     */
    private BigDecimal freight;


    /**
     * 商品优惠信息
     */
    private ProductPromotion promotion;


    /**
     * 是否支持7天无条件退款
     */
    private boolean supportRtnWithoutReason;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    public BigDecimal getYmtCouponAmount() {
        return ymtCouponAmount;
    }

    public void setYmtCouponAmount(BigDecimal ymtCouponAmount) {
        this.ymtCouponAmount = ymtCouponAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public ProductPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(ProductPromotion promotion) {
        this.promotion = promotion;
    }

    public boolean isSupportRtnWithoutReason() {
        return supportRtnWithoutReason;
    }

    public void setSupportRtnWithoutReason(boolean supportRtnWithoutReason) {
        this.supportRtnWithoutReason = supportRtnWithoutReason;
    }
}

