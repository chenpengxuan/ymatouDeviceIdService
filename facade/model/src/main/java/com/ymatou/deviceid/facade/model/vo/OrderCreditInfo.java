/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.model.vo;

import java.util.Date;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author luoshiqian 2016/8/30 14:40
 */
public class OrderCreditInfo extends PrintFriendliness {


    // 状态
    private int action;
    // 创建日期
    private Date addTime;

    // 订单评价id
    private long creditDetailId;
    // 评价描述
    private String description;

    // 是否是下单器订单相关评价
    private Boolean fromPurchaseAgent;

    // 买家ip
    private String ip;
    // 好评度
    private int praiseRange;
    // 卖家回复
    private String sellerReply;
    // 卖家回复时间
    private Date sellerReplyUpdateTime;
    // 卖家的服务态度
    private double serviceRange;
    // 与描述相符程度
    private double similarRange;
    private int sort;
    // 评价相关订单号
    private String targetId;
    // 卖家id
    private long targetUserId;
    private int type;
    // 更新日期
    private Date updateTime;
    // 买家id
    private long userId;

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public long getCreditDetailId() {
        return creditDetailId;
    }

    public void setCreditDetailId(long creditDetailId) {
        this.creditDetailId = creditDetailId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFromPurchaseAgent() {
        return fromPurchaseAgent;
    }

    public void setFromPurchaseAgent(Boolean fromPurchaseAgent) {
        this.fromPurchaseAgent = fromPurchaseAgent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPraiseRange() {
        return praiseRange;
    }

    public void setPraiseRange(int praiseRange) {
        this.praiseRange = praiseRange;
    }

    public String getSellerReply() {
        return sellerReply;
    }

    public void setSellerReply(String sellerReply) {
        this.sellerReply = sellerReply;
    }

    public Date getSellerReplyUpdateTime() {
        return sellerReplyUpdateTime;
    }

    public void setSellerReplyUpdateTime(Date sellerReplyUpdateTime) {
        this.sellerReplyUpdateTime = sellerReplyUpdateTime;
    }

    public double getServiceRange() {
        return serviceRange;
    }

    public void setServiceRange(double serviceRange) {
        this.serviceRange = serviceRange;
    }

    public double getSimilarRange() {
        return similarRange;
    }

    public void setSimilarRange(double similarRange) {
        this.similarRange = similarRange;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public long getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(long targetUserId) {
        this.targetUserId = targetUserId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
