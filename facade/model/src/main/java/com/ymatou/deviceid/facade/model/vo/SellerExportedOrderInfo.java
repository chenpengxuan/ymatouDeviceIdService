
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.util.Date;
import java.math.BigDecimal;


/**
 * @author zhangyifan 2016/9/1 12:00
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.facade.model.PrintFriendliness;

public class  SellerExportedOrderInfo extends PrintFriendliness {

    /**
     * 订单号
     */
    private long orderNo;


    /**
     * 商品编号
     */
    private String productNos;


    /**
     * 商品名
     */
    private String productNames;


    /**
     * 规格
     */
    private String catalogInfos;


    /**
     * 商品数量
     */
    private String productNum;


    /**
     * 单价
     */
    private String productPrice;


    /**
     * 运费
     */
    private BigDecimal freight;


    /**
     * 定金金额
     */
    private BigDecimal depositAmount;


    /**
     * 补款金额
     */
    private BigDecimal postPayAmount;


    /**
     * 实付现金金额
     */
    private BigDecimal cashAmount;


    /**
     * 总价
     */
    private BigDecimal totalAmount;


    /**
     * 订单类型
     */
    private Integer orderType;


    /**
     * 订单状态
     */
    private int orderState;


    /**
     * 是否全额支付
     */
    @JsonProperty("isPaidInFull")
    private boolean isPaidInFull;


    /**
     * 下单时间
     */
    private Date addTime;


    /**
     * 付款时间
     */
    private Date payTime;


    /**
     * 补款时间
     */
    private Date postPayTime;


    /**
     * 申请补款时间
     */
    private Date applyPostPayTime;


    /**
     * 买家留言
     */
    private String leaveWord;


    /**
     * 买家用户名
     */
    private String buyerLoginId;


    /**
     * 收货人姓名
     */
    private String receivePerson;


    /**
     * 收货人手机
     */
    private String phone;


    /**
     * 收货人座机
     */
    private String telephone;


    /**
     * 收货人地址
     */
    private String address;


    /**
     * 收货人邮编
     */
    private String postCode;


    /**
     * 配送方式（已废弃）
     */
    private String deliveryType;


    /**
     * 发货时间
     */
    private Date dispathTime;


    /**
     * 物流公司
     */
    private String logisticsCompany;


    /**
     * 物流单号
     */
    private String logisticsCode;


    /**
     * 退款总金额
     */
    private BigDecimal refundAmount;


    /**
     * 订单备注
     */
    private String orderNote;


    /**
     * 风控状态（对应枚举：RiskVerifiedStatusEnum）
     */
    private Integer riskVerifiedStatus;


    /**
     * 物流类型
     */
    private Integer catalogStatus;


    /**
     * 备货状态
     */
    private Integer catalogType;


    /**
     * 保税仓
     */
    private Integer bondedArea;


    /**
     * 卖家优惠券使用额度
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 拼邮国内段是否已发货.true:已发货false:未发货null:非拼邮
     */
    private Boolean packageDelivery_DomesticDelivered;


    /**
     * 备注级别：对应页面的旗子
     */
    private Integer remarkLevel;

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductNos() {
        return productNos;
    }

    public void setProductNos(String productNos) {
        this.productNos = productNos;
    }

    public String getProductNames() {
        return productNames;
    }

    public void setProductNames(String productNames) {
        this.productNames = productNames;
    }

    public String getCatalogInfos() {
        return catalogInfos;
    }

    public void setCatalogInfos(String catalogInfos) {
        this.catalogInfos = catalogInfos;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public BigDecimal getPostPayAmount() {
        return postPayAmount;
    }

    public void setPostPayAmount(BigDecimal postPayAmount) {
        this.postPayAmount = postPayAmount;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public boolean isPaidInFull() {
        return isPaidInFull;
    }

    public void setPaidInFull(boolean paidInFull) {
        isPaidInFull = paidInFull;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPostPayTime() {
        return postPayTime;
    }

    public void setPostPayTime(Date postPayTime) {
        this.postPayTime = postPayTime;
    }

    public Date getApplyPostPayTime() {
        return applyPostPayTime;
    }

    public void setApplyPostPayTime(Date applyPostPayTime) {
        this.applyPostPayTime = applyPostPayTime;
    }

    public String getLeaveWord() {
        return leaveWord;
    }

    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord;
    }

    public String getBuyerLoginId() {
        return buyerLoginId;
    }

    public void setBuyerLoginId(String buyerLoginId) {
        this.buyerLoginId = buyerLoginId;
    }

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Date getDispathTime() {
        return dispathTime;
    }

    public void setDispathTime(Date dispathTime) {
        this.dispathTime = dispathTime;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public Integer getRiskVerifiedStatus() {
        return riskVerifiedStatus;
    }

    public void setRiskVerifiedStatus(Integer riskVerifiedStatus) {
        this.riskVerifiedStatus = riskVerifiedStatus;
    }

    public Integer getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Integer catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public Integer getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(Integer catalogType) {
        this.catalogType = catalogType;
    }

    public Integer getBondedArea() {
        return bondedArea;
    }

    public void setBondedArea(Integer bondedArea) {
        this.bondedArea = bondedArea;
    }

    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    public Boolean getPackageDelivery_DomesticDelivered() {
        return packageDelivery_DomesticDelivered;
    }

    public void setPackageDelivery_DomesticDelivered(Boolean packageDelivery_DomesticDelivered) {
        this.packageDelivery_DomesticDelivered = packageDelivery_DomesticDelivered;
    }

    public Integer getRemarkLevel() {
        return remarkLevel;
    }

    public void setRemarkLevel(Integer remarkLevel) {
        this.remarkLevel = remarkLevel;
    }
}

