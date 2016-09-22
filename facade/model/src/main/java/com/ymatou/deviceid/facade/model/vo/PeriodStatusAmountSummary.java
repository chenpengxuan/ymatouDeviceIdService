
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

public class PeriodStatusAmountSummary extends PrintFriendliness {


    /**
     * 今天
     */
    private StatusAmountSummary today;


    /**
     * 昨日
     */
    private StatusAmountSummary yesterday;


    /**
     * 本周
     */
    private StatusAmountSummary week;


    /**
     * 本月
     */
    private StatusAmountSummary month;

    public StatusAmountSummary getToday() {
        return today;
    }

    public void setToday(StatusAmountSummary today) {
        this.today = today;
    }

    public StatusAmountSummary getYesterday() {
        return yesterday;
    }

    public void setYesterday(StatusAmountSummary yesterday) {
        this.yesterday = yesterday;
    }

    public StatusAmountSummary getWeek() {
        return week;
    }

    public void setWeek(StatusAmountSummary week) {
        this.week = week;
    }

    public StatusAmountSummary getMonth() {
        return month;
    }

    public void setMonth(StatusAmountSummary month) {
        this.month = month;
    }
}

