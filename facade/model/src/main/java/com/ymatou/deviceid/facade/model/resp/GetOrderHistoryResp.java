

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.OrderHistoryInfo;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderHistoryResp extends BaseResponse {


    /**
     * 订单历史列表
     */
    private List<OrderHistoryInfo> orderHistoryList;


    public List<OrderHistoryInfo> getOrderHistoryList() {
        return orderHistoryList;
    }

    public void setOrderHistoryList(List<OrderHistoryInfo> orderHistoryList) {
        this.orderHistoryList = orderHistoryList;
    }
}

