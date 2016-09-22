package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerOrderCountReq extends BaseMongoRequest {


    /**
     * 商家id
     */
    private long sellerId;


    /**
     * 是否为闪购订单
     */
    @JsonProperty("IsShangouOrder")
    private Boolean isShangouOrder;


    /**
     * 订单状态列表
     */
    private List<Integer> orderStatusList;


    /**
     * 订单创建日期(查询的开始日期)
     */
    private Date beginTime;


    /**
     * 订单创建日期(查询的结束日期)
     */
    private Date endTime;

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public Boolean getShangouOrder() {
        return isShangouOrder;
    }

    public void setShangouOrder(Boolean shangouOrder) {
        isShangouOrder = shangouOrder;
    }

    public List<Integer> getOrderStatusList() {
        return orderStatusList;
    }

    public void setOrderStatusList(List<Integer> orderStatusList) {
        this.orderStatusList = orderStatusList;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}

