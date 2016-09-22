package com.ymatou.deviceid.infrastructure.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditDetailExample() {
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

        public Criteria andCreditDetailIdIsNull() {
            addCriterion("iCreditDetailId is null");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdIsNotNull() {
            addCriterion("iCreditDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdEqualTo(Long value) {
            addCriterion("iCreditDetailId =", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdNotEqualTo(Long value) {
            addCriterion("iCreditDetailId <>", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdGreaterThan(Long value) {
            addCriterion("iCreditDetailId >", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iCreditDetailId >=", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdLessThan(Long value) {
            addCriterion("iCreditDetailId <", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("iCreditDetailId <=", value, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdIn(List<Long> values) {
            addCriterion("iCreditDetailId in", values, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdNotIn(List<Long> values) {
            addCriterion("iCreditDetailId not in", values, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdBetween(Long value1, Long value2) {
            addCriterion("iCreditDetailId between", value1, value2, "creditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("iCreditDetailId not between", value1, value2, "creditDetailId");
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

        public Criteria andTargetIdIsNull() {
            addCriterion("sTargetId is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("sTargetId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(String value) {
            addCriterion("sTargetId =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(String value) {
            addCriterion("sTargetId <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(String value) {
            addCriterion("sTargetId >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(String value) {
            addCriterion("sTargetId >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(String value) {
            addCriterion("sTargetId <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(String value) {
            addCriterion("sTargetId <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLike(String value) {
            addCriterion("sTargetId like", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotLike(String value) {
            addCriterion("sTargetId not like", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<String> values) {
            addCriterion("sTargetId in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<String> values) {
            addCriterion("sTargetId not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(String value1, String value2) {
            addCriterion("sTargetId between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(String value1, String value2) {
            addCriterion("sTargetId not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("fPoint is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("fPoint is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Double value) {
            addCriterion("fPoint =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Double value) {
            addCriterion("fPoint <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Double value) {
            addCriterion("fPoint >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Double value) {
            addCriterion("fPoint >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Double value) {
            addCriterion("fPoint <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Double value) {
            addCriterion("fPoint <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Double> values) {
            addCriterion("fPoint in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Double> values) {
            addCriterion("fPoint not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Double value1, Double value2) {
            addCriterion("fPoint between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Double value1, Double value2) {
            addCriterion("fPoint not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("sDescription is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("sDescription is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("sDescription =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("sDescription <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("sDescription >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("sDescription >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("sDescription <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("sDescription <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("sDescription like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("sDescription not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("sDescription in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("sDescription not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("sDescription between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("sDescription not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("iSort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("iSort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("iSort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("iSort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("iSort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("iSort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("iSort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("iSort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("iSort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("iSort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("iSort not between", value1, value2, "sort");
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

        public Criteria andIPIsNull() {
            addCriterion("sIP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("sIP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("sIP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("sIP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("sIP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("sIP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("sIP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("sIP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("sIP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("sIP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("sIP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("sIP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("sIP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("sIP not between", value1, value2, "IP");
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

        public Criteria andTargetUserIdIsNull() {
            addCriterion("iTargetUserId is null");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIsNotNull() {
            addCriterion("iTargetUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdEqualTo(Long value) {
            addCriterion("iTargetUserId =", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotEqualTo(Long value) {
            addCriterion("iTargetUserId <>", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdGreaterThan(Long value) {
            addCriterion("iTargetUserId >", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iTargetUserId >=", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLessThan(Long value) {
            addCriterion("iTargetUserId <", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdLessThanOrEqualTo(Long value) {
            addCriterion("iTargetUserId <=", value, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdIn(List<Long> values) {
            addCriterion("iTargetUserId in", values, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotIn(List<Long> values) {
            addCriterion("iTargetUserId not in", values, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdBetween(Long value1, Long value2) {
            addCriterion("iTargetUserId between", value1, value2, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andTargetUserIdNotBetween(Long value1, Long value2) {
            addCriterion("iTargetUserId not between", value1, value2, "targetUserId");
            return (Criteria) this;
        }

        public Criteria andPoint2IsNull() {
            addCriterion("fPoint2 is null");
            return (Criteria) this;
        }

        public Criteria andPoint2IsNotNull() {
            addCriterion("fPoint2 is not null");
            return (Criteria) this;
        }

        public Criteria andPoint2EqualTo(Double value) {
            addCriterion("fPoint2 =", value, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2NotEqualTo(Double value) {
            addCriterion("fPoint2 <>", value, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2GreaterThan(Double value) {
            addCriterion("fPoint2 >", value, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2GreaterThanOrEqualTo(Double value) {
            addCriterion("fPoint2 >=", value, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2LessThan(Double value) {
            addCriterion("fPoint2 <", value, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2LessThanOrEqualTo(Double value) {
            addCriterion("fPoint2 <=", value, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2In(List<Double> values) {
            addCriterion("fPoint2 in", values, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2NotIn(List<Double> values) {
            addCriterion("fPoint2 not in", values, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2Between(Double value1, Double value2) {
            addCriterion("fPoint2 between", value1, value2, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint2NotBetween(Double value1, Double value2) {
            addCriterion("fPoint2 not between", value1, value2, "point2");
            return (Criteria) this;
        }

        public Criteria andPoint3IsNull() {
            addCriterion("iPoint3 is null");
            return (Criteria) this;
        }

        public Criteria andPoint3IsNotNull() {
            addCriterion("iPoint3 is not null");
            return (Criteria) this;
        }

        public Criteria andPoint3EqualTo(Integer value) {
            addCriterion("iPoint3 =", value, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3NotEqualTo(Integer value) {
            addCriterion("iPoint3 <>", value, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3GreaterThan(Integer value) {
            addCriterion("iPoint3 >", value, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3GreaterThanOrEqualTo(Integer value) {
            addCriterion("iPoint3 >=", value, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3LessThan(Integer value) {
            addCriterion("iPoint3 <", value, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3LessThanOrEqualTo(Integer value) {
            addCriterion("iPoint3 <=", value, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3In(List<Integer> values) {
            addCriterion("iPoint3 in", values, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3NotIn(List<Integer> values) {
            addCriterion("iPoint3 not in", values, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3Between(Integer value1, Integer value2) {
            addCriterion("iPoint3 between", value1, value2, "point3");
            return (Criteria) this;
        }

        public Criteria andPoint3NotBetween(Integer value1, Integer value2) {
            addCriterion("iPoint3 not between", value1, value2, "point3");
            return (Criteria) this;
        }

        public Criteria andSellerReplyIsNull() {
            addCriterion("sSellerReply is null");
            return (Criteria) this;
        }

        public Criteria andSellerReplyIsNotNull() {
            addCriterion("sSellerReply is not null");
            return (Criteria) this;
        }

        public Criteria andSellerReplyEqualTo(String value) {
            addCriterion("sSellerReply =", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotEqualTo(String value) {
            addCriterion("sSellerReply <>", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyGreaterThan(String value) {
            addCriterion("sSellerReply >", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyGreaterThanOrEqualTo(String value) {
            addCriterion("sSellerReply >=", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyLessThan(String value) {
            addCriterion("sSellerReply <", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyLessThanOrEqualTo(String value) {
            addCriterion("sSellerReply <=", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyLike(String value) {
            addCriterion("sSellerReply like", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotLike(String value) {
            addCriterion("sSellerReply not like", value, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyIn(List<String> values) {
            addCriterion("sSellerReply in", values, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotIn(List<String> values) {
            addCriterion("sSellerReply not in", values, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyBetween(String value1, String value2) {
            addCriterion("sSellerReply between", value1, value2, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyNotBetween(String value1, String value2) {
            addCriterion("sSellerReply not between", value1, value2, "sellerReply");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeIsNull() {
            addCriterion("dSellerReplyUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeIsNotNull() {
            addCriterion("dSellerReplyUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeEqualTo(Date value) {
            addCriterion("dSellerReplyUpdateTime =", value, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeNotEqualTo(Date value) {
            addCriterion("dSellerReplyUpdateTime <>", value, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeGreaterThan(Date value) {
            addCriterion("dSellerReplyUpdateTime >", value, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dSellerReplyUpdateTime >=", value, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeLessThan(Date value) {
            addCriterion("dSellerReplyUpdateTime <", value, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dSellerReplyUpdateTime <=", value, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeIn(List<Date> values) {
            addCriterion("dSellerReplyUpdateTime in", values, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeNotIn(List<Date> values) {
            addCriterion("dSellerReplyUpdateTime not in", values, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dSellerReplyUpdateTime between", value1, value2, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSellerReplyUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dSellerReplyUpdateTime not between", value1, value2, "sellerReplyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentIsNull() {
            addCriterion("bFromPurchaseAgent is null");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentIsNotNull() {
            addCriterion("bFromPurchaseAgent is not null");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentEqualTo(Boolean value) {
            addCriterion("bFromPurchaseAgent =", value, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentNotEqualTo(Boolean value) {
            addCriterion("bFromPurchaseAgent <>", value, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentGreaterThan(Boolean value) {
            addCriterion("bFromPurchaseAgent >", value, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bFromPurchaseAgent >=", value, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentLessThan(Boolean value) {
            addCriterion("bFromPurchaseAgent <", value, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentLessThanOrEqualTo(Boolean value) {
            addCriterion("bFromPurchaseAgent <=", value, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentIn(List<Boolean> values) {
            addCriterion("bFromPurchaseAgent in", values, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentNotIn(List<Boolean> values) {
            addCriterion("bFromPurchaseAgent not in", values, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentBetween(Boolean value1, Boolean value2) {
            addCriterion("bFromPurchaseAgent between", value1, value2, "fromPurchaseAgent");
            return (Criteria) this;
        }

        public Criteria andFromPurchaseAgentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bFromPurchaseAgent not between", value1, value2, "fromPurchaseAgent");
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