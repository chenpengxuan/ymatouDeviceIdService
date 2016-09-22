/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.rest;

import com.ymatou.deviceid.facade.OrderCreditFacade;
import com.ymatou.deviceid.facade.model.req.OrderCreditReq;
import com.ymatou.deviceid.facade.model.resp.OrderCreditResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Component("orderCreditResource")
@Produces({"application/json; charset=UTF-8"})
@Consumes({MediaType.APPLICATION_JSON})
@Path("/{api:(?i:api)}")
public class OrderCreditResourceImpl implements OrderCreditResource {

    @Autowired
    private OrderCreditFacade orderCreditFacade;

    @GET
    @Path("/{SellerQuery:(?i:SellerQuery)}/{getOrderCreditList:(?i:getOrderCreditList)}")
    @Override
    public BaseNetCompatibleResp getOrderCreditList(@BeanParam OrderCreditReq req) {
        OrderCreditResp resp = orderCreditFacade.getOrderCreditList(req);

        return BaseNetCompatibleResp.newInstance(resp);
    }
}
