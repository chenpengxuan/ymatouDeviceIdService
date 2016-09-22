package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


import javax.validation.constraints.Min;
import javax.ws.rs.QueryParam;
import java.util.Date;

public class GetSellerConsumersReq extends BaseRequest {


    /**
     * 卖家ID
     */
    @Min(value = 1, message = "sellerId不能为0")
    @QueryParam("SellerId")
    private int sellerId;


    /**
     * 仅查询有成交记录的
     */
    @QueryParam("Turnover")
    private boolean turnover;


    /**
     * 是否闪购订单.null为全部
     */
    @QueryParam("Shangou")
    private Boolean shangou;


    /**
     * 仅获取顾客数量
     */
    @QueryParam("CountOnly")
    private boolean countOnly;

    /**
     * 是否排除黑名单顾客
     */
    @QueryParam("ExcludeBlacklistConsumers")
    private boolean excludeBlacklistConsumers;

    /**
     * 开始时间
     */
    @QueryParam("BeginTime")
    private String strBeginTime;

    /**
     * 结束时间
     */
    @QueryParam("EndTime")
    private String strEndTime;

    public String getStrBeginTime() {
        return strBeginTime;
    }

    public void setStrBeginTime(String strBeginTime) {
        this.strBeginTime = strBeginTime;
    }

    public String getStrEndTime() {
        return strEndTime;
    }

    public void setStrEndTime(String strEndTime) {
        this.strEndTime = strEndTime;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public boolean isTurnover() {
        return turnover;
    }

    public void setTurnover(boolean turnover) {
        this.turnover = turnover;
    }

    public Boolean getShangou() {
        return shangou;
    }

    public void setShangou(Boolean shangou) {
        this.shangou = shangou;
    }

    public boolean isCountOnly() {
        return countOnly;
    }

    public void setCountOnly(boolean countOnly) {
        this.countOnly = countOnly;
    }

    public boolean isExcludeBlacklistConsumers() {
        return excludeBlacklistConsumers;
    }

    public void setExcludeBlacklistConsumers(boolean excludeBlacklistConsumers) {
        this.excludeBlacklistConsumers = excludeBlacklistConsumers;
    }

    public Date getBeginTime() {
        return this.convertDotNetDateToDate(strBeginTime);
    }


    public Date getEndTime() {
        return this.convertDotNetDateToDate(strEndTime);
    }

}

