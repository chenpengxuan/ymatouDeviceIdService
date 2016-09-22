
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerOrdersByIdsReq extends BaseRequest {


    /**
     * 卖家ID
     */
    private int sellerId;


    /**
     * 订单ID列表.数量不能大于200，也不能为空
     */
    private int[] orderIds;



}

