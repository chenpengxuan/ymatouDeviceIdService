package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.infrastructure.db.model.OrdersPo;

import java.math.BigDecimal;

/**
 * Created by zhangzhiqiang on 2016/9/6.
 */
public class SellerOrderInfoDetailPo extends OrdersPo{
    /**
     * 卖家备注
     */
    private String sellerNote;
    /**
     * 补款金额
     */
    private BigDecimal postpayAmount;
    /**
     * 补款红包金额
     */
    private BigDecimal postpayUseGiftAmount;

    /**
     * 是否需要上传身份证
     */
    private Boolean needUploadIdCard;

    /**
     * 是否已上传身份证
     */
    private boolean haveUploadedIdCard;

    /**
     * 新买手单标识
     */
    @JsonProperty("isNewSellerOrder")
    private Boolean isNewSellerOrder;

    /**
     * 新客单标识
     */
    @JsonProperty("isNewCustomerOrder")
    private Boolean isNewCustomerOrder;

    /**
     * 买家是否在黑名单中
     */
    private boolean buyerInBlacklist;

    /**
     * 订单取消原因
     */
    private String orderCancelReason;

    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    public BigDecimal getPostpayAmount() {
        return postpayAmount;
    }

    public void setPostpayAmount(BigDecimal postpayAmount) {
        this.postpayAmount = postpayAmount;
    }

    public BigDecimal getPostpayUseGiftAmount() {
        return postpayUseGiftAmount;
    }

    public void setPostpayUseGiftAmount(BigDecimal postpayUseGiftAmount) {
        this.postpayUseGiftAmount = postpayUseGiftAmount;
    }

    public Boolean getNeedUploadIdCard() {
        return needUploadIdCard;
    }

    public void setNeedUploadIdCard(Boolean needUploadIdCard) {
        this.needUploadIdCard = needUploadIdCard;
    }

    public boolean isHaveUploadedIdCard() {
        return haveUploadedIdCard;
    }

    public void setHaveUploadedIdCard(boolean haveUploadedIdCard) {
        this.haveUploadedIdCard = haveUploadedIdCard;
    }

    public Boolean getNewSellerOrder() {
        return isNewSellerOrder;
    }

    public void setNewSellerOrder(Boolean newSellerOrder) {
        isNewSellerOrder = newSellerOrder;
    }

    public Boolean getNewCustomerOrder() {
        return isNewCustomerOrder;
    }

    public void setNewCustomerOrder(Boolean newCustomerOrder) {
        isNewCustomerOrder = newCustomerOrder;
    }

    public boolean isBuyerInBlacklist() {
        return buyerInBlacklist;
    }

    public void setBuyerInBlacklist(boolean buyerInBlacklist) {
        this.buyerInBlacklist = buyerInBlacklist;
    }

    public String getOrderCancelReason() {
        return orderCancelReason;
    }

    public void setOrderCancelReason(String orderCancelReason) {
        this.orderCancelReason = orderCancelReason;
    }
}
