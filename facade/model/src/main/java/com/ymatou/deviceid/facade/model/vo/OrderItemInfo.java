package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.enums.*;

import java.math.BigDecimal;

public class OrderItemInfo extends PrintFriendliness {


    /**
     * 是否护航直邮
     */
    private boolean sailProtected;


    /**
     * 价格
     */
    private BigDecimal price;


    /**
     * 订单项相关属性组合信息
     */
    private String propertyInfo;


    /**
     * 商品个数
     */
    private int amount;


    /**
     * 订单项类型
     *
     * @see OrderInfoTypeEnum
     */
    private int itemType;


    /**
     * 商品规格id
     */
    private String catalogId;


    /**
     * 商品id
     */
    private String productId;


    /**
     * 订单项描述
     */
    private String description;


    /**
     * 订单项Id
     */
    private String orderItemId;


    /**
     * 商品图片url
     */
    private String pictureUrl;


    /**
     * 商品详情链接url
     */
    private String referenceUrl;


    /**
     * 商品标题
     */
    private String title;


    /**
     * 商品2级类别目录
     */
    private long subProductCategoryId;


    /**
     * 物流类型
     *
     * @see LogisticsTypeEnum
     */
    private int logisticsType;


    /**
     * 备货状态
     *
     * @see StockStatusEnum
     */
    private int stockStatus;


    /**
     * 新人价补贴
     */
    private BigDecimal premium;


    /**
     * 商品sku
     */
    private String sku;


    /**
     * 是否算入成本（专门用于财务核算）
     */
    @JsonProperty("IsCost")
    private boolean isCost;


    /**
     * 区分新客价或者VIP价
     *
     * @see PriceTypeEnum
     */
    private int priceType;


    /**
     * 保税区
     *
     * @see BondedAreaEnum
     */
    private int bondedArea;


    /**
     * 退货方式(官方、非官方)
     *
     * @see ProductRefundChannelEnum
     */
    private int productRefundChannel;


    /**
     * 订单商品对应的活动信息
     */
    private OrderItemInfoExt orderItemInfoExt;


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
     * 运费商品分摊金额
     */
    private BigDecimal freight;


    /**
     * 商品成交价
     */
    private BigDecimal productPrice;


    /**
     * 商品退款单号
     */
    private String refundBillNo;


    /**
     * 商品原价
     */
    private BigDecimal productOriginalPrice;


    /**
     * 关税承担类型(0-卖家承担1-买家承担)
     */
    private int tariffType;


    /**
     * 销售类型
     * .net端 兼容 java式枚举
     *
     * @see SalesTypeStringEnum
     */
    private String salesType;


    /**
     * 商品优惠信息
     */
    private ProductPromotion promotion;


    /**
     * 是否支持7天无条件退款
     */
    private boolean supportRtnWithoutReason;


    /**
     * 是否为免运费标识
     */
    private Boolean freightFree;

    public boolean isSailProtected() {
        return sailProtected;
    }

    public void setSailProtected(boolean sailProtected) {
        this.sailProtected = sailProtected;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getReferenceUrl() {
        return referenceUrl;
    }

    public void setReferenceUrl(String referenceUrl) {
        this.referenceUrl = referenceUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getSubProductCategoryId() {
        return subProductCategoryId;
    }

    public void setSubProductCategoryId(long subProductCategoryId) {
        this.subProductCategoryId = subProductCategoryId;
    }

    public int getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(int logisticsType) {
        this.logisticsType = logisticsType;
    }

    public int getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(int stockStatus) {
        this.stockStatus = stockStatus;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean isCost() {
        return isCost;
    }

    public void setCost(boolean cost) {
        isCost = cost;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public int getBondedArea() {
        return bondedArea;
    }

    public void setBondedArea(int bondedArea) {
        this.bondedArea = bondedArea;
    }

    public int getProductRefundChannel() {
        return productRefundChannel;
    }

    public void setProductRefundChannel(int productRefundChannel) {
        this.productRefundChannel = productRefundChannel;
    }

    public OrderItemInfoExt getOrderItemInfoExt() {
        return orderItemInfoExt;
    }

    public void setOrderItemInfoExt(OrderItemInfoExt orderItemInfoExt) {
        this.orderItemInfoExt = orderItemInfoExt;
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

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getRefundBillNo() {
        return refundBillNo;
    }

    public void setRefundBillNo(String refundBillNo) {
        this.refundBillNo = refundBillNo;
    }

    public BigDecimal getProductOriginalPrice() {
        return productOriginalPrice;
    }

    public void setProductOriginalPrice(BigDecimal productOriginalPrice) {
        this.productOriginalPrice = productOriginalPrice;
    }

    public int getTariffType() {
        return tariffType;
    }

    public void setTariffType(int tariffType) {
        this.tariffType = tariffType;
    }

    public String getSalesType() {
        return salesType;
    }

    public void setSalesType(String salesType) {
        this.salesType = salesType;
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

    public Boolean getFreightFree() {
        return freightFree;
    }

    public void setFreightFree(Boolean freightFree) {
        this.freightFree = freightFree;
    }
}

