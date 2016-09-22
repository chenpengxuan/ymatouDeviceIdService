package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.ymatou.deviceid.infrastructure.db.model.OrderInfoPo;

import java.math.BigDecimal;

/**
 * Created by zhangzhiqiang on 2016/9/6.
 */
public class SellerOrderProductInfoPo extends OrderInfoPo {
    /**
     * 退货退款单号
     */
    private String salesRefundCode;


    /**
     * 退货退款金额
     */
    private BigDecimal salesRefundAmount;

    /**
     * 促销活动ID
     */
    private Integer promotionId;


    /**
     * 促销活动类型
     */
    private Integer promotionType;


    /**
     * 促销活动名称
     */
    private String promotionName;


    /**
     * 满件时，需达到的件数;满额时,需要达到的额度.如满100减50中的100
     */
    private String matchCondition;


    /**
     * 满减时，减掉的金额；满折时，打的折扣.如满100减50中的50(将来某些活动可能送商品,则此处为商品ID.请根据Type判断)
     */
    private String promotionValue;


    /**
     * 应用该优惠时，共优惠的金额
     */
    private BigDecimal reducedAmount;

    public String getSalesRefundCode() {
        return salesRefundCode;
    }

    public void setSalesRefundCode(String salesRefundCode) {
        this.salesRefundCode = salesRefundCode;
    }

    public BigDecimal getSalesRefundAmount() {
        return salesRefundAmount;
    }

    public void setSalesRefundAmount(BigDecimal salesRefundAmount) {
        this.salesRefundAmount = salesRefundAmount;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getMatchCondition() {
        return matchCondition;
    }

    public void setMatchCondition(String matchCondition) {
        this.matchCondition = matchCondition;
    }

    public String getPromotionValue() {
        return promotionValue;
    }

    public void setPromotionValue(String promotionValue) {
        this.promotionValue = promotionValue;
    }

    public BigDecimal getReducedAmount() {
        return reducedAmount;
    }

    public void setReducedAmount(BigDecimal reducedAmount) {
        this.reducedAmount = reducedAmount;
    }
}
