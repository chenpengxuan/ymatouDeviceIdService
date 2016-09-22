package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.facade.model.vo.FlowsDetail;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderFlowsResp extends BaseResponse {


    /**
     * 是否扫货订单
     */
    @JsonProperty("IsShangouOrder")
    private boolean isShangouOrder;


    /**
     * 资金流
     */
    private List<FlowsDetail> flows;

    public boolean isShangouOrder() {
        return isShangouOrder;
    }

    public void setShangouOrder(boolean shangouOrder) {
        isShangouOrder = shangouOrder;
    }

    public List<FlowsDetail> getFlows() {
        return flows;
    }

    public void setFlows(List<FlowsDetail> flows) {
        this.flows = flows;
    }
}

