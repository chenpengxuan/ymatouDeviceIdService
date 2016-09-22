package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPostPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPostPayExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("sId is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("sId is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("sId =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("sId <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("sId >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("sId >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("sId <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("sId <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("sId like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("sId not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("sId in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("sId not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("sId between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("sId not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andAmountIsNull() {
            addCriterion("fAmount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("fAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("fAmount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("fAmount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("fAmount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fAmount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("fAmount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fAmount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("fAmount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("fAmount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fAmount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fAmount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("iAction is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("iAction is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(Integer value) {
            addCriterion("iAction =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(Integer value) {
            addCriterion("iAction <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(Integer value) {
            addCriterion("iAction >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("iAction >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(Integer value) {
            addCriterion("iAction <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(Integer value) {
            addCriterion("iAction <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<Integer> values) {
            addCriterion("iAction in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<Integer> values) {
            addCriterion("iAction not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(Integer value1, Integer value2) {
            addCriterion("iAction between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(Integer value1, Integer value2) {
            addCriterion("iAction not between", value1, value2, "action");
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

        public Criteria andCommentIsNull() {
            addCriterion("sComment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("sComment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("sComment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("sComment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("sComment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("sComment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("sComment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("sComment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("sComment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("sComment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("sComment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("sComment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("sComment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("sComment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("dUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("dUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("dUpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("dUpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("dUpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dUpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("dUpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dUpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("dUpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("dUpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dUpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dUpdateTime not between", value1, value2, "updateTime");
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

        public Criteria andUseGiftIsNull() {
            addCriterion("iUseGift is null");
            return (Criteria) this;
        }

        public Criteria andUseGiftIsNotNull() {
            addCriterion("iUseGift is not null");
            return (Criteria) this;
        }

        public Criteria andUseGiftEqualTo(Integer value) {
            addCriterion("iUseGift =", value, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftNotEqualTo(Integer value) {
            addCriterion("iUseGift <>", value, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftGreaterThan(Integer value) {
            addCriterion("iUseGift >", value, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("iUseGift >=", value, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftLessThan(Integer value) {
            addCriterion("iUseGift <", value, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftLessThanOrEqualTo(Integer value) {
            addCriterion("iUseGift <=", value, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftIn(List<Integer> values) {
            addCriterion("iUseGift in", values, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftNotIn(List<Integer> values) {
            addCriterion("iUseGift not in", values, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftBetween(Integer value1, Integer value2) {
            addCriterion("iUseGift between", value1, value2, "useGift");
            return (Criteria) this;
        }

        public Criteria andUseGiftNotBetween(Integer value1, Integer value2) {
            addCriterion("iUseGift not between", value1, value2, "useGift");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeIsNull() {
            addCriterion("iPostPayType is null");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeIsNotNull() {
            addCriterion("iPostPayType is not null");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeEqualTo(Integer value) {
            addCriterion("iPostPayType =", value, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeNotEqualTo(Integer value) {
            addCriterion("iPostPayType <>", value, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeGreaterThan(Integer value) {
            addCriterion("iPostPayType >", value, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPostPayType >=", value, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeLessThan(Integer value) {
            addCriterion("iPostPayType <", value, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iPostPayType <=", value, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeIn(List<Integer> values) {
            addCriterion("iPostPayType in", values, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeNotIn(List<Integer> values) {
            addCriterion("iPostPayType not in", values, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("iPostPayType between", value1, value2, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iPostPayType not between", value1, value2, "postPayType");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdIsNull() {
            addCriterion("sPostPayTradingId is null");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdIsNotNull() {
            addCriterion("sPostPayTradingId is not null");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdEqualTo(String value) {
            addCriterion("sPostPayTradingId =", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdNotEqualTo(String value) {
            addCriterion("sPostPayTradingId <>", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdGreaterThan(String value) {
            addCriterion("sPostPayTradingId >", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdGreaterThanOrEqualTo(String value) {
            addCriterion("sPostPayTradingId >=", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdLessThan(String value) {
            addCriterion("sPostPayTradingId <", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdLessThanOrEqualTo(String value) {
            addCriterion("sPostPayTradingId <=", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdLike(String value) {
            addCriterion("sPostPayTradingId like", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdNotLike(String value) {
            addCriterion("sPostPayTradingId not like", value, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdIn(List<String> values) {
            addCriterion("sPostPayTradingId in", values, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdNotIn(List<String> values) {
            addCriterion("sPostPayTradingId not in", values, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdBetween(String value1, String value2) {
            addCriterion("sPostPayTradingId between", value1, value2, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPostPayTradingIdNotBetween(String value1, String value2) {
            addCriterion("sPostPayTradingId not between", value1, value2, "postPayTradingId");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("sPayChannel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("sPayChannel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("sPayChannel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("sPayChannel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("sPayChannel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("sPayChannel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("sPayChannel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("sPayChannel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("sPayChannel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("sPayChannel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("sPayChannel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("sPayChannel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("sPayChannel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("sPayChannel not between", value1, value2, "payChannel");
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