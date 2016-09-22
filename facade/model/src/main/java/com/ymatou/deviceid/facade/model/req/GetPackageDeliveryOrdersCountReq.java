package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import javax.ws.rs.QueryParam;
import java.util.Date;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetPackageDeliveryOrdersCountReq extends BaseMongoRequest {


    /**
     * 卖家ID
     */
    @QueryParam("SellerId")
    private int sellerId;


    /**
     * 是否已国内配送.true:仅查询国内已配送false:仅查询国内未配送null:全部拼邮订单
     */
    @QueryParam("DomesticDelivered")
    private Boolean domesticDelivered;


    /**
     * 起始时间(基于下单时间).null表示不考虑
     */
    @QueryParam("TimeFrom")
    private String timeFrom;


    /**
     * 结束时间(基于下单时间).null表示不考虑
     */
    @QueryParam("TimeTo")
    private String timeTo;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public Boolean getDomesticDelivered() {
        return domesticDelivered;
    }

    public void setDomesticDelivered(Boolean domesticDelivered) {
        this.domesticDelivered = domesticDelivered;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public Date getBeginTime() {
        return this.convertDotNetDateToDate(timeFrom);
    }

    public Date getEndTime() {
        return this.convertDotNetDateToDate(timeTo);
    }
}

