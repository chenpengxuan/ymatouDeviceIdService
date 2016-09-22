package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderPostPayPo {
    /**
     * sId VARCHAR(36) 必填<br>
     * 
     */
    private String id;

    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * fAmount DECIMAL(16,2) 必填<br>
     * 
     */
    private BigDecimal amount;

    /**
     * iAction INTEGER(10) 必填<br>
     * 
     */
    private Integer action;

    /**
     * dAddTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date addTime;

    /**
     * sComment VARCHAR(2000)<br>
     * 
     */
    private String comment;

    /**
     * dUpdateTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date updateTime;

    /**
     * fUseGiftAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal useGiftAmount;

    /**
     * iUseGift INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer useGift;

    /**
     * iPostPayType INTEGER(10) 默认值[((1))] 必填<br>
     * 
     */
    private Integer postPayType;

    /**
     * sPostPayTradingId VARCHAR(36)<br>
     * 
     */
    private String postPayTradingId;

    /**
     * sPayChannel VARCHAR(50)<br>
     * 
     */
    private String payChannel;

    /**
     * sId VARCHAR(36) 必填<br>
     */
    public String getId() {
        return id;
    }

    /**
     * sId VARCHAR(36) 必填<br>
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * iOrderId INTEGER(10) 必填<br>
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * iOrderId INTEGER(10) 必填<br>
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * fAmount DECIMAL(16,2) 必填<br>
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * fAmount DECIMAL(16,2) 必填<br>
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * iAction INTEGER(10) 必填<br>
     */
    public Integer getAction() {
        return action;
    }

    /**
     * iAction INTEGER(10) 必填<br>
     */
    public void setAction(Integer action) {
        this.action = action;
    }

    /**
     * dAddTime TIMESTAMP(23,3) 必填<br>
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * dAddTime TIMESTAMP(23,3) 必填<br>
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * sComment VARCHAR(2000)<br>
     */
    public String getComment() {
        return comment;
    }

    /**
     * sComment VARCHAR(2000)<br>
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * dUpdateTime TIMESTAMP(23,3) 必填<br>
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3) 必填<br>
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * fUseGiftAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getUseGiftAmount() {
        return useGiftAmount;
    }

    /**
     * fUseGiftAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setUseGiftAmount(BigDecimal useGiftAmount) {
        this.useGiftAmount = useGiftAmount;
    }

    /**
     * iUseGift INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getUseGift() {
        return useGift;
    }

    /**
     * iUseGift INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setUseGift(Integer useGift) {
        this.useGift = useGift;
    }

    /**
     * iPostPayType INTEGER(10) 默认值[((1))] 必填<br>
     */
    public Integer getPostPayType() {
        return postPayType;
    }

    /**
     * iPostPayType INTEGER(10) 默认值[((1))] 必填<br>
     */
    public void setPostPayType(Integer postPayType) {
        this.postPayType = postPayType;
    }

    /**
     * sPostPayTradingId VARCHAR(36)<br>
     */
    public String getPostPayTradingId() {
        return postPayTradingId;
    }

    /**
     * sPostPayTradingId VARCHAR(36)<br>
     */
    public void setPostPayTradingId(String postPayTradingId) {
        this.postPayTradingId = postPayTradingId == null ? null : postPayTradingId.trim();
    }

    /**
     * sPayChannel VARCHAR(50)<br>
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * sPayChannel VARCHAR(50)<br>
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", amount=").append(amount);
        sb.append(", action=").append(action);
        sb.append(", addTime=").append(addTime);
        sb.append(", comment=").append(comment);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", useGiftAmount=").append(useGiftAmount);
        sb.append(", useGift=").append(useGift);
        sb.append(", postPayType=").append(postPayType);
        sb.append(", postPayTradingId=").append(postPayTradingId);
        sb.append(", payChannel=").append(payChannel);
        sb.append("]");
        return sb.toString();
    }
}