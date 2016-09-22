package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.enums.DateTypeEnum;
import com.ymatou.deviceid.facade.model.enums.OrderFilterEnum;
import com.ymatou.deviceid.facade.model.enums.OrderStatusEnum;
import com.ymatou.deviceid.facade.model.vo.KeyValue;

import javax.validation.constraints.Min;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetAppSellerOrdersReq extends BaseMongoRequest {


    /**
     * 日期列表
     *
     * @see DateTypeEnum
     */
    private List<Integer> dateList;


    /**
     * 卖家id
     */
    @Min(value = 1, message = "卖家ID不能为0")
    private int sellerUserId;


    /**
     * 订单状态列表
     *
     * @see OrderStatusEnum
     */
    private List<Integer> orderStatusList;


    /**
     * 订单过滤条件
     *
     * @see OrderFilterEnum
     */
    private KeyValue<Integer, String> filter;


    /**
     * 最后一条订单号(用于分页)
     */
    private Integer lastOrderId;


    /**
     * 要获取的订单条目数，如果为空则获取全部
     */
    private Integer orderNum;

    public List<Integer> getDateList() {
        return dateList;
    }

    public void setDateList(List<Integer> dateList) {
        this.dateList = dateList;
    }

    public int getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(int sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public List<Integer> getOrderStatusList() {
        return orderStatusList;
    }

    public void setOrderStatusList(List<Integer> orderStatusList) {
        this.orderStatusList = orderStatusList;
    }

    public KeyValue<Integer, String> getFilter() {
        return filter;
    }

    public void setFilter(KeyValue<Integer, String> filter) {
        this.filter = filter;
    }

    public Integer getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(Integer lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}

