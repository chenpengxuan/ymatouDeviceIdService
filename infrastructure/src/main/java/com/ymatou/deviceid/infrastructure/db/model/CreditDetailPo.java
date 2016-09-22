package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class CreditDetailPo {
    /**
     * iCreditDetailId BIGINT(19) 必填<br>
     * 
     */
    private Long creditDetailId;

    /**
     * iUserId INTEGER(10) 必填<br>
     * 
     */
    private Long userId;

    /**
     * sTargetId VARCHAR(36) 必填<br>
     * 
     */
    private String targetId;

    /**
     * fPoint DOUBLE(53) 必填<br>
     * 
     */
    private Double point;

    /**
     * sDescription VARCHAR(500)<br>
     * 
     */
    private String description;

    /**
     * iSort INTEGER(10) 必填<br>
     * 
     */
    private Integer sort;

    /**
     * iType INTEGER(10) 必填<br>
     * 
     */
    private Integer type;

    /**
     * sIP VARCHAR(50)<br>
     * 
     */
    private String IP;

    /**
     * dAddTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     * 
     */
    private Date addTime;

    /**
     * dUpdateTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     * 
     */
    private Date updateTime;

    /**
     * iAction INTEGER(10) 必填<br>
     * 
     */
    private Integer action;

    /**
     * iTargetUserId INTEGER(10)<br>
     * 
     */
    private Long targetUserId;

    /**
     * fPoint2 DOUBLE(53) 默认值[((0))]<br>
     * 
     */
    private Double point2;

    /**
     * iPoint3 INTEGER(10) 默认值[((2))] 必填<br>
     * 
     */
    private int point3;

    /**
     * sSellerReply VARCHAR(1000)<br>
     * 
     */
    private String sellerReply;

    /**
     * dSellerReplyUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date sellerReplyUpdateTime;

    /**
     * bFromPurchaseAgent BIT(1) 默认值[((0))]<br>
     * 
     */
    private Boolean fromPurchaseAgent;

    /**
     * iCreditDetailId BIGINT(19) 必填<br>
     */
    public Long getCreditDetailId() {
        return creditDetailId;
    }

    /**
     * iCreditDetailId BIGINT(19) 必填<br>
     */
    public void setCreditDetailId(Long creditDetailId) {
        this.creditDetailId = creditDetailId;
    }

    /**
     * iUserId INTEGER(10) 必填<br>
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * iUserId INTEGER(10) 必填<br>
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * sTargetId VARCHAR(36) 必填<br>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * sTargetId VARCHAR(36) 必填<br>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    /**
     * fPoint DOUBLE(53) 必填<br>
     */
    public Double getPoint() {
        return point;
    }

    /**
     * fPoint DOUBLE(53) 必填<br>
     */
    public void setPoint(Double point) {
        this.point = point;
    }

    /**
     * sDescription VARCHAR(500)<br>
     */
    public String getDescription() {
        return description;
    }

    /**
     * sDescription VARCHAR(500)<br>
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * iSort INTEGER(10) 必填<br>
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * iSort INTEGER(10) 必填<br>
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * iType INTEGER(10) 必填<br>
     */
    public Integer getType() {
        return type;
    }

    /**
     * iType INTEGER(10) 必填<br>
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * sIP VARCHAR(50)<br>
     */
    public String getIP() {
        return IP;
    }

    /**
     * sIP VARCHAR(50)<br>
     */
    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
    }

    /**
     * dAddTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * dAddTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * iTargetUserId INTEGER(10)<br>
     */
    public Long getTargetUserId() {
        return targetUserId;
    }

    /**
     * iTargetUserId INTEGER(10)<br>
     */
    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }

    /**
     * fPoint2 DOUBLE(53) 默认值[((0))]<br>
     */
    public Double getPoint2() {
        return point2;
    }

    /**
     * fPoint2 DOUBLE(53) 默认值[((0))]<br>
     */
    public void setPoint2(Double point2) {
        this.point2 = point2;
    }

    /**
     * iPoint3 INTEGER(10) 默认值[((2))] 必填<br>
     */
    public int getPoint3() {
        return point3;
    }

    /**
     * iPoint3 INTEGER(10) 默认值[((2))] 必填<br>
     */
    public void setPoint3(int point3) {
        this.point3 = point3;
    }

    /**
     * sSellerReply VARCHAR(1000)<br>
     */
    public String getSellerReply() {
        return sellerReply;
    }

    /**
     * sSellerReply VARCHAR(1000)<br>
     */
    public void setSellerReply(String sellerReply) {
        this.sellerReply = sellerReply == null ? null : sellerReply.trim();
    }

    /**
     * dSellerReplyUpdateTime TIMESTAMP(23,3)<br>
     */
    public Date getSellerReplyUpdateTime() {
        return sellerReplyUpdateTime;
    }

    /**
     * dSellerReplyUpdateTime TIMESTAMP(23,3)<br>
     */
    public void setSellerReplyUpdateTime(Date sellerReplyUpdateTime) {
        this.sellerReplyUpdateTime = sellerReplyUpdateTime;
    }

    /**
     * bFromPurchaseAgent BIT(1) 默认值[((0))]<br>
     */
    public Boolean getFromPurchaseAgent() {
        return fromPurchaseAgent;
    }

    /**
     * bFromPurchaseAgent BIT(1) 默认值[((0))]<br>
     */
    public void setFromPurchaseAgent(Boolean fromPurchaseAgent) {
        this.fromPurchaseAgent = fromPurchaseAgent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", creditDetailId=").append(creditDetailId);
        sb.append(", userId=").append(userId);
        sb.append(", targetId=").append(targetId);
        sb.append(", point=").append(point);
        sb.append(", description=").append(description);
        sb.append(", sort=").append(sort);
        sb.append(", type=").append(type);
        sb.append(", IP=").append(IP);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", action=").append(action);
        sb.append(", targetUserId=").append(targetUserId);
        sb.append(", point2=").append(point2);
        sb.append(", point3=").append(point3);
        sb.append(", sellerReply=").append(sellerReply);
        sb.append(", sellerReplyUpdateTime=").append(sellerReplyUpdateTime);
        sb.append(", fromPurchaseAgent=").append(fromPurchaseAgent);
        sb.append("]");
        return sb.toString();
    }
}