package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.util.Date;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class OrderTransferInfo extends PrintFriendliness {


    /**
     * 发货时间
     */
    private Date deliveredTime;


    /**
     * 确认收货时间
     */
    private Date receiptConfirmedTime;

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public Date getReceiptConfirmedTime() {
        return receiptConfirmedTime;
    }

    public void setReceiptConfirmedTime(Date receiptConfirmedTime) {
        this.receiptConfirmedTime = receiptConfirmedTime;
    }
}

