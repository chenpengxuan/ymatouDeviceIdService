package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class SellerPromotionPo {
    /**
     * id VARCHAR(32) 必填<br>
     * 
     */
    private String id;

    /**
     * PromotionType INTEGER(10) 必填<br>
     * 
     */
    private Integer promotionType;

    /**
     * PromotionId INTEGER(10) 必填<br>
     * 
     */
    private long promotionId;

    /**
     * PromotionName VARCHAR(255)<br>
     * 
     */
    private String promotionName;

    /**
     * MatchCondition VARCHAR(32)<br>
     * 
     */
    private String matchCondition;

    /**
     * PromotionValue VARCHAR(255)<br>
     * 
     */
    private String promotionValue;

    /**
     * ReducedAmount DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal reducedAmount;

    /**
     * CreateTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date createTime;

    /**
     * LastUpdateTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date lastUpdateTime;

    /**
     * OrderId INTEGER(10) 必填<br>
     * 
     */
    private long orderId;

    /**
     * OrderInfoId VARCHAR(36) 必填<br>
     * 
     */
    private String orderInfoId;

    /**
     * id VARCHAR(32) 必填<br>
     */
    public String getId() {
        return id;
    }

    /**
     * id VARCHAR(32) 必填<br>
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * PromotionType INTEGER(10) 必填<br>
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * PromotionType INTEGER(10) 必填<br>
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * PromotionId INTEGER(10) 必填<br>
     */
    public long getPromotionId() {
        return promotionId;
    }

    /**
     * PromotionId INTEGER(10) 必填<br>
     */
    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * PromotionName VARCHAR(255)<br>
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * PromotionName VARCHAR(255)<br>
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName == null ? null : promotionName.trim();
    }

    /**
     * MatchCondition VARCHAR(32)<br>
     */
    public String getMatchCondition() {
        return matchCondition;
    }

    /**
     * MatchCondition VARCHAR(32)<br>
     */
    public void setMatchCondition(String matchCondition) {
        this.matchCondition = matchCondition == null ? null : matchCondition.trim();
    }

    /**
     * PromotionValue VARCHAR(255)<br>
     */
    public String getPromotionValue() {
        return promotionValue;
    }

    /**
     * PromotionValue VARCHAR(255)<br>
     */
    public void setPromotionValue(String promotionValue) {
        this.promotionValue = promotionValue == null ? null : promotionValue.trim();
    }

    /**
     * ReducedAmount DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getReducedAmount() {
        return reducedAmount;
    }

    /**
     * ReducedAmount DECIMAL(18,2) 必填<br>
     */
    public void setReducedAmount(BigDecimal reducedAmount) {
        this.reducedAmount = reducedAmount;
    }

    /**
     * CreateTime TIMESTAMP(23,3) 必填<br>
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * CreateTime TIMESTAMP(23,3) 必填<br>
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * LastUpdateTime TIMESTAMP(23,3) 必填<br>
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * LastUpdateTime TIMESTAMP(23,3) 必填<br>
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * OrderId INTEGER(10) 必填<br>
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * OrderId INTEGER(10) 必填<br>
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     * OrderInfoId VARCHAR(36) 必填<br>
     */
    public String getOrderInfoId() {
        return orderInfoId;
    }

    /**
     * OrderInfoId VARCHAR(36) 必填<br>
     */
    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId == null ? null : orderInfoId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", promotionId=").append(promotionId);
        sb.append(", promotionName=").append(promotionName);
        sb.append(", matchCondition=").append(matchCondition);
        sb.append(", promotionValue=").append(promotionValue);
        sb.append(", reducedAmount=").append(reducedAmount);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderInfoId=").append(orderInfoId);
        sb.append("]");
        return sb.toString();
    }
}