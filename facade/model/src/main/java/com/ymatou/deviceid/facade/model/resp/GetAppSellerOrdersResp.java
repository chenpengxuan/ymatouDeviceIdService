package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.SellerOrderInfoV3;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetAppSellerOrdersResp extends BaseMongoResponse {


    /**
     * 卖家订单列表信息
     */
    private List<SellerOrderInfoV3> orders;


    /**
     * 本页最后一个订单号，用于请求下一页时赋值给Request的LastOrderId(注意这很重要，否则获取下一页数据会出错)
     */
    private Integer lastOrderId;

    public List<SellerOrderInfoV3> getOrders() {
        return orders;
    }

    public void setOrders(List<SellerOrderInfoV3> orders) {
        this.orders = orders;
    }

    public Integer getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(Integer lastOrderId) {
        this.lastOrderId = lastOrderId;
    }
}

