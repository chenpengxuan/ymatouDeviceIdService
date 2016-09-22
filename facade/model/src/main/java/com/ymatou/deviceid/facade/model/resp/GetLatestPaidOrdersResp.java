

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.google.common.collect.Lists;
import com.ymatou.deviceid.facade.model.vo.GetLatestPaidOrderInfo;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetLatestPaidOrdersResp extends BaseResponse {


    /**
     * 订单信息
     */
    private List<GetLatestPaidOrderInfo> orders = Lists.newArrayList();


    public List<GetLatestPaidOrderInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<GetLatestPaidOrderInfo> orders) {
        this.orders = orders;
    }
}

