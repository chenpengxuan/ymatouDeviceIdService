package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class RefundBillPo {
    /**
     * Id INTEGER(10) 必填<br>
     * 
     */
    private Long id;

    /**
     * OrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * RefundBillNo VARCHAR(50) 必填<br>
     * 
     */
    private String refundBillNo;

    /**
     * RefundAmount DECIMAL(16,2) 必填<br>
     * 
     */
    private BigDecimal refundAmount;

    /**
     * RefundStatus INTEGER(10) 必填<br>
     * 
     */
    private Integer refundStatus;

    /**
     * SettlementAmount DECIMAL(16,2) 必填<br>
     * 
     */
    private BigDecimal settlementAmount;

    /**
     * SettlementStatus INTEGER(10) 必填<br>
     * 
     */
    private Integer settlementStatus;

    /**
     * RefundType INTEGER(10) 必填<br>
     * 
     */
    private Integer refundType;

    /**
     * RefundedAmountOfCash DECIMAL(16,2) 必填<br>
     * 
     */
    private BigDecimal refundedAmountOfCash;

    /**
     * RefundedAmountOfGift DECIMAL(16,2) 必填<br>
     * 
     */
    private BigDecimal refundedAmountOfGift;

    /**
     * Approver VARCHAR(50)<br>
     * 
     */
    private String approver;

    /**
     * Reason VARCHAR(500)<br>
     * 
     */
    private String reason;

    /**
     * AddTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     * 
     */
    private Date addTime;

    /**
     * UpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date updateTime;

    /**
     * SettlementAmountOfCoupon DECIMAL(16,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal settlementAmountOfCoupon;

    /**
     * SalesRefundStatus INTEGER(10)<br>
     * 
     */
    private Integer salesRefundStatus;

    /**
     * SellerId INTEGER(10)<br>
     * 
     */
    private Long sellerId;

    /**
     * BuyerId INTEGER(10)<br>
     * 
     */
    private Long buyerId;

    /**
     * InterfaceVersion VARCHAR(50)<br>
     * 
     */
    private String interfaceVersion;

    /**
     * ApprovedAfterOrderReceived BIT(1)<br>
     * 
     */
    private Boolean approvedAfterOrderReceived;

    /**
     * Id INTEGER(10) 必填<br>
     */
    public Long getId() {
        return id;
    }

    /**
     * Id INTEGER(10) 必填<br>
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * OrderId INTEGER(10) 必填<br>
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * OrderId INTEGER(10) 必填<br>
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * RefundBillNo VARCHAR(50) 必填<br>
     */
    public String getRefundBillNo() {
        return refundBillNo;
    }

    /**
     * RefundBillNo VARCHAR(50) 必填<br>
     */
    public void setRefundBillNo(String refundBillNo) {
        this.refundBillNo = refundBillNo == null ? null : refundBillNo.trim();
    }

    /**
     * RefundAmount DECIMAL(16,2) 必填<br>
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * RefundAmount DECIMAL(16,2) 必填<br>
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * RefundStatus INTEGER(10) 必填<br>
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * RefundStatus INTEGER(10) 必填<br>
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * SettlementAmount DECIMAL(16,2) 必填<br>
     */
    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * SettlementAmount DECIMAL(16,2) 必填<br>
     */
    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    /**
     * SettlementStatus INTEGER(10) 必填<br>
     */
    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    /**
     * SettlementStatus INTEGER(10) 必填<br>
     */
    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    /**
     * RefundType INTEGER(10) 必填<br>
     */
    public Integer getRefundType() {
        return refundType;
    }

    /**
     * RefundType INTEGER(10) 必填<br>
     */
    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    /**
     * RefundedAmountOfCash DECIMAL(16,2) 必填<br>
     */
    public BigDecimal getRefundedAmountOfCash() {
        return refundedAmountOfCash;
    }

    /**
     * RefundedAmountOfCash DECIMAL(16,2) 必填<br>
     */
    public void setRefundedAmountOfCash(BigDecimal refundedAmountOfCash) {
        this.refundedAmountOfCash = refundedAmountOfCash;
    }

    /**
     * RefundedAmountOfGift DECIMAL(16,2) 必填<br>
     */
    public BigDecimal getRefundedAmountOfGift() {
        return refundedAmountOfGift;
    }

    /**
     * RefundedAmountOfGift DECIMAL(16,2) 必填<br>
     */
    public void setRefundedAmountOfGift(BigDecimal refundedAmountOfGift) {
        this.refundedAmountOfGift = refundedAmountOfGift;
    }

    /**
     * Approver VARCHAR(50)<br>
     */
    public String getApprover() {
        return approver;
    }

    /**
     * Approver VARCHAR(50)<br>
     */
    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    /**
     * Reason VARCHAR(500)<br>
     */
    public String getReason() {
        return reason;
    }

    /**
     * Reason VARCHAR(500)<br>
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * AddTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * AddTime TIMESTAMP(23,3) 默认值[(getdate())] 必填<br>
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * UpdateTime TIMESTAMP(23,3)<br>
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * UpdateTime TIMESTAMP(23,3)<br>
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * SettlementAmountOfCoupon DECIMAL(16,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getSettlementAmountOfCoupon() {
        return settlementAmountOfCoupon;
    }

    /**
     * SettlementAmountOfCoupon DECIMAL(16,2) 默认值[((0))] 必填<br>
     */
    public void setSettlementAmountOfCoupon(BigDecimal settlementAmountOfCoupon) {
        this.settlementAmountOfCoupon = settlementAmountOfCoupon;
    }

    /**
     * SalesRefundStatus INTEGER(10)<br>
     */
    public Integer getSalesRefundStatus() {
        return salesRefundStatus;
    }

    /**
     * SalesRefundStatus INTEGER(10)<br>
     */
    public void setSalesRefundStatus(Integer salesRefundStatus) {
        this.salesRefundStatus = salesRefundStatus;
    }

    /**
     * SellerId INTEGER(10)<br>
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * SellerId INTEGER(10)<br>
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * BuyerId INTEGER(10)<br>
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * BuyerId INTEGER(10)<br>
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * InterfaceVersion VARCHAR(50)<br>
     */
    public String getInterfaceVersion() {
        return interfaceVersion;
    }

    /**
     * InterfaceVersion VARCHAR(50)<br>
     */
    public void setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion == null ? null : interfaceVersion.trim();
    }

    /**
     * ApprovedAfterOrderReceived BIT(1)<br>
     */
    public Boolean getApprovedAfterOrderReceived() {
        return approvedAfterOrderReceived;
    }

    /**
     * ApprovedAfterOrderReceived BIT(1)<br>
     */
    public void setApprovedAfterOrderReceived(Boolean approvedAfterOrderReceived) {
        this.approvedAfterOrderReceived = approvedAfterOrderReceived;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", refundBillNo=").append(refundBillNo);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", settlementAmount=").append(settlementAmount);
        sb.append(", settlementStatus=").append(settlementStatus);
        sb.append(", refundType=").append(refundType);
        sb.append(", refundedAmountOfCash=").append(refundedAmountOfCash);
        sb.append(", refundedAmountOfGift=").append(refundedAmountOfGift);
        sb.append(", approver=").append(approver);
        sb.append(", reason=").append(reason);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", settlementAmountOfCoupon=").append(settlementAmountOfCoupon);
        sb.append(", salesRefundStatus=").append(salesRefundStatus);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", interfaceVersion=").append(interfaceVersion);
        sb.append(", approvedAfterOrderReceived=").append(approvedAfterOrderReceived);
        sb.append("]");
        return sb.toString();
    }
}