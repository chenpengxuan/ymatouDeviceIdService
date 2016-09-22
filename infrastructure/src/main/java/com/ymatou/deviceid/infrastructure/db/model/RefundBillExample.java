package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundBillExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("OrderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("OrderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("OrderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OrderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("OrderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
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

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("OrderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("OrderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoIsNull() {
            addCriterion("RefundBillNo is null");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoIsNotNull() {
            addCriterion("RefundBillNo is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoEqualTo(String value) {
            addCriterion("RefundBillNo =", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoNotEqualTo(String value) {
            addCriterion("RefundBillNo <>", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoGreaterThan(String value) {
            addCriterion("RefundBillNo >", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("RefundBillNo >=", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoLessThan(String value) {
            addCriterion("RefundBillNo <", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoLessThanOrEqualTo(String value) {
            addCriterion("RefundBillNo <=", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoLike(String value) {
            addCriterion("RefundBillNo like", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoNotLike(String value) {
            addCriterion("RefundBillNo not like", value, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoIn(List<String> values) {
            addCriterion("RefundBillNo in", values, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoNotIn(List<String> values) {
            addCriterion("RefundBillNo not in", values, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoBetween(String value1, String value2) {
            addCriterion("RefundBillNo between", value1, value2, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundBillNoNotBetween(String value1, String value2) {
            addCriterion("RefundBillNo not between", value1, value2, "refundBillNo");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("RefundAmount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("RefundAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("RefundAmount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("RefundAmount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("RefundAmount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundAmount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("RefundAmount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundAmount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("RefundAmount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("RefundAmount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundAmount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundAmount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("RefundStatus is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("RefundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("RefundStatus =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("RefundStatus <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("RefundStatus >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RefundStatus >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("RefundStatus <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RefundStatus <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("RefundStatus in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("RefundStatus not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("RefundStatus between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RefundStatus not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIsNull() {
            addCriterion("SettlementAmount is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIsNotNull() {
            addCriterion("SettlementAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountEqualTo(BigDecimal value) {
            addCriterion("SettlementAmount =", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotEqualTo(BigDecimal value) {
            addCriterion("SettlementAmount <>", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountGreaterThan(BigDecimal value) {
            addCriterion("SettlementAmount >", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SettlementAmount >=", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountLessThan(BigDecimal value) {
            addCriterion("SettlementAmount <", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SettlementAmount <=", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIn(List<BigDecimal> values) {
            addCriterion("SettlementAmount in", values, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotIn(List<BigDecimal> values) {
            addCriterion("SettlementAmount not in", values, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SettlementAmount between", value1, value2, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SettlementAmount not between", value1, value2, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNull() {
            addCriterion("SettlementStatus is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("SettlementStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(Integer value) {
            addCriterion("SettlementStatus =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(Integer value) {
            addCriterion("SettlementStatus <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(Integer value) {
            addCriterion("SettlementStatus >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SettlementStatus >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(Integer value) {
            addCriterion("SettlementStatus <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SettlementStatus <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<Integer> values) {
            addCriterion("SettlementStatus in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<Integer> values) {
            addCriterion("SettlementStatus not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(Integer value1, Integer value2) {
            addCriterion("SettlementStatus between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SettlementStatus not between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNull() {
            addCriterion("RefundType is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNotNull() {
            addCriterion("RefundType is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualTo(Integer value) {
            addCriterion("RefundType =", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualTo(Integer value) {
            addCriterion("RefundType <>", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThan(Integer value) {
            addCriterion("RefundType >", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RefundType >=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThan(Integer value) {
            addCriterion("RefundType <", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualTo(Integer value) {
            addCriterion("RefundType <=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIn(List<Integer> values) {
            addCriterion("RefundType in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotIn(List<Integer> values) {
            addCriterion("RefundType not in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeBetween(Integer value1, Integer value2) {
            addCriterion("RefundType between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RefundType not between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashIsNull() {
            addCriterion("RefundedAmountOfCash is null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashIsNotNull() {
            addCriterion("RefundedAmountOfCash is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfCash =", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashNotEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfCash <>", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashGreaterThan(BigDecimal value) {
            addCriterion("RefundedAmountOfCash >", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfCash >=", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashLessThan(BigDecimal value) {
            addCriterion("RefundedAmountOfCash <", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfCash <=", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashIn(List<BigDecimal> values) {
            addCriterion("RefundedAmountOfCash in", values, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashNotIn(List<BigDecimal> values) {
            addCriterion("RefundedAmountOfCash not in", values, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundedAmountOfCash between", value1, value2, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundedAmountOfCash not between", value1, value2, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftIsNull() {
            addCriterion("RefundedAmountOfGift is null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftIsNotNull() {
            addCriterion("RefundedAmountOfGift is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfGift =", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftNotEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfGift <>", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftGreaterThan(BigDecimal value) {
            addCriterion("RefundedAmountOfGift >", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfGift >=", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftLessThan(BigDecimal value) {
            addCriterion("RefundedAmountOfGift <", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundedAmountOfGift <=", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftIn(List<BigDecimal> values) {
            addCriterion("RefundedAmountOfGift in", values, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftNotIn(List<BigDecimal> values) {
            addCriterion("RefundedAmountOfGift not in", values, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundedAmountOfGift between", value1, value2, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundedAmountOfGift not between", value1, value2, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("Approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("Approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("Approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("Approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("Approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("Approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("Approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("Approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("Approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("Approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("Approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("Approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("Approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("Approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponIsNull() {
            addCriterion("SettlementAmountOfCoupon is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponIsNotNull() {
            addCriterion("SettlementAmountOfCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponEqualTo(BigDecimal value) {
            addCriterion("SettlementAmountOfCoupon =", value, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponNotEqualTo(BigDecimal value) {
            addCriterion("SettlementAmountOfCoupon <>", value, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponGreaterThan(BigDecimal value) {
            addCriterion("SettlementAmountOfCoupon >", value, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SettlementAmountOfCoupon >=", value, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponLessThan(BigDecimal value) {
            addCriterion("SettlementAmountOfCoupon <", value, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SettlementAmountOfCoupon <=", value, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponIn(List<BigDecimal> values) {
            addCriterion("SettlementAmountOfCoupon in", values, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponNotIn(List<BigDecimal> values) {
            addCriterion("SettlementAmountOfCoupon not in", values, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SettlementAmountOfCoupon between", value1, value2, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountOfCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SettlementAmountOfCoupon not between", value1, value2, "settlementAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusIsNull() {
            addCriterion("SalesRefundStatus is null");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusIsNotNull() {
            addCriterion("SalesRefundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusEqualTo(Integer value) {
            addCriterion("SalesRefundStatus =", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusNotEqualTo(Integer value) {
            addCriterion("SalesRefundStatus <>", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusGreaterThan(Integer value) {
            addCriterion("SalesRefundStatus >", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesRefundStatus >=", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusLessThan(Integer value) {
            addCriterion("SalesRefundStatus <", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SalesRefundStatus <=", value, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusIn(List<Integer> values) {
            addCriterion("SalesRefundStatus in", values, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusNotIn(List<Integer> values) {
            addCriterion("SalesRefundStatus not in", values, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("SalesRefundStatus between", value1, value2, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSalesRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesRefundStatus not between", value1, value2, "salesRefundStatus");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("SellerId is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("SellerId is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("SellerId =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("SellerId <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("SellerId >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SellerId >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("SellerId <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("SellerId <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("SellerId in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("SellerId not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("SellerId between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("SellerId not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("BuyerId is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("BuyerId is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("BuyerId =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("BuyerId <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("BuyerId >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BuyerId >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("BuyerId <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("BuyerId <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("BuyerId in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("BuyerId not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("BuyerId between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("BuyerId not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionIsNull() {
            addCriterion("InterfaceVersion is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionIsNotNull() {
            addCriterion("InterfaceVersion is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionEqualTo(String value) {
            addCriterion("InterfaceVersion =", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotEqualTo(String value) {
            addCriterion("InterfaceVersion <>", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionGreaterThan(String value) {
            addCriterion("InterfaceVersion >", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("InterfaceVersion >=", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionLessThan(String value) {
            addCriterion("InterfaceVersion <", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionLessThanOrEqualTo(String value) {
            addCriterion("InterfaceVersion <=", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionLike(String value) {
            addCriterion("InterfaceVersion like", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotLike(String value) {
            addCriterion("InterfaceVersion not like", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionIn(List<String> values) {
            addCriterion("InterfaceVersion in", values, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotIn(List<String> values) {
            addCriterion("InterfaceVersion not in", values, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionBetween(String value1, String value2) {
            addCriterion("InterfaceVersion between", value1, value2, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotBetween(String value1, String value2) {
            addCriterion("InterfaceVersion not between", value1, value2, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedIsNull() {
            addCriterion("ApprovedAfterOrderReceived is null");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedIsNotNull() {
            addCriterion("ApprovedAfterOrderReceived is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedEqualTo(Boolean value) {
            addCriterion("ApprovedAfterOrderReceived =", value, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedNotEqualTo(Boolean value) {
            addCriterion("ApprovedAfterOrderReceived <>", value, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedGreaterThan(Boolean value) {
            addCriterion("ApprovedAfterOrderReceived >", value, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ApprovedAfterOrderReceived >=", value, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedLessThan(Boolean value) {
            addCriterion("ApprovedAfterOrderReceived <", value, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedLessThanOrEqualTo(Boolean value) {
            addCriterion("ApprovedAfterOrderReceived <=", value, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedIn(List<Boolean> values) {
            addCriterion("ApprovedAfterOrderReceived in", values, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedNotIn(List<Boolean> values) {
            addCriterion("ApprovedAfterOrderReceived not in", values, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedBetween(Boolean value1, Boolean value2) {
            addCriterion("ApprovedAfterOrderReceived between", value1, value2, "approvedAfterOrderReceived");
            return (Criteria) this;
        }

        public Criteria andApprovedAfterOrderReceivedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ApprovedAfterOrderReceived not between", value1, value2, "approvedAfterOrderReceived");
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