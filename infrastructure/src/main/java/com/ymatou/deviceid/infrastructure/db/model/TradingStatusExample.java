package com.ymatou.deviceid.infrastructure.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradingStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradingStatusExample() {
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

        public Criteria andTradingStatusIdIsNull() {
            addCriterion("sTradingStatusId is null");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdIsNotNull() {
            addCriterion("sTradingStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdEqualTo(String value) {
            addCriterion("sTradingStatusId =", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdNotEqualTo(String value) {
            addCriterion("sTradingStatusId <>", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdGreaterThan(String value) {
            addCriterion("sTradingStatusId >", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("sTradingStatusId >=", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdLessThan(String value) {
            addCriterion("sTradingStatusId <", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdLessThanOrEqualTo(String value) {
            addCriterion("sTradingStatusId <=", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdLike(String value) {
            addCriterion("sTradingStatusId like", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdNotLike(String value) {
            addCriterion("sTradingStatusId not like", value, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdIn(List<String> values) {
            addCriterion("sTradingStatusId in", values, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdNotIn(List<String> values) {
            addCriterion("sTradingStatusId not in", values, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdBetween(String value1, String value2) {
            addCriterion("sTradingStatusId between", value1, value2, "tradingStatusId");
            return (Criteria) this;
        }

        public Criteria andTradingStatusIdNotBetween(String value1, String value2) {
            addCriterion("sTradingStatusId not between", value1, value2, "tradingStatusId");
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

        public Criteria andTradingIdIsNull() {
            addCriterion("iTraddingId is null");
            return (Criteria) this;
        }

        public Criteria andTradingIdIsNotNull() {
            addCriterion("iTraddingId is not null");
            return (Criteria) this;
        }

        public Criteria andTradingIdEqualTo(Long value) {
            addCriterion("iTraddingId =", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotEqualTo(Long value) {
            addCriterion("iTraddingId <>", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdGreaterThan(Long value) {
            addCriterion("iTraddingId >", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iTraddingId >=", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdLessThan(Long value) {
            addCriterion("iTraddingId <", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdLessThanOrEqualTo(Long value) {
            addCriterion("iTraddingId <=", value, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdIn(List<Long> values) {
            addCriterion("iTraddingId in", values, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotIn(List<Long> values) {
            addCriterion("iTraddingId not in", values, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdBetween(Long value1, Long value2) {
            addCriterion("iTraddingId between", value1, value2, "tradingId");
            return (Criteria) this;
        }

        public Criteria andTradingIdNotBetween(Long value1, Long value2) {
            addCriterion("iTraddingId not between", value1, value2, "tradingId");
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