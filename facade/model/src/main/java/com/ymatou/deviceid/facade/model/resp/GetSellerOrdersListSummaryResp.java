

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


public class GetSellerOrdersListSummaryResp extends BaseResponse {


    /**
     * 订单数量
     */
    private int ordersCount;


    /**
     * 应收订单总额
     */
    private BigDecimal expectedTotalPrice;

    public int getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }

    public BigDecimal getExpectedTotalPrice() {
        return expectedTotalPrice;
    }

    public void setExpectedTotalPrice(BigDecimal expectedTotalPrice) {
        this.expectedTotalPrice = expectedTotalPrice;
    }
}

