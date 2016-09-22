
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.math.BigDecimal;


/**
 * @author zhangyifan 2016/9/1 12:00
 */

import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.enums.RefundStatusEnum;
import com.ymatou.deviceid.facade.model.enums.SalesRefundStatusEnum;

public class OrderProductRefundInfo extends PrintFriendliness {


    /**
     * 退货退款状态
     */
    private SalesRefundStatusEnum salesRefundStatus;


    /**
     * 退款状态
     */
    private RefundStatusEnum refundStatus;


    /**
     * 退款金额
     */
    private BigDecimal refundAmount;


    /**
     * 退现金金额
     */
    private BigDecimal refundedAmountOfCash;


    /**
     * 退红包金额
     */
    private BigDecimal refundedAmountOfGift;


    /**
     * 平台优惠券
     */
    private BigDecimal settlementAmountOfCoupon;


    /**
     * 退货退款商品数量
     */
    private BigDecimal refundProductNum;



}

