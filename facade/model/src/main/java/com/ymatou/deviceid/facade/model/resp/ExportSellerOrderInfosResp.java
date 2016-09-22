

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.SellerExportedOrderInfo;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class ExportSellerOrderInfosResp extends BaseResponse {

    /**
     * 卖家订单导出信息（部分）
     */
    private List<SellerExportedOrderInfo> sellerExportedPartialOrderInfos;

    /**
     * 用来获取余下部分数据的Key
     */
    private String nextPartitionKey;

    public List<SellerExportedOrderInfo> getSellerExportedPartialOrderInfos() {
        return sellerExportedPartialOrderInfos;
    }

    public void setSellerExportedPartialOrderInfos(List<SellerExportedOrderInfo> sellerExportedPartialOrderInfos) {
        this.sellerExportedPartialOrderInfos = sellerExportedPartialOrderInfos;
    }

    public String getNextPartitionKey() {
        return nextPartitionKey;
    }

    public void setNextPartitionKey(String nextPartitionKey) {
        this.nextPartitionKey = nextPartitionKey;
    }
}

