
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.joda.time.DateTime;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class TimeRange extends PrintFriendliness {

    /**
     * 起始时间
     */
    @JsonDeserialize(converter = DatetimeConverter.class)
    private DateTime begin;

    /**
     * 结束时间
     */
    @JsonDeserialize(converter = DatetimeConverter.class)
    private DateTime end;

    public TimeRange(){}

    public TimeRange(DateTime begin, DateTime end) {
        this.begin = begin;
        this.end = end;
    }

    public DateTime getBegin() {
        return begin;
    }

    public void setBegin(DateTime begin) {
        this.begin = begin;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }
}

