
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.math.BigDecimal;


/**
 * @author zhangyifan 2016/9/1 12:00
 */

import com.ymatou.deviceid.facade.model.PrintFriendliness;

public class SellerOrderProductInfo extends PrintFriendliness {


    /**
     * 商品成交价
     */
    private BigDecimal productPrice;


    /**
     * 商品原价
     */
    private BigDecimal productOriginalPrice;


    /**
     * 商品图片链接地址
     */
    private String productPictureUrl;


    /**
     * 商品规格信息
     */
    private String propertyInfo;


    /**
     * 商品id
     */
    private String productId;


    /**
     * 规格id
     */
    private String catalogId;


    /**
     * 商品数量
     */
    private int productNum;


    /**
     * 商品名称
     */
    private String productTitle;


    /**
     * 区分新客价或者VIP价(对应枚举：PriceTypeEnum)
     */
    private Integer priceType;


    /**
     * 配送方式(对应枚举：LogisticsTypeEnum)
     * 4保税发货，3护航直邮，2海外直邮，1国内现货国内转运
     */
    private int logisticsType;


    /**
     * 退货方式(官方、非官方,对应枚举：ProductRefundChannelEnum)
     */
    private Integer productRefundChannel;


    /**
     * 是否退货
     */
    private boolean productRefund;


    /**
     * 退货退款单号
     */
    private String salesRefundCode;


    /**
     * 退货退款状态(对应枚举：SalesRefundStatusEnum)
     */
    private Integer salesRefundStatus;


    /**
     * 退货退款金额
     */
    private BigDecimal salesRefundAmount;


    /**
     * 平台优惠券商品分摊金额
     */
    private BigDecimal couponAmount;


    /**
     * 卖家优惠券商品分摊金额
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 运费商品分摊金额
     */
    private BigDecimal freightPartialAmount;


    /**
     * 订单折扣商品分摊金额
     */
    private BigDecimal discountPartialAmount;


    /**
     * 交税方(对应的枚举：TariffTypeEnum)
     */
    private Integer tariffType;


    /**
     * 是否免运费null:unknown
     */
    private Boolean freightFree;


    /**
     * 是否支持7天无条件退款
     */
    private Boolean supportRtnWithoutReason;


    /**
     * 物流方式：4保税发货，3护航直邮，2海外直邮，1国内现货国内转运
     */
    private int catalogStatus;


    /**
     * 1:代购;0:现货
     */
    private Integer catalogType;


    /**
     * 商品优惠信息
     */
    private ProductPromotion promotion;

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductOriginalPrice() {
        return productOriginalPrice;
    }

    public void setProductOriginalPrice(BigDecimal productOriginalPrice) {
        this.productOriginalPrice = productOriginalPrice;
    }

    public String getProductPictureUrl() {
        return productPictureUrl;
    }

    public void setProductPictureUrl(String productPictureUrl) {
        this.productPictureUrl = productPictureUrl;
    }

    public String getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo;
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

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public int getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(int logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Integer getProductRefundChannel() {
        return productRefundChannel;
    }

    public void setProductRefundChannel(Integer productRefundChannel) {
        this.productRefundChannel = productRefundChannel;
    }

    public boolean isProductRefund() {
        return productRefund;
    }

    public void setProductRefund(boolean productRefund) {
        this.productRefund = productRefund;
    }

    public String getSalesRefundCode() {
        return salesRefundCode;
    }

    public void setSalesRefundCode(String salesRefundCode) {
        this.salesRefundCode = salesRefundCode;
    }

    public Integer getSalesRefundStatus() {
        return salesRefundStatus;
    }

    public void setSalesRefundStatus(Integer salesRefundStatus) {
        this.salesRefundStatus = salesRefundStatus;
    }

    public BigDecimal getSalesRefundAmount() {
        return salesRefundAmount;
    }

    public void setSalesRefundAmount(BigDecimal salesRefundAmount) {
        this.salesRefundAmount = salesRefundAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    public BigDecimal getFreightPartialAmount() {
        return freightPartialAmount;
    }

    public void setFreightPartialAmount(BigDecimal freightPartialAmount) {
        this.freightPartialAmount = freightPartialAmount;
    }

    public BigDecimal getDiscountPartialAmount() {
        return discountPartialAmount;
    }

    public void setDiscountPartialAmount(BigDecimal discountPartialAmount) {
        this.discountPartialAmount = discountPartialAmount;
    }

    public Integer getTariffType() {
        return tariffType;
    }

    public void setTariffType(Integer tariffType) {
        this.tariffType = tariffType;
    }

    public Boolean getFreightFree() {
        return freightFree;
    }

    public void setFreightFree(Boolean freightFree) {
        this.freightFree = freightFree;
    }

    public Boolean getSupportRtnWithoutReason() {
        return supportRtnWithoutReason;
    }

    public void setSupportRtnWithoutReason(Boolean supportRtnWithoutReason) {
        this.supportRtnWithoutReason = supportRtnWithoutReason;
    }

    public int getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(int catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public Integer getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(Integer catalogType) {
        this.catalogType = catalogType;
    }

    public ProductPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(ProductPromotion promotion) {
        this.promotion = promotion;
    }
}

