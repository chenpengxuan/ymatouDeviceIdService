package com.ymatou.deviceid.facade.model.vo;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * Created by zhangyifan on 2016/9/7.
 */
public class SimpleOrder extends PrintFriendliness {

    /**
     * 订单号
     */
    private long orderId;

    /**
     * 是否要再支付
     */
    private Boolean needPayTwiceOrMore;

    /**
     * 是否要再支付
     */
    private Boolean shangou;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Boolean getNeedPayTwiceOrMore() {
        return needPayTwiceOrMore;
    }

    public void setNeedPayTwiceOrMore(Boolean needPayTwiceOrMore) {
        this.needPayTwiceOrMore = needPayTwiceOrMore;
    }

    public Boolean getShangou() {
        return shangou;
    }

    public void setShangou(Boolean shangou) {
        this.shangou = shangou;
    }

}
