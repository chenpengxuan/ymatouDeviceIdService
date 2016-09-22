

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.RefundBill;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetRefundBillResp extends BaseResponse {


    /**
     * 退款订单及商品
     */
    private RefundBill refundBillandProduct;


    public RefundBill getRefundBillandProduct() {
        return refundBillandProduct;
    }

    public void setRefundBillandProduct(RefundBill refundBillandProduct) {
        this.refundBillandProduct = refundBillandProduct;
    }
}

