package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class OrderSummaryPo {
    /**
     * sOrderSummaryId VARCHAR(36) 必填<br>
     * 
     */
    private String orderSummaryId;

    /**
     * iOrderId INTEGER(10)<br>
     * 
     */
    private Long OrderId;

    /**
     * iType INTEGER(10)<br>
     * 
     */
    private Integer type;

    /**
     * sSummary VARCHAR(1073741823)<br>
     * 
     */
    private String summary;

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date addTime;

    /**
     * fGoodWeight DOUBLE(53) 默认值[((0))] 必填<br>
     * 
     */
    private Double goodWeight;

    /**
     * sLogisticsProvider VARCHAR(50)<br>
     * 
     */
    private String logisticsProvider;

    /**
     * iBillType INTEGER(10)<br>
     * 
     */
    private Integer billType;

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date lastUpdateTime;

    /**
     * sOrderSummaryId VARCHAR(36) 必填<br>
     */
    public String getOrderSummaryId() {
        return orderSummaryId;
    }

    /**
     * sOrderSummaryId VARCHAR(36) 必填<br>
     */
    public void setOrderSummaryId(String orderSummaryId) {
        this.orderSummaryId = orderSummaryId == null ? null : orderSummaryId.trim();
    }

    /**
     * iOrderId INTEGER(10)<br>
     */
    public Long getOrderId() {
        return OrderId;
    }

    /**
     * iOrderId INTEGER(10)<br>
     */
    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * iType INTEGER(10)<br>
     */
    public Integer getType() {
        return type;
    }

    /**
     * iType INTEGER(10)<br>
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * sSummary VARCHAR(1073741823)<br>
     */
    public String getSummary() {
        return summary;
    }

    /**
     * sSummary VARCHAR(1073741823)<br>
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * fGoodWeight DOUBLE(53) 默认值[((0))] 必填<br>
     */
    public Double getGoodWeight() {
        return goodWeight;
    }

    /**
     * fGoodWeight DOUBLE(53) 默认值[((0))] 必填<br>
     */
    public void setGoodWeight(Double goodWeight) {
        this.goodWeight = goodWeight;
    }

    /**
     * sLogisticsProvider VARCHAR(50)<br>
     */
    public String getLogisticsProvider() {
        return logisticsProvider;
    }

    /**
     * sLogisticsProvider VARCHAR(50)<br>
     */
    public void setLogisticsProvider(String logisticsProvider) {
        this.logisticsProvider = logisticsProvider == null ? null : logisticsProvider.trim();
    }

    /**
     * iBillType INTEGER(10)<br>
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * iBillType INTEGER(10)<br>
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderSummaryId=").append(orderSummaryId);
        sb.append(", OrderId=").append(OrderId);
        sb.append(", type=").append(type);
        sb.append(", summary=").append(summary);
        sb.append(", addTime=").append(addTime);
        sb.append(", goodWeight=").append(goodWeight);
        sb.append(", logisticsProvider=").append(logisticsProvider);
        sb.append(", billType=").append(billType);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}