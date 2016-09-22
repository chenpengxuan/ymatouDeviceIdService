package com.ymatou.deviceid.infrastructure.db.model.ext;

/**
 * Created by zhangyifan on 2016/9/6.
 */
public class OrderInfoExtExtPo extends OrderInfoExtPo {

    private String orderInfoExtId;
    private Boolean giftAvail4Reward;
    private Integer activityId;
    private Integer activityTemplateId;

    public String getOrderInfoExtId() {
        return orderInfoExtId;
    }

    public void setOrderInfoExtId(String orderInfoExtId) {
        this.orderInfoExtId = orderInfoExtId;
    }

    public Boolean getGiftAvail4Reward() {
        return giftAvail4Reward;
    }

    public void setGiftAvail4Reward(Boolean giftAvail4Reward) {
        this.giftAvail4Reward = giftAvail4Reward;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }
}
