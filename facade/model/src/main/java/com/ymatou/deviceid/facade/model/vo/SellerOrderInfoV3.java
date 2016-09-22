package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.enums.RiskVerifiedStatusEnum;
import com.ymatou.deviceid.facade.model.enums.SalesTypeStringEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class SellerOrderInfoV3 extends PrintFriendliness {


    /**
     * 销售类型
     * .net端 兼容 java式枚举
     *
     * @see SalesTypeStringEnum
     */
    private SalesTypeStringEnum salesType;


    /**
     * 主单号
     */
    private Long orderGroupId;


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 订单状态
     */
    private int orderStatus;


    /**
     * 风控状态
     *
     * @see RiskVerifiedStatusEnum
     */
    private int riskVerifiedStatus;


    /**
     * 买家用户id
     */
    private long buyerUserId;


    /**
     * 买家登陆id
     */
    private String buyerUserLoginId;


    /**
     * 订单留言
     */
    private String leaveWord;


    /**
     * 是否全款支付
     */
    private boolean paidInFull;


    /**
     * 卖家备注
     */
    private String sellerNote;


    /**
     * 买家是否在黑名单中
     */
    private boolean buyerInBlacklist;


    /**
     * 订单商品信息
     */
    private List<SellerOrderProductInfo> products;


    /**
     * 是否需要上传身份证
     */
    private boolean needUploadIdCard;


    /**
     * 是否已上传身份证
     */
    private boolean haveUploadedIdCard;


    /**
     * 创建订单日期
     */
    private Date createOrderDate;


    /**
     * 首付款时间（如订金）
     */
    private Date paidTime;


    /**
     * 尾款支付时间
     */
    private Date postpayTime;


    /**
     * 发货时间
     */
    private Date deliveryTime;


    /**
     * 订单取消时间
     */
    private Date orderCancelledTime;


    /**
     * 确认收货时间
     */
    private Date orderConfirmedTime;


    /**
     * 发起补款的时间
     */
    private Date applyPostPayTime;


    /**
     * 是否只需付款一次
     */
    private boolean onlyNeedPayOnce;


    /**
     * 平台优惠券编号
     */
    private String couponCode;


    /**
     * 卖家优惠券编号
     */
    private String sellerCouponCode;


    /**
     * 商品总价（下单时）
     */
    private BigDecimal totalProductPrice;


    /**
     * 运费
     */
    private BigDecimal freight;


    /**
     * 订单应收
     */
    private BigDecimal expectedTotalPayAmount;


    /**
     * 平台优惠券使用金额
     */
    private BigDecimal couponAmount;


    /**
     * 卖家优惠券使用金额
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 优惠活动金额
     */
    private BigDecimal sellerPromotionAmount;


    /**
     * 红包使用金额
     */
    private BigDecimal giftAmount;


    /**
     * 卖家调价（加价为正，降价为负）
     */
    private BigDecimal discount;


    /**
     * 首付款应收(如订金，只需支付一次时=订单应收)
     */
    private BigDecimal expectedPayAmount;


    /**
     * 尾款应收
     */
    private BigDecimal expectedPostpayAmount;


    /**
     * 原始尾款金额(调价前)
     */
    private BigDecimal originalPostpayAmount;


    /**
     * 新买手单标识
     */
    @JsonProperty("isNewCustomerOrder")
    private Boolean isNewSellerOrder;


    /**
     * 新客单标识
     */
    @JsonProperty("isNewCustomerOrder")
    private Boolean isNewCustomerOrder;

    public SalesTypeStringEnum getSalesType() {
        return salesType;
    }

    public void setSalesType(SalesTypeStringEnum salesType) {
        this.salesType = salesType;
    }

    public Long getOrderGroupId() {
        return orderGroupId;
    }

    public void setOrderGroupId(Long orderGroupId) {
        this.orderGroupId = orderGroupId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getRiskVerifiedStatus() {
        return riskVerifiedStatus;
    }

    public void setRiskVerifiedStatus(int riskVerifiedStatus) {
        this.riskVerifiedStatus = riskVerifiedStatus;
    }

    public long getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(long buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getBuyerUserLoginId() {
        return buyerUserLoginId;
    }

    public void setBuyerUserLoginId(String buyerUserLoginId) {
        this.buyerUserLoginId = buyerUserLoginId;
    }

    public String getLeaveWord() {
        return leaveWord;
    }

    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord;
    }

    public boolean isPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    public boolean isBuyerInBlacklist() {
        return buyerInBlacklist;
    }

    public void setBuyerInBlacklist(boolean buyerInBlacklist) {
        this.buyerInBlacklist = buyerInBlacklist;
    }

    public List<SellerOrderProductInfo> getProducts() {
        return products;
    }

    public void setProducts(List<SellerOrderProductInfo> products) {
        this.products = products;
    }

    public boolean isNeedUploadIdCard() {
        return needUploadIdCard;
    }

    public void setNeedUploadIdCard(boolean needUploadIdCard) {
        this.needUploadIdCard = needUploadIdCard;
    }

    public boolean isHaveUploadedIdCard() {
        return haveUploadedIdCard;
    }

    public void setHaveUploadedIdCard(boolean haveUploadedIdCard) {
        this.haveUploadedIdCard = haveUploadedIdCard;
    }

    public Date getCreateOrderDate() {
        return createOrderDate;
    }

    public void setCreateOrderDate(Date createOrderDate) {
        this.createOrderDate = createOrderDate;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getPostpayTime() {
        return postpayTime;
    }

    public void setPostpayTime(Date postpayTime) {
        this.postpayTime = postpayTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getOrderCancelledTime() {
        return orderCancelledTime;
    }

    public void setOrderCancelledTime(Date orderCancelledTime) {
        this.orderCancelledTime = orderCancelledTime;
    }

    public Date getOrderConfirmedTime() {
        return orderConfirmedTime;
    }

    public void setOrderConfirmedTime(Date orderConfirmedTime) {
        this.orderConfirmedTime = orderConfirmedTime;
    }

    public Date getApplyPostPayTime() {
        return applyPostPayTime;
    }

    public void setApplyPostPayTime(Date applyPostPayTime) {
        this.applyPostPayTime = applyPostPayTime;
    }

    public boolean isOnlyNeedPayOnce() {
        return onlyNeedPayOnce;
    }

    public void setOnlyNeedPayOnce(boolean onlyNeedPayOnce) {
        this.onlyNeedPayOnce = onlyNeedPayOnce;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getSellerCouponCode() {
        return sellerCouponCode;
    }

    public void setSellerCouponCode(String sellerCouponCode) {
        this.sellerCouponCode = sellerCouponCode;
    }

    public BigDecimal getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(BigDecimal totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getExpectedTotalPayAmount() {
        return expectedTotalPayAmount;
    }

    public void setExpectedTotalPayAmount(BigDecimal expectedTotalPayAmount) {
        this.expectedTotalPayAmount = expectedTotalPayAmount;
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

    public BigDecimal getSellerPromotionAmount() {
        return sellerPromotionAmount;
    }

    public void setSellerPromotionAmount(BigDecimal sellerPromotionAmount) {
        this.sellerPromotionAmount = sellerPromotionAmount;
    }

    public BigDecimal getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(BigDecimal giftAmount) {
        this.giftAmount = giftAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getExpectedPayAmount() {
        return expectedPayAmount;
    }

    public void setExpectedPayAmount(BigDecimal expectedPayAmount) {
        this.expectedPayAmount = expectedPayAmount;
    }

    public BigDecimal getExpectedPostpayAmount() {
        return expectedPostpayAmount;
    }

    public void setExpectedPostpayAmount(BigDecimal expectedPostpayAmount) {
        this.expectedPostpayAmount = expectedPostpayAmount;
    }

    public BigDecimal getOriginalPostpayAmount() {
        return originalPostpayAmount;
    }

    public void setOriginalPostpayAmount(BigDecimal originalPostpayAmount) {
        this.originalPostpayAmount = originalPostpayAmount;
    }

    public Boolean getNewSellerOrder() {
        return isNewSellerOrder;
    }

    public void setNewSellerOrder(Boolean newSellerOrder) {
        isNewSellerOrder = newSellerOrder;
    }

    public Boolean getNewCustomerOrder() {
        return isNewCustomerOrder;
    }

    public void setNewCustomerOrder(Boolean newCustomerOrder) {
        isNewCustomerOrder = newCustomerOrder;
    }
}

