package com.ymatou.deviceid.infrastructure.db.model;

import java.util.Date;

public class OrderExtPo {
    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * sOrderSource VARCHAR(128)<br>
     * 
     */
    private String orderSource;

    /**
     * sOrderSourceIP VARCHAR(128)<br>
     * 
     */
    private String orderSourceIP;

    /**
     * iOrderType INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer orderType;

    /**
     * sTerminalSource VARCHAR(128)<br>
     * 
     */
    private String terminalSource;

    /**
     * bIsNeedUploadIdCard BIT(1) 默认值[((0))] 必填<br>
     * 
     */
    private Boolean isNeedUploadIdCard;

    /**
     * sAppTerminalSource VARCHAR(128)<br>
     * 
     */
    private String appTerminalSource;

    /**
     * sDeviceId VARCHAR(200)<br>
     * 
     */
    private String deviceId;

    /**
     * bHaveUploadedIdCard BIT(1)<br>
     * 
     */
    private Boolean haveUploadedIdCard;

    /**
     * bDeliveredOfChina BIT(1)<br>
     * 
     */
    private Boolean deliveredOfChina;

    /**
     * bIsFirstOrder BIT(1)<br>
     * 
     */
    private Boolean isFirstOrder;

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date lastUpdateTime;

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date addTime;

    /**
     * sInterfaceVersion VARCHAR(50)<br>
     * 
     */
    private String interfaceVersion;

    /**
     * sEquipmentId VARCHAR(200)<br>
     * 
     */
    private String equipmentId;

    /**
     * bNewSellerOrder BIT(1)<br>
     * 
     */
    private Boolean newSellerOrder;

    /**
     * bNewCustomerOrder BIT(1)<br>
     * 
     */
    private Boolean newCustomerOrder;

    /**
     * bAutoAccepted BIT(1)<br>
     * 
     */
    private Boolean autoAccepted;

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
     * sOrderSource VARCHAR(128)<br>
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * sOrderSource VARCHAR(128)<br>
     */
    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    /**
     * sOrderSourceIP VARCHAR(128)<br>
     */
    public String getOrderSourceIP() {
        return orderSourceIP;
    }

    /**
     * sOrderSourceIP VARCHAR(128)<br>
     */
    public void setOrderSourceIP(String orderSourceIP) {
        this.orderSourceIP = orderSourceIP == null ? null : orderSourceIP.trim();
    }

    /**
     * iOrderType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * iOrderType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * sTerminalSource VARCHAR(128)<br>
     */
    public String getTerminalSource() {
        return terminalSource;
    }

    /**
     * sTerminalSource VARCHAR(128)<br>
     */
    public void setTerminalSource(String terminalSource) {
        this.terminalSource = terminalSource == null ? null : terminalSource.trim();
    }

    /**
     * bIsNeedUploadIdCard BIT(1) 默认值[((0))] 必填<br>
     */
    public Boolean getIsNeedUploadIdCard() {
        return isNeedUploadIdCard;
    }

    /**
     * bIsNeedUploadIdCard BIT(1) 默认值[((0))] 必填<br>
     */
    public void setIsNeedUploadIdCard(Boolean isNeedUploadIdCard) {
        this.isNeedUploadIdCard = isNeedUploadIdCard;
    }

    /**
     * sAppTerminalSource VARCHAR(128)<br>
     */
    public String getAppTerminalSource() {
        return appTerminalSource;
    }

    /**
     * sAppTerminalSource VARCHAR(128)<br>
     */
    public void setAppTerminalSource(String appTerminalSource) {
        this.appTerminalSource = appTerminalSource == null ? null : appTerminalSource.trim();
    }

    /**
     * sDeviceId VARCHAR(200)<br>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * sDeviceId VARCHAR(200)<br>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * bHaveUploadedIdCard BIT(1)<br>
     */
    public Boolean getHaveUploadedIdCard() {
        return haveUploadedIdCard;
    }

    /**
     * bHaveUploadedIdCard BIT(1)<br>
     */
    public void setHaveUploadedIdCard(Boolean haveUploadedIdCard) {
        this.haveUploadedIdCard = haveUploadedIdCard;
    }

    /**
     * bDeliveredOfChina BIT(1)<br>
     */
    public Boolean getDeliveredOfChina() {
        return deliveredOfChina;
    }

    /**
     * bDeliveredOfChina BIT(1)<br>
     */
    public void setDeliveredOfChina(Boolean deliveredOfChina) {
        this.deliveredOfChina = deliveredOfChina;
    }

    /**
     * bIsFirstOrder BIT(1)<br>
     */
    public Boolean getIsFirstOrder() {
        return isFirstOrder;
    }

    /**
     * bIsFirstOrder BIT(1)<br>
     */
    public void setIsFirstOrder(Boolean isFirstOrder) {
        this.isFirstOrder = isFirstOrder;
    }

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
     * sInterfaceVersion VARCHAR(50)<br>
     */
    public String getInterfaceVersion() {
        return interfaceVersion;
    }

    /**
     * sInterfaceVersion VARCHAR(50)<br>
     */
    public void setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion == null ? null : interfaceVersion.trim();
    }

    /**
     * sEquipmentId VARCHAR(200)<br>
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * sEquipmentId VARCHAR(200)<br>
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    /**
     * bNewSellerOrder BIT(1)<br>
     */
    public Boolean getNewSellerOrder() {
        return newSellerOrder;
    }

    /**
     * bNewSellerOrder BIT(1)<br>
     */
    public void setNewSellerOrder(Boolean newSellerOrder) {
        this.newSellerOrder = newSellerOrder;
    }

    /**
     * bNewCustomerOrder BIT(1)<br>
     */
    public Boolean getNewCustomerOrder() {
        return newCustomerOrder;
    }

    /**
     * bNewCustomerOrder BIT(1)<br>
     */
    public void setNewCustomerOrder(Boolean newCustomerOrder) {
        this.newCustomerOrder = newCustomerOrder;
    }

    /**
     * bAutoAccepted BIT(1)<br>
     */
    public Boolean getAutoAccepted() {
        return autoAccepted;
    }

    /**
     * bAutoAccepted BIT(1)<br>
     */
    public void setAutoAccepted(Boolean autoAccepted) {
        this.autoAccepted = autoAccepted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSource=").append(orderSource);
        sb.append(", orderSourceIP=").append(orderSourceIP);
        sb.append(", orderType=").append(orderType);
        sb.append(", terminalSource=").append(terminalSource);
        sb.append(", isNeedUploadIdCard=").append(isNeedUploadIdCard);
        sb.append(", appTerminalSource=").append(appTerminalSource);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", haveUploadedIdCard=").append(haveUploadedIdCard);
        sb.append(", deliveredOfChina=").append(deliveredOfChina);
        sb.append(", isFirstOrder=").append(isFirstOrder);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", addTime=").append(addTime);
        sb.append(", interfaceVersion=").append(interfaceVersion);
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", newSellerOrder=").append(newSellerOrder);
        sb.append(", newCustomerOrder=").append(newCustomerOrder);
        sb.append(", autoAccepted=").append(autoAccepted);
        sb.append("]");
        return sb.toString();
    }
}