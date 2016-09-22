/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.facade;

import com.ymatou.deviceid.facade.model.req.OrderCreditReq;
import com.ymatou.deviceid.facade.model.resp.OrderCreditResp;

/**
 * @author luoshiqian 2016/7/13 15:30
 */
public interface OrderCreditFacade {

    OrderCreditResp getOrderCreditList(OrderCreditReq orderCreditReq);
}
