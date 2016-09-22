package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetPackageDeliveryOrdersCountResp extends BaseMongoResponse {


    /**
     * 扫货订单数量
     */
    private int shangouOrdersCount;


    /**
     * 现货订单数量
     */
    private int spotOrdersCount;


    /**
     * 订单总数量
     */
    private int totalOrdersCount;

    public int getShangouOrdersCount() {
        return shangouOrdersCount;
    }

    public void setShangouOrdersCount(int shangouOrdersCount) {
        this.shangouOrdersCount = shangouOrdersCount;
    }

    public int getSpotOrdersCount() {
        return spotOrdersCount;
    }

    public void setSpotOrdersCount(int spotOrdersCount) {
        this.spotOrdersCount = spotOrdersCount;
    }

    public int getTotalOrdersCount() {
        return totalOrdersCount;
    }

    public void setTotalOrdersCount(int totalOrdersCount) {
        this.totalOrdersCount = totalOrdersCount;
    }
}

