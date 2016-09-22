package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class OrderFrozenPo {
    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * dAddTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date addTime;

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date updateTime;

    /**
     * bFrozen BIT(1) 必填<br>
     * 
     */
    private Boolean frozen;

    /**
     * dFrozenTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date frozenTime;

    /**
     * sMemo VARCHAR(200)<br>
     * 
     */
    private String memo;

    /**
     * iUserId INTEGER(10)<br>
     * 
     */
    private Long userId;

    /**
     * bFrozenAutoReceive BIT(1)<br>
     * 
     */
    private Boolean frozenAutoReceive;

    /**
     * bPause BIT(1)<br>
     * 
     */
    private Boolean pause;

    /**
     * dPauseTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date pauseTime;

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
     * bFrozen BIT(1) 必填<br>
     */
    public Boolean getFrozen() {
        return frozen;
    }

    /**
     * bFrozen BIT(1) 必填<br>
     */
    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    /**
     * dFrozenTime TIMESTAMP(23,3)<br>
     */
    public Date getFrozenTime() {
        return frozenTime;
    }

    /**
     * dFrozenTime TIMESTAMP(23,3)<br>
     */
    public void setFrozenTime(Date frozenTime) {
        this.frozenTime = frozenTime;
    }

    /**
     * sMemo VARCHAR(200)<br>
     */
    public String getMemo() {
        return memo;
    }

    /**
     * sMemo VARCHAR(200)<br>
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * iUserId INTEGER(10)<br>
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * iUserId INTEGER(10)<br>
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * bFrozenAutoReceive BIT(1)<br>
     */
    public Boolean getFrozenAutoReceive() {
        return frozenAutoReceive;
    }

    /**
     * bFrozenAutoReceive BIT(1)<br>
     */
    public void setFrozenAutoReceive(Boolean frozenAutoReceive) {
        this.frozenAutoReceive = frozenAutoReceive;
    }

    /**
     * bPause BIT(1)<br>
     */
    public Boolean getPause() {
        return pause;
    }

    /**
     * bPause BIT(1)<br>
     */
    public void setPause(Boolean pause) {
        this.pause = pause;
    }

    /**
     * dPauseTime TIMESTAMP(23,3)<br>
     */
    public Date getPauseTime() {
        return pauseTime;
    }

    /**
     * dPauseTime TIMESTAMP(23,3)<br>
     */
    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", frozen=").append(frozen);
        sb.append(", frozenTime=").append(frozenTime);
        sb.append(", memo=").append(memo);
        sb.append(", userId=").append(userId);
        sb.append(", frozenAutoReceive=").append(frozenAutoReceive);
        sb.append(", pause=").append(pause);
        sb.append(", pauseTime=").append(pauseTime);
        sb.append("]");
        return sb.toString();
    }
}