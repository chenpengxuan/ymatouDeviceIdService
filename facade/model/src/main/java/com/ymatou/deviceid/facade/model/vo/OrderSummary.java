package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

public class OrderSummary extends PrintFriendliness {


    /**
     * 运单号
     */
    private String summary;


    /**
     * 运单类型
     */
    private Integer billType;


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }
}

