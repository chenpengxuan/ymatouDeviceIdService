package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.SellerOrderInfo;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerOrdersResp extends BaseMongoResponse {


    /**
     * 符合查询条件的订单总数量
     */
    private int totalOrdersCount;


    /**
     * 订单信息
     */
    private List<SellerOrderInfo> orders;

    public int getTotalOrdersCount() {
        return totalOrdersCount;
    }

    public void setTotalOrdersCount(int totalOrdersCount) {
        this.totalOrdersCount = totalOrdersCount;
    }

    public List<SellerOrderInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<SellerOrderInfo> orders) {
        this.orders = orders;
    }
}

