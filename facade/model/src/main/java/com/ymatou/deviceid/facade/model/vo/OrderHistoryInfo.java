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

public class OrderHistoryInfo extends PrintFriendliness {


    /**
     * 更新时间
     */
    public Date updateTime;
    /**
     * 备注
     */
    public String memo;
    /**
     * 交易id
     */
    public Long traddingId;

    /**
     * 订单历史Id
     */
    private String tradingStatusId;


    /**
     * 订单状态
     */
    private int tradingStatus;

    public String getTradingStatusId() {
        return tradingStatusId;
    }

    public void setTradingStatusId(String tradingStatusId) {
        this.tradingStatusId = tradingStatusId;
    }

    public int getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(int tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getTraddingId() {
        return traddingId;
    }

    public void setTraddingId(Long traddingId) {
        this.traddingId = traddingId;
    }
}

