

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.google.common.collect.Maps;
import com.ymatou.deviceid.facade.model.vo.OrderProductAmountInfo;

import java.util.HashMap;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderProductAmountInfosResp extends BaseResponse {


    /**
     * 商品数量信息集合，与请求中的商品ID一一对应
     */
    private HashMap<String,OrderProductAmountInfo> amountInfos = Maps.newHashMap();


    public HashMap<String, OrderProductAmountInfo> getAmountInfos() {
        return amountInfos;
    }

    public void setAmountInfos(HashMap<String, OrderProductAmountInfo> amountInfos) {
        this.amountInfos = amountInfos;
    }
}

