package com.ymatou.deviceid.infrastructure.db.model.args;

import java.util.List;

/**
 * Created by zhangzhiqiang on 2016/9/8.
 */
public class ExportOrderRelatedInfosArgs {

    private int sellerId;

    private String productName;

    private List<Integer> logisticsTypeList;

    private Long orderId;

    private String createdTimeFromStr;

    private String createdTimeToStr;

    private String paidTimeFromStr;

    private String paidTimeToStr;

    private String deliveredTimeFromStr;

    private String deliveredTimeToStr;

    private String postpayAppliedTimeFromStr;

    private String postpayAppliedTimeToStr;

    private String buyerNickName;

    private Boolean paidInFull;

    private List<Integer> orderStatusList;

    private Boolean shangouOrder;

    private String partitionKey;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Integer> getLogisticsTypeList() {
        return logisticsTypeList;
    }

    public void setLogisticsTypeList(List<Integer> logisticsTypeList) {
        this.logisticsTypeList = logisticsTypeList;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCreatedTimeFromStr() {
        return createdTimeFromStr;
    }

    public void setCreatedTimeFromStr(String createdTimeFromStr) {
        this.createdTimeFromStr = createdTimeFromStr;
    }

    public String getCreatedTimeToStr() {
        return createdTimeToStr;
    }

    public void setCreatedTimeToStr(String createdTimeToStr) {
        this.createdTimeToStr = createdTimeToStr;
    }

    public String getPaidTimeFromStr() {
        return paidTimeFromStr;
    }

    public void setPaidTimeFromStr(String paidTimeFromStr) {
        this.paidTimeFromStr = paidTimeFromStr;
    }

    public String getPaidTimeToStr() {
        return paidTimeToStr;
    }

    public void setPaidTimeToStr(String paidTimeToStr) {
        this.paidTimeToStr = paidTimeToStr;
    }

    public String getDeliveredTimeFromStr() {
        return deliveredTimeFromStr;
    }

    public void setDeliveredTimeFromStr(String deliveredTimeFromStr) {
        this.deliveredTimeFromStr = deliveredTimeFromStr;
    }

    public String getDeliveredTimeToStr() {
        return deliveredTimeToStr;
    }

    public void setDeliveredTimeToStr(String deliveredTimeToStr) {
        this.deliveredTimeToStr = deliveredTimeToStr;
    }

    public String getPostpayAppliedTimeFromStr() {
        return postpayAppliedTimeFromStr;
    }

    public void setPostpayAppliedTimeFromStr(String postpayAppliedTimeFromStr) {
        this.postpayAppliedTimeFromStr = postpayAppliedTimeFromStr;
    }

    public String getPostpayAppliedTimeToStr() {
        return postpayAppliedTimeToStr;
    }

    public void setPostpayAppliedTimeToStr(String postpayAppliedTimeToStr) {
        this.postpayAppliedTimeToStr = postpayAppliedTimeToStr;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public Boolean getPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(Boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    public List<Integer> getOrderStatusList() {
        return orderStatusList;
    }

    public void setOrderStatusList(List<Integer> orderStatusList) {
        this.orderStatusList = orderStatusList;
    }

    public Boolean getShangouOrder() {
        return shangouOrder;
    }

    public void setShangouOrder(Boolean shangouOrder) {
        this.shangouOrder = shangouOrder;
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }
}
