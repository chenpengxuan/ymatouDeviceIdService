package com.ymatou.deviceid.infrastructure.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderFrozenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderFrozenExample() {
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

        public Criteria andFrozenIsNull() {
            addCriterion("bFrozen is null");
            return (Criteria) this;
        }

        public Criteria andFrozenIsNotNull() {
            addCriterion("bFrozen is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenEqualTo(Boolean value) {
            addCriterion("bFrozen =", value, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenNotEqualTo(Boolean value) {
            addCriterion("bFrozen <>", value, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenGreaterThan(Boolean value) {
            addCriterion("bFrozen >", value, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bFrozen >=", value, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenLessThan(Boolean value) {
            addCriterion("bFrozen <", value, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenLessThanOrEqualTo(Boolean value) {
            addCriterion("bFrozen <=", value, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenIn(List<Boolean> values) {
            addCriterion("bFrozen in", values, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenNotIn(List<Boolean> values) {
            addCriterion("bFrozen not in", values, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenBetween(Boolean value1, Boolean value2) {
            addCriterion("bFrozen between", value1, value2, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bFrozen not between", value1, value2, "frozen");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeIsNull() {
            addCriterion("dFrozenTime is null");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeIsNotNull() {
            addCriterion("dFrozenTime is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeEqualTo(Date value) {
            addCriterion("dFrozenTime =", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeNotEqualTo(Date value) {
            addCriterion("dFrozenTime <>", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeGreaterThan(Date value) {
            addCriterion("dFrozenTime >", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dFrozenTime >=", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeLessThan(Date value) {
            addCriterion("dFrozenTime <", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeLessThanOrEqualTo(Date value) {
            addCriterion("dFrozenTime <=", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeIn(List<Date> values) {
            addCriterion("dFrozenTime in", values, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeNotIn(List<Date> values) {
            addCriterion("dFrozenTime not in", values, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeBetween(Date value1, Date value2) {
            addCriterion("dFrozenTime between", value1, value2, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeNotBetween(Date value1, Date value2) {
            addCriterion("dFrozenTime not between", value1, value2, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("sMemo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("sMemo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("sMemo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("sMemo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("sMemo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("sMemo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("sMemo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("sMemo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("sMemo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("sMemo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("sMemo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("sMemo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("sMemo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("sMemo not between", value1, value2, "memo");
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

        public Criteria andFrozenAutoReceiveIsNull() {
            addCriterion("bFrozenAutoReceive is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveIsNotNull() {
            addCriterion("bFrozenAutoReceive is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveEqualTo(Boolean value) {
            addCriterion("bFrozenAutoReceive =", value, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveNotEqualTo(Boolean value) {
            addCriterion("bFrozenAutoReceive <>", value, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveGreaterThan(Boolean value) {
            addCriterion("bFrozenAutoReceive >", value, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bFrozenAutoReceive >=", value, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveLessThan(Boolean value) {
            addCriterion("bFrozenAutoReceive <", value, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveLessThanOrEqualTo(Boolean value) {
            addCriterion("bFrozenAutoReceive <=", value, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveIn(List<Boolean> values) {
            addCriterion("bFrozenAutoReceive in", values, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveNotIn(List<Boolean> values) {
            addCriterion("bFrozenAutoReceive not in", values, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveBetween(Boolean value1, Boolean value2) {
            addCriterion("bFrozenAutoReceive between", value1, value2, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andFrozenAutoReceiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bFrozenAutoReceive not between", value1, value2, "frozenAutoReceive");
            return (Criteria) this;
        }

        public Criteria andPauseIsNull() {
            addCriterion("bPause is null");
            return (Criteria) this;
        }

        public Criteria andPauseIsNotNull() {
            addCriterion("bPause is not null");
            return (Criteria) this;
        }

        public Criteria andPauseEqualTo(Boolean value) {
            addCriterion("bPause =", value, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseNotEqualTo(Boolean value) {
            addCriterion("bPause <>", value, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseGreaterThan(Boolean value) {
            addCriterion("bPause >", value, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bPause >=", value, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseLessThan(Boolean value) {
            addCriterion("bPause <", value, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseLessThanOrEqualTo(Boolean value) {
            addCriterion("bPause <=", value, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseIn(List<Boolean> values) {
            addCriterion("bPause in", values, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseNotIn(List<Boolean> values) {
            addCriterion("bPause not in", values, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseBetween(Boolean value1, Boolean value2) {
            addCriterion("bPause between", value1, value2, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bPause not between", value1, value2, "pause");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNull() {
            addCriterion("dPauseTime is null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNotNull() {
            addCriterion("dPauseTime is not null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeEqualTo(Date value) {
            addCriterion("dPauseTime =", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotEqualTo(Date value) {
            addCriterion("dPauseTime <>", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThan(Date value) {
            addCriterion("dPauseTime >", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dPauseTime >=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThan(Date value) {
            addCriterion("dPauseTime <", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThanOrEqualTo(Date value) {
            addCriterion("dPauseTime <=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIn(List<Date> values) {
            addCriterion("dPauseTime in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotIn(List<Date> values) {
            addCriterion("dPauseTime not in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeBetween(Date value1, Date value2) {
            addCriterion("dPauseTime between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotBetween(Date value1, Date value2) {
            addCriterion("dPauseTime not between", value1, value2, "pauseTime");
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