package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class TradingStatusPo {
    /**
     * sTradingStatusId VARCHAR(36) 必填<br>
     * 
     */
    private String tradingStatusId;

    /**
     * iTradingStatus INTEGER(10)<br>
     * 
     */
    private Integer tradingStatus;

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date updateTime;

    /**
     * iTraddingId INTEGER(10)<br>
     * 
     */
    private Long tradingId;

    /**
     * mMemo CLOB(2147483647)<br>
     * 
     */
    private String mMemo;

    /**
     * sTradingStatusId VARCHAR(36) 必填<br>
     */
    public String getTradingStatusId() {
        return tradingStatusId;
    }

    /**
     * sTradingStatusId VARCHAR(36) 必填<br>
     */
    public void setTradingStatusId(String tradingStatusId) {
        this.tradingStatusId = tradingStatusId == null ? null : tradingStatusId.trim();
    }

    /**
     * iTradingStatus INTEGER(10)<br>
     */
    public Integer getTradingStatus() {
        return tradingStatus;
    }

    /**
     * iTradingStatus INTEGER(10)<br>
     */
    public void setTradingStatus(Integer tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * iTraddingId INTEGER(10)<br>
     */
    public Long getTradingId() {
        return tradingId;
    }

    /**
     * iTraddingId INTEGER(10)<br>
     */
    public void setTradingId(Long tradingId) {
        this.tradingId = tradingId;
    }

    /**
     * mMemo CLOB(2147483647)<br>
     */
    public String getmMemo() {
        return mMemo;
    }

    /**
     * mMemo CLOB(2147483647)<br>
     */
    public void setmMemo(String mMemo) {
        this.mMemo = mMemo == null ? null : mMemo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tradingStatusId=").append(tradingStatusId);
        sb.append(", tradingStatus=").append(tradingStatus);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", tradingId=").append(tradingId);
        sb.append(", mMemo=").append(mMemo);
        sb.append("]");
        return sb.toString();
    }
}