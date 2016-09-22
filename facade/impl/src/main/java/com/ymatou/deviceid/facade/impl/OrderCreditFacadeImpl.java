/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ymatou.deviceid.facade.OrderCreditFacade;
import com.ymatou.deviceid.facade.model.req.OrderCreditReq;
import com.ymatou.deviceid.facade.model.resp.OrderCreditResp;
import com.ymatou.deviceid.repository.CreditDetailRepository;

/**
 * @author luoshiqian 2016/8/30 18:28
 */
@Component("orderCreditFacade")
public class OrderCreditFacadeImpl implements OrderCreditFacade {

    @Autowired
    private CreditDetailRepository creditDetailRepository;

    @Override
    public OrderCreditResp getOrderCreditList(OrderCreditReq orderCreditReq) {
        return creditDetailRepository.getOrderCreditList(orderCreditReq);
    }
}
