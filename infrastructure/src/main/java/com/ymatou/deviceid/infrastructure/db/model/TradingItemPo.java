package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class TradingItemPo {
    /**
     * sId VARCHAR(36) 必填<br>
     * 
     */
    private String id;

    /**
     * iTradingId INTEGER(10) 必填<br>
     * 
     */
    private Long tradingId;

    /**
     * iTradingType INTEGER(10) 必填<br>
     * 
     */
    private Integer tradingType;

    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * iTradingResult INTEGER(10) 必填<br>
     * 
     */
    private Integer tradingResult;

    /**
     * dAddTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date addTime;

    /**
     * dUpdateTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date updateTime;

    /**
     * sTradingMessage CLOB(1073741823)<br>
     * 
     */
    private String tradingMessage;

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
     * iTradingId INTEGER(10) 必填<br>
     */
    public Long getTradingId() {
        return tradingId;
    }

    /**
     * iTradingId INTEGER(10) 必填<br>
     */
    public void setTradingId(Long tradingId) {
        this.tradingId = tradingId;
    }

    /**
     * iTradingType INTEGER(10) 必填<br>
     */
    public Integer getTradingType() {
        return tradingType;
    }

    /**
     * iTradingType INTEGER(10) 必填<br>
     */
    public void setTradingType(Integer tradingType) {
        this.tradingType = tradingType;
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
     * iTradingResult INTEGER(10) 必填<br>
     */
    public Integer getTradingResult() {
        return tradingResult;
    }

    /**
     * iTradingResult INTEGER(10) 必填<br>
     */
    public void setTradingResult(Integer tradingResult) {
        this.tradingResult = tradingResult;
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
     * sTradingMessage CLOB(1073741823)<br>
     */
    public String getTradingMessage() {
        return tradingMessage;
    }

    /**
     * sTradingMessage CLOB(1073741823)<br>
     */
    public void setTradingMessage(String tradingMessage) {
        this.tradingMessage = tradingMessage == null ? null : tradingMessage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradingId=").append(tradingId);
        sb.append(", tradingType=").append(tradingType);
        sb.append(", orderId=").append(orderId);
        sb.append(", tradingResult=").append(tradingResult);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", tradingMessage=").append(tradingMessage);
        sb.append("]");
        return sb.toString();
    }
}