
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.math.BigDecimal;
import java.util.List;

import com.google.common.collect.Lists;
import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class RefundBill extends PrintFriendliness {


    /**
     * 退款单号
     */
    private String refundBillNo;


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 退款总金额
     */
    private BigDecimal refundAmount;


    /**
     * 退款现金金额
     */
    private BigDecimal refundedAmountOfCash;


    /**
     * 退款红包金额
     */
    private BigDecimal refundedAmountOfGift;


    /**
     * 退款商品列表
     */
    private List<RefundBillProduct> refundBillProductList = Lists.newArrayList();

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

    public List<RefundBillProduct> getRefundBillProductList() {
        return refundBillProductList;
    }

    public void setRefundBillProductList(List<RefundBillProduct> refundBillProductList) {
        this.refundBillProductList = refundBillProductList;
    }
}

