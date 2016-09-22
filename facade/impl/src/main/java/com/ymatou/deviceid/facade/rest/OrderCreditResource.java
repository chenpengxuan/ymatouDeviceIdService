/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.rest;


import com.ymatou.deviceid.facade.model.req.OrderCreditReq;

public interface OrderCreditResource {

    BaseNetCompatibleResp getOrderCreditList(OrderCreditReq req);
}
