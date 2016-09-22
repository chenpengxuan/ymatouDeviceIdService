

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.math.BigDecimal;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderFundInfoResp extends BaseResponse {


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 买家支付金额现金部分（码头余额+第三方支付）
     */
    private BigDecimal buyerPaidCashAmount;


    /**
     * 买家所使用的平台优惠劵金额（不包含卖家优惠劵）
     */
    private BigDecimal buyerUsedCouponAmount;


    /**
     * 买家所使用的平台优惠劵码
     */
    private String buyerUsedCouponCode;


    /**
     * 买家已退现金金额
     */
    private BigDecimal buyerRefundedCashAmount;


    /**
     * 买家所已退红包金额
     */
    private BigDecimal buyerRefundedGiftAmount;


    /**
     * 买家支付的红包金额
     */
    private BigDecimal buyerUsedGiftAmount;


    /**
     * 订单状态 int OrderStatusEnum
     */
    private int orderStatus;


    /**
     * 买家ID
     */
    private long buyerId;


    /**
     * 卖家ID
     */
    private long sellerId;


    /**
     * 买家登录ID
     */
    private String buyerLoginId;


    /**
     * 卖家登录ID
     */
    private String sellerLoginId;


    /**
     * 退货退款关联的优惠券金额
     */
    private BigDecimal refundRelatedCouponAmount;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getBuyerPaidCashAmount() {
        return buyerPaidCashAmount;
    }

    public void setBuyerPaidCashAmount(BigDecimal buyerPaidCashAmount) {
        this.buyerPaidCashAmount = buyerPaidCashAmount;
    }

    public BigDecimal getBuyerUsedCouponAmount() {
        return buyerUsedCouponAmount;
    }

    public void setBuyerUsedCouponAmount(BigDecimal buyerUsedCouponAmount) {
        this.buyerUsedCouponAmount = buyerUsedCouponAmount;
    }

    public String getBuyerUsedCouponCode() {
        return buyerUsedCouponCode;
    }

    public void setBuyerUsedCouponCode(String buyerUsedCouponCode) {
        this.buyerUsedCouponCode = buyerUsedCouponCode;
    }

    public BigDecimal getBuyerRefundedCashAmount() {
        return buyerRefundedCashAmount;
    }

    public void setBuyerRefundedCashAmount(BigDecimal buyerRefundedCashAmount) {
        this.buyerRefundedCashAmount = buyerRefundedCashAmount;
    }

    public BigDecimal getBuyerRefundedGiftAmount() {
        return buyerRefundedGiftAmount;
    }

    public void setBuyerRefundedGiftAmount(BigDecimal buyerRefundedGiftAmount) {
        this.buyerRefundedGiftAmount = buyerRefundedGiftAmount;
    }

    public BigDecimal getBuyerUsedGiftAmount() {
        return buyerUsedGiftAmount;
    }

    public void setBuyerUsedGiftAmount(BigDecimal buyerUsedGiftAmount) {
        this.buyerUsedGiftAmount = buyerUsedGiftAmount;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
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

    public BigDecimal getRefundRelatedCouponAmount() {
        return refundRelatedCouponAmount;
    }

    public void setRefundRelatedCouponAmount(BigDecimal refundRelatedCouponAmount) {
        this.refundRelatedCouponAmount = refundRelatedCouponAmount;
    }
}

