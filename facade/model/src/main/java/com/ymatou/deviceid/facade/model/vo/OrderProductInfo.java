package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class OrderProductInfo extends PrintFriendliness {


    /**
     * 商品名称
     */
    private String name;


    /**
     * 商品分类[0]:一级,[1]:二级,[2]:三级.Categories.Length>=3.
     */
    private List<Integer> categories;


    /**
     * SKU
     */
    private String sKU;


    /**
     * 单价(成交价)
     */
    private BigDecimal price;


    /**
     * 数量
     */
    private int count;


    /**
     * 总价=单价*数量
     */
    private BigDecimal totalPrice;


    /**
     * 商品规格
     */
    private String propertyInfo;


    /**
     * 保税区
     */
    private int bondedArea;


    /**
     * 配送方式
     */
    private int logistics;


    /**
     * 原价
     */
    private BigDecimal originalPrice;


    /**
     * 商品分摊运费
     */
    private BigDecimal partialFreight;


    /**
     * 商品分摊的平台优惠金额
     */
    private BigDecimal partialYmtCoupon;


    /**
     * 退货退款信息
     */
    private OrderProductRefundInfo refundInfo;


    /**
     * 品牌ID
     */
    private int brandId;


    /**
     * 规格ID
     */
    private String catalogId;


    /**
     * 商品ID
     */
    private String productId;


    /**
     * 商品类型
     */
    private int catalogType;


    /**
     * 套餐编号
     */
    private String packageNo;


    /**
     * 活动ID
     */
    private int activityId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public String getsKU() {
        return sKU;
    }

    public void setsKU(String sKU) {
        this.sKU = sKU;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    public int getBondedArea() {
        return bondedArea;
    }

    public void setBondedArea(int bondedArea) {
        this.bondedArea = bondedArea;
    }

    public int getLogistics() {
        return logistics;
    }

    public void setLogistics(int logistics) {
        this.logistics = logistics;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPartialFreight() {
        return partialFreight;
    }

    public void setPartialFreight(BigDecimal partialFreight) {
        this.partialFreight = partialFreight;
    }

    public BigDecimal getPartialYmtCoupon() {
        return partialYmtCoupon;
    }

    public void setPartialYmtCoupon(BigDecimal partialYmtCoupon) {
        this.partialYmtCoupon = partialYmtCoupon;
    }

    public OrderProductRefundInfo getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(OrderProductRefundInfo refundInfo) {
        this.refundInfo = refundInfo;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
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

    public int getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(int catalogType) {
        this.catalogType = catalogType;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }
}

