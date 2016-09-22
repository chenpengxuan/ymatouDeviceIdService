

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.OrderInfo;

import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerMainOrderListResp extends BaseResponse {


    /**
     * 订单信息列表
     */
    private List<OrderInfo> orderInfoList;


    /**
     * 订单总个数
     */
    private int allRecordCount;



}

