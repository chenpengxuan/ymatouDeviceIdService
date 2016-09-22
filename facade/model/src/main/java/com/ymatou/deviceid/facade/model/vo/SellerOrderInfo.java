package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.util.List;

/**
 * @author zhangyifan 2016/9/1 12:00
 */

public class SellerOrderInfo extends PrintFriendliness {


    /**
     * 订单基本信息
     */
    private OrderBasicInfo basic;


    /**
     * 买家信息
     */
    private OrderConsumerInfo buyer;


    /**
     * 卖家信息
     */
    private OrderSellerInfo seller;


    /**
     * 收件人信息
     */
    private OrderConsigneeInfo consignee;


    /**
     * 商品信息
     */
    private List<OrderProductInfo> products;


    /**
     * 支付信息
     */
    private OrderPaymentInfo payment;


    /**
     * 发货、收货信息
     */
    private OrderTransferInfo transfer;

    public OrderBasicInfo getBasic() {
        return basic;
    }

    public void setBasic(OrderBasicInfo basic) {
        this.basic = basic;
    }

    public OrderConsumerInfo getBuyer() {
        return buyer;
    }

    public void setBuyer(OrderConsumerInfo buyer) {
        this.buyer = buyer;
    }

    public OrderSellerInfo getSeller() {
        return seller;
    }

    public void setSeller(OrderSellerInfo seller) {
        this.seller = seller;
    }

    public OrderConsigneeInfo getConsignee() {
        return consignee;
    }

    public void setConsignee(OrderConsigneeInfo consignee) {
        this.consignee = consignee;
    }

    public List<OrderProductInfo> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProductInfo> products) {
        this.products = products;
    }

    public OrderPaymentInfo getPayment() {
        return payment;
    }

    public void setPayment(OrderPaymentInfo payment) {
        this.payment = payment;
    }

    public OrderTransferInfo getTransfer() {
        return transfer;
    }

    public void setTransfer(OrderTransferInfo transfer) {
        this.transfer = transfer;
    }
}

