
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.KeyValue;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerOrdersListSummaryReq extends BaseRequest {


    /**
     * 日期列表
     * 
     * @see com.ymatou.deviceid.facade.model.enums.DateTypeEnum
     */
    private List<Integer> dateList;


    /**
     * 卖家id
     */
    @NotNull
    private Long sellerUserId;


    /**
     * 订单状态列表
     * 
     * @see com.ymatou.deviceid.facade.model.enums.OrderStatusEnum
     */
    private List<Integer> orderStatusList;


    /**
     * 订单过滤条件
     * 
     * @see com.ymatou.deviceid.facade.model.enums.OrderFilterEnum
     */
    private KeyValue<Integer,String> filter;

    public List<Integer> getDateList() {
        return dateList;
    }

    public void setDateList(List<Integer> dateList) {
        this.dateList = dateList;
    }

    public Long getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(Long sellerUserId) {
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
}

