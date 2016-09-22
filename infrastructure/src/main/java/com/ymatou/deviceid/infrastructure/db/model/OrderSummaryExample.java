package com.ymatou.deviceid.infrastructure.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSummaryExample() {
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

        public Criteria andOrderSummaryIdIsNull() {
            addCriterion("sOrderSummaryId is null");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdIsNotNull() {
            addCriterion("sOrderSummaryId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdEqualTo(String value) {
            addCriterion("sOrderSummaryId =", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdNotEqualTo(String value) {
            addCriterion("sOrderSummaryId <>", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdGreaterThan(String value) {
            addCriterion("sOrderSummaryId >", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("sOrderSummaryId >=", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdLessThan(String value) {
            addCriterion("sOrderSummaryId <", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdLessThanOrEqualTo(String value) {
            addCriterion("sOrderSummaryId <=", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdLike(String value) {
            addCriterion("sOrderSummaryId like", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdNotLike(String value) {
            addCriterion("sOrderSummaryId not like", value, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdIn(List<String> values) {
            addCriterion("sOrderSummaryId in", values, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdNotIn(List<String> values) {
            addCriterion("sOrderSummaryId not in", values, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdBetween(String value1, String value2) {
            addCriterion("sOrderSummaryId between", value1, value2, "orderSummaryId");
            return (Criteria) this;
        }

        public Criteria andOrderSummaryIdNotBetween(String value1, String value2) {
            addCriterion("sOrderSummaryId not between", value1, value2, "orderSummaryId");
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
            addCriterion("iOrderId =", value, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("iOrderId <>", value, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("iOrderId >", value, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iOrderId >=", value, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("iOrderId <", value, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("iOrderId <=", value, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("iOrderId in", values, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("iOrderId not in", values, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("iOrderId between", value1, value2, "OrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("iOrderId not between", value1, value2, "OrderId");
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

        public Criteria andSummaryIsNull() {
            addCriterion("sSummary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("sSummary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("sSummary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("sSummary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("sSummary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("sSummary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("sSummary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("sSummary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("sSummary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("sSummary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("sSummary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("sSummary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("sSummary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("sSummary not between", value1, value2, "summary");
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

        public Criteria andGoodWeightIsNull() {
            addCriterion("fGoodWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodWeightIsNotNull() {
            addCriterion("fGoodWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodWeightEqualTo(Double value) {
            addCriterion("fGoodWeight =", value, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightNotEqualTo(Double value) {
            addCriterion("fGoodWeight <>", value, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightGreaterThan(Double value) {
            addCriterion("fGoodWeight >", value, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("fGoodWeight >=", value, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightLessThan(Double value) {
            addCriterion("fGoodWeight <", value, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightLessThanOrEqualTo(Double value) {
            addCriterion("fGoodWeight <=", value, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightIn(List<Double> values) {
            addCriterion("fGoodWeight in", values, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightNotIn(List<Double> values) {
            addCriterion("fGoodWeight not in", values, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightBetween(Double value1, Double value2) {
            addCriterion("fGoodWeight between", value1, value2, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andGoodWeightNotBetween(Double value1, Double value2) {
            addCriterion("fGoodWeight not between", value1, value2, "goodWeight");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderIsNull() {
            addCriterion("sLogisticsProvider is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderIsNotNull() {
            addCriterion("sLogisticsProvider is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderEqualTo(String value) {
            addCriterion("sLogisticsProvider =", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderNotEqualTo(String value) {
            addCriterion("sLogisticsProvider <>", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderGreaterThan(String value) {
            addCriterion("sLogisticsProvider >", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderGreaterThanOrEqualTo(String value) {
            addCriterion("sLogisticsProvider >=", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderLessThan(String value) {
            addCriterion("sLogisticsProvider <", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderLessThanOrEqualTo(String value) {
            addCriterion("sLogisticsProvider <=", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderLike(String value) {
            addCriterion("sLogisticsProvider like", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderNotLike(String value) {
            addCriterion("sLogisticsProvider not like", value, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderIn(List<String> values) {
            addCriterion("sLogisticsProvider in", values, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderNotIn(List<String> values) {
            addCriterion("sLogisticsProvider not in", values, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderBetween(String value1, String value2) {
            addCriterion("sLogisticsProvider between", value1, value2, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andLogisticsProviderNotBetween(String value1, String value2) {
            addCriterion("sLogisticsProvider not between", value1, value2, "logisticsProvider");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("iBillType is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("iBillType is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("iBillType =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("iBillType <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("iBillType >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iBillType >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("iBillType <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iBillType <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("iBillType in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("iBillType not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("iBillType between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iBillType not between", value1, value2, "billType");
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