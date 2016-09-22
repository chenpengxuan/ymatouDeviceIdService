
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import org.hibernate.validator.constraints.NotBlank;

import javax.ws.rs.QueryParam;

/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetRefundBillReq extends BaseRequest {


    /**
     * 退款单号
     */
    @NotBlank
    @QueryParam("RefundBillNo")
    private String refundBillNo;


    public String getRefundBillNo() {
        return refundBillNo;
    }

    public void setRefundBillNo(String refundBillNo) {
        this.refundBillNo = refundBillNo;
    }
}

