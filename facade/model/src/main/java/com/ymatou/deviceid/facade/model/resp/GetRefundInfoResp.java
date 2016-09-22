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


public class GetRefundInfoResp extends BaseResponse {


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 退款单号
     */
    private String refundNo;


    /**
     * 退款总额
     */
    private BigDecimal total;


    /**
     * 已退现金(退款未结束时为0)
     */
    private BigDecimal refundedCash;


    /**
     * 已退红包(退款未结束时为0)
     */
    private BigDecimal refundedGift;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getRefundedCash() {
        return refundedCash;
    }

    public void setRefundedCash(BigDecimal refundedCash) {
        this.refundedCash = refundedCash;
    }

    public BigDecimal getRefundedGift() {
        return refundedGift;
    }

    public void setRefundedGift(BigDecimal refundedGift) {
        this.refundedGift = refundedGift;
    }
}

