package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerPromotionExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNull() {
            addCriterion("PromotionType is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("PromotionType is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(Integer value) {
            addCriterion("PromotionType =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(Integer value) {
            addCriterion("PromotionType <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(Integer value) {
            addCriterion("PromotionType >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PromotionType >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(Integer value) {
            addCriterion("PromotionType <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PromotionType <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<Integer> values) {
            addCriterion("PromotionType in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<Integer> values) {
            addCriterion("PromotionType not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(Integer value1, Integer value2) {
            addCriterion("PromotionType between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PromotionType not between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNull() {
            addCriterion("PromotionId is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNotNull() {
            addCriterion("PromotionId is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdEqualTo(long value) {
            addCriterion("PromotionId =", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotEqualTo(long value) {
            addCriterion("PromotionId <>", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThan(long value) {
            addCriterion("PromotionId >", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThanOrEqualTo(long value) {
            addCriterion("PromotionId >=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThan(long value) {
            addCriterion("PromotionId <", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThanOrEqualTo(long value) {
            addCriterion("PromotionId <=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIn(List<Long> values) {
            addCriterion("PromotionId in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotIn(List<Long> values) {
            addCriterion("PromotionId not in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdBetween(long value1, long value2) {
            addCriterion("PromotionId between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotBetween(long value1, long value2) {
            addCriterion("PromotionId not between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNull() {
            addCriterion("PromotionName is null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNotNull() {
            addCriterion("PromotionName is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameEqualTo(String value) {
            addCriterion("PromotionName =", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotEqualTo(String value) {
            addCriterion("PromotionName <>", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThan(String value) {
            addCriterion("PromotionName >", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PromotionName >=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThan(String value) {
            addCriterion("PromotionName <", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThanOrEqualTo(String value) {
            addCriterion("PromotionName <=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLike(String value) {
            addCriterion("PromotionName like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotLike(String value) {
            addCriterion("PromotionName not like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIn(List<String> values) {
            addCriterion("PromotionName in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotIn(List<String> values) {
            addCriterion("PromotionName not in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameBetween(String value1, String value2) {
            addCriterion("PromotionName between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotBetween(String value1, String value2) {
            addCriterion("PromotionName not between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andMatchConditionIsNull() {
            addCriterion("MatchCondition is null");
            return (Criteria) this;
        }

        public Criteria andMatchConditionIsNotNull() {
            addCriterion("MatchCondition is not null");
            return (Criteria) this;
        }

        public Criteria andMatchConditionEqualTo(String value) {
            addCriterion("MatchCondition =", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionNotEqualTo(String value) {
            addCriterion("MatchCondition <>", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionGreaterThan(String value) {
            addCriterion("MatchCondition >", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionGreaterThanOrEqualTo(String value) {
            addCriterion("MatchCondition >=", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionLessThan(String value) {
            addCriterion("MatchCondition <", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionLessThanOrEqualTo(String value) {
            addCriterion("MatchCondition <=", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionLike(String value) {
            addCriterion("MatchCondition like", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionNotLike(String value) {
            addCriterion("MatchCondition not like", value, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionIn(List<String> values) {
            addCriterion("MatchCondition in", values, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionNotIn(List<String> values) {
            addCriterion("MatchCondition not in", values, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionBetween(String value1, String value2) {
            addCriterion("MatchCondition between", value1, value2, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andMatchConditionNotBetween(String value1, String value2) {
            addCriterion("MatchCondition not between", value1, value2, "matchCondition");
            return (Criteria) this;
        }

        public Criteria andPromotionValueIsNull() {
            addCriterion("PromotionValue is null");
            return (Criteria) this;
        }

        public Criteria andPromotionValueIsNotNull() {
            addCriterion("PromotionValue is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionValueEqualTo(String value) {
            addCriterion("PromotionValue =", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueNotEqualTo(String value) {
            addCriterion("PromotionValue <>", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueGreaterThan(String value) {
            addCriterion("PromotionValue >", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueGreaterThanOrEqualTo(String value) {
            addCriterion("PromotionValue >=", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueLessThan(String value) {
            addCriterion("PromotionValue <", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueLessThanOrEqualTo(String value) {
            addCriterion("PromotionValue <=", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueLike(String value) {
            addCriterion("PromotionValue like", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueNotLike(String value) {
            addCriterion("PromotionValue not like", value, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueIn(List<String> values) {
            addCriterion("PromotionValue in", values, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueNotIn(List<String> values) {
            addCriterion("PromotionValue not in", values, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueBetween(String value1, String value2) {
            addCriterion("PromotionValue between", value1, value2, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andPromotionValueNotBetween(String value1, String value2) {
            addCriterion("PromotionValue not between", value1, value2, "promotionValue");
            return (Criteria) this;
        }

        public Criteria andReducedAmountIsNull() {
            addCriterion("ReducedAmount is null");
            return (Criteria) this;
        }

        public Criteria andReducedAmountIsNotNull() {
            addCriterion("ReducedAmount is not null");
            return (Criteria) this;
        }

        public Criteria andReducedAmountEqualTo(BigDecimal value) {
            addCriterion("ReducedAmount =", value, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountNotEqualTo(BigDecimal value) {
            addCriterion("ReducedAmount <>", value, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountGreaterThan(BigDecimal value) {
            addCriterion("ReducedAmount >", value, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReducedAmount >=", value, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountLessThan(BigDecimal value) {
            addCriterion("ReducedAmount <", value, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReducedAmount <=", value, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountIn(List<BigDecimal> values) {
            addCriterion("ReducedAmount in", values, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountNotIn(List<BigDecimal> values) {
            addCriterion("ReducedAmount not in", values, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReducedAmount between", value1, value2, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andReducedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReducedAmount not between", value1, value2, "reducedAmount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LastUpdateTime =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LastUpdateTime <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LastUpdateTime >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastUpdateTime >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LastUpdateTime <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastUpdateTime <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LastUpdateTime in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LastUpdateTime not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LastUpdateTime between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastUpdateTime not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(long value) {
            addCriterion("OrderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(long value) {
            addCriterion("OrderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(long value) {
            addCriterion("OrderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(long value) {
            addCriterion("OrderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(long value) {
            addCriterion("OrderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(long value) {
            addCriterion("OrderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("OrderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("OrderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(long value1, long value2) {
            addCriterion("OrderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(long value1, long value2) {
            addCriterion("OrderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIsNull() {
            addCriterion("OrderInfoId is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIsNotNull() {
            addCriterion("OrderInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdEqualTo(String value) {
            addCriterion("OrderInfoId =", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotEqualTo(String value) {
            addCriterion("OrderInfoId <>", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThan(String value) {
            addCriterion("OrderInfoId >", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("OrderInfoId >=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThan(String value) {
            addCriterion("OrderInfoId <", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThanOrEqualTo(String value) {
            addCriterion("OrderInfoId <=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLike(String value) {
            addCriterion("OrderInfoId like", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotLike(String value) {
            addCriterion("OrderInfoId not like", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIn(List<String> values) {
            addCriterion("OrderInfoId in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotIn(List<String> values) {
            addCriterion("OrderInfoId not in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdBetween(String value1, String value2) {
            addCriterion("OrderInfoId between", value1, value2, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotBetween(String value1, String value2) {
            addCriterion("OrderInfoId not between", value1, value2, "orderInfoId");
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