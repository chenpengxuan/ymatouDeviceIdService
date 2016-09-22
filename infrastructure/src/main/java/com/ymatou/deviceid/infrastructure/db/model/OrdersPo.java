package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersPo {
    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * iUserId INTEGER(10) 必填<br>
     * 
     */
    private Long userId;

    /**
     * iBuyerId INTEGER(10) 必填<br>
     * 
     */
    private Long buyerId;

    /**
     * sMarkId VARCHAR(36)<br>
     * 
     */
    private String markId;

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date addTime;

    /**
     * fOrderPrice DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal orderPrice;

    /**
     * fOrderDiscount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal orderDiscount;

    /**
     * fFreight DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal freight;

    /**
     * fDiscount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal discount;

    /**
     * iTradingId INTEGER(10)<br>
     * 
     */
    private Long tradingId;

    /**
     * iTradingStatus INTEGER(10) 默认值[((0))]<br>
     * 
     */
    private Integer tradingStatus;

    /**
     * iOperate INTEGER(10) 默认值[((0))]<br>
     * 
     */
    private Integer operate;

    /**
     * dOperateExpireTime TIMESTAMP(23,3) 默认值[(getdate())]<br>
     * 
     */
    private Date operateExpireTime;

    /**
     * sAddress VARCHAR(2147483647)<br>
     * 
     */
    private String address;

    /**
     * sPostCode VARCHAR(10)<br>
     * 
     */
    private String postCode;

    /**
     * sReceivePerson VARCHAR(50)<br>
     * 
     */
    private String receivePerson;

    /**
     * sPhone VARCHAR(20)<br>
     * 
     */
    private String phone;

    /**
     * sTelephone VARCHAR(20)<br>
     * 
     */
    private String telephone;

    /**
     * sQQ VARCHAR(20)<br>
     * 
     */
    private String QQ;

    /**
     * sEmail VARCHAR(500)<br>
     * 
     */
    private String email;

    /**
     * sLeaveWord VARCHAR(1073741823)<br>
     * 
     */
    private String leaveWord;

    /**
     * iUnfreezeStatus INTEGER(10) 默认值[((0))]<br>
     * 
     */
    private Integer unfreezeStatus;

    /**
     * dDispathTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date dispathTime;

    /**
     * iTopicId INTEGER(10)<br>
     * 
     */
    private Integer topicId;

    /**
     * sTitle VARCHAR(500)<br>
     * 
     */
    private String title;

    /**
     * iReplyTopicWhenOrderPaid INTEGER(10)<br>
     * 
     */
    private Integer replyTopicWhenOrderPaid;

    /**
     * bPaidInFull BIT(1) 默认值[((1))] 必填<br>
     * 
     */
    private Boolean paidInFull;

    /**
     * fUseGiftAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal useGiftAmount;

    /**
     * sCouponCode VARCHAR(36)<br>
     * 
     */
    private String couponCode;

    /**
     * CouponValue DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal couponValue;

    /**
     * iCouponType INTEGER(10)<br>
     * 
     */
    private Integer couponType;

    /**
     * dPaidTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date paidTime;

    /**
     * dApplyPostPayTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date applyPostPayTime;

    /**
     * dPostPaidTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date postPaidTime;

    /**
     * dConfirmedTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date confirmedTime;

    /**
     * dChangeAddressTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date changeAddressTime;

    /**
     * iDistributor INTEGER(10) 默认值[((1))] 必填<br>
     * 
     */
    private Integer distributor;

    /**
     * sThirdOrderId VARCHAR(36)<br>
     * 
     */
    private String thirdOrderId;

    /**
     * iType INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer type;

    /**
     * fOldFreight DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal oldFreight;

    /**
     * dDiscountTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date discountTime;

    /**
     * fOldDiscount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal oldDiscount;

    /**
     * fAutoCancelOrderHours DECIMAL(18,2) 默认值[((48))] 必填<br>
     * 
     */
    private BigDecimal autoCancelOrderHours;

    /**
     * dCancelTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date cancelTime;

    /**
     * bShangouOrder BIT(1) 默认值[((0))] 必填<br>
     * 
     */
    private Boolean shangouOrder;

    /**
     * sBuyerLoginId VARCHAR(200)<br>
     * 
     */
    private String buyerLoginId;

    /**
     * sBuyerLoginEmail VARCHAR(200)<br>
     * 
     */
    private String buyerLoginEmail;

    /**
     * sSellerLoginId VARCHAR(200)<br>
     * 
     */
    private String sellerLoginId;

    /**
     * sSellerLoginEmail VARCHAR(200)<br>
     * 
     */
    private String sellerLoginEmail;

    /**
     * iIsMerchant INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer isMerchant;

    /**
     * sBuyerNickName VARCHAR(200)<br>
     * 
     */
    private String buyerNickName;

    /**
     * fTotalPrice DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal totalPrice;

    /**
     * fUseFreeCardAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     * 
     */
    private BigDecimal useFreeCardAmount;

    /**
     * bIncludeActivityProducts BIT(1) 默认值[((0))] 必填<br>
     * 
     */
    private Boolean includeActivityProducts;

    /**
     * bShippedByXlobo BIT(1) 默认值[((0))] 必填<br>
     * 
     */
    private Boolean shippedByXlobo;

    /**
     * dAcceptTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date acceptTime;

    /**
     * sCurType VARCHAR(50) 默认值[('CNY')]<br>
     * 
     */
    private String curType;

    /**
     * bCanLocalReturn BIT(1) 默认值[((0))]<br>
     * 
     */
    private Boolean canLocalReturn;

    /**
     * bApplyLocalReturn BIT(1)<br>
     * 
     */
    private Boolean applyLocalReturn;

    /**
     * dApplyLocalReturnTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date applyLocalReturnTime;

    /**
     * iRiskVerifiedStatus INTEGER(10)<br>
     * 
     */
    private Integer riskVerifiedStatus;

    /**
     * iThirdPartyRefundStatus INTEGER(10)<br>
     * 
     */
    private Integer thirdPartyRefundStatus;

    /**
     * dLastUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date lastUpdateTime;

    /**
     * iCouponChannel INTEGER(10)<br>
     * 
     */
    private Integer couponChannel;

    /**
     * iSalesRefundStatus INTEGER(10)<br>
     * 
     */
    private Integer salesRefundStatus;

    /**
     * bDomesticDelivered BIT(1)<br>
     * 
     */
    private Boolean domesticDelivered;

    /**
     * fOriginalPrice DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal originalPrice;

    /**
     * fPayableAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal payableAmount;

    /**
     * fCommission DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal commission;

    /**
     * sSellerCouponCode VARCHAR(36)<br>
     * 
     */
    private String sellerCouponCode;

    /**
     * fSellerCouponAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal sellerCouponAmount;

    /**
     * sYmtCouponCode VARCHAR(36)<br>
     * 
     */
    private String ymtCouponCode;

    /**
     * fYmtCouponAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal ymtCouponAmount;

    /**
     * iMainOrderId INTEGER(10)<br>
     * 
     */
    private Long mainOrderId;

    /**
     * sHostRef VARCHAR(100) 默认值[(host_name())]<br>
     * 
     */
    private String hostRef;

    /**
     * bEvaluated BIT(1)<br>
     * 
     */
    private Boolean evaluated;

    /**
     * bFullPay BIT(1)<br>
     * 
     */
    private Boolean fullPay;

    /**
     * fSellerPromotionAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal sellerPromotionAmount;

    /**
     * bDeleted BIT(1)<br>
     * 
     */
    private Boolean deleted;

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
     * iBuyerId INTEGER(10) 必填<br>
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * iBuyerId INTEGER(10) 必填<br>
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * sMarkId VARCHAR(36)<br>
     */
    public String getMarkId() {
        return markId;
    }

    /**
     * sMarkId VARCHAR(36)<br>
     */
    public void setMarkId(String markId) {
        this.markId = markId == null ? null : markId.trim();
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
     * fOrderPrice DECIMAL(18,2)<br>
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * fOrderPrice DECIMAL(18,2)<br>
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * fOrderDiscount DECIMAL(18,2)<br>
     */
    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    /**
     * fOrderDiscount DECIMAL(18,2)<br>
     */
    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    /**
     * fFreight DECIMAL(18,2)<br>
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * fFreight DECIMAL(18,2)<br>
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * fDiscount DECIMAL(18,2)<br>
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * fDiscount DECIMAL(18,2)<br>
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * iTradingId INTEGER(10)<br>
     */
    public Long getTradingId() {
        return tradingId;
    }

    /**
     * iTradingId INTEGER(10)<br>
     */
    public void setTradingId(Long tradingId) {
        this.tradingId = tradingId;
    }

    /**
     * iTradingStatus INTEGER(10) 默认值[((0))]<br>
     */
    public Integer getTradingStatus() {
        return tradingStatus;
    }

    /**
     * iTradingStatus INTEGER(10) 默认值[((0))]<br>
     */
    public void setTradingStatus(Integer tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    /**
     * iOperate INTEGER(10) 默认值[((0))]<br>
     */
    public Integer getOperate() {
        return operate;
    }

    /**
     * iOperate INTEGER(10) 默认值[((0))]<br>
     */
    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    /**
     * dOperateExpireTime TIMESTAMP(23,3) 默认值[(getdate())]<br>
     */
    public Date getOperateExpireTime() {
        return operateExpireTime;
    }

    /**
     * dOperateExpireTime TIMESTAMP(23,3) 默认值[(getdate())]<br>
     */
    public void setOperateExpireTime(Date operateExpireTime) {
        this.operateExpireTime = operateExpireTime;
    }

    /**
     * sAddress VARCHAR(2147483647)<br>
     */
    public String getAddress() {
        return address;
    }

    /**
     * sAddress VARCHAR(2147483647)<br>
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * sPostCode VARCHAR(10)<br>
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * sPostCode VARCHAR(10)<br>
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    /**
     * sReceivePerson VARCHAR(50)<br>
     */
    public String getReceivePerson() {
        return receivePerson;
    }

    /**
     * sReceivePerson VARCHAR(50)<br>
     */
    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson == null ? null : receivePerson.trim();
    }

    /**
     * sPhone VARCHAR(20)<br>
     */
    public String getPhone() {
        return phone;
    }

    /**
     * sPhone VARCHAR(20)<br>
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * sTelephone VARCHAR(20)<br>
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * sTelephone VARCHAR(20)<br>
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * sQQ VARCHAR(20)<br>
     */
    public String getQQ() {
        return QQ;
    }

    /**
     * sQQ VARCHAR(20)<br>
     */
    public void setQQ(String QQ) {
        this.QQ = QQ == null ? null : QQ.trim();
    }

    /**
     * sEmail VARCHAR(500)<br>
     */
    public String getEmail() {
        return email;
    }

    /**
     * sEmail VARCHAR(500)<br>
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * sLeaveWord VARCHAR(1073741823)<br>
     */
    public String getLeaveWord() {
        return leaveWord;
    }

    /**
     * sLeaveWord VARCHAR(1073741823)<br>
     */
    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord == null ? null : leaveWord.trim();
    }

    /**
     * iUnfreezeStatus INTEGER(10) 默认值[((0))]<br>
     */
    public Integer getUnfreezeStatus() {
        return unfreezeStatus;
    }

    /**
     * iUnfreezeStatus INTEGER(10) 默认值[((0))]<br>
     */
    public void setUnfreezeStatus(Integer unfreezeStatus) {
        this.unfreezeStatus = unfreezeStatus;
    }

    /**
     * dDispathTime TIMESTAMP(23,3)<br>
     */
    public Date getDispathTime() {
        return dispathTime;
    }

    /**
     * dDispathTime TIMESTAMP(23,3)<br>
     */
    public void setDispathTime(Date dispathTime) {
        this.dispathTime = dispathTime;
    }

    /**
     * iTopicId INTEGER(10)<br>
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * iTopicId INTEGER(10)<br>
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * sTitle VARCHAR(500)<br>
     */
    public String getTitle() {
        return title;
    }

    /**
     * sTitle VARCHAR(500)<br>
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * iReplyTopicWhenOrderPaid INTEGER(10)<br>
     */
    public Integer getReplyTopicWhenOrderPaid() {
        return replyTopicWhenOrderPaid;
    }

    /**
     * iReplyTopicWhenOrderPaid INTEGER(10)<br>
     */
    public void setReplyTopicWhenOrderPaid(Integer replyTopicWhenOrderPaid) {
        this.replyTopicWhenOrderPaid = replyTopicWhenOrderPaid;
    }

    /**
     * bPaidInFull BIT(1) 默认值[((1))] 必填<br>
     */
    public Boolean getPaidInFull() {
        return paidInFull;
    }

    /**
     * bPaidInFull BIT(1) 默认值[((1))] 必填<br>
     */
    public void setPaidInFull(Boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    /**
     * fUseGiftAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getUseGiftAmount() {
        return useGiftAmount;
    }

    /**
     * fUseGiftAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setUseGiftAmount(BigDecimal useGiftAmount) {
        this.useGiftAmount = useGiftAmount;
    }

    /**
     * sCouponCode VARCHAR(36)<br>
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * sCouponCode VARCHAR(36)<br>
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    /**
     * CouponValue DECIMAL(18,2)<br>
     */
    public BigDecimal getCouponValue() {
        return couponValue;
    }

    /**
     * CouponValue DECIMAL(18,2)<br>
     */
    public void setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
    }

    /**
     * iCouponType INTEGER(10)<br>
     */
    public Integer getCouponType() {
        return couponType;
    }

    /**
     * iCouponType INTEGER(10)<br>
     */
    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    /**
     * dPaidTime TIMESTAMP(23,3)<br>
     */
    public Date getPaidTime() {
        return paidTime;
    }

    /**
     * dPaidTime TIMESTAMP(23,3)<br>
     */
    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    /**
     * dApplyPostPayTime TIMESTAMP(23,3)<br>
     */
    public Date getApplyPostPayTime() {
        return applyPostPayTime;
    }

    /**
     * dApplyPostPayTime TIMESTAMP(23,3)<br>
     */
    public void setApplyPostPayTime(Date applyPostPayTime) {
        this.applyPostPayTime = applyPostPayTime;
    }

    /**
     * dPostPaidTime TIMESTAMP(23,3)<br>
     */
    public Date getPostPaidTime() {
        return postPaidTime;
    }

    /**
     * dPostPaidTime TIMESTAMP(23,3)<br>
     */
    public void setPostPaidTime(Date postPaidTime) {
        this.postPaidTime = postPaidTime;
    }

    /**
     * dConfirmedTime TIMESTAMP(23,3)<br>
     */
    public Date getConfirmedTime() {
        return confirmedTime;
    }

    /**
     * dConfirmedTime TIMESTAMP(23,3)<br>
     */
    public void setConfirmedTime(Date confirmedTime) {
        this.confirmedTime = confirmedTime;
    }

    /**
     * dChangeAddressTime TIMESTAMP(23,3)<br>
     */
    public Date getChangeAddressTime() {
        return changeAddressTime;
    }

    /**
     * dChangeAddressTime TIMESTAMP(23,3)<br>
     */
    public void setChangeAddressTime(Date changeAddressTime) {
        this.changeAddressTime = changeAddressTime;
    }

    /**
     * iDistributor INTEGER(10) 默认值[((1))] 必填<br>
     */
    public Integer getDistributor() {
        return distributor;
    }

    /**
     * iDistributor INTEGER(10) 默认值[((1))] 必填<br>
     */
    public void setDistributor(Integer distributor) {
        this.distributor = distributor;
    }

    /**
     * sThirdOrderId VARCHAR(36)<br>
     */
    public String getThirdOrderId() {
        return thirdOrderId;
    }

    /**
     * sThirdOrderId VARCHAR(36)<br>
     */
    public void setThirdOrderId(String thirdOrderId) {
        this.thirdOrderId = thirdOrderId == null ? null : thirdOrderId.trim();
    }

    /**
     * iType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getType() {
        return type;
    }

    /**
     * iType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * fOldFreight DECIMAL(18,2)<br>
     */
    public BigDecimal getOldFreight() {
        return oldFreight;
    }

    /**
     * fOldFreight DECIMAL(18,2)<br>
     */
    public void setOldFreight(BigDecimal oldFreight) {
        this.oldFreight = oldFreight;
    }

    /**
     * dDiscountTime TIMESTAMP(23,3)<br>
     */
    public Date getDiscountTime() {
        return discountTime;
    }

    /**
     * dDiscountTime TIMESTAMP(23,3)<br>
     */
    public void setDiscountTime(Date discountTime) {
        this.discountTime = discountTime;
    }

    /**
     * fOldDiscount DECIMAL(18,2)<br>
     */
    public BigDecimal getOldDiscount() {
        return oldDiscount;
    }

    /**
     * fOldDiscount DECIMAL(18,2)<br>
     */
    public void setOldDiscount(BigDecimal oldDiscount) {
        this.oldDiscount = oldDiscount;
    }

    /**
     * fAutoCancelOrderHours DECIMAL(18,2) 默认值[((48))] 必填<br>
     */
    public BigDecimal getAutoCancelOrderHours() {
        return autoCancelOrderHours;
    }

    /**
     * fAutoCancelOrderHours DECIMAL(18,2) 默认值[((48))] 必填<br>
     */
    public void setAutoCancelOrderHours(BigDecimal autoCancelOrderHours) {
        this.autoCancelOrderHours = autoCancelOrderHours;
    }

    /**
     * dCancelTime TIMESTAMP(23,3)<br>
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * dCancelTime TIMESTAMP(23,3)<br>
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * bShangouOrder BIT(1) 默认值[((0))] 必填<br>
     */
    public Boolean getShangouOrder() {
        return shangouOrder;
    }

    /**
     * bShangouOrder BIT(1) 默认值[((0))] 必填<br>
     */
    public void setShangouOrder(Boolean shangouOrder) {
        this.shangouOrder = shangouOrder;
    }

    /**
     * sBuyerLoginId VARCHAR(200)<br>
     */
    public String getBuyerLoginId() {
        return buyerLoginId;
    }

    /**
     * sBuyerLoginId VARCHAR(200)<br>
     */
    public void setBuyerLoginId(String buyerLoginId) {
        this.buyerLoginId = buyerLoginId == null ? null : buyerLoginId.trim();
    }

    /**
     * sBuyerLoginEmail VARCHAR(200)<br>
     */
    public String getBuyerLoginEmail() {
        return buyerLoginEmail;
    }

    /**
     * sBuyerLoginEmail VARCHAR(200)<br>
     */
    public void setBuyerLoginEmail(String buyerLoginEmail) {
        this.buyerLoginEmail = buyerLoginEmail == null ? null : buyerLoginEmail.trim();
    }

    /**
     * sSellerLoginId VARCHAR(200)<br>
     */
    public String getSellerLoginId() {
        return sellerLoginId;
    }

    /**
     * sSellerLoginId VARCHAR(200)<br>
     */
    public void setSellerLoginId(String sellerLoginId) {
        this.sellerLoginId = sellerLoginId == null ? null : sellerLoginId.trim();
    }

    /**
     * sSellerLoginEmail VARCHAR(200)<br>
     */
    public String getSellerLoginEmail() {
        return sellerLoginEmail;
    }

    /**
     * sSellerLoginEmail VARCHAR(200)<br>
     */
    public void setSellerLoginEmail(String sellerLoginEmail) {
        this.sellerLoginEmail = sellerLoginEmail == null ? null : sellerLoginEmail.trim();
    }

    /**
     * iIsMerchant INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getIsMerchant() {
        return isMerchant;
    }

    /**
     * iIsMerchant INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setIsMerchant(Integer isMerchant) {
        this.isMerchant = isMerchant;
    }

    /**
     * sBuyerNickName VARCHAR(200)<br>
     */
    public String getBuyerNickName() {
        return buyerNickName;
    }

    /**
     * sBuyerNickName VARCHAR(200)<br>
     */
    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName == null ? null : buyerNickName.trim();
    }

    /**
     * fTotalPrice DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * fTotalPrice DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * fUseFreeCardAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public BigDecimal getUseFreeCardAmount() {
        return useFreeCardAmount;
    }

    /**
     * fUseFreeCardAmount DECIMAL(18,2) 默认值[((0))] 必填<br>
     */
    public void setUseFreeCardAmount(BigDecimal useFreeCardAmount) {
        this.useFreeCardAmount = useFreeCardAmount;
    }

    /**
     * bIncludeActivityProducts BIT(1) 默认值[((0))] 必填<br>
     */
    public Boolean getIncludeActivityProducts() {
        return includeActivityProducts;
    }

    /**
     * bIncludeActivityProducts BIT(1) 默认值[((0))] 必填<br>
     */
    public void setIncludeActivityProducts(Boolean includeActivityProducts) {
        this.includeActivityProducts = includeActivityProducts;
    }

    /**
     * bShippedByXlobo BIT(1) 默认值[((0))] 必填<br>
     */
    public Boolean getShippedByXlobo() {
        return shippedByXlobo;
    }

    /**
     * bShippedByXlobo BIT(1) 默认值[((0))] 必填<br>
     */
    public void setShippedByXlobo(Boolean shippedByXlobo) {
        this.shippedByXlobo = shippedByXlobo;
    }

    /**
     * dAcceptTime TIMESTAMP(23,3)<br>
     */
    public Date getAcceptTime() {
        return acceptTime;
    }

    /**
     * dAcceptTime TIMESTAMP(23,3)<br>
     */
    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    /**
     * sCurType VARCHAR(50) 默认值[('CNY')]<br>
     */
    public String getCurType() {
        return curType;
    }

    /**
     * sCurType VARCHAR(50) 默认值[('CNY')]<br>
     */
    public void setCurType(String curType) {
        this.curType = curType == null ? null : curType.trim();
    }

    /**
     * bCanLocalReturn BIT(1) 默认值[((0))]<br>
     */
    public Boolean getCanLocalReturn() {
        return canLocalReturn;
    }

    /**
     * bCanLocalReturn BIT(1) 默认值[((0))]<br>
     */
    public void setCanLocalReturn(Boolean canLocalReturn) {
        this.canLocalReturn = canLocalReturn;
    }

    /**
     * bApplyLocalReturn BIT(1)<br>
     */
    public Boolean getApplyLocalReturn() {
        return applyLocalReturn;
    }

    /**
     * bApplyLocalReturn BIT(1)<br>
     */
    public void setApplyLocalReturn(Boolean applyLocalReturn) {
        this.applyLocalReturn = applyLocalReturn;
    }

    /**
     * dApplyLocalReturnTime TIMESTAMP(23,3)<br>
     */
    public Date getApplyLocalReturnTime() {
        return applyLocalReturnTime;
    }

    /**
     * dApplyLocalReturnTime TIMESTAMP(23,3)<br>
     */
    public void setApplyLocalReturnTime(Date applyLocalReturnTime) {
        this.applyLocalReturnTime = applyLocalReturnTime;
    }

    /**
     * iRiskVerifiedStatus INTEGER(10)<br>
     */
    public Integer getRiskVerifiedStatus() {
        return riskVerifiedStatus;
    }

    /**
     * iRiskVerifiedStatus INTEGER(10)<br>
     */
    public void setRiskVerifiedStatus(Integer riskVerifiedStatus) {
        this.riskVerifiedStatus = riskVerifiedStatus;
    }

    /**
     * iThirdPartyRefundStatus INTEGER(10)<br>
     */
    public Integer getThirdPartyRefundStatus() {
        return thirdPartyRefundStatus;
    }

    /**
     * iThirdPartyRefundStatus INTEGER(10)<br>
     */
    public void setThirdPartyRefundStatus(Integer thirdPartyRefundStatus) {
        this.thirdPartyRefundStatus = thirdPartyRefundStatus;
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
     * iCouponChannel INTEGER(10)<br>
     */
    public Integer getCouponChannel() {
        return couponChannel;
    }

    /**
     * iCouponChannel INTEGER(10)<br>
     */
    public void setCouponChannel(Integer couponChannel) {
        this.couponChannel = couponChannel;
    }

    /**
     * iSalesRefundStatus INTEGER(10)<br>
     */
    public Integer getSalesRefundStatus() {
        return salesRefundStatus;
    }

    /**
     * iSalesRefundStatus INTEGER(10)<br>
     */
    public void setSalesRefundStatus(Integer salesRefundStatus) {
        this.salesRefundStatus = salesRefundStatus;
    }

    /**
     * bDomesticDelivered BIT(1)<br>
     */
    public Boolean getDomesticDelivered() {
        return domesticDelivered;
    }

    /**
     * bDomesticDelivered BIT(1)<br>
     */
    public void setDomesticDelivered(Boolean domesticDelivered) {
        this.domesticDelivered = domesticDelivered;
    }

    /**
     * fOriginalPrice DECIMAL(18,2)<br>
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * fOriginalPrice DECIMAL(18,2)<br>
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * fPayableAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    /**
     * fPayableAmount DECIMAL(18,2)<br>
     */
    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * fCommission DECIMAL(18,2)<br>
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * fCommission DECIMAL(18,2)<br>
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * sSellerCouponCode VARCHAR(36)<br>
     */
    public String getSellerCouponCode() {
        return sellerCouponCode;
    }

    /**
     * sSellerCouponCode VARCHAR(36)<br>
     */
    public void setSellerCouponCode(String sellerCouponCode) {
        this.sellerCouponCode = sellerCouponCode == null ? null : sellerCouponCode.trim();
    }

    /**
     * fSellerCouponAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    /**
     * fSellerCouponAmount DECIMAL(18,2)<br>
     */
    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    /**
     * sYmtCouponCode VARCHAR(36)<br>
     */
    public String getYmtCouponCode() {
        return ymtCouponCode;
    }

    /**
     * sYmtCouponCode VARCHAR(36)<br>
     */
    public void setYmtCouponCode(String ymtCouponCode) {
        this.ymtCouponCode = ymtCouponCode == null ? null : ymtCouponCode.trim();
    }

    /**
     * fYmtCouponAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getYmtCouponAmount() {
        return ymtCouponAmount;
    }

    /**
     * fYmtCouponAmount DECIMAL(18,2)<br>
     */
    public void setYmtCouponAmount(BigDecimal ymtCouponAmount) {
        this.ymtCouponAmount = ymtCouponAmount;
    }

    /**
     * iMainOrderId INTEGER(10)<br>
     */
    public Long getMainOrderId() {
        return mainOrderId;
    }

    /**
     * iMainOrderId INTEGER(10)<br>
     */
    public void setMainOrderId(Long mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    /**
     * sHostRef VARCHAR(100) 默认值[(host_name())]<br>
     */
    public String getHostRef() {
        return hostRef;
    }

    /**
     * sHostRef VARCHAR(100) 默认值[(host_name())]<br>
     */
    public void setHostRef(String hostRef) {
        this.hostRef = hostRef == null ? null : hostRef.trim();
    }

    /**
     * bEvaluated BIT(1)<br>
     */
    public Boolean getEvaluated() {
        return evaluated;
    }

    /**
     * bEvaluated BIT(1)<br>
     */
    public void setEvaluated(Boolean evaluated) {
        this.evaluated = evaluated;
    }

    /**
     * bFullPay BIT(1)<br>
     */
    public Boolean getFullPay() {
        return fullPay;
    }

    /**
     * bFullPay BIT(1)<br>
     */
    public void setFullPay(Boolean fullPay) {
        this.fullPay = fullPay;
    }

    /**
     * fSellerPromotionAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getSellerPromotionAmount() {
        return sellerPromotionAmount;
    }

    /**
     * fSellerPromotionAmount DECIMAL(18,2)<br>
     */
    public void setSellerPromotionAmount(BigDecimal sellerPromotionAmount) {
        this.sellerPromotionAmount = sellerPromotionAmount;
    }

    /**
     * bDeleted BIT(1)<br>
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * bDeleted BIT(1)<br>
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", markId=").append(markId);
        sb.append(", addTime=").append(addTime);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderDiscount=").append(orderDiscount);
        sb.append(", freight=").append(freight);
        sb.append(", discount=").append(discount);
        sb.append(", tradingId=").append(tradingId);
        sb.append(", tradingStatus=").append(tradingStatus);
        sb.append(", operate=").append(operate);
        sb.append(", operateExpireTime=").append(operateExpireTime);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", receivePerson=").append(receivePerson);
        sb.append(", phone=").append(phone);
        sb.append(", telephone=").append(telephone);
        sb.append(", QQ=").append(QQ);
        sb.append(", email=").append(email);
        sb.append(", leaveWord=").append(leaveWord);
        sb.append(", unfreezeStatus=").append(unfreezeStatus);
        sb.append(", dispathTime=").append(dispathTime);
        sb.append(", topicId=").append(topicId);
        sb.append(", title=").append(title);
        sb.append(", replyTopicWhenOrderPaid=").append(replyTopicWhenOrderPaid);
        sb.append(", paidInFull=").append(paidInFull);
        sb.append(", useGiftAmount=").append(useGiftAmount);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", couponValue=").append(couponValue);
        sb.append(", couponType=").append(couponType);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", applyPostPayTime=").append(applyPostPayTime);
        sb.append(", postPaidTime=").append(postPaidTime);
        sb.append(", confirmedTime=").append(confirmedTime);
        sb.append(", changeAddressTime=").append(changeAddressTime);
        sb.append(", distributor=").append(distributor);
        sb.append(", thirdOrderId=").append(thirdOrderId);
        sb.append(", type=").append(type);
        sb.append(", oldFreight=").append(oldFreight);
        sb.append(", discountTime=").append(discountTime);
        sb.append(", oldDiscount=").append(oldDiscount);
        sb.append(", autoCancelOrderHours=").append(autoCancelOrderHours);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", shangouOrder=").append(shangouOrder);
        sb.append(", buyerLoginId=").append(buyerLoginId);
        sb.append(", buyerLoginEmail=").append(buyerLoginEmail);
        sb.append(", sellerLoginId=").append(sellerLoginId);
        sb.append(", sellerLoginEmail=").append(sellerLoginEmail);
        sb.append(", isMerchant=").append(isMerchant);
        sb.append(", buyerNickName=").append(buyerNickName);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", useFreeCardAmount=").append(useFreeCardAmount);
        sb.append(", includeActivityProducts=").append(includeActivityProducts);
        sb.append(", shippedByXlobo=").append(shippedByXlobo);
        sb.append(", acceptTime=").append(acceptTime);
        sb.append(", curType=").append(curType);
        sb.append(", canLocalReturn=").append(canLocalReturn);
        sb.append(", applyLocalReturn=").append(applyLocalReturn);
        sb.append(", applyLocalReturnTime=").append(applyLocalReturnTime);
        sb.append(", riskVerifiedStatus=").append(riskVerifiedStatus);
        sb.append(", thirdPartyRefundStatus=").append(thirdPartyRefundStatus);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", couponChannel=").append(couponChannel);
        sb.append(", salesRefundStatus=").append(salesRefundStatus);
        sb.append(", domesticDelivered=").append(domesticDelivered);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", payableAmount=").append(payableAmount);
        sb.append(", commission=").append(commission);
        sb.append(", sellerCouponCode=").append(sellerCouponCode);
        sb.append(", sellerCouponAmount=").append(sellerCouponAmount);
        sb.append(", ymtCouponCode=").append(ymtCouponCode);
        sb.append(", ymtCouponAmount=").append(ymtCouponAmount);
        sb.append(", mainOrderId=").append(mainOrderId);
        sb.append(", hostRef=").append(hostRef);
        sb.append(", evaluated=").append(evaluated);
        sb.append(", fullPay=").append(fullPay);
        sb.append(", sellerPromotionAmount=").append(sellerPromotionAmount);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}