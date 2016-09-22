/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.db.model.ext;

import java.math.BigDecimal;

import com.ymatou.deviceid.facade.model.vo.RefundBillProduct;

/**
 * @author luoshiqian 2016/9/2 10:42
 */
public class RefundBillExtPo extends RefundBillProduct {


    // 退款单号
    public String refundBillNo;
    // 订单号
    public long orderId;

    // 退款总金额
    public BigDecimal refundAmount;

    // 退款现金金额
    public BigDecimal refundedAmountOfCash;

    // 退款红包金额
    public BigDecimal refundedAmountOfGift;


    public String getRefundBillNo() {
        return refundBillNo;
    }

    public void setRefundBillNo(String refundBillNo) {
        this.refundBillNo = refundBillNo;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundedAmountOfCash() {
        return refundedAmountOfCash;
    }

    public void setRefundedAmountOfCash(BigDecimal refundedAmountOfCash) {
        this.refundedAmountOfCash = refundedAmountOfCash;
    }

    public BigDecimal getRefundedAmountOfGift() {
        return refundedAmountOfGift;
    }

    public void setRefundedAmountOfGift(BigDecimal refundedAmountOfGift) {
        this.refundedAmountOfGift = refundedAmountOfGift;
    }
}
