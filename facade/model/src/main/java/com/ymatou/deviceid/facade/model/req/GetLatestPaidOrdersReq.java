package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;

/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetLatestPaidOrdersReq extends BaseRequest {


    /**
     * 一次加载的订单数量（建议小于20.超过100会报错）
     */
    @NotNull
    @Min(1)
    @Max(100)
    @QueryParam("PageSize")
    private int pageSize;


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

