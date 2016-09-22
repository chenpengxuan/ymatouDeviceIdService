

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.Flows;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderSalesRefundFlowsResp extends BaseResponse {


    /**
     * 订单资金信息
     */
    private Flows order;


    /**
     * 退款退货资金信息
     */
    private Flows refund;

    public Flows getOrder() {
        return order;
    }

    public void setOrder(Flows order) {
        this.order = order;
    }

    public Flows getRefund() {
        return refund;
    }

    public void setRefund(Flows refund) {
        this.refund = refund;
    }
}

