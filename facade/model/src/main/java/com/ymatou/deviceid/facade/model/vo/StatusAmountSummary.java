
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.math.BigDecimal;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class StatusAmountSummary extends PrintFriendliness {


    /**
     * 待支付订单金额
     */
    private AmountInfo unpaid;


    /**
     * 部分付款订单金额(订金)
     */
    private AmountInfo partialPaid;


    /**
     * 已付全款订单金额
     */
    private AmountInfo fullPaid;


    /**
     * 已取消订单金额(金额为负数)
     */
    private AmountInfo cancelled;


    /**
     * 金额总和
     */
    private BigDecimal total;


    public AmountInfo getUnpaid() {
        return unpaid;
    }

    public void setUnpaid(AmountInfo unpaid) {
        this.unpaid = unpaid;
    }

    public AmountInfo getPartialPaid() {
        return partialPaid;
    }

    public void setPartialPaid(AmountInfo partialPaid) {
        this.partialPaid = partialPaid;
    }

    public AmountInfo getFullPaid() {
        return fullPaid;
    }

    public void setFullPaid(AmountInfo fullPaid) {
        this.fullPaid = fullPaid;
    }

    public AmountInfo getCancelled() {
        return cancelled;
    }

    public void setCancelled(AmountInfo cancelled) {
        this.cancelled = cancelled;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}

