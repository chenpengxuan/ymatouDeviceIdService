package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.enums.OrderStatusEnum;

import java.util.HashMap;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerOrderCountResp extends BaseMongoResponse {


    /**
     * 订单数量,其中key值为订单状态，value对应订单数量
     * HashMap<OrderStatusEnum, int>
     *
     * @see OrderStatusEnum
     */
    private HashMap<Integer, Integer> allRecordCountDic;

    public HashMap<Integer, Integer> getAllRecordCountDic() {
        return allRecordCountDic;
    }

    public void setAllRecordCountDic(HashMap<Integer, Integer> allRecordCountDic) {
        this.allRecordCountDic = allRecordCountDic;
    }
}

