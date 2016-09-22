
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import javax.validation.constraints.Min;
import javax.ws.rs.QueryParam;

/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerSalesDetailReq extends BaseRequest {


    /**
     * 卖家Id
     */
    @QueryParam("SellerId")
    @Min(1)
    private long sellerId;


    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }
}

