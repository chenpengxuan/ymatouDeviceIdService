package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class OrderNotePo {
    /**
     * iId INTEGER(10) 必填<br>
     * 
     */
    private Integer id;

    /**
     * iUserId INTEGER(10) 必填<br>
     * 
     */
    private Long UserId;

    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long OrderId;

    /**
     * sContent VARCHAR(1000)<br>
     * 
     */
    private String content;

    /**
     * dAddTime TIMESTAMP(23,3) 必填<br>
     * 
     */
    private Date addTime;

    /**
     * iRemarkLevel INTEGER(10)<br>
     * 
     */
    private Integer remarkLevel;

    /**
     * iId INTEGER(10) 必填<br>
     */
    public Integer getId() {
        return id;
    }

    /**
     * iId INTEGER(10) 必填<br>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * iUserId INTEGER(10) 必填<br>
     */
    public Long getUserId() {
        return UserId;
    }

    /**
     * iUserId INTEGER(10) 必填<br>
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * iOrderId INTEGER(10) 必填<br>
     */
    public Long getOrderId() {
        return OrderId;
    }

    /**
     * iOrderId INTEGER(10) 必填<br>
     */
    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * sContent VARCHAR(1000)<br>
     */
    public String getContent() {
        return content;
    }

    /**
     * sContent VARCHAR(1000)<br>
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * iRemarkLevel INTEGER(10)<br>
     */
    public Integer getRemarkLevel() {
        return remarkLevel;
    }

    /**
     * iRemarkLevel INTEGER(10)<br>
     */
    public void setRemarkLevel(Integer remarkLevel) {
        this.remarkLevel = remarkLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", UserId=").append(UserId);
        sb.append(", OrderId=").append(OrderId);
        sb.append(", content=").append(content);
        sb.append(", addTime=").append(addTime);
        sb.append(", remarkLevel=").append(remarkLevel);
        sb.append("]");
        return sb.toString();
    }
}