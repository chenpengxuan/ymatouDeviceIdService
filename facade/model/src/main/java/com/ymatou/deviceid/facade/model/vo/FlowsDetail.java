package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.enums.CouponChannelEnum;
import com.ymatou.deviceid.facade.model.enums.OrderFlowOperationEnum;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class FlowsDetail extends PrintFriendliness {


    /**
     * 发生时间
     */
    private Date time;


    /**
     * true:收入false:支出
     */
    @JsonProperty("isIncoming")
    private boolean isIncoming;


    /**
     * 操作类型
     *
     * @see OrderFlowOperationEnum
     */
    private int operation;


    /**
     * 凭证，如：退货退款单号、交易号
     */
    private String evidence;


    /**
     * 优惠券渠道：卖家优惠券、平台优惠券
     *
     * @see CouponChannelEnum
     */
    private Integer couponChannel = 0;


    /**
     * 平台优惠券码
     */
    private String couponCode;


    /**
     * 免运卡
     */
    private BigDecimal freeCard = BigDecimal.ZERO;


    /**
     * 调价
     */
    private BigDecimal priceChange = BigDecimal.ZERO;


    /**
     * 总额
     */
    private BigDecimal total = BigDecimal.ZERO;


    /**
     * 现金
     */
    private BigDecimal cash = BigDecimal.ZERO;


    /**
     * 红包
     */
    private BigDecimal gift = BigDecimal.ZERO;


    /**
     * 平台优惠券
     */
    private BigDecimal coupon = BigDecimal.ZERO;


    /**
     * 账户余额支付金额
     */
    private BigDecimal accountPaidAmount = BigDecimal.ZERO;

    /**
     * 第三方支付金额
     */
    private BigDecimal thirdPartyPaidAmount;


    /**
     * 第三方名称.alipay:支付宝wechat:微信
     */
    private String thirdPartyName;

    /**
     * 卖家优惠券码
     */
    private String sellerCouponCode;

    /**
     * 商家优惠券
     */
    private BigDecimal sellerCoupon = BigDecimal.ZERO;
    /**
     * 运费
     */
    private BigDecimal freight = BigDecimal.ZERO;

    public BigDecimal getAccountPaidAmount() {
        return accountPaidAmount;
    }

    public void setAccountPaidAmount(BigDecimal accountPaidAmount) {
        this.accountPaidAmount = accountPaidAmount;
    }

    public BigDecimal getThirdPartyPaidAmount() {
        return thirdPartyPaidAmount;
    }

    public void setThirdPartyPaidAmount(BigDecimal thirdPartyPaidAmount) {
        this.thirdPartyPaidAmount = thirdPartyPaidAmount;
    }

    public String getThirdPartyName() {
        return thirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        this.thirdPartyName = thirdPartyName;
    }

    public String getSellerCouponCode() {
        return sellerCouponCode;
    }

    public void setSellerCouponCode(String sellerCouponCode) {
        this.sellerCouponCode = sellerCouponCode;
    }

    public BigDecimal getSellerCoupon() {
        return sellerCoupon;
    }

    public void setSellerCoupon(BigDecimal sellerCoupon) {
        this.sellerCoupon = sellerCoupon;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isIncoming() {
        return isIncoming;
    }

    public void setIncoming(boolean incoming) {
        isIncoming = incoming;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    public Integer getCouponChannel() {
        return couponChannel;
    }

    public void setCouponChannel(Integer couponChannel) {
        this.couponChannel = couponChannel;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getFreeCard() {
        return freeCard;
    }

    public void setFreeCard(BigDecimal freeCard) {
        this.freeCard = freeCard;
    }

    public BigDecimal getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(BigDecimal priceChange) {
        this.priceChange = priceChange;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getGift() {
        return gift;
    }

    public void setGift(BigDecimal gift) {
        this.gift = gift;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
}

