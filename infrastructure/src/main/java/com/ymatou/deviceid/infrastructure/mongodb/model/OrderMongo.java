package com.ymatou.deviceid.infrastructure.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangyifan on 2016/9/13.
 */
@Document
public class OrderMongo {
    @Id
    private Integer id;
    @Field("MainOrderId")
    private Integer mainOrderId;
    @Field("TradingStatus")
    private Integer tradingStatus;
    @Field("FullPaid")
    private Integer fullPaid;
    @Field("Status")
    private Integer status;
    @Field("Income")
    private Integer income;
    @Field("DomesticDelivered")
    private Integer domesticDelivered;
    @Field("ComplaInteger")
    private Integer complaInteger;
    @Field("AddT")
    private Date addT;
    @Field("CancelT")
    private Date cancelT;
    @Field("DeliverT")
    private Date deliverT;
    @Field("ConfirmT")
    private Date confirmT;
    @Field("Buyer")
    private long buyer;
    @Field("Seller")
    private long seller;
    @Field("Type")
    private Integer type;
    @Field("Products")
    private List<Product> products;
    @Field("Count")
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMainOrderId() {
        return mainOrderId;
    }

    public void setMainOrderId(Integer mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    public Integer getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(Integer tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public Integer getFullPaid() {
        return fullPaid;
    }

    public void setFullPaid(Integer fullPaid) {
        this.fullPaid = fullPaid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getDomesticDelivered() {
        return domesticDelivered;
    }

    public void setDomesticDelivered(Integer domesticDelivered) {
        this.domesticDelivered = domesticDelivered;
    }

    public Integer getComplaInteger() {
        return complaInteger;
    }

    public void setComplaInteger(Integer complaInteger) {
        this.complaInteger = complaInteger;
    }

    public Date getAddT() {
        return addT;
    }

    public void setAddT(Date addT) {
        this.addT = addT;
    }

    public Date getCancelT() {
        return cancelT;
    }

    public void setCancelT(Date cancelT) {
        this.cancelT = cancelT;
    }

    public Date getDeliverT() {
        return deliverT;
    }

    public void setDeliverT(Date deliverT) {
        this.deliverT = deliverT;
    }

    public Date getConfirmT() {
        return confirmT;
    }

    public void setConfirmT(Date confirmT) {
        this.confirmT = confirmT;
    }

    public long getBuyer() {
        return buyer;
    }

    public void setBuyer(long buyer) {
        this.buyer = buyer;
    }

    public long getSeller() {
        return seller;
    }

    public void setSeller(long seller) {
        this.seller = seller;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
