
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


import java.math.BigDecimal;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

public class ProductPromotion extends PrintFriendliness {


    /**
     * 促销活动ID
     */
    private long iD;


    /**
     * 促销活动类型
     */
    private int type;


    /**
     * 促销活动名称
     */
    private String name;


    /**
     * 满件时，需达到的件数;满额时,需要达到的额度.如满100减50中的100
     */
    private String condition;


    /**
     * 满减时，减掉的金额；满折时，打的折扣.如满100减50中的50(将来某些活动可能送商品,则此处为商品ID.请根据Type判断)
     */
    private String content;


    /**
     * 应用该优惠时，共优惠的金额
     */
    private BigDecimal reducedAmount;


    /**
     * 商品分摊的优惠金额
     */
    private BigDecimal partialReducedAmount;

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BigDecimal getReducedAmount() {
        return reducedAmount;
    }

    public void setReducedAmount(BigDecimal reducedAmount) {
        this.reducedAmount = reducedAmount;
    }

    public BigDecimal getPartialReducedAmount() {
        return partialReducedAmount;
    }

    public void setPartialReducedAmount(BigDecimal partialReducedAmount) {
        this.partialReducedAmount = partialReducedAmount;
    }
}

