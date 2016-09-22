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

public class OrderPaymentInfo extends PrintFriendliness {


    /**
     * 实付金额
     */
    private BigDecimal actualPaid;


    /**
     * 支付明细.[0]:全款或订金[1]:补款.未发生支付时Details=null,仅支付全款或订金时Details.Length=1
     */
    private List<OrderPaymentDetail> details;


    /**
     * 合计信息
     */
    private FundSummary summary;

    public BigDecimal getActualPaid() {
        return actualPaid;
    }

    public void setActualPaid(BigDecimal actualPaid) {
        this.actualPaid = actualPaid;
    }

    public List<OrderPaymentDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderPaymentDetail> details) {
        this.details = details;
    }

    public FundSummary getSummary() {
        return summary;
    }

    public void setSummary(FundSummary summary) {
        this.summary = summary;
    }
}

