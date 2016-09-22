package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.OrderInfoForRelated;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetRelatedOrderInfosResp extends BaseResponse {


    /**
     * 订单信息
     */
    private List<OrderInfoForRelated> orderInfoList;

    public List<OrderInfoForRelated> getOrderInfoList() {
        return orderInfoList;
    }

    public void setOrderInfoList(List<OrderInfoForRelated> orderInfoList) {
        this.orderInfoList = orderInfoList;
    }
}

