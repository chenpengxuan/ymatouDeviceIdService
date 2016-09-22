/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.db.model.args;

import java.util.List;

import org.joda.time.DateTime;

import com.ymatou.deviceid.infrastructure.constants.Constants;

/**
 * @author luoshiqian 2016/9/6 12:43
 */
public class GetSellerOrdersListSummaryArgs {

    private long sellerId;

    private int orderSellerAcceptedStatus;

    private List<Integer> orderStatusList;

    private Boolean paidInFull;

    private DateTime timeFrom;
    private String timeFromStr;

    private DateTime timeTo;
    private String timeToStr;

    private int filter;

    private String filterValue;


    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public int getOrderSellerAcceptedStatus() {
        return orderSellerAcceptedStatus;
    }

    public void setOrderSellerAcceptedStatus(int orderSellerAcceptedStatus) {
        this.orderSellerAcceptedStatus = orderSellerAcceptedStatus;
    }

    public List<Integer> getOrderStatusList() {
        return orderStatusList;
    }

    public void setOrderStatusList(List<Integer> orderStatusList) {
        this.orderStatusList = orderStatusList;
    }

    public Boolean getPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(Boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    public DateTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(DateTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public DateTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(DateTime timeTo) {
        this.timeTo = timeTo;
    }

    public int getFilter() {
        return filter;
    }

    public void setFilter(int filter) {
        this.filter = filter;
    }

    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    public String getTimeFromStr() {
        if(null != timeFrom){
            return formatDate(timeFrom);
        }
        return timeFromStr;
    }

    public String getTimeToStr() {
        if(null != timeTo){
            return formatDate(timeTo);
        }
        return timeToStr;
    }

    private String formatDate(DateTime dateTime) {
        return dateTime.toString(Constants.FORMATTER_YYYYMMDD) + " 00:00:00";
    }
}
