

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.AmountInfo;
import com.ymatou.deviceid.facade.model.vo.PeriodAmountSummary;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerSalesInfoResp extends BaseResponse {


    /**
     * 今日销售额
     */
    private AmountInfo todaySales;


    /**
     * 销售额
     */
    private PeriodAmountSummary sales;


    /**
     * 成交额
     */
    private PeriodAmountSummary turnovers;


    public AmountInfo getTodaySales() {
        return todaySales;
    }

    public void setTodaySales(AmountInfo todaySales) {
        this.todaySales = todaySales;
    }

    public PeriodAmountSummary getSales() {
        return sales;
    }

    public void setSales(PeriodAmountSummary sales) {
        this.sales = sales;
    }

    public PeriodAmountSummary getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(PeriodAmountSummary turnovers) {
        this.turnovers = turnovers;
    }
}

