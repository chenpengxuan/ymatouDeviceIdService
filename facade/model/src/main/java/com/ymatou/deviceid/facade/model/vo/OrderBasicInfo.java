package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class OrderBasicInfo extends PrintFriendliness {


    /**
     * 订单号
     */
    private long iD;


    /**
     * 下单时间
     */
    private Date createdTime;


    /**
     * 取消时间
     */
    private Date cancelledTime;


    /**
     * 接单时间
     */
    private Date acceptedTime;


    /**
     * 订单来源
     */
    private String source;


    /**
     * 订单类型0:商品订单1:扫货订单2:下单器订单
     */
    private int type;


    /**
     * 订单状态
     */
    private int status;


    /**
     * 订单总金额
     */
    private BigDecimal totalPrice;


    /**
     * 订单折扣
     */
    private BigDecimal discount;

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getCancelledTime() {
        return cancelledTime;
    }

    public void setCancelledTime(Date cancelledTime) {
        this.cancelledTime = cancelledTime;
    }

    public Date getAcceptedTime() {
        return acceptedTime;
    }

    public void setAcceptedTime(Date acceptedTime) {
        this.acceptedTime = acceptedTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}

