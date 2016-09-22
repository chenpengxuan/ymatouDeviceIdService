package com.ymatou.deviceid.facade.model.req;

import com.ymatou.deviceid.facade.model.vo.TimeRange;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * Created by zhangzhiqiang on 2016/9/12.
 */
public class ExportOrderRelatedInfosReqBase extends BaseRequest {
    /**
     * 用户ID
     */
    @Min(value = 1 , message = "商家Id不能为空")
    private int sellerId;


    /**
     * 查询关键字(精确匹配)
     */
    private String buyerNickName;


    /**
     * 商品名称(精确匹配)
     */
    private String productName;


    /**
     * 下单时间
     */
    private TimeRange createdTime;


    /**
     * 付款时间
     */
    private TimeRange paidTime;


    /**
     * 发货时间
     */
    private TimeRange deliveredTime;


    /**
     * 申请补款时间
     */
    private TimeRange postpayAppliedTime;


    /**
     * 订单状态(对应枚举：OrderStatusEnum)
     */
    private List<Integer> orderStatus;


    /**
     * 配送方式(对应枚举：LogisticsTypeEnum)
     */
    private List<Integer> logisticsTypes;


    /**
     * 订单号
     */
    private Long orderId;


    /**
     * 1.定金+尾款或全款
     */
    private List<Byte> payTypes;

//
//    /**
//     * 订单类型列表(现货订单(0)  扫货订单(1)  下单器订单(2))
//     */
//    private List<Integer> orderTypeList;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public TimeRange getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(TimeRange createdTime) {
        this.createdTime = createdTime;
    }

    public TimeRange getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(TimeRange paidTime) {
        this.paidTime = paidTime;
    }

    public TimeRange getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(TimeRange deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public TimeRange getPostpayAppliedTime() {
        return postpayAppliedTime;
    }

    public void setPostpayAppliedTime(TimeRange postpayAppliedTime) {
        this.postpayAppliedTime = postpayAppliedTime;
    }

    public List<Integer> getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(List<Integer> orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Integer> getLogisticsTypes() {
        return logisticsTypes;
    }

    public void setLogisticsTypes(List<Integer> logisticsTypes) {
        this.logisticsTypes = logisticsTypes;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<Byte> getPayTypes() {
        return payTypes;
    }

    public void setPayTypes(List<Byte> payTypes) {
        this.payTypes = payTypes;
    }
}
