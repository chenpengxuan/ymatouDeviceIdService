package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.FlowsDetail;
import com.ymatou.deviceid.facade.model.vo.FundSummary;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderFundDetailResp extends BaseResponse {


    /**
     * 是否仅需一次付款(即全款支付)
     */
    private boolean onlyNeedPayOnce;


    /**
     * 资金流
     */
    private List<FlowsDetail> flows;


    /**
     * 合计信息
     */
    private FundSummary summary;


    public boolean isOnlyNeedPayOnce() {
        return onlyNeedPayOnce;
    }

    public void setOnlyNeedPayOnce(boolean onlyNeedPayOnce) {
        this.onlyNeedPayOnce = onlyNeedPayOnce;
    }

    public List<FlowsDetail> getFlows() {
        return flows;
    }

    public void setFlows(List<FlowsDetail> flows) {
        this.flows = flows;
    }

    public FundSummary getSummary() {
        return summary;
    }

    public void setSummary(FundSummary summary) {
        this.summary = summary;
    }
}

