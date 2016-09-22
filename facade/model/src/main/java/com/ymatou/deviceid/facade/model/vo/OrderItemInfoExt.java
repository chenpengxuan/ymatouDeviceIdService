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

public class OrderItemInfoExt extends PrintFriendliness {


    /**
     * 是否可返红包或免运卡
     */
    private boolean giftAvail4Reward;


    /**
     * 活动Id
     */
    private int activityId;


    /**
     * 活动模版Id
     */
    private int activityTemplateId;


    public boolean isGiftAvail4Reward() {
        return giftAvail4Reward;
    }

    public void setGiftAvail4Reward(boolean giftAvail4Reward) {
        this.giftAvail4Reward = giftAvail4Reward;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(int activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }
}

