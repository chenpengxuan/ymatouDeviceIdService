

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.PeriodStatusAmountSummary;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerSalesDetailResp extends BaseResponse {


    /**
     * 销售额
     */
    private PeriodStatusAmountSummary sales = new PeriodStatusAmountSummary();

    public PeriodStatusAmountSummary getSales() {
        return sales;
    }

    public void setSales(PeriodStatusAmountSummary sales) {
        this.sales = sales;
    }
}

