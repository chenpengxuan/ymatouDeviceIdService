package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerConsumersResp extends BaseResponse {


    /**
     * 卖家顾客ID
     */
    private List<String> consumers;


    /**
     * 顾客数量
     */
    private int consumersCount;

    public List<String> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<String> consumers) {
        this.consumers = consumers;
    }

    public int getConsumersCount() {
        return consumersCount;
    }

    public void setConsumersCount(int consumersCount) {
        this.consumersCount = consumersCount;
    }
}

