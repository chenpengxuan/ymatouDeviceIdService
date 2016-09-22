package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderListByOrderIdListReq extends BaseRequest {


    /**
     * 卖家用户id
     */
    private int sellerId;


    /**
     * 订单id列表
     */
    private List<Long> orderIdList;


    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public List<Long> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<Long> orderIdList) {
        this.orderIdList = orderIdList;
    }
}

