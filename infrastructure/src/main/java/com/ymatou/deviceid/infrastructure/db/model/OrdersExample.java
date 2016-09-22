package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("iOrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("iOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("iOrderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("iOrderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("iOrderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iOrderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("iOrderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("iOrderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("iOrderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("iOrderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("iOrderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("iOrderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("iUserId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("iUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("iUserId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("iUserId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("iUserId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iUserId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("iUserId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("iUserId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("iUserId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("iUserId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("iUserId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("iUserId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("iBuyerId is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("iBuyerId is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("iBuyerId =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("iBuyerId <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("iBuyerId >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iBuyerId >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("iBuyerId <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("iBuyerId <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("iBuyerId in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("iBuyerId not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("iBuyerId between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("iBuyerId not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andMarkIdIsNull() {
            addCriterion("sMarkId is null");
            return (Criteria) this;
        }

        public Criteria andMarkIdIsNotNull() {
            addCriterion("sMarkId is not null");
            return (Criteria) this;
        }

        public Criteria andMarkIdEqualTo(String value) {
            addCriterion("sMarkId =", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotEqualTo(String value) {
            addCriterion("sMarkId <>", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdGreaterThan(String value) {
            addCriterion("sMarkId >", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdGreaterThanOrEqualTo(String value) {
            addCriterion("sMarkId >=", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLessThan(String value) {
            addCriterion("sMarkId <", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLessThanOrEqualTo(String value) {
            addCriterion("sMarkId <=", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLike(String value) {
            addCriterion("sMarkId like", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotLike(String value) {
            addCriterion("sMarkId not like", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdIn(List<String> values) {
            addCriterion("sMarkId in", values, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotIn(List<String> values) {
            addCriterion("sMarkId not in", values, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdBetween(String value1, String value2) {
            addCriterion("sMarkId between", value1, value2, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotBetween(String value1, String value2) {
            addCriterion("sMarkId not between", value1, value2, "markId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("dAddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("dAddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("dAddTime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("dAddTime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("dAddTime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dAddTime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("dAddTime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("dAddTime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("dAddTime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("dAddTime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("dAddTime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("dAddTime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("fOrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("fOrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("fOrderPrice =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("fOrderPrice <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("fOrderPrice >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fOrderPrice >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("fOrderPrice <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fOrderPrice <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("fOrderPrice in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("fOrderPrice not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOrderPrice between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOrderPrice not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIsNull() {
            addCriterion("fOrderDiscount is null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIsNotNull() {
            addCriterion("fOrderDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountEqualTo(BigDecimal value) {
            addCriterion("fOrderDiscount =", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotEqualTo(BigDecimal value) {
            addCriterion("fOrderDiscount <>", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountGreaterThan(BigDecimal value) {
            addCriterion("fOrderDiscount >", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fOrderDiscount >=", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLessThan(BigDecimal value) {
            addCriterion("fOrderDiscount <", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fOrderDiscount <=", value, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountIn(List<BigDecimal> values) {
            addCriterion("fOrderDiscount in", values, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotIn(List<BigDecimal> values) {
            addCriterion("fOrderDiscount not in", values, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOrderDiscount between", value1, value2, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOrderDiscount not between", value1, value2, "orderDiscount");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("fFreight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("fFreight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("fFreight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("fFreight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("fFreight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fFreight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("fFreight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fFreight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("fFreight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("fFreight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fFreight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fFreight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("fDiscount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("fDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("fDiscount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("fDiscount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("fDiscount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fDiscount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("fDiscount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fDiscount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("fDiscount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("fDiscount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fDiscount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fDiscount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andTradingIdIsNull() {
            addCriterion("iTradingId is null");
            return (Criteria) this;
        }

        public Criteria andTradingIdIsNotNull() {
            addCriterion("iTradingId is not null");
            return (Criteria) this;
        }

        public Criteria andTradingIdEqualTo(Long value) {
            addCriterion("iTradingId =", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotEqualTo(Long value) {
            addCriterion("iTradingId <>", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdGreaterThan(Long value) {
            addCriterion("iTradingId >", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iTradingId >=", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdLessThan(Long value) {
            addCriterion("iTradingId <", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdLessThanOrEqualTo(Long value) {
            addCriterion("iTradingId <=", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdIn(List<Long> values) {
            addCriterion("iTradingId in", values, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotIn(List<Long> values) {
            addCriterion("iTradingId not in", values, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdBetween(Long value1, Long value2) {
            addCriterion("iTradingId between", value1, value2, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotBetween(Long value1, Long value2) {
            addCriterion("iTradingId not between", value1, value2, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIsNull() {
            addCriterion("iTradingStatus is null");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIsNotNull() {
            addCriterion("iTradingStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTradingStatusEqualTo(Integer value) {
            addCriterion("iTradingStatus =", value, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusNotEqualTo(Integer value) {
            addCriterion("iTradingStatus <>", value, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusGreaterThan(Integer value) {
            addCriterion("iTradingStatus >", value, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTradingStatus >=", value, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusLessThan(Integer value) {
            addCriterion("iTradingStatus <", value, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iTradingStatus <=", value, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIn(List<Integer> values) {
            addCriterion("iTradingStatus in", values, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusNotIn(List<Integer> values) {
            addCriterion("iTradingStatus not in", values, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusBetween(Integer value1, Integer value2) {
            addCriterion("iTradingStatus between", value1, value2, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andTradingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iTradingStatus not between", value1, value2, "tradingStatus");
            return (Criteria) this;
        }

        public Criteria andOperateIsNull() {
            addCriterion("iOperate is null");
            return (Criteria) this;
        }

        public Criteria andOperateIsNotNull() {
            addCriterion("iOperate is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEqualTo(Integer value) {
            addCriterion("iOperate =", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotEqualTo(Integer value) {
            addCriterion("iOperate <>", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThan(Integer value) {
            addCriterion("iOperate >", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThanOrEqualTo(Integer value) {
            addCriterion("iOperate >=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThan(Integer value) {
            addCriterion("iOperate <", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThanOrEqualTo(Integer value) {
            addCriterion("iOperate <=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateIn(List<Integer> values) {
            addCriterion("iOperate in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotIn(List<Integer> values) {
            addCriterion("iOperate not in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateBetween(Integer value1, Integer value2) {
            addCriterion("iOperate between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotBetween(Integer value1, Integer value2) {
            addCriterion("iOperate not between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeIsNull() {
            addCriterion("dOperateExpireTime is null");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeIsNotNull() {
            addCriterion("dOperateExpireTime is not null");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeEqualTo(Date value) {
            addCriterion("dOperateExpireTime =", value, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeNotEqualTo(Date value) {
            addCriterion("dOperateExpireTime <>", value, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeGreaterThan(Date value) {
            addCriterion("dOperateExpireTime >", value, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dOperateExpireTime >=", value, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeLessThan(Date value) {
            addCriterion("dOperateExpireTime <", value, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("dOperateExpireTime <=", value, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeIn(List<Date> values) {
            addCriterion("dOperateExpireTime in", values, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeNotIn(List<Date> values) {
            addCriterion("dOperateExpireTime not in", values, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeBetween(Date value1, Date value2) {
            addCriterion("dOperateExpireTime between", value1, value2, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andOperateExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("dOperateExpireTime not between", value1, value2, "operateExpireTime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("sAddress is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("sAddress is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("sAddress =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("sAddress <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("sAddress >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sAddress >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("sAddress <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("sAddress <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("sAddress like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("sAddress not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("sAddress in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("sAddress not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("sAddress between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("sAddress not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("sPostCode is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("sPostCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("sPostCode =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("sPostCode <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("sPostCode >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sPostCode >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("sPostCode <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("sPostCode <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("sPostCode like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("sPostCode not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("sPostCode in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("sPostCode not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("sPostCode between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("sPostCode not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andReceivePersonIsNull() {
            addCriterion("sReceivePerson is null");
            return (Criteria) this;
        }

        public Criteria andReceivePersonIsNotNull() {
            addCriterion("sReceivePerson is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePersonEqualTo(String value) {
            addCriterion("sReceivePerson =", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotEqualTo(String value) {
            addCriterion("sReceivePerson <>", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonGreaterThan(String value) {
            addCriterion("sReceivePerson >", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonGreaterThanOrEqualTo(String value) {
            addCriterion("sReceivePerson >=", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonLessThan(String value) {
            addCriterion("sReceivePerson <", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonLessThanOrEqualTo(String value) {
            addCriterion("sReceivePerson <=", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonLike(String value) {
            addCriterion("sReceivePerson like", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotLike(String value) {
            addCriterion("sReceivePerson not like", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonIn(List<String> values) {
            addCriterion("sReceivePerson in", values, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotIn(List<String> values) {
            addCriterion("sReceivePerson not in", values, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonBetween(String value1, String value2) {
            addCriterion("sReceivePerson between", value1, value2, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotBetween(String value1, String value2) {
            addCriterion("sReceivePerson not between", value1, value2, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("sPhone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("sPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("sPhone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("sPhone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("sPhone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sPhone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("sPhone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("sPhone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("sPhone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("sPhone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("sPhone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("sPhone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("sPhone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("sPhone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("sTelephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("sTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("sTelephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("sTelephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("sTelephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("sTelephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("sTelephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("sTelephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("sTelephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("sTelephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("sTelephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("sTelephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("sTelephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("sTelephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andQQIsNull() {
            addCriterion("sQQ is null");
            return (Criteria) this;
        }

        public Criteria andQQIsNotNull() {
            addCriterion("sQQ is not null");
            return (Criteria) this;
        }

        public Criteria andQQEqualTo(String value) {
            addCriterion("sQQ =", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotEqualTo(String value) {
            addCriterion("sQQ <>", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThan(String value) {
            addCriterion("sQQ >", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThanOrEqualTo(String value) {
            addCriterion("sQQ >=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThan(String value) {
            addCriterion("sQQ <", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThanOrEqualTo(String value) {
            addCriterion("sQQ <=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLike(String value) {
            addCriterion("sQQ like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotLike(String value) {
            addCriterion("sQQ not like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQIn(List<String> values) {
            addCriterion("sQQ in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotIn(List<String> values) {
            addCriterion("sQQ not in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQBetween(String value1, String value2) {
            addCriterion("sQQ between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotBetween(String value1, String value2) {
            addCriterion("sQQ not between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("sEmail is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("sEmail is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("sEmail =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("sEmail <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("sEmail >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sEmail >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("sEmail <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("sEmail <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("sEmail like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("sEmail not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("sEmail in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("sEmail not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("sEmail between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("sEmail not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIsNull() {
            addCriterion("sLeaveWord is null");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIsNotNull() {
            addCriterion("sLeaveWord is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveWordEqualTo(String value) {
            addCriterion("sLeaveWord =", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordNotEqualTo(String value) {
            addCriterion("sLeaveWord <>", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordGreaterThan(String value) {
            addCriterion("sLeaveWord >", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordGreaterThanOrEqualTo(String value) {
            addCriterion("sLeaveWord >=", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordLessThan(String value) {
            addCriterion("sLeaveWord <", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordLessThanOrEqualTo(String value) {
            addCriterion("sLeaveWord <=", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordLike(String value) {
            addCriterion("sLeaveWord like", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordNotLike(String value) {
            addCriterion("sLeaveWord not like", value, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIn(List<String> values) {
            addCriterion("sLeaveWord in", values, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordNotIn(List<String> values) {
            addCriterion("sLeaveWord not in", values, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordBetween(String value1, String value2) {
            addCriterion("sLeaveWord between", value1, value2, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andLeaveWordNotBetween(String value1, String value2) {
            addCriterion("sLeaveWord not between", value1, value2, "leaveWord");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusIsNull() {
            addCriterion("iUnfreezeStatus is null");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusIsNotNull() {
            addCriterion("iUnfreezeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusEqualTo(Integer value) {
            addCriterion("iUnfreezeStatus =", value, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusNotEqualTo(Integer value) {
            addCriterion("iUnfreezeStatus <>", value, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusGreaterThan(Integer value) {
            addCriterion("iUnfreezeStatus >", value, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iUnfreezeStatus >=", value, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusLessThan(Integer value) {
            addCriterion("iUnfreezeStatus <", value, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iUnfreezeStatus <=", value, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusIn(List<Integer> values) {
            addCriterion("iUnfreezeStatus in", values, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusNotIn(List<Integer> values) {
            addCriterion("iUnfreezeStatus not in", values, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusBetween(Integer value1, Integer value2) {
            addCriterion("iUnfreezeStatus between", value1, value2, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andUnfreezeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iUnfreezeStatus not between", value1, value2, "unfreezeStatus");
            return (Criteria) this;
        }

        public Criteria andDispathTimeIsNull() {
            addCriterion("dDispathTime is null");
            return (Criteria) this;
        }

        public Criteria andDispathTimeIsNotNull() {
            addCriterion("dDispathTime is not null");
            return (Criteria) this;
        }

        public Criteria andDispathTimeEqualTo(Date value) {
            addCriterion("dDispathTime =", value, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeNotEqualTo(Date value) {
            addCriterion("dDispathTime <>", value, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeGreaterThan(Date value) {
            addCriterion("dDispathTime >", value, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dDispathTime >=", value, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeLessThan(Date value) {
            addCriterion("dDispathTime <", value, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeLessThanOrEqualTo(Date value) {
            addCriterion("dDispathTime <=", value, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeIn(List<Date> values) {
            addCriterion("dDispathTime in", values, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeNotIn(List<Date> values) {
            addCriterion("dDispathTime not in", values, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeBetween(Date value1, Date value2) {
            addCriterion("dDispathTime between", value1, value2, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andDispathTimeNotBetween(Date value1, Date value2) {
            addCriterion("dDispathTime not between", value1, value2, "dispathTime");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("iTopicId is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("iTopicId is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("iTopicId =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("iTopicId <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("iTopicId >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTopicId >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("iTopicId <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("iTopicId <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("iTopicId in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("iTopicId not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("iTopicId between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iTopicId not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("sTitle is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("sTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("sTitle =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("sTitle <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("sTitle >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sTitle >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("sTitle <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("sTitle <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("sTitle like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("sTitle not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("sTitle in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("sTitle not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("sTitle between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("sTitle not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidIsNull() {
            addCriterion("iReplyTopicWhenOrderPaid is null");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidIsNotNull() {
            addCriterion("iReplyTopicWhenOrderPaid is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidEqualTo(Integer value) {
            addCriterion("iReplyTopicWhenOrderPaid =", value, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidNotEqualTo(Integer value) {
            addCriterion("iReplyTopicWhenOrderPaid <>", value, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidGreaterThan(Integer value) {
            addCriterion("iReplyTopicWhenOrderPaid >", value, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iReplyTopicWhenOrderPaid >=", value, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidLessThan(Integer value) {
            addCriterion("iReplyTopicWhenOrderPaid <", value, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidLessThanOrEqualTo(Integer value) {
            addCriterion("iReplyTopicWhenOrderPaid <=", value, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidIn(List<Integer> values) {
            addCriterion("iReplyTopicWhenOrderPaid in", values, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidNotIn(List<Integer> values) {
            addCriterion("iReplyTopicWhenOrderPaid not in", values, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidBetween(Integer value1, Integer value2) {
            addCriterion("iReplyTopicWhenOrderPaid between", value1, value2, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andReplyTopicWhenOrderPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("iReplyTopicWhenOrderPaid not between", value1, value2, "replyTopicWhenOrderPaid");
            return (Criteria) this;
        }

        public Criteria andPaidInFullIsNull() {
            addCriterion("bPaidInFull is null");
            return (Criteria) this;
        }

        public Criteria andPaidInFullIsNotNull() {
            addCriterion("bPaidInFull is not null");
            return (Criteria) this;
        }

        public Criteria andPaidInFullEqualTo(Boolean value) {
            addCriterion("bPaidInFull =", value, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullNotEqualTo(Boolean value) {
            addCriterion("bPaidInFull <>", value, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullGreaterThan(Boolean value) {
            addCriterion("bPaidInFull >", value, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bPaidInFull >=", value, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullLessThan(Boolean value) {
            addCriterion("bPaidInFull <", value, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullLessThanOrEqualTo(Boolean value) {
            addCriterion("bPaidInFull <=", value, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullIn(List<Boolean> values) {
            addCriterion("bPaidInFull in", values, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullNotIn(List<Boolean> values) {
            addCriterion("bPaidInFull not in", values, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullBetween(Boolean value1, Boolean value2) {
            addCriterion("bPaidInFull between", value1, value2, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andPaidInFullNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bPaidInFull not between", value1, value2, "paidInFull");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountIsNull() {
            addCriterion("fUseGiftAmount is null");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountIsNotNull() {
            addCriterion("fUseGiftAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountEqualTo(BigDecimal value) {
            addCriterion("fUseGiftAmount =", value, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountNotEqualTo(BigDecimal value) {
            addCriterion("fUseGiftAmount <>", value, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountGreaterThan(BigDecimal value) {
            addCriterion("fUseGiftAmount >", value, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fUseGiftAmount >=", value, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountLessThan(BigDecimal value) {
            addCriterion("fUseGiftAmount <", value, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fUseGiftAmount <=", value, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountIn(List<BigDecimal> values) {
            addCriterion("fUseGiftAmount in", values, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountNotIn(List<BigDecimal> values) {
            addCriterion("fUseGiftAmount not in", values, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fUseGiftAmount between", value1, value2, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUseGiftAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fUseGiftAmount not between", value1, value2, "useGiftAmount");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNull() {
            addCriterion("sCouponCode is null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNotNull() {
            addCriterion("sCouponCode is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeEqualTo(String value) {
            addCriterion("sCouponCode =", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotEqualTo(String value) {
            addCriterion("sCouponCode <>", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThan(String value) {
            addCriterion("sCouponCode >", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCouponCode >=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThan(String value) {
            addCriterion("sCouponCode <", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("sCouponCode <=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLike(String value) {
            addCriterion("sCouponCode like", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotLike(String value) {
            addCriterion("sCouponCode not like", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIn(List<String> values) {
            addCriterion("sCouponCode in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotIn(List<String> values) {
            addCriterion("sCouponCode not in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeBetween(String value1, String value2) {
            addCriterion("sCouponCode between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotBetween(String value1, String value2) {
            addCriterion("sCouponCode not between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNull() {
            addCriterion("CouponValue is null");
            return (Criteria) this;
        }

        public Criteria andCouponValueIsNotNull() {
            addCriterion("CouponValue is not null");
            return (Criteria) this;
        }

        public Criteria andCouponValueEqualTo(BigDecimal value) {
            addCriterion("CouponValue =", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotEqualTo(BigDecimal value) {
            addCriterion("CouponValue <>", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThan(BigDecimal value) {
            addCriterion("CouponValue >", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CouponValue >=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThan(BigDecimal value) {
            addCriterion("CouponValue <", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CouponValue <=", value, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueIn(List<BigDecimal> values) {
            addCriterion("CouponValue in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotIn(List<BigDecimal> values) {
            addCriterion("CouponValue not in", values, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CouponValue between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CouponValue not between", value1, value2, "couponValue");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("iCouponType is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("iCouponType is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("iCouponType =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("iCouponType <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("iCouponType >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCouponType >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("iCouponType <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iCouponType <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("iCouponType in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("iCouponType not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("iCouponType between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iCouponType not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("dPaidTime is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("dPaidTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(Date value) {
            addCriterion("dPaidTime =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(Date value) {
            addCriterion("dPaidTime <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(Date value) {
            addCriterion("dPaidTime >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dPaidTime >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(Date value) {
            addCriterion("dPaidTime <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(Date value) {
            addCriterion("dPaidTime <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<Date> values) {
            addCriterion("dPaidTime in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<Date> values) {
            addCriterion("dPaidTime not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(Date value1, Date value2) {
            addCriterion("dPaidTime between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(Date value1, Date value2) {
            addCriterion("dPaidTime not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeIsNull() {
            addCriterion("dApplyPostPayTime is null");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeIsNotNull() {
            addCriterion("dApplyPostPayTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeEqualTo(Date value) {
            addCriterion("dApplyPostPayTime =", value, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeNotEqualTo(Date value) {
            addCriterion("dApplyPostPayTime <>", value, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeGreaterThan(Date value) {
            addCriterion("dApplyPostPayTime >", value, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dApplyPostPayTime >=", value, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeLessThan(Date value) {
            addCriterion("dApplyPostPayTime <", value, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("dApplyPostPayTime <=", value, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeIn(List<Date> values) {
            addCriterion("dApplyPostPayTime in", values, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeNotIn(List<Date> values) {
            addCriterion("dApplyPostPayTime not in", values, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeBetween(Date value1, Date value2) {
            addCriterion("dApplyPostPayTime between", value1, value2, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPostPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("dApplyPostPayTime not between", value1, value2, "applyPostPayTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeIsNull() {
            addCriterion("dPostPaidTime is null");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeIsNotNull() {
            addCriterion("dPostPaidTime is not null");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeEqualTo(Date value) {
            addCriterion("dPostPaidTime =", value, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeNotEqualTo(Date value) {
            addCriterion("dPostPaidTime <>", value, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeGreaterThan(Date value) {
            addCriterion("dPostPaidTime >", value, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dPostPaidTime >=", value, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeLessThan(Date value) {
            addCriterion("dPostPaidTime <", value, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeLessThanOrEqualTo(Date value) {
            addCriterion("dPostPaidTime <=", value, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeIn(List<Date> values) {
            addCriterion("dPostPaidTime in", values, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeNotIn(List<Date> values) {
            addCriterion("dPostPaidTime not in", values, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeBetween(Date value1, Date value2) {
            addCriterion("dPostPaidTime between", value1, value2, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andPostPaidTimeNotBetween(Date value1, Date value2) {
            addCriterion("dPostPaidTime not between", value1, value2, "postPaidTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeIsNull() {
            addCriterion("dConfirmedTime is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeIsNotNull() {
            addCriterion("dConfirmedTime is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeEqualTo(Date value) {
            addCriterion("dConfirmedTime =", value, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeNotEqualTo(Date value) {
            addCriterion("dConfirmedTime <>", value, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeGreaterThan(Date value) {
            addCriterion("dConfirmedTime >", value, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dConfirmedTime >=", value, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeLessThan(Date value) {
            addCriterion("dConfirmedTime <", value, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeLessThanOrEqualTo(Date value) {
            addCriterion("dConfirmedTime <=", value, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeIn(List<Date> values) {
            addCriterion("dConfirmedTime in", values, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeNotIn(List<Date> values) {
            addCriterion("dConfirmedTime not in", values, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeBetween(Date value1, Date value2) {
            addCriterion("dConfirmedTime between", value1, value2, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmedTimeNotBetween(Date value1, Date value2) {
            addCriterion("dConfirmedTime not between", value1, value2, "confirmedTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeIsNull() {
            addCriterion("dChangeAddressTime is null");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeIsNotNull() {
            addCriterion("dChangeAddressTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeEqualTo(Date value) {
            addCriterion("dChangeAddressTime =", value, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeNotEqualTo(Date value) {
            addCriterion("dChangeAddressTime <>", value, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeGreaterThan(Date value) {
            addCriterion("dChangeAddressTime >", value, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dChangeAddressTime >=", value, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeLessThan(Date value) {
            addCriterion("dChangeAddressTime <", value, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeLessThanOrEqualTo(Date value) {
            addCriterion("dChangeAddressTime <=", value, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeIn(List<Date> values) {
            addCriterion("dChangeAddressTime in", values, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeNotIn(List<Date> values) {
            addCriterion("dChangeAddressTime not in", values, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeBetween(Date value1, Date value2) {
            addCriterion("dChangeAddressTime between", value1, value2, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andChangeAddressTimeNotBetween(Date value1, Date value2) {
            addCriterion("dChangeAddressTime not between", value1, value2, "changeAddressTime");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNull() {
            addCriterion("iDistributor is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNotNull() {
            addCriterion("iDistributor is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorEqualTo(Integer value) {
            addCriterion("iDistributor =", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotEqualTo(Integer value) {
            addCriterion("iDistributor <>", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThan(Integer value) {
            addCriterion("iDistributor >", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThanOrEqualTo(Integer value) {
            addCriterion("iDistributor >=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThan(Integer value) {
            addCriterion("iDistributor <", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThanOrEqualTo(Integer value) {
            addCriterion("iDistributor <=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorIn(List<Integer> values) {
            addCriterion("iDistributor in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotIn(List<Integer> values) {
            addCriterion("iDistributor not in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorBetween(Integer value1, Integer value2) {
            addCriterion("iDistributor between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotBetween(Integer value1, Integer value2) {
            addCriterion("iDistributor not between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdIsNull() {
            addCriterion("sThirdOrderId is null");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdIsNotNull() {
            addCriterion("sThirdOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdEqualTo(String value) {
            addCriterion("sThirdOrderId =", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotEqualTo(String value) {
            addCriterion("sThirdOrderId <>", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdGreaterThan(String value) {
            addCriterion("sThirdOrderId >", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sThirdOrderId >=", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdLessThan(String value) {
            addCriterion("sThirdOrderId <", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sThirdOrderId <=", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdLike(String value) {
            addCriterion("sThirdOrderId like", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotLike(String value) {
            addCriterion("sThirdOrderId not like", value, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdIn(List<String> values) {
            addCriterion("sThirdOrderId in", values, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotIn(List<String> values) {
            addCriterion("sThirdOrderId not in", values, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdBetween(String value1, String value2) {
            addCriterion("sThirdOrderId between", value1, value2, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdOrderIdNotBetween(String value1, String value2) {
            addCriterion("sThirdOrderId not between", value1, value2, "thirdOrderId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("iType is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("iType is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("iType =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("iType <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("iType >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iType >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("iType <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iType <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("iType in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("iType not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("iType between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iType not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOldFreightIsNull() {
            addCriterion("fOldFreight is null");
            return (Criteria) this;
        }

        public Criteria andOldFreightIsNotNull() {
            addCriterion("fOldFreight is not null");
            return (Criteria) this;
        }

        public Criteria andOldFreightEqualTo(BigDecimal value) {
            addCriterion("fOldFreight =", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotEqualTo(BigDecimal value) {
            addCriterion("fOldFreight <>", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightGreaterThan(BigDecimal value) {
            addCriterion("fOldFreight >", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fOldFreight >=", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightLessThan(BigDecimal value) {
            addCriterion("fOldFreight <", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fOldFreight <=", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightIn(List<BigDecimal> values) {
            addCriterion("fOldFreight in", values, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotIn(List<BigDecimal> values) {
            addCriterion("fOldFreight not in", values, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOldFreight between", value1, value2, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOldFreight not between", value1, value2, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeIsNull() {
            addCriterion("dDiscountTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeIsNotNull() {
            addCriterion("dDiscountTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeEqualTo(Date value) {
            addCriterion("dDiscountTime =", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeNotEqualTo(Date value) {
            addCriterion("dDiscountTime <>", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeGreaterThan(Date value) {
            addCriterion("dDiscountTime >", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dDiscountTime >=", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeLessThan(Date value) {
            addCriterion("dDiscountTime <", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeLessThanOrEqualTo(Date value) {
            addCriterion("dDiscountTime <=", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeIn(List<Date> values) {
            addCriterion("dDiscountTime in", values, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeNotIn(List<Date> values) {
            addCriterion("dDiscountTime not in", values, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeBetween(Date value1, Date value2) {
            addCriterion("dDiscountTime between", value1, value2, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeNotBetween(Date value1, Date value2) {
            addCriterion("dDiscountTime not between", value1, value2, "discountTime");
            return (Criteria) this;
        }

        public Criteria andOldDiscountIsNull() {
            addCriterion("fOldDiscount is null");
            return (Criteria) this;
        }

        public Criteria andOldDiscountIsNotNull() {
            addCriterion("fOldDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andOldDiscountEqualTo(BigDecimal value) {
            addCriterion("fOldDiscount =", value, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountNotEqualTo(BigDecimal value) {
            addCriterion("fOldDiscount <>", value, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountGreaterThan(BigDecimal value) {
            addCriterion("fOldDiscount >", value, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fOldDiscount >=", value, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountLessThan(BigDecimal value) {
            addCriterion("fOldDiscount <", value, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fOldDiscount <=", value, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountIn(List<BigDecimal> values) {
            addCriterion("fOldDiscount in", values, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountNotIn(List<BigDecimal> values) {
            addCriterion("fOldDiscount not in", values, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOldDiscount between", value1, value2, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andOldDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOldDiscount not between", value1, value2, "oldDiscount");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursIsNull() {
            addCriterion("fAutoCancelOrderHours is null");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursIsNotNull() {
            addCriterion("fAutoCancelOrderHours is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursEqualTo(BigDecimal value) {
            addCriterion("fAutoCancelOrderHours =", value, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursNotEqualTo(BigDecimal value) {
            addCriterion("fAutoCancelOrderHours <>", value, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursGreaterThan(BigDecimal value) {
            addCriterion("fAutoCancelOrderHours >", value, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fAutoCancelOrderHours >=", value, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursLessThan(BigDecimal value) {
            addCriterion("fAutoCancelOrderHours <", value, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fAutoCancelOrderHours <=", value, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursIn(List<BigDecimal> values) {
            addCriterion("fAutoCancelOrderHours in", values, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursNotIn(List<BigDecimal> values) {
            addCriterion("fAutoCancelOrderHours not in", values, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fAutoCancelOrderHours between", value1, value2, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andAutoCancelOrderHoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fAutoCancelOrderHours not between", value1, value2, "autoCancelOrderHours");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("dCancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("dCancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("dCancelTime =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("dCancelTime <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("dCancelTime >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dCancelTime >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("dCancelTime <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("dCancelTime <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("dCancelTime in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("dCancelTime not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("dCancelTime between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("dCancelTime not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andShangouOrderIsNull() {
            addCriterion("bShangouOrder is null");
            return (Criteria) this;
        }

        public Criteria andShangouOrderIsNotNull() {
            addCriterion("bShangouOrder is not null");
            return (Criteria) this;
        }

        public Criteria andShangouOrderEqualTo(Boolean value) {
            addCriterion("bShangouOrder =", value, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderNotEqualTo(Boolean value) {
            addCriterion("bShangouOrder <>", value, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderGreaterThan(Boolean value) {
            addCriterion("bShangouOrder >", value, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bShangouOrder >=", value, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderLessThan(Boolean value) {
            addCriterion("bShangouOrder <", value, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("bShangouOrder <=", value, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderIn(List<Boolean> values) {
            addCriterion("bShangouOrder in", values, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderNotIn(List<Boolean> values) {
            addCriterion("bShangouOrder not in", values, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("bShangouOrder between", value1, value2, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andShangouOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bShangouOrder not between", value1, value2, "shangouOrder");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdIsNull() {
            addCriterion("sBuyerLoginId is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdIsNotNull() {
            addCriterion("sBuyerLoginId is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdEqualTo(String value) {
            addCriterion("sBuyerLoginId =", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdNotEqualTo(String value) {
            addCriterion("sBuyerLoginId <>", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdGreaterThan(String value) {
            addCriterion("sBuyerLoginId >", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("sBuyerLoginId >=", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdLessThan(String value) {
            addCriterion("sBuyerLoginId <", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdLessThanOrEqualTo(String value) {
            addCriterion("sBuyerLoginId <=", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdLike(String value) {
            addCriterion("sBuyerLoginId like", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdNotLike(String value) {
            addCriterion("sBuyerLoginId not like", value, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdIn(List<String> values) {
            addCriterion("sBuyerLoginId in", values, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdNotIn(List<String> values) {
            addCriterion("sBuyerLoginId not in", values, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdBetween(String value1, String value2) {
            addCriterion("sBuyerLoginId between", value1, value2, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginIdNotBetween(String value1, String value2) {
            addCriterion("sBuyerLoginId not between", value1, value2, "buyerLoginId");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailIsNull() {
            addCriterion("sBuyerLoginEmail is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailIsNotNull() {
            addCriterion("sBuyerLoginEmail is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailEqualTo(String value) {
            addCriterion("sBuyerLoginEmail =", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailNotEqualTo(String value) {
            addCriterion("sBuyerLoginEmail <>", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailGreaterThan(String value) {
            addCriterion("sBuyerLoginEmail >", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sBuyerLoginEmail >=", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailLessThan(String value) {
            addCriterion("sBuyerLoginEmail <", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailLessThanOrEqualTo(String value) {
            addCriterion("sBuyerLoginEmail <=", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailLike(String value) {
            addCriterion("sBuyerLoginEmail like", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailNotLike(String value) {
            addCriterion("sBuyerLoginEmail not like", value, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailIn(List<String> values) {
            addCriterion("sBuyerLoginEmail in", values, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailNotIn(List<String> values) {
            addCriterion("sBuyerLoginEmail not in", values, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailBetween(String value1, String value2) {
            addCriterion("sBuyerLoginEmail between", value1, value2, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerLoginEmailNotBetween(String value1, String value2) {
            addCriterion("sBuyerLoginEmail not between", value1, value2, "buyerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdIsNull() {
            addCriterion("sSellerLoginId is null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdIsNotNull() {
            addCriterion("sSellerLoginId is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdEqualTo(String value) {
            addCriterion("sSellerLoginId =", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdNotEqualTo(String value) {
            addCriterion("sSellerLoginId <>", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdGreaterThan(String value) {
            addCriterion("sSellerLoginId >", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("sSellerLoginId >=", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdLessThan(String value) {
            addCriterion("sSellerLoginId <", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdLessThanOrEqualTo(String value) {
            addCriterion("sSellerLoginId <=", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdLike(String value) {
            addCriterion("sSellerLoginId like", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdNotLike(String value) {
            addCriterion("sSellerLoginId not like", value, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdIn(List<String> values) {
            addCriterion("sSellerLoginId in", values, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdNotIn(List<String> values) {
            addCriterion("sSellerLoginId not in", values, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdBetween(String value1, String value2) {
            addCriterion("sSellerLoginId between", value1, value2, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIdNotBetween(String value1, String value2) {
            addCriterion("sSellerLoginId not between", value1, value2, "sellerLoginId");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailIsNull() {
            addCriterion("sSellerLoginEmail is null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailIsNotNull() {
            addCriterion("sSellerLoginEmail is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailEqualTo(String value) {
            addCriterion("sSellerLoginEmail =", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailNotEqualTo(String value) {
            addCriterion("sSellerLoginEmail <>", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailGreaterThan(String value) {
            addCriterion("sSellerLoginEmail >", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sSellerLoginEmail >=", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailLessThan(String value) {
            addCriterion("sSellerLoginEmail <", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailLessThanOrEqualTo(String value) {
            addCriterion("sSellerLoginEmail <=", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailLike(String value) {
            addCriterion("sSellerLoginEmail like", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailNotLike(String value) {
            addCriterion("sSellerLoginEmail not like", value, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailIn(List<String> values) {
            addCriterion("sSellerLoginEmail in", values, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailNotIn(List<String> values) {
            addCriterion("sSellerLoginEmail not in", values, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailBetween(String value1, String value2) {
            addCriterion("sSellerLoginEmail between", value1, value2, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEmailNotBetween(String value1, String value2) {
            addCriterion("sSellerLoginEmail not between", value1, value2, "sellerLoginEmail");
            return (Criteria) this;
        }

        public Criteria andIsMerchantIsNull() {
            addCriterion("iIsMerchant is null");
            return (Criteria) this;
        }

        public Criteria andIsMerchantIsNotNull() {
            addCriterion("iIsMerchant is not null");
            return (Criteria) this;
        }

        public Criteria andIsMerchantEqualTo(Integer value) {
            addCriterion("iIsMerchant =", value, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantNotEqualTo(Integer value) {
            addCriterion("iIsMerchant <>", value, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantGreaterThan(Integer value) {
            addCriterion("iIsMerchant >", value, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantGreaterThanOrEqualTo(Integer value) {
            addCriterion("iIsMerchant >=", value, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantLessThan(Integer value) {
            addCriterion("iIsMerchant <", value, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantLessThanOrEqualTo(Integer value) {
            addCriterion("iIsMerchant <=", value, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantIn(List<Integer> values) {
            addCriterion("iIsMerchant in", values, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantNotIn(List<Integer> values) {
            addCriterion("iIsMerchant not in", values, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantBetween(Integer value1, Integer value2) {
            addCriterion("iIsMerchant between", value1, value2, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andIsMerchantNotBetween(Integer value1, Integer value2) {
            addCriterion("iIsMerchant not between", value1, value2, "isMerchant");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameIsNull() {
            addCriterion("sBuyerNickName is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameIsNotNull() {
            addCriterion("sBuyerNickName is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameEqualTo(String value) {
            addCriterion("sBuyerNickName =", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameNotEqualTo(String value) {
            addCriterion("sBuyerNickName <>", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameGreaterThan(String value) {
            addCriterion("sBuyerNickName >", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("sBuyerNickName >=", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameLessThan(String value) {
            addCriterion("sBuyerNickName <", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameLessThanOrEqualTo(String value) {
            addCriterion("sBuyerNickName <=", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameLike(String value) {
            addCriterion("sBuyerNickName like", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameNotLike(String value) {
            addCriterion("sBuyerNickName not like", value, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameIn(List<String> values) {
            addCriterion("sBuyerNickName in", values, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameNotIn(List<String> values) {
            addCriterion("sBuyerNickName not in", values, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameBetween(String value1, String value2) {
            addCriterion("sBuyerNickName between", value1, value2, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNameNotBetween(String value1, String value2) {
            addCriterion("sBuyerNickName not between", value1, value2, "buyerNickName");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("fTotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("fTotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("fTotalPrice =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("fTotalPrice <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("fTotalPrice >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fTotalPrice >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("fTotalPrice <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fTotalPrice <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("fTotalPrice in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("fTotalPrice not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fTotalPrice between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fTotalPrice not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountIsNull() {
            addCriterion("fUseFreeCardAmount is null");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountIsNotNull() {
            addCriterion("fUseFreeCardAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountEqualTo(BigDecimal value) {
            addCriterion("fUseFreeCardAmount =", value, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountNotEqualTo(BigDecimal value) {
            addCriterion("fUseFreeCardAmount <>", value, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountGreaterThan(BigDecimal value) {
            addCriterion("fUseFreeCardAmount >", value, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fUseFreeCardAmount >=", value, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountLessThan(BigDecimal value) {
            addCriterion("fUseFreeCardAmount <", value, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fUseFreeCardAmount <=", value, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountIn(List<BigDecimal> values) {
            addCriterion("fUseFreeCardAmount in", values, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountNotIn(List<BigDecimal> values) {
            addCriterion("fUseFreeCardAmount not in", values, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fUseFreeCardAmount between", value1, value2, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andUseFreeCardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fUseFreeCardAmount not between", value1, value2, "useFreeCardAmount");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsIsNull() {
            addCriterion("bIncludeActivityProducts is null");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsIsNotNull() {
            addCriterion("bIncludeActivityProducts is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsEqualTo(Boolean value) {
            addCriterion("bIncludeActivityProducts =", value, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsNotEqualTo(Boolean value) {
            addCriterion("bIncludeActivityProducts <>", value, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsGreaterThan(Boolean value) {
            addCriterion("bIncludeActivityProducts >", value, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bIncludeActivityProducts >=", value, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsLessThan(Boolean value) {
            addCriterion("bIncludeActivityProducts <", value, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsLessThanOrEqualTo(Boolean value) {
            addCriterion("bIncludeActivityProducts <=", value, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsIn(List<Boolean> values) {
            addCriterion("bIncludeActivityProducts in", values, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsNotIn(List<Boolean> values) {
            addCriterion("bIncludeActivityProducts not in", values, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsBetween(Boolean value1, Boolean value2) {
            addCriterion("bIncludeActivityProducts between", value1, value2, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andIncludeActivityProductsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bIncludeActivityProducts not between", value1, value2, "includeActivityProducts");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboIsNull() {
            addCriterion("bShippedByXlobo is null");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboIsNotNull() {
            addCriterion("bShippedByXlobo is not null");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboEqualTo(Boolean value) {
            addCriterion("bShippedByXlobo =", value, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboNotEqualTo(Boolean value) {
            addCriterion("bShippedByXlobo <>", value, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboGreaterThan(Boolean value) {
            addCriterion("bShippedByXlobo >", value, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bShippedByXlobo >=", value, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboLessThan(Boolean value) {
            addCriterion("bShippedByXlobo <", value, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboLessThanOrEqualTo(Boolean value) {
            addCriterion("bShippedByXlobo <=", value, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboIn(List<Boolean> values) {
            addCriterion("bShippedByXlobo in", values, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboNotIn(List<Boolean> values) {
            addCriterion("bShippedByXlobo not in", values, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboBetween(Boolean value1, Boolean value2) {
            addCriterion("bShippedByXlobo between", value1, value2, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andShippedByXloboNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bShippedByXlobo not between", value1, value2, "shippedByXlobo");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNull() {
            addCriterion("dAcceptTime is null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNotNull() {
            addCriterion("dAcceptTime is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeEqualTo(Date value) {
            addCriterion("dAcceptTime =", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotEqualTo(Date value) {
            addCriterion("dAcceptTime <>", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThan(Date value) {
            addCriterion("dAcceptTime >", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dAcceptTime >=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThan(Date value) {
            addCriterion("dAcceptTime <", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThanOrEqualTo(Date value) {
            addCriterion("dAcceptTime <=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIn(List<Date> values) {
            addCriterion("dAcceptTime in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotIn(List<Date> values) {
            addCriterion("dAcceptTime not in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeBetween(Date value1, Date value2) {
            addCriterion("dAcceptTime between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotBetween(Date value1, Date value2) {
            addCriterion("dAcceptTime not between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andCurTypeIsNull() {
            addCriterion("sCurType is null");
            return (Criteria) this;
        }

        public Criteria andCurTypeIsNotNull() {
            addCriterion("sCurType is not null");
            return (Criteria) this;
        }

        public Criteria andCurTypeEqualTo(String value) {
            addCriterion("sCurType =", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotEqualTo(String value) {
            addCriterion("sCurType <>", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeGreaterThan(String value) {
            addCriterion("sCurType >", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sCurType >=", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeLessThan(String value) {
            addCriterion("sCurType <", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeLessThanOrEqualTo(String value) {
            addCriterion("sCurType <=", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeLike(String value) {
            addCriterion("sCurType like", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotLike(String value) {
            addCriterion("sCurType not like", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeIn(List<String> values) {
            addCriterion("sCurType in", values, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotIn(List<String> values) {
            addCriterion("sCurType not in", values, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeBetween(String value1, String value2) {
            addCriterion("sCurType between", value1, value2, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotBetween(String value1, String value2) {
            addCriterion("sCurType not between", value1, value2, "curType");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnIsNull() {
            addCriterion("bCanLocalReturn is null");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnIsNotNull() {
            addCriterion("bCanLocalReturn is not null");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnEqualTo(Boolean value) {
            addCriterion("bCanLocalReturn =", value, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnNotEqualTo(Boolean value) {
            addCriterion("bCanLocalReturn <>", value, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnGreaterThan(Boolean value) {
            addCriterion("bCanLocalReturn >", value, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bCanLocalReturn >=", value, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnLessThan(Boolean value) {
            addCriterion("bCanLocalReturn <", value, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("bCanLocalReturn <=", value, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnIn(List<Boolean> values) {
            addCriterion("bCanLocalReturn in", values, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnNotIn(List<Boolean> values) {
            addCriterion("bCanLocalReturn not in", values, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("bCanLocalReturn between", value1, value2, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andCanLocalReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bCanLocalReturn not between", value1, value2, "canLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnIsNull() {
            addCriterion("bApplyLocalReturn is null");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnIsNotNull() {
            addCriterion("bApplyLocalReturn is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnEqualTo(Boolean value) {
            addCriterion("bApplyLocalReturn =", value, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnNotEqualTo(Boolean value) {
            addCriterion("bApplyLocalReturn <>", value, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnGreaterThan(Boolean value) {
            addCriterion("bApplyLocalReturn >", value, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bApplyLocalReturn >=", value, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnLessThan(Boolean value) {
            addCriterion("bApplyLocalReturn <", value, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("bApplyLocalReturn <=", value, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnIn(List<Boolean> values) {
            addCriterion("bApplyLocalReturn in", values, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnNotIn(List<Boolean> values) {
            addCriterion("bApplyLocalReturn not in", values, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("bApplyLocalReturn between", value1, value2, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bApplyLocalReturn not between", value1, value2, "applyLocalReturn");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeIsNull() {
            addCriterion("dApplyLocalReturnTime is null");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeIsNotNull() {
            addCriterion("dApplyLocalReturnTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeEqualTo(Date value) {
            addCriterion("dApplyLocalReturnTime =", value, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeNotEqualTo(Date value) {
            addCriterion("dApplyLocalReturnTime <>", value, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeGreaterThan(Date value) {
            addCriterion("dApplyLocalReturnTime >", value, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dApplyLocalReturnTime >=", value, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeLessThan(Date value) {
            addCriterion("dApplyLocalReturnTime <", value, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("dApplyLocalReturnTime <=", value, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeIn(List<Date> values) {
            addCriterion("dApplyLocalReturnTime in", values, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeNotIn(List<Date> values) {
            addCriterion("dApplyLocalReturnTime not in", values, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeBetween(Date value1, Date value2) {
            addCriterion("dApplyLocalReturnTime between", value1, value2, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyLocalReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("dApplyLocalReturnTime not between", value1, value2, "applyLocalReturnTime");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusIsNull() {
            addCriterion("iRiskVerifiedStatus is null");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusIsNotNull() {
            addCriterion("iRiskVerifiedStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusEqualTo(Integer value) {
            addCriterion("iRiskVerifiedStatus =", value, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusNotEqualTo(Integer value) {
            addCriterion("iRiskVerifiedStatus <>", value, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusGreaterThan(Integer value) {
            addCriterion("iRiskVerifiedStatus >", value, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iRiskVerifiedStatus >=", value, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusLessThan(Integer value) {
            addCriterion("iRiskVerifiedStatus <", value, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iRiskVerifiedStatus <=", value, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusIn(List<Integer> values) {
            addCriterion("iRiskVerifiedStatus in", values, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusNotIn(List<Integer> values) {
            addCriterion("iRiskVerifiedStatus not in", values, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusBetween(Integer value1, Integer value2) {
            addCriterion("iRiskVerifiedStatus between", value1, value2, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andRiskVerifiedStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iRiskVerifiedStatus not between", value1, value2, "riskVerifiedStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusIsNull() {
            addCriterion("iThirdPartyRefundStatus is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusIsNotNull() {
            addCriterion("iThirdPartyRefundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusEqualTo(Integer value) {
            addCriterion("iThirdPartyRefundStatus =", value, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusNotEqualTo(Integer value) {
            addCriterion("iThirdPartyRefundStatus <>", value, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusGreaterThan(Integer value) {
            addCriterion("iThirdPartyRefundStatus >", value, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iThirdPartyRefundStatus >=", value, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusLessThan(Integer value) {
            addCriterion("iThirdPartyRefundStatus <", value, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iThirdPartyRefundStatus <=", value, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusIn(List<Integer> values) {
            addCriterion("iThirdPartyRefundStatus in", values, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusNotIn(List<Integer> values) {
            addCriterion("iThirdPartyRefundStatus not in", values, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("iThirdPartyRefundStatus between", value1, value2, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andThirdPartyRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iThirdPartyRefundStatus not between", value1, value2, "thirdPartyRefundStatus");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("dLastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("dLastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("dLastUpdateTime =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("dLastUpdateTime <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("dLastUpdateTime >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dLastUpdateTime >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("dLastUpdateTime <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dLastUpdateTime <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("dLastUpdateTime in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("dLastUpdateTime not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dLastUpdateTime between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dLastUpdateTime not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCouponChannelIsNull() {
            addCriterion("iCouponChannel is null");
            return (Criteria) this;
        }

        public Criteria andCouponChannelIsNotNull() {
            addCriterion("iCouponChannel is not null");
            return (Criteria) this;
        }

        public Criteria andCouponChannelEqualTo(Integer value) {
            addCriterion("iCouponChannel =", value, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelNotEqualTo(Integer value) {
            addCriterion("iCouponChannel <>", value, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelGreaterThan(Integer value) {
            addCriterion("iCouponChannel >", value, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCouponChannel >=", value, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelLessThan(Integer value) {
            addCriterion("iCouponChannel <", value, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelLessThanOrEqualTo(Integer value) {
            addCriterion("iCouponChannel <=", value, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelIn(List<Integer> values) {
            addCriterion("iCouponChannel in", values, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelNotIn(List<Integer> values) {
            addCriterion("iCouponChannel not in", values, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelBetween(Integer value1, Integer value2) {
            addCriterion("iCouponChannel between", value1, value2, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andCouponChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("iCouponChannel not between", value1, value2, "couponChannel");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusIsNull() {
            addCriterion("iSalesRefundStatus is null");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusIsNotNull() {
            addCriterion("iSalesRefundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusEqualTo(Integer value) {
            addCriterion("iSalesRefundStatus =", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusNotEqualTo(Integer value) {
            addCriterion("iSalesRefundStatus <>", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusGreaterThan(Integer value) {
            addCriterion("iSalesRefundStatus >", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSalesRefundStatus >=", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusLessThan(Integer value) {
            addCriterion("iSalesRefundStatus <", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iSalesRefundStatus <=", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusIn(List<Integer> values) {
            addCriterion("iSalesRefundStatus in", values, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusNotIn(List<Integer> values) {
            addCriterion("iSalesRefundStatus not in", values, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("iSalesRefundStatus between", value1, value2, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iSalesRefundStatus not between", value1, value2, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredIsNull() {
            addCriterion("bDomesticDelivered is null");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredIsNotNull() {
            addCriterion("bDomesticDelivered is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredEqualTo(Boolean value) {
            addCriterion("bDomesticDelivered =", value, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredNotEqualTo(Boolean value) {
            addCriterion("bDomesticDelivered <>", value, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredGreaterThan(Boolean value) {
            addCriterion("bDomesticDelivered >", value, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bDomesticDelivered >=", value, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredLessThan(Boolean value) {
            addCriterion("bDomesticDelivered <", value, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredLessThanOrEqualTo(Boolean value) {
            addCriterion("bDomesticDelivered <=", value, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredIn(List<Boolean> values) {
            addCriterion("bDomesticDelivered in", values, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredNotIn(List<Boolean> values) {
            addCriterion("bDomesticDelivered not in", values, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredBetween(Boolean value1, Boolean value2) {
            addCriterion("bDomesticDelivered between", value1, value2, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andDomesticDeliveredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bDomesticDelivered not between", value1, value2, "domesticDelivered");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("fOriginalPrice is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("fOriginalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("fOriginalPrice =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("fOriginalPrice <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("fOriginalPrice >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fOriginalPrice >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(BigDecimal value) {
            addCriterion("fOriginalPrice <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fOriginalPrice <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("fOriginalPrice in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("fOriginalPrice not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOriginalPrice between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fOriginalPrice not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNull() {
            addCriterion("fPayableAmount is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNotNull() {
            addCriterion("fPayableAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountEqualTo(BigDecimal value) {
            addCriterion("fPayableAmount =", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotEqualTo(BigDecimal value) {
            addCriterion("fPayableAmount <>", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThan(BigDecimal value) {
            addCriterion("fPayableAmount >", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPayableAmount >=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThan(BigDecimal value) {
            addCriterion("fPayableAmount <", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPayableAmount <=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIn(List<BigDecimal> values) {
            addCriterion("fPayableAmount in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotIn(List<BigDecimal> values) {
            addCriterion("fPayableAmount not in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPayableAmount between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPayableAmount not between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("fCommission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("fCommission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(BigDecimal value) {
            addCriterion("fCommission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(BigDecimal value) {
            addCriterion("fCommission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(BigDecimal value) {
            addCriterion("fCommission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fCommission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(BigDecimal value) {
            addCriterion("fCommission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fCommission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<BigDecimal> values) {
            addCriterion("fCommission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<BigDecimal> values) {
            addCriterion("fCommission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fCommission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fCommission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeIsNull() {
            addCriterion("sSellerCouponCode is null");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeIsNotNull() {
            addCriterion("sSellerCouponCode is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeEqualTo(String value) {
            addCriterion("sSellerCouponCode =", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeNotEqualTo(String value) {
            addCriterion("sSellerCouponCode <>", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeGreaterThan(String value) {
            addCriterion("sSellerCouponCode >", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sSellerCouponCode >=", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeLessThan(String value) {
            addCriterion("sSellerCouponCode <", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("sSellerCouponCode <=", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeLike(String value) {
            addCriterion("sSellerCouponCode like", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeNotLike(String value) {
            addCriterion("sSellerCouponCode not like", value, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeIn(List<String> values) {
            addCriterion("sSellerCouponCode in", values, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeNotIn(List<String> values) {
            addCriterion("sSellerCouponCode not in", values, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeBetween(String value1, String value2) {
            addCriterion("sSellerCouponCode between", value1, value2, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponCodeNotBetween(String value1, String value2) {
            addCriterion("sSellerCouponCode not between", value1, value2, "sellerCouponCode");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountIsNull() {
            addCriterion("fSellerCouponAmount is null");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountIsNotNull() {
            addCriterion("fSellerCouponAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountEqualTo(BigDecimal value) {
            addCriterion("fSellerCouponAmount =", value, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("fSellerCouponAmount <>", value, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("fSellerCouponAmount >", value, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fSellerCouponAmount >=", value, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountLessThan(BigDecimal value) {
            addCriterion("fSellerCouponAmount <", value, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fSellerCouponAmount <=", value, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountIn(List<BigDecimal> values) {
            addCriterion("fSellerCouponAmount in", values, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("fSellerCouponAmount not in", values, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fSellerCouponAmount between", value1, value2, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andSellerCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fSellerCouponAmount not between", value1, value2, "sellerCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeIsNull() {
            addCriterion("sYmtCouponCode is null");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeIsNotNull() {
            addCriterion("sYmtCouponCode is not null");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeEqualTo(String value) {
            addCriterion("sYmtCouponCode =", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeNotEqualTo(String value) {
            addCriterion("sYmtCouponCode <>", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeGreaterThan(String value) {
            addCriterion("sYmtCouponCode >", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sYmtCouponCode >=", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeLessThan(String value) {
            addCriterion("sYmtCouponCode <", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("sYmtCouponCode <=", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeLike(String value) {
            addCriterion("sYmtCouponCode like", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeNotLike(String value) {
            addCriterion("sYmtCouponCode not like", value, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeIn(List<String> values) {
            addCriterion("sYmtCouponCode in", values, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeNotIn(List<String> values) {
            addCriterion("sYmtCouponCode not in", values, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeBetween(String value1, String value2) {
            addCriterion("sYmtCouponCode between", value1, value2, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponCodeNotBetween(String value1, String value2) {
            addCriterion("sYmtCouponCode not between", value1, value2, "ymtCouponCode");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountIsNull() {
            addCriterion("fYmtCouponAmount is null");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountIsNotNull() {
            addCriterion("fYmtCouponAmount is not null");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountEqualTo(BigDecimal value) {
            addCriterion("fYmtCouponAmount =", value, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("fYmtCouponAmount <>", value, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("fYmtCouponAmount >", value, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fYmtCouponAmount >=", value, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountLessThan(BigDecimal value) {
            addCriterion("fYmtCouponAmount <", value, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fYmtCouponAmount <=", value, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountIn(List<BigDecimal> values) {
            addCriterion("fYmtCouponAmount in", values, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("fYmtCouponAmount not in", values, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fYmtCouponAmount between", value1, value2, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andYmtCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fYmtCouponAmount not between", value1, value2, "ymtCouponAmount");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIsNull() {
            addCriterion("iMainOrderId is null");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIsNotNull() {
            addCriterion("iMainOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdEqualTo(Long value) {
            addCriterion("iMainOrderId =", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotEqualTo(Long value) {
            addCriterion("iMainOrderId <>", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdGreaterThan(Long value) {
            addCriterion("iMainOrderId >", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iMainOrderId >=", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdLessThan(Long value) {
            addCriterion("iMainOrderId <", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("iMainOrderId <=", value, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdIn(List<Long> values) {
            addCriterion("iMainOrderId in", values, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotIn(List<Long> values) {
            addCriterion("iMainOrderId not in", values, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdBetween(Long value1, Long value2) {
            addCriterion("iMainOrderId between", value1, value2, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andMainOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("iMainOrderId not between", value1, value2, "mainOrderId");
            return (Criteria) this;
        }

        public Criteria andHostRefIsNull() {
            addCriterion("sHostRef is null");
            return (Criteria) this;
        }

        public Criteria andHostRefIsNotNull() {
            addCriterion("sHostRef is not null");
            return (Criteria) this;
        }

        public Criteria andHostRefEqualTo(String value) {
            addCriterion("sHostRef =", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefNotEqualTo(String value) {
            addCriterion("sHostRef <>", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefGreaterThan(String value) {
            addCriterion("sHostRef >", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefGreaterThanOrEqualTo(String value) {
            addCriterion("sHostRef >=", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefLessThan(String value) {
            addCriterion("sHostRef <", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefLessThanOrEqualTo(String value) {
            addCriterion("sHostRef <=", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefLike(String value) {
            addCriterion("sHostRef like", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefNotLike(String value) {
            addCriterion("sHostRef not like", value, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefIn(List<String> values) {
            addCriterion("sHostRef in", values, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefNotIn(List<String> values) {
            addCriterion("sHostRef not in", values, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefBetween(String value1, String value2) {
            addCriterion("sHostRef between", value1, value2, "hostRef");
            return (Criteria) this;
        }

        public Criteria andHostRefNotBetween(String value1, String value2) {
            addCriterion("sHostRef not between", value1, value2, "hostRef");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIsNull() {
            addCriterion("bEvaluated is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIsNotNull() {
            addCriterion("bEvaluated is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedEqualTo(Boolean value) {
            addCriterion("bEvaluated =", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotEqualTo(Boolean value) {
            addCriterion("bEvaluated <>", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedGreaterThan(Boolean value) {
            addCriterion("bEvaluated >", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bEvaluated >=", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedLessThan(Boolean value) {
            addCriterion("bEvaluated <", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedLessThanOrEqualTo(Boolean value) {
            addCriterion("bEvaluated <=", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIn(List<Boolean> values) {
            addCriterion("bEvaluated in", values, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotIn(List<Boolean> values) {
            addCriterion("bEvaluated not in", values, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedBetween(Boolean value1, Boolean value2) {
            addCriterion("bEvaluated between", value1, value2, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bEvaluated not between", value1, value2, "evaluated");
            return (Criteria) this;
        }

        public Criteria andFullPayIsNull() {
            addCriterion("bFullPay is null");
            return (Criteria) this;
        }

        public Criteria andFullPayIsNotNull() {
            addCriterion("bFullPay is not null");
            return (Criteria) this;
        }

        public Criteria andFullPayEqualTo(Boolean value) {
            addCriterion("bFullPay =", value, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayNotEqualTo(Boolean value) {
            addCriterion("bFullPay <>", value, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayGreaterThan(Boolean value) {
            addCriterion("bFullPay >", value, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bFullPay >=", value, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayLessThan(Boolean value) {
            addCriterion("bFullPay <", value, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayLessThanOrEqualTo(Boolean value) {
            addCriterion("bFullPay <=", value, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayIn(List<Boolean> values) {
            addCriterion("bFullPay in", values, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayNotIn(List<Boolean> values) {
            addCriterion("bFullPay not in", values, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayBetween(Boolean value1, Boolean value2) {
            addCriterion("bFullPay between", value1, value2, "fullPay");
            return (Criteria) this;
        }

        public Criteria andFullPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bFullPay not between", value1, value2, "fullPay");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountIsNull() {
            addCriterion("fSellerPromotionAmount is null");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountIsNotNull() {
            addCriterion("fSellerPromotionAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountEqualTo(BigDecimal value) {
            addCriterion("fSellerPromotionAmount =", value, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountNotEqualTo(BigDecimal value) {
            addCriterion("fSellerPromotionAmount <>", value, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountGreaterThan(BigDecimal value) {
            addCriterion("fSellerPromotionAmount >", value, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fSellerPromotionAmount >=", value, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountLessThan(BigDecimal value) {
            addCriterion("fSellerPromotionAmount <", value, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fSellerPromotionAmount <=", value, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountIn(List<BigDecimal> values) {
            addCriterion("fSellerPromotionAmount in", values, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountNotIn(List<BigDecimal> values) {
            addCriterion("fSellerPromotionAmount not in", values, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fSellerPromotionAmount between", value1, value2, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andSellerPromotionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fSellerPromotionAmount not between", value1, value2, "sellerPromotionAmount");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("bDeleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("bDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("bDeleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("bDeleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("bDeleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bDeleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("bDeleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("bDeleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("bDeleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("bDeleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("bDeleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bDeleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}