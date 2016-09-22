package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.enums.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderInfo extends PrintFriendliness {


    /**
     * 订单号
     */
    private long orderId;


    /**
     * 买家id
     */
    private Long userId;


    /**
     * 卖家id
     */
    private Long buyerId;


    /**
     * 订单创建日期
     */
    private Date addTime;


    /**
     * 订单价格
     */
    private BigDecimal orderPrice;


    /**
     * 订单折扣
     */
    private BigDecimal orderDiscount;


    /**
     * 运费
     */
    private BigDecimal freight;


    /**
     * (这个字段为冗余字段，已经跟姚乾确认过cpx2014年6月10日)
     */
    private BigDecimal discount;


    /**
     * 交易号
     */
    private long tradingId;


    /**
     * 订单状态
     */
    private Integer tradingStatus;


    /**
     * (这个字段为冗余字段，已经跟姚乾确认过cpx2014年6月10日)
     */
    private Integer operate;


    /**
     * (这个字段为冗余字段，已经跟姚乾确认过cpx2014年6月10日)
     */
    private Date operateExpireTime;


    /**
     * 地址
     */
    private String address;


    /**
     * 邮编
     */
    private String postCode;


    /**
     * 收件人
     */
    private String receivePerson;


    /**
     * 电话
     */
    private String phone;


    /**
     * 固话
     */
    private String telephone;


    /**
     * qq
     */
    private String qQ;


    /**
     * 邮箱
     */
    private String email;


    /**
     * 留言
     */
    private String leaveWord;


    /**
     * 订单冻结状态(这个字段为冗余字段，已经跟姚乾确认过cpx2014年6月10日)
     */
    private Integer unfreezeStatus;


    /**
     * (这个字段为冗余字段，已经跟姚乾确认过cpx2014年6月10日)
     */
    private Date dispathTime;


    /**
     * 论坛号
     */
    private Integer topicId;


    /**
     * 论坛标题
     */
    private String title;


    /**
     * 当订单付款后是否在论坛回复
     */
    private Integer replyTopicWhenOrderPaid;


    /**
     * 是否全款支付
     */
    private boolean paidInFull;


    /**
     * 使用红包金额
     */
    private BigDecimal useGiftAmount;


    /**
     * 优惠券code
     */
    private String couponCode;


    /**
     * 优惠券金额
     */
    private BigDecimal couponValue;


    /**
     * 优惠券类型
     */
    private Integer couponType;


    /**
     * 支付日期
     */
    private Date paidTime;


    /**
     * 申请补款日期
     */
    private Date applyPostPayTime;


    /**
     * 补款日期
     */
    private Date postPaidTime;


    /**
     * 确认接单日期
     */
    private Date acceptTime;


    /**
     * 确认接单日期
     */
    private Date confirmedTime;


    /**
     * 更改收货人地址日期
     */
    private Date changeAddressTime;


    /**
     * 订单渠道（对应DistributorEnums枚举的值）
     */
    private int distributor;


    /**
     * 第三方订单号此字段为冗余字段
     */
    private String thirdOrderId;


    /**
     * 此字段已弃用cpx2014年6月10日
     */
    private int type;


    /**
     * 以前的运费用于在更新折扣的时候记录之前的运费
     */
    private BigDecimal oldFreight;


    /**
     * 打折日期
     */
    private Date discountTime;


    /**
     * 以前的折扣用于在更新折扣的时候记录之前的折扣
     */
    private BigDecimal oldDiscount;


    /**
     * 自动取消订单的时间
     */
    private BigDecimal autoCancelOrderHours;


    /**
     * 取消订单的时间
     */
    private Date cancelTime;


    /**
     * 是否为闪购订单
     */
    private boolean shangouOrder;


    /**
     * 买家名称
     */
    private String buyerLoginId;


    /**
     * 买家注册邮箱
     */
    private String buyerLoginEmail;


    /**
     * 卖家名称
     */
    private String sellerLoginId;


    /**
     * 卖家注册邮箱
     */
    private String sellerLoginEmail;


    /**
     * 是否为商家卖家
     */
    private int isMerchant;


    /**
     * 卖家昵称
     */
    private String buyerNickName;


    /**
     * 订单总价
     */
    private BigDecimal totalPrice;


    /**
     * 使用免运卡数量
     */
    private BigDecimal useFreeCardAmount;


    /**
     * 自动收货日期
     */
    private Date autoReceiveTime;


    /**
     * 自动确认收货是否有效
     */
    @JsonProperty("IsAutoReceiveEnabled")
    private boolean isAutoReceiveEnabled;


    /**
     * 是否评价
     */
    private boolean credited;


    /**
     * 订单评价id
     */
    private long creditId;


    /**
     * 评价用户id
     */
    private long creditUserId;


    /**
     * 卖家服务态度分数
     */
    private int creditServiceRange;


    /**
     * 与描述相符程度
     */
    private int creditUniformityRange;


    /**
     * 好评度
     */
    private int creditScoreRange;


    /**
     * 评价描述
     */
    private String creditDescript;


    /**
     * 评价时间
     */
    private Date creditAddTime;


    /**
     * 评价更新时间
     */
    private Date creditUpdateTime;


    /**
     * 卖家回复评价
     */
    private String creditSellerReply;


    /**
     * 卖家回复评价更新时间
     */
    private Date creditSellerReplyUpdateTime;


    /**
     * 卖家订单备注
     */
    private String sellerNote;


    /**
     * 订单相关运单号列表
     */
    private List<String> billCodeList;


    /**
     * 物流类型
     *
     * @see LogisticsTypeEnum
     */
    private int logisticsType;


    /**
     * 备货状态
     *
     * @see StockStatusEnum
     */
    private int stockStatus;


    /**
     * 订单是否延迟收货
     */
    private boolean delayReceiveFrozened;


    /**
     * 延迟收货日期
     */
    private Date delayReceiveFrozenTime;


    /**
     * 延迟收货记录的更新日期
     */
    private Date delayReceiveUpdateTime;


    /**
     * 延迟收货记录的添加日期
     */
    private Date delayReceiveAddTime;


    /**
     * 延迟收货操作UserID
     */
    private long delayReceiveUserId;


    /**
     * 发货日期
     */
    private Date dispatchTime;


    /**
     * 订单是否在被投诉冻结中
     */
    private boolean frozen;


    /**
     * 退款金额
     */
    private BigDecimal refund;


    /**
     * 应补款金额
     */
    private BigDecimal needPostPay;


    /**
     * 实际支付金额
     */
    private BigDecimal realPay;


    /**
     * 应付红包金额
     */
    private BigDecimal realPaidAmountOfGift;


    /**
     * 应付现金金额
     */
    private BigDecimal needPrePayAmountOfCash;


    /**
     * 实际补款金额
     */
    private BigDecimal realPostPay;


    /**
     * 补款红包金额
     */
    private BigDecimal postPaidAmountOfGift;


    /**
     * 补款优惠券金额
     */
    private BigDecimal postPaidAmountOfCoupon;


    /**
     * 首付款金额
     */
    private BigDecimal firstPay;


    /**
     * 订单所属平台
     *
     * @see PlatformEnum
     */
    private int platformEnum;


    /**
     * 实际支付的现金
     */
    private BigDecimal realPaidAmountOfCash;


    /**
     * 是否是Xlobo发货
     */
    @JsonProperty("IsShippedByXlobo")
    private boolean isShippedByXlobo;


    /**
     * 订单项列表
     */
    private List<OrderItemInfo> orderItemList;


    /**
     * 运单列表
     */
    private List<BillInfo> billInfoList;


    /**
     * 发货物流信息
     */
    private List<OrderSummary> orderSummaryList;


    /**
     * 第三方支付退款状态。目前仅在第三方退款处理中的订单此属性才有值：ThirdPartyRefundStatus.Processing
     * @see ThirdPartyRefundStatus
     *
     */
    private Integer thirdPartyRefundStatus;


    /**
     * 免运卡金额
     */
    private BigDecimal paidAmountOfFreeCard;


    /**
     * 优惠券金额
     */
    private BigDecimal paidAmountOfCoupon;


    /**
     * 是否支持本土退货
     */
    private boolean supportLocalRefund;


    /**
     * 本土退货申请时间
     */
    private Date localRefundApplyTime;


    /**
     * 风控状态
     *
     * @see RiskVerifiedStatusEnum
     */
    private int riskVerifiedStatus;


    /**
     * 卖家优惠券使用额度
     */
    private BigDecimal sellerCouponAmount;


    /**
     * 退货退款状态
     *
     * @see SalesRefundStatusEnum
     */
    private Integer salesRefundStatus;


    /**
     * 退货退款总额
     */
    private BigDecimal totalSalesRefundAmount;


    /**
     * 实际退平台优惠券金额
     */
    private BigDecimal realSettlementAmountOfCoupon;


    /**
     * 调价总额
     */
    private BigDecimal totalPriceChange;


    /**
     * 拼邮国内段是否已发货.true:已发货false:未发货null:非拼邮
     */
    private Boolean packageDelivery_DomesticDelivered;


    /**
     * 订单取消原因
     */
    private String cancelReason;


    /**
     * 是否需要上传身份证
     */
    private boolean needUploadIdCard;


    /**
     * 是否已上传身份证
     */
    private boolean haveUploadedIdCard;


    /**
     * 商家优惠券Code
     */
    private String sellerCouponCode;


    /**
     * 码头平台优惠券Code
     */
    private String ymtCouponCode;


    /**
     * 码头平台优惠券金额
     */
    private BigDecimal ymtCouponAmount;


    /**
     * 平台优惠券金额
     */
    private BigDecimal paidAmountOfYmtCoupon;


    /**
     * 订单总应付金额
     */
    private BigDecimal payableAmount;


    /**
     * 主订单号
     */
    private Long mainOrderId;


    /**
     * 备注等级
     */
    private Integer remarkLevel;


    /**
     * 业务类型(1-贝海发货2-拼邮发货3-投诉维权4-退货退款)
     */
    private List<Integer> busynessTypeList;


    /**
     * 优惠活动金额
     */
    private BigDecimal promotionReducedAmount;


    /**
     * 新买手单标识
     */
    @JsonProperty("IsNewSellerOrder")
    private Boolean isNewSellerOrder;


    /**
     * 新客单标识
     */
    @JsonProperty("IsNewCustomerOrder")
    private Boolean isNewCustomerOrder;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public long getTradingId() {
        return tradingId;
    }

    public void setTradingId(long tradingId) {
        this.tradingId = tradingId;
    }

    public Integer getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(Integer tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    public Date getOperateExpireTime() {
        return operateExpireTime;
    }

    public void setOperateExpireTime(Date operateExpireTime) {
        this.operateExpireTime = operateExpireTime;
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

    public String getqQ() {
        return qQ;
    }

    public void setqQ(String qQ) {
        this.qQ = qQ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeaveWord() {
        return leaveWord;
    }

    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord;
    }

    public Integer getUnfreezeStatus() {
        return unfreezeStatus;
    }

    public void setUnfreezeStatus(Integer unfreezeStatus) {
        this.unfreezeStatus = unfreezeStatus;
    }

    public Date getDispathTime() {
        return dispathTime;
    }

    public void setDispathTime(Date dispathTime) {
        this.dispathTime = dispathTime;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReplyTopicWhenOrderPaid() {
        return replyTopicWhenOrderPaid;
    }

    public void setReplyTopicWhenOrderPaid(Integer replyTopicWhenOrderPaid) {
        this.replyTopicWhenOrderPaid = replyTopicWhenOrderPaid;
    }

    public boolean isPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    public BigDecimal getUseGiftAmount() {
        return useGiftAmount;
    }

    public void setUseGiftAmount(BigDecimal useGiftAmount) {
        this.useGiftAmount = useGiftAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getApplyPostPayTime() {
        return applyPostPayTime;
    }

    public void setApplyPostPayTime(Date applyPostPayTime) {
        this.applyPostPayTime = applyPostPayTime;
    }

    public Date getPostPaidTime() {
        return postPaidTime;
    }

    public void setPostPaidTime(Date postPaidTime) {
        this.postPaidTime = postPaidTime;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Date getConfirmedTime() {
        return confirmedTime;
    }

    public void setConfirmedTime(Date confirmedTime) {
        this.confirmedTime = confirmedTime;
    }

    public Date getChangeAddressTime() {
        return changeAddressTime;
    }

    public void setChangeAddressTime(Date changeAddressTime) {
        this.changeAddressTime = changeAddressTime;
    }

    public int getDistributor() {
        return distributor;
    }

    public void setDistributor(int distributor) {
        this.distributor = distributor;
    }

    public String getThirdOrderId() {
        return thirdOrderId;
    }

    public void setThirdOrderId(String thirdOrderId) {
        this.thirdOrderId = thirdOrderId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getOldFreight() {
        return oldFreight;
    }

    public void setOldFreight(BigDecimal oldFreight) {
        this.oldFreight = oldFreight;
    }

    public Date getDiscountTime() {
        return discountTime;
    }

    public void setDiscountTime(Date discountTime) {
        this.discountTime = discountTime;
    }

    public BigDecimal getOldDiscount() {
        return oldDiscount;
    }

    public void setOldDiscount(BigDecimal oldDiscount) {
        this.oldDiscount = oldDiscount;
    }

    public BigDecimal getAutoCancelOrderHours() {
        return autoCancelOrderHours;
    }

    public void setAutoCancelOrderHours(BigDecimal autoCancelOrderHours) {
        this.autoCancelOrderHours = autoCancelOrderHours;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public boolean isShangouOrder() {
        return shangouOrder;
    }

    public void setShangouOrder(boolean shangouOrder) {
        this.shangouOrder = shangouOrder;
    }

    public String getBuyerLoginId() {
        return buyerLoginId;
    }

    public void setBuyerLoginId(String buyerLoginId) {
        this.buyerLoginId = buyerLoginId;
    }

    public String getBuyerLoginEmail() {
        return buyerLoginEmail;
    }

    public void setBuyerLoginEmail(String buyerLoginEmail) {
        this.buyerLoginEmail = buyerLoginEmail;
    }

    public String getSellerLoginId() {
        return sellerLoginId;
    }

    public void setSellerLoginId(String sellerLoginId) {
        this.sellerLoginId = sellerLoginId;
    }

    public String getSellerLoginEmail() {
        return sellerLoginEmail;
    }

    public void setSellerLoginEmail(String sellerLoginEmail) {
        this.sellerLoginEmail = sellerLoginEmail;
    }

    public int getIsMerchant() {
        return isMerchant;
    }

    public void setIsMerchant(int isMerchant) {
        this.isMerchant = isMerchant;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getUseFreeCardAmount() {
        return useFreeCardAmount;
    }

    public void setUseFreeCardAmount(BigDecimal useFreeCardAmount) {
        this.useFreeCardAmount = useFreeCardAmount;
    }

    public Date getAutoReceiveTime() {
        return autoReceiveTime;
    }

    public void setAutoReceiveTime(Date autoReceiveTime) {
        this.autoReceiveTime = autoReceiveTime;
    }

    public boolean isAutoReceiveEnabled() {
        return isAutoReceiveEnabled;
    }

    public void setAutoReceiveEnabled(boolean autoReceiveEnabled) {
        isAutoReceiveEnabled = autoReceiveEnabled;
    }

    public boolean isCredited() {
        return credited;
    }

    public void setCredited(boolean credited) {
        this.credited = credited;
    }

    public long getCreditId() {
        return creditId;
    }

    public void setCreditId(long creditId) {
        this.creditId = creditId;
    }

    public long getCreditUserId() {
        return creditUserId;
    }

    public void setCreditUserId(long creditUserId) {
        this.creditUserId = creditUserId;
    }

    public int getCreditServiceRange() {
        return creditServiceRange;
    }

    public void setCreditServiceRange(int creditServiceRange) {
        this.creditServiceRange = creditServiceRange;
    }

    public int getCreditUniformityRange() {
        return creditUniformityRange;
    }

    public void setCreditUniformityRange(int creditUniformityRange) {
        this.creditUniformityRange = creditUniformityRange;
    }

    public int getCreditScoreRange() {
        return creditScoreRange;
    }

    public void setCreditScoreRange(int creditScoreRange) {
        this.creditScoreRange = creditScoreRange;
    }

    public String getCreditDescript() {
        return creditDescript;
    }

    public void setCreditDescript(String creditDescript) {
        this.creditDescript = creditDescript;
    }

    public Date getCreditAddTime() {
        return creditAddTime;
    }

    public void setCreditAddTime(Date creditAddTime) {
        this.creditAddTime = creditAddTime;
    }

    public Date getCreditUpdateTime() {
        return creditUpdateTime;
    }

    public void setCreditUpdateTime(Date creditUpdateTime) {
        this.creditUpdateTime = creditUpdateTime;
    }

    public String getCreditSellerReply() {
        return creditSellerReply;
    }

    public void setCreditSellerReply(String creditSellerReply) {
        this.creditSellerReply = creditSellerReply;
    }

    public Date getCreditSellerReplyUpdateTime() {
        return creditSellerReplyUpdateTime;
    }

    public void setCreditSellerReplyUpdateTime(Date creditSellerReplyUpdateTime) {
        this.creditSellerReplyUpdateTime = creditSellerReplyUpdateTime;
    }

    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    public List<String> getBillCodeList() {
        return billCodeList;
    }

    public void setBillCodeList(List<String> billCodeList) {
        this.billCodeList = billCodeList;
    }

    public int getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(int logisticsType) {
        this.logisticsType = logisticsType;
    }

    public int getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(int stockStatus) {
        this.stockStatus = stockStatus;
    }

    public boolean isDelayReceiveFrozened() {
        return delayReceiveFrozened;
    }

    public void setDelayReceiveFrozened(boolean delayReceiveFrozened) {
        this.delayReceiveFrozened = delayReceiveFrozened;
    }

    public Date getDelayReceiveFrozenTime() {
        return delayReceiveFrozenTime;
    }

    public void setDelayReceiveFrozenTime(Date delayReceiveFrozenTime) {
        this.delayReceiveFrozenTime = delayReceiveFrozenTime;
    }

    public Date getDelayReceiveUpdateTime() {
        return delayReceiveUpdateTime;
    }

    public void setDelayReceiveUpdateTime(Date delayReceiveUpdateTime) {
        this.delayReceiveUpdateTime = delayReceiveUpdateTime;
    }

    public Date getDelayReceiveAddTime() {
        return delayReceiveAddTime;
    }

    public void setDelayReceiveAddTime(Date delayReceiveAddTime) {
        this.delayReceiveAddTime = delayReceiveAddTime;
    }

    public long getDelayReceiveUserId() {
        return delayReceiveUserId;
    }

    public void setDelayReceiveUserId(long delayReceiveUserId) {
        this.delayReceiveUserId = delayReceiveUserId;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public BigDecimal getNeedPostPay() {
        return needPostPay;
    }

    public void setNeedPostPay(BigDecimal needPostPay) {
        this.needPostPay = needPostPay;
    }

    public BigDecimal getRealPay() {
        return realPay;
    }

    public void setRealPay(BigDecimal realPay) {
        this.realPay = realPay;
    }

    public BigDecimal getRealPaidAmountOfGift() {
        return realPaidAmountOfGift;
    }

    public void setRealPaidAmountOfGift(BigDecimal realPaidAmountOfGift) {
        this.realPaidAmountOfGift = realPaidAmountOfGift;
    }

    public BigDecimal getNeedPrePayAmountOfCash() {
        return needPrePayAmountOfCash;
    }

    public void setNeedPrePayAmountOfCash(BigDecimal needPrePayAmountOfCash) {
        this.needPrePayAmountOfCash = needPrePayAmountOfCash;
    }

    public BigDecimal getRealPostPay() {
        return realPostPay;
    }

    public void setRealPostPay(BigDecimal realPostPay) {
        this.realPostPay = realPostPay;
    }

    public BigDecimal getPostPaidAmountOfGift() {
        return postPaidAmountOfGift;
    }

    public void setPostPaidAmountOfGift(BigDecimal postPaidAmountOfGift) {
        this.postPaidAmountOfGift = postPaidAmountOfGift;
    }

    public BigDecimal getPostPaidAmountOfCoupon() {
        return postPaidAmountOfCoupon;
    }

    public void setPostPaidAmountOfCoupon(BigDecimal postPaidAmountOfCoupon) {
        this.postPaidAmountOfCoupon = postPaidAmountOfCoupon;
    }

    public BigDecimal getFirstPay() {
        return firstPay;
    }

    public void setFirstPay(BigDecimal firstPay) {
        this.firstPay = firstPay;
    }

    public int getPlatformEnum() {
        return platformEnum;
    }

    public void setPlatformEnum(int platformEnum) {
        this.platformEnum = platformEnum;
    }

    public BigDecimal getRealPaidAmountOfCash() {
        return realPaidAmountOfCash;
    }

    public void setRealPaidAmountOfCash(BigDecimal realPaidAmountOfCash) {
        this.realPaidAmountOfCash = realPaidAmountOfCash;
    }

    public boolean isShippedByXlobo() {
        return isShippedByXlobo;
    }

    public void setShippedByXlobo(boolean shippedByXlobo) {
        isShippedByXlobo = shippedByXlobo;
    }

    public List<OrderItemInfo> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemInfo> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<BillInfo> getBillInfoList() {
        return billInfoList;
    }

    public void setBillInfoList(List<BillInfo> billInfoList) {
        this.billInfoList = billInfoList;
    }

    public List<OrderSummary> getOrderSummaryList() {
        return orderSummaryList;
    }

    public void setOrderSummaryList(List<OrderSummary> orderSummaryList) {
        this.orderSummaryList = orderSummaryList;
    }

    public Integer getThirdPartyRefundStatus() {
        return thirdPartyRefundStatus;
    }

    public void setThirdPartyRefundStatus(Integer thirdPartyRefundStatus) {
        this.thirdPartyRefundStatus = thirdPartyRefundStatus;
    }

    public BigDecimal getPaidAmountOfFreeCard() {
        return paidAmountOfFreeCard;
    }

    public void setPaidAmountOfFreeCard(BigDecimal paidAmountOfFreeCard) {
        this.paidAmountOfFreeCard = paidAmountOfFreeCard;
    }

    public BigDecimal getPaidAmountOfCoupon() {
        return paidAmountOfCoupon;
    }

    public void setPaidAmountOfCoupon(BigDecimal paidAmountOfCoupon) {
        this.paidAmountOfCoupon = paidAmountOfCoupon;
    }

    public boolean isSupportLocalRefund() {
        return supportLocalRefund;
    }

    public void setSupportLocalRefund(boolean supportLocalRefund) {
        this.supportLocalRefund = supportLocalRefund;
    }

    public Date getLocalRefundApplyTime() {
        return localRefundApplyTime;
    }

    public void setLocalRefundApplyTime(Date localRefundApplyTime) {
        this.localRefundApplyTime = localRefundApplyTime;
    }

    public int getRiskVerifiedStatus() {
        return riskVerifiedStatus;
    }

    public void setRiskVerifiedStatus(int riskVerifiedStatus) {
        this.riskVerifiedStatus = riskVerifiedStatus;
    }

    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    public Integer getSalesRefundStatus() {
        return salesRefundStatus;
    }

    public void setSalesRefundStatus(Integer salesRefundStatus) {
        this.salesRefundStatus = salesRefundStatus;
    }

    public BigDecimal getTotalSalesRefundAmount() {
        return totalSalesRefundAmount;
    }

    public void setTotalSalesRefundAmount(BigDecimal totalSalesRefundAmount) {
        this.totalSalesRefundAmount = totalSalesRefundAmount;
    }

    public BigDecimal getRealSettlementAmountOfCoupon() {
        return realSettlementAmountOfCoupon;
    }

    public void setRealSettlementAmountOfCoupon(BigDecimal realSettlementAmountOfCoupon) {
        this.realSettlementAmountOfCoupon = realSettlementAmountOfCoupon;
    }

    public BigDecimal getTotalPriceChange() {
        return totalPriceChange;
    }

    public void setTotalPriceChange(BigDecimal totalPriceChange) {
        this.totalPriceChange = totalPriceChange;
    }

    public Boolean getPackageDelivery_DomesticDelivered() {
        return packageDelivery_DomesticDelivered;
    }

    public void setPackageDelivery_DomesticDelivered(Boolean packageDelivery_DomesticDelivered) {
        this.packageDelivery_DomesticDelivered = packageDelivery_DomesticDelivered;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public boolean isNeedUploadIdCard() {
        return needUploadIdCard;
    }

    public void setNeedUploadIdCard(boolean needUploadIdCard) {
        this.needUploadIdCard = needUploadIdCard;
    }

    public boolean isHaveUploadedIdCard() {
        return haveUploadedIdCard;
    }

    public void setHaveUploadedIdCard(boolean haveUploadedIdCard) {
        this.haveUploadedIdCard = haveUploadedIdCard;
    }

    public String getSellerCouponCode() {
        return sellerCouponCode;
    }

    public void setSellerCouponCode(String sellerCouponCode) {
        this.sellerCouponCode = sellerCouponCode;
    }

    public String getYmtCouponCode() {
        return ymtCouponCode;
    }

    public void setYmtCouponCode(String ymtCouponCode) {
        this.ymtCouponCode = ymtCouponCode;
    }

    public BigDecimal getYmtCouponAmount() {
        return ymtCouponAmount;
    }

    public void setYmtCouponAmount(BigDecimal ymtCouponAmount) {
        this.ymtCouponAmount = ymtCouponAmount;
    }

    public BigDecimal getPaidAmountOfYmtCoupon() {
        return paidAmountOfYmtCoupon;
    }

    public void setPaidAmountOfYmtCoupon(BigDecimal paidAmountOfYmtCoupon) {
        this.paidAmountOfYmtCoupon = paidAmountOfYmtCoupon;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Long getMainOrderId() {
        return mainOrderId;
    }

    public void setMainOrderId(Long mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    public Integer getRemarkLevel() {
        return remarkLevel;
    }

    public void setRemarkLevel(Integer remarkLevel) {
        this.remarkLevel = remarkLevel;
    }

    public List<Integer> getBusynessTypeList() {
        return busynessTypeList;
    }

    public void setBusynessTypeList(List<Integer> busynessTypeList) {
        this.busynessTypeList = busynessTypeList;
    }

    public BigDecimal getPromotionReducedAmount() {
        return promotionReducedAmount;
    }

    public void setPromotionReducedAmount(BigDecimal promotionReducedAmount) {
        this.promotionReducedAmount = promotionReducedAmount;
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
}

