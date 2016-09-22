package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.ymatou.deviceid.infrastructure.db.model.OrderInfoPo;

import java.math.BigDecimal;

/**
 * Created by zhangyifan on 2016/9/6.
 */
public class OrderInfoExtPo extends OrderInfoPo {

    private Integer promotionType;

    private Long promotionId;

    private String promotionName;

    private String matchCondition;

    private String promotionValue;

    private BigDecimal reducedAmount;

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
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
