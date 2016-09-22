

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.SellerExportedProductInfo;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class ExportSellerProductInfosResp extends BaseResponse {

    /**
     * 待导出的商品信息（部分）
     */
    private List<SellerExportedProductInfo> sellerExportedPartialProductInfos;

    /**
     * 用来获取余下部分数据的Key
     */
    private String nextPartitionKey;

    public List<SellerExportedProductInfo> getSellerExportedPartialProductInfos() {
        return sellerExportedPartialProductInfos;
    }

    public void setSellerExportedPartialProductInfos(List<SellerExportedProductInfo> sellerExportedPartialProductInfos) {
        this.sellerExportedPartialProductInfos = sellerExportedPartialProductInfos;
    }

    public String getNextPartitionKey() {
        return nextPartitionKey;
    }

    public void setNextPartitionKey(String nextPartitionKey) {
        this.nextPartitionKey = nextPartitionKey;
    }
}

