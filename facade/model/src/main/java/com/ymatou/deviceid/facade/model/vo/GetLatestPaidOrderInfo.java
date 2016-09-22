/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.model.vo;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.util.Date;

/**
 * @author luoshiqian 2016/9/1 17:47
 */
public class GetLatestPaidOrderInfo extends PrintFriendliness {

    //     买家ID
    private long buyerId;
    //     订单创建时间
    private Date createdTime;
    //     订单ID
    private Long orderId;
    //     商品ID
    private String productId;
    //     商品名
    private String productName;
    //     商品图片链接
    private String productPicUrl;
    //     卖家ID
    private long sellerId;
    //     是否为扫货订单
    private boolean shangou;


    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public boolean isShangou() {
        return shangou;
    }

    public void setShangou(boolean shangou) {
        this.shangou = shangou;
    }
}
