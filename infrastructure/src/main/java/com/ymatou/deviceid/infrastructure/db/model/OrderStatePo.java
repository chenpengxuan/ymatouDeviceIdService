package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderStatePo {
    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * fRefundedAmountOfCash DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal refundedAmountOfCash;

    /**
     * fRefundedAmountOfGift DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal refundedAmountOfGift;

    /**
     * fPaidAmountOfCash DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal paidAmountOfCash;

    /**
     * fPaidAmountOfGift DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal paidAmountOfGift;

    /**
     * fPostPaidAmountOfCash DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal postPaidAmountOfCash;

    /**
     * fPostPaidAmountOfGift DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal postPaidAmountOfGift;

    /**
     * fPaidAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal paidAmountOfCoupon;

    /**
     * fRefundedAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal refundedAmountOfCoupon;

    /**
     * fPostPadiAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal postPadiAmountOfCoupon;

    /**
     * fQuickTurnoverAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal quickTurnoverAmount;

    /**
     * fCommissionFee DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal commissionFee;

    /**
     * fNeedCommissionFee DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal needCommissionFee;

    /**
     * fPaidAmountOfFreeCard DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal paidAmountOfFreeCard;

    /**
     * fBalanceAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal balanceAmount;

    /**
     * fPaidAmountOfSellerCoupon DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal paidAmountOfSellerCoupon;

    /**
     * fPaidAmountOfYmtCoupon DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal paidAmountOfYmtCoupon;

    /**
     * fPaidAmountOfThirdParty DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal paidAmountOfThirdParty;

    /**
     * fPaidAmountOfYmtAccount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal paidAmountOfYmtAccount;

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date addTime;

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date updateTime;

    /**
     * fPostPaidAmountOfThirdParty DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal postPaidAmountOfThirdParty;

    /**
     * fPostPaidAmountOfYmtAccount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal postPaidAmountOfYmtAccount;

    /**
     * fRefundedAmountToAccount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal refundedAmountToAccount;

    /**
     * fRefundedPaidAmountToThirdParty DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal refundedPaidAmountToThirdParty;

    /**
     * fRefundedPostPaidAmountToThirdParty DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal refundedPostPaidAmountToThirdParty;

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
     * fRefundedAmountOfCash DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getRefundedAmountOfCash() {
        return refundedAmountOfCash;
    }

    /**
     * fRefundedAmountOfCash DECIMAL(18,2) 必填<br>
     */
    public void setRefundedAmountOfCash(BigDecimal refundedAmountOfCash) {
        this.refundedAmountOfCash = refundedAmountOfCash;
    }

    /**
     * fRefundedAmountOfGift DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getRefundedAmountOfGift() {
        return refundedAmountOfGift;
    }

    /**
     * fRefundedAmountOfGift DECIMAL(18,2) 必填<br>
     */
    public void setRefundedAmountOfGift(BigDecimal refundedAmountOfGift) {
        this.refundedAmountOfGift = refundedAmountOfGift;
    }

    /**
     * fPaidAmountOfCash DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getPaidAmountOfCash() {
        return paidAmountOfCash;
    }

    /**
     * fPaidAmountOfCash DECIMAL(18,2) 必填<br>
     */
    public void setPaidAmountOfCash(BigDecimal paidAmountOfCash) {
        this.paidAmountOfCash = paidAmountOfCash;
    }

    /**
     * fPaidAmountOfGift DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getPaidAmountOfGift() {
        return paidAmountOfGift;
    }

    /**
     * fPaidAmountOfGift DECIMAL(18,2) 必填<br>
     */
    public void setPaidAmountOfGift(BigDecimal paidAmountOfGift) {
        this.paidAmountOfGift = paidAmountOfGift;
    }

    /**
     * fPostPaidAmountOfCash DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getPostPaidAmountOfCash() {
        return postPaidAmountOfCash;
    }

    /**
     * fPostPaidAmountOfCash DECIMAL(18,2) 必填<br>
     */
    public void setPostPaidAmountOfCash(BigDecimal postPaidAmountOfCash) {
        this.postPaidAmountOfCash = postPaidAmountOfCash;
    }

    /**
     * fPostPaidAmountOfGift DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getPostPaidAmountOfGift() {
        return postPaidAmountOfGift;
    }

    /**
     * fPostPaidAmountOfGift DECIMAL(18,2) 必填<br>
     */
    public void setPostPaidAmountOfGift(BigDecimal postPaidAmountOfGift) {
        this.postPaidAmountOfGift = postPaidAmountOfGift;
    }

    /**
     * fPaidAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getPaidAmountOfCoupon() {
        return paidAmountOfCoupon;
    }

    /**
     * fPaidAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setPaidAmountOfCoupon(BigDecimal paidAmountOfCoupon) {
        this.paidAmountOfCoupon = paidAmountOfCoupon;
    }

    /**
     * fRefundedAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getRefundedAmountOfCoupon() {
        return refundedAmountOfCoupon;
    }

    /**
     * fRefundedAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setRefundedAmountOfCoupon(BigDecimal refundedAmountOfCoupon) {
        this.refundedAmountOfCoupon = refundedAmountOfCoupon;
    }

    /**
     * fPostPadiAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getPostPadiAmountOfCoupon() {
        return postPadiAmountOfCoupon;
    }

    /**
     * fPostPadiAmountOfCoupon DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setPostPadiAmountOfCoupon(BigDecimal postPadiAmountOfCoupon) {
        this.postPadiAmountOfCoupon = postPadiAmountOfCoupon;
    }

    /**
     * fQuickTurnoverAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getQuickTurnoverAmount() {
        return quickTurnoverAmount;
    }

    /**
     * fQuickTurnoverAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setQuickTurnoverAmount(BigDecimal quickTurnoverAmount) {
        this.quickTurnoverAmount = quickTurnoverAmount;
    }

    /**
     * fCommissionFee DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getCommissionFee() {
        return commissionFee;
    }

    /**
     * fCommissionFee DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setCommissionFee(BigDecimal commissionFee) {
        this.commissionFee = commissionFee;
    }

    /**
     * fNeedCommissionFee DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getNeedCommissionFee() {
        return needCommissionFee;
    }

    /**
     * fNeedCommissionFee DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setNeedCommissionFee(BigDecimal needCommissionFee) {
        this.needCommissionFee = needCommissionFee;
    }

    /**
     * fPaidAmountOfFreeCard DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getPaidAmountOfFreeCard() {
        return paidAmountOfFreeCard;
    }

    /**
     * fPaidAmountOfFreeCard DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setPaidAmountOfFreeCard(BigDecimal paidAmountOfFreeCard) {
        this.paidAmountOfFreeCard = paidAmountOfFreeCard;
    }

    /**
     * fBalanceAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * fBalanceAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    /**
     * fPaidAmountOfSellerCoupon DECIMAL(18,2)<br>
     */
    public BigDecimal getPaidAmountOfSellerCoupon() {
        return paidAmountOfSellerCoupon;
    }

    /**
     * fPaidAmountOfSellerCoupon DECIMAL(18,2)<br>
     */
    public void setPaidAmountOfSellerCoupon(BigDecimal paidAmountOfSellerCoupon) {
        this.paidAmountOfSellerCoupon = paidAmountOfSellerCoupon;
    }

    /**
     * fPaidAmountOfYmtCoupon DECIMAL(18,2)<br>
     */
    public BigDecimal getPaidAmountOfYmtCoupon() {
        return paidAmountOfYmtCoupon;
    }

    /**
     * fPaidAmountOfYmtCoupon DECIMAL(18,2)<br>
     */
    public void setPaidAmountOfYmtCoupon(BigDecimal paidAmountOfYmtCoupon) {
        this.paidAmountOfYmtCoupon = paidAmountOfYmtCoupon;
    }

    /**
     * fPaidAmountOfThirdParty DECIMAL(18,2)<br>
     */
    public BigDecimal getPaidAmountOfThirdParty() {
        return paidAmountOfThirdParty;
    }

    /**
     * fPaidAmountOfThirdParty DECIMAL(18,2)<br>
     */
    public void setPaidAmountOfThirdParty(BigDecimal paidAmountOfThirdParty) {
        this.paidAmountOfThirdParty = paidAmountOfThirdParty;
    }

    /**
     * fPaidAmountOfYmtAccount DECIMAL(18,2)<br>
     */
    public BigDecimal getPaidAmountOfYmtAccount() {
        return paidAmountOfYmtAccount;
    }

    /**
     * fPaidAmountOfYmtAccount DECIMAL(18,2)<br>
     */
    public void setPaidAmountOfYmtAccount(BigDecimal paidAmountOfYmtAccount) {
        this.paidAmountOfYmtAccount = paidAmountOfYmtAccount;
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
     * fPostPaidAmountOfThirdParty DECIMAL(18,2)<br>
     */
    public BigDecimal getPostPaidAmountOfThirdParty() {
        return postPaidAmountOfThirdParty;
    }

    /**
     * fPostPaidAmountOfThirdParty DECIMAL(18,2)<br>
     */
    public void setPostPaidAmountOfThirdParty(BigDecimal postPaidAmountOfThirdParty) {
        this.postPaidAmountOfThirdParty = postPaidAmountOfThirdParty;
    }

    /**
     * fPostPaidAmountOfYmtAccount DECIMAL(18,2)<br>
     */
    public BigDecimal getPostPaidAmountOfYmtAccount() {
        return postPaidAmountOfYmtAccount;
    }

    /**
     * fPostPaidAmountOfYmtAccount DECIMAL(18,2)<br>
     */
    public void setPostPaidAmountOfYmtAccount(BigDecimal postPaidAmountOfYmtAccount) {
        this.postPaidAmountOfYmtAccount = postPaidAmountOfYmtAccount;
    }

    /**
     * fRefundedAmountToAccount DECIMAL(18,2)<br>
     */
    public BigDecimal getRefundedAmountToAccount() {
        return refundedAmountToAccount;
    }

    /**
     * fRefundedAmountToAccount DECIMAL(18,2)<br>
     */
    public void setRefundedAmountToAccount(BigDecimal refundedAmountToAccount) {
        this.refundedAmountToAccount = refundedAmountToAccount;
    }

    /**
     * fRefundedPaidAmountToThirdParty DECIMAL(18,2)<br>
     */
    public BigDecimal getRefundedPaidAmountToThirdParty() {
        return refundedPaidAmountToThirdParty;
    }

    /**
     * fRefundedPaidAmountToThirdParty DECIMAL(18,2)<br>
     */
    public void setRefundedPaidAmountToThirdParty(BigDecimal refundedPaidAmountToThirdParty) {
        this.refundedPaidAmountToThirdParty = refundedPaidAmountToThirdParty;
    }

    /**
     * fRefundedPostPaidAmountToThirdParty DECIMAL(18,2)<br>
     */
    public BigDecimal getRefundedPostPaidAmountToThirdParty() {
        return refundedPostPaidAmountToThirdParty;
    }

    /**
     * fRefundedPostPaidAmountToThirdParty DECIMAL(18,2)<br>
     */
    public void setRefundedPostPaidAmountToThirdParty(BigDecimal refundedPostPaidAmountToThirdParty) {
        this.refundedPostPaidAmountToThirdParty = refundedPostPaidAmountToThirdParty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", refundedAmountOfCash=").append(refundedAmountOfCash);
        sb.append(", refundedAmountOfGift=").append(refundedAmountOfGift);
        sb.append(", paidAmountOfCash=").append(paidAmountOfCash);
        sb.append(", paidAmountOfGift=").append(paidAmountOfGift);
        sb.append(", postPaidAmountOfCash=").append(postPaidAmountOfCash);
        sb.append(", postPaidAmountOfGift=").append(postPaidAmountOfGift);
        sb.append(", paidAmountOfCoupon=").append(paidAmountOfCoupon);
        sb.append(", refundedAmountOfCoupon=").append(refundedAmountOfCoupon);
        sb.append(", postPadiAmountOfCoupon=").append(postPadiAmountOfCoupon);
        sb.append(", quickTurnoverAmount=").append(quickTurnoverAmount);
        sb.append(", commissionFee=").append(commissionFee);
        sb.append(", needCommissionFee=").append(needCommissionFee);
        sb.append(", paidAmountOfFreeCard=").append(paidAmountOfFreeCard);
        sb.append(", balanceAmount=").append(balanceAmount);
        sb.append(", paidAmountOfSellerCoupon=").append(paidAmountOfSellerCoupon);
        sb.append(", paidAmountOfYmtCoupon=").append(paidAmountOfYmtCoupon);
        sb.append(", paidAmountOfThirdParty=").append(paidAmountOfThirdParty);
        sb.append(", paidAmountOfYmtAccount=").append(paidAmountOfYmtAccount);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", postPaidAmountOfThirdParty=").append(postPaidAmountOfThirdParty);
        sb.append(", postPaidAmountOfYmtAccount=").append(postPaidAmountOfYmtAccount);
        sb.append(", refundedAmountToAccount=").append(refundedAmountToAccount);
        sb.append(", refundedPaidAmountToThirdParty=").append(refundedPaidAmountToThirdParty);
        sb.append(", refundedPostPaidAmountToThirdParty=").append(refundedPostPaidAmountToThirdParty);
        sb.append("]");
        return sb.toString();
    }
}