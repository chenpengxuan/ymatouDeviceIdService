/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.model.resp;


import com.google.common.collect.Lists;
import com.ymatou.deviceid.facade.model.vo.OrderCreditInfo;

import java.util.List;

public class OrderCreditResp extends BaseResponse {

    private static final long serialVersionUID = -7541098366339777912L;
    private List<OrderCreditInfo> creditInfoList = Lists.newArrayList();


    public List<OrderCreditInfo> getCreditInfoList() {
        return creditInfoList;
    }

    public void setCreditInfoList(List<OrderCreditInfo> creditInfoList) {
        this.creditInfoList = creditInfoList;
    }
}
