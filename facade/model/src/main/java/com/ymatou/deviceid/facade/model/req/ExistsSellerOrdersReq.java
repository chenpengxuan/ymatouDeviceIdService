package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import javax.validation.constraints.Min;
import java.util.Date;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class ExistsSellerOrdersReq extends BaseMongoRequest {


    /**
     * 卖家ID
     */
    @Min(value = 1, message = "卖家ID不能为0")
    private long sellerId;


    /**
     * 订单号
     */
    private Long orderId;


    /**
     * 主单号
     */
    private Long orderGroupId;


    /**
     * 买家昵称(LoginId)
     */
    private String buyerNickName;


    /**
     * 商品名
     */
    private String productName;


    /**
     * 下单时间-开始
     */
    private Date orderCreatedTimeBegin;


    /**
     * 下单时间-结束
     */
    private Date orderCreatedTimeEnd;


    /**
     * 订单支付时间-开始
     */
    private Date orderPaidTimeBegin;


    /**
     * 订单支付时间-结束
     */
    private Date orderPaidTimeEnd;


    /**
     * 订单是否退货退款
     */
    private boolean orderRefund;


    /**
     * 国内段发货状态（目前仅支持拼邮）
     * 全部:null;
     * 国内段待发货:false;
     * 国内段已发货:true;
     */
    private Boolean domesticDelivered;


    /**
     * 备注等级
     */
    private Integer remarkLevel;


    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderGroupId() {
        return orderGroupId;
    }

    public void setOrderGroupId(Long orderGroupId) {
        this.orderGroupId = orderGroupId;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getOrderCreatedTimeBegin() {
        return orderCreatedTimeBegin;
    }

    public void setOrderCreatedTimeBegin(Date orderCreatedTimeBegin) {
        this.orderCreatedTimeBegin = orderCreatedTimeBegin;
    }

    public Date getOrderCreatedTimeEnd() {
        return orderCreatedTimeEnd;
    }

    public void setOrderCreatedTimeEnd(Date orderCreatedTimeEnd) {
        this.orderCreatedTimeEnd = orderCreatedTimeEnd;
    }

    public Date getOrderPaidTimeBegin() {
        return orderPaidTimeBegin;
    }

    public void setOrderPaidTimeBegin(Date orderPaidTimeBegin) {
        this.orderPaidTimeBegin = orderPaidTimeBegin;
    }

    public Date getOrderPaidTimeEnd() {
        return orderPaidTimeEnd;
    }

    public void setOrderPaidTimeEnd(Date orderPaidTimeEnd) {
        this.orderPaidTimeEnd = orderPaidTimeEnd;
    }

    public boolean isOrderRefund() {
        return orderRefund;
    }

    public void setOrderRefund(boolean orderRefund) {
        this.orderRefund = orderRefund;
    }

    public Boolean getDomesticDelivered() {
        return domesticDelivered;
    }

    public void setDomesticDelivered(Boolean domesticDelivered) {
        this.domesticDelivered = domesticDelivered;
    }

    public Integer getRemarkLevel() {
        return remarkLevel;
    }

    public void setRemarkLevel(Integer remarkLevel) {
        this.remarkLevel = remarkLevel;
    }
}

