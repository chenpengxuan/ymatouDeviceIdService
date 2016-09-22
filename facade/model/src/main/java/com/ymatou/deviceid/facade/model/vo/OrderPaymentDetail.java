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

public class OrderPaymentDetail extends PrintFriendliness {


    /**
     * 1.全款或订金2.补款
     */
    private int type;


    /**
     * 支付时间
     */
    private Date paidTime;


    /**
     * 内部交易号(码头支付交易号)
     */
    private String internalTradingNo;


    /**
     * 外部交易号(支付平台支付流水号.仅在发生第三方支付且是全款或订金支付时有值)
     */
    private String externalTradingNo;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public String getInternalTradingNo() {
        return internalTradingNo;
    }

    public void setInternalTradingNo(String internalTradingNo) {
        this.internalTradingNo = internalTradingNo;
    }

    public String getExternalTradingNo() {
        return externalTradingNo;
    }

    public void setExternalTradingNo(String externalTradingNo) {
        this.externalTradingNo = externalTradingNo;
    }
}

