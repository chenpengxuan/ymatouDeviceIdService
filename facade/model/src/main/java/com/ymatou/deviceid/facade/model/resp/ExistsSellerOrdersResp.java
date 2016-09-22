package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class ExistsSellerOrdersResp extends BaseMongoResponse {


    /**
     * 待付款
     */
    private boolean toBePaid;


    /**
     * 待接单
     */
    private boolean toBeAccepted;


    /**
     * 待发起补款
     */
    private boolean toBeAppliedPostpay;


    /**
     * 补款中
     */
    private boolean toBePostpaid;


    /**
     * 等待发布
     */
    private boolean toBeDelivered;


    /**
     * 已发货
     */
    private boolean toBeConfirmed;

    public boolean isToBePaid() {
        return toBePaid;
    }

    public void setToBePaid(boolean toBePaid) {
        this.toBePaid = toBePaid;
    }

    public boolean isToBeAccepted() {
        return toBeAccepted;
    }

    public void setToBeAccepted(boolean toBeAccepted) {
        this.toBeAccepted = toBeAccepted;
    }

    public boolean isToBeAppliedPostpay() {
        return toBeAppliedPostpay;
    }

    public void setToBeAppliedPostpay(boolean toBeAppliedPostpay) {
        this.toBeAppliedPostpay = toBeAppliedPostpay;
    }

    public boolean isToBePostpaid() {
        return toBePostpaid;
    }

    public void setToBePostpaid(boolean toBePostpaid) {
        this.toBePostpaid = toBePostpaid;
    }

    public boolean isToBeDelivered() {
        return toBeDelivered;
    }

    public void setToBeDelivered(boolean toBeDelivered) {
        this.toBeDelivered = toBeDelivered;
    }

    public boolean isToBeConfirmed() {
        return toBeConfirmed;
    }

    public void setToBeConfirmed(boolean toBeConfirmed) {
        this.toBeConfirmed = toBeConfirmed;
    }
}

