/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.repository;

import com.ymatou.deviceid.facade.model.req.OrderCreditReq;
import com.ymatou.deviceid.facade.model.resp.OrderCreditResp;
import com.ymatou.deviceid.facade.model.vo.OrderCreditInfo;
import com.ymatou.deviceid.infrastructure.Utils;
import com.ymatou.deviceid.infrastructure.db.mapper.CreditDetailMapper;
import com.ymatou.deviceid.infrastructure.db.model.CreditDetailPo;
import com.ymatou.deviceid.infrastructure.db.query.CreditDetailQuery;
import com.ymatou.deviceid.infrastructure.util.Converter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author luoshiqian 2016/5/10 18:36
 */
@Component
public class CreditDetailRepository {

    @Resource
    private CreditDetailMapper creditDetailMapper;
    @Resource
    private CreditDetailQuery creditDetailQuery;


    public CreditDetailPo findById(Long id) {
        return creditDetailMapper.selectByPrimaryKey(id);
    }


    public OrderCreditResp getOrderCreditList(OrderCreditReq orderCreditReq) {
        List<CreditDetailPo> poList = creditDetailQuery.getOrderCreditList(orderCreditReq.getOrderId() + "");

        OrderCreditResp orderCreditResp = new OrderCreditResp();
        poList.forEach(creditDetailPo -> {
            OrderCreditInfo orderCreditInfo = Converter.convert(creditDetailPo, OrderCreditInfo.class);
            orderCreditInfo.setServiceRange(Utils.zeroIfNull(creditDetailPo.getPoint()));
            orderCreditInfo.setSimilarRange(Utils.zeroIfNull(creditDetailPo.getPoint2()));
            orderCreditInfo.setPraiseRange(Utils.zeroIfNull(creditDetailPo.getPoint3()));
            orderCreditInfo.setTargetUserId(Utils.zeroIfNull(creditDetailPo.getTargetUserId()));
            orderCreditInfo.setIp(creditDetailPo.getIP());
            orderCreditResp.getCreditInfoList().add(orderCreditInfo);
        });
        return orderCreditResp;
    }
}
