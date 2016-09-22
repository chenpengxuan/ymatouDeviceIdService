

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.SellerOrderInfoDetail;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetAppSellerOrderResp extends BaseResponse {

    /**
     * 卖家订单列表信息
     */
    private SellerOrderInfoDetail order;

    public SellerOrderInfoDetail getOrder() {
        return order;
    }

    public void setOrder(SellerOrderInfoDetail order) {
        this.order = order;
    }
}

