package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.enums.LogisticsTypeEnum;
import com.ymatou.deviceid.facade.model.enums.OrderQueryTimeType;
import com.ymatou.deviceid.facade.model.enums.OrderStatusEnum;

import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerOrdersReq extends BaseMongoRequest {


    /**
     * 卖家ID
     */
    @Min(value = 1, message = "卖家ID不能为0")
    private long sellerId;


    /**
     * 订单状态.当前不支持默认值Unknown(会抛异常)
     *
     * @see OrderStatusEnum
     */
    @Min(value = 1, message = "需要指定OrderStatus")
    private int orderStatus;


    /**
     * 配送方式.不要传Unknown(会抛异常)
     *
     * @see LogisticsTypeEnum
     */
    private List<Integer> logistics;


    /**
     * 起始时间(返回大于等于起始时间的数据)
     */
    private Date beginTime;


    /**
     * 截止时间(只返回小于截止时间的数据)
     */
    private Date endTime;


    /**
     * 时间类型
     *
     * @see OrderQueryTimeType
     */
    @Min(value = 1, message = "需要指定TimeType")
    private int timeType;


    /**
     * 页数
     */
    private int pageIndex;


    /**
     * 每页记录数.不能小于1,也不能大于200
     */
    private int pageSize;

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Integer> getLogistics() {
        return logistics;
    }

    public void setLogistics(List<Integer> logistics) {
        this.logistics = logistics;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getTimeType() {
        return timeType;
    }

    public void setTimeType(int timeType) {
        this.timeType = timeType;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

