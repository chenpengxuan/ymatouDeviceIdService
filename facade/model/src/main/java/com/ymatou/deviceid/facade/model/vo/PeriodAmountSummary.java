
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class PeriodAmountSummary extends PrintFriendliness {


    /**
     * 今天
     */
    private AmountInfo today;


    /**
     * 昨日
     */
    private AmountInfo yesterday;


    /**
     * 本周
     */
    private AmountInfo week;


    /**
     * 本月
     */
    private AmountInfo month;

    public AmountInfo getToday() {
        return today;
    }

    public void setToday(AmountInfo today) {
        this.today = today;
    }

    public AmountInfo getYesterday() {
        return yesterday;
    }

    public void setYesterday(AmountInfo yesterday) {
        this.yesterday = yesterday;
    }

    public AmountInfo getWeek() {
        return week;
    }

    public void setWeek(AmountInfo week) {
        this.week = week;
    }

    public AmountInfo getMonth() {
        return month;
    }

    public void setMonth(AmountInfo month) {
        this.month = month;
    }
}

