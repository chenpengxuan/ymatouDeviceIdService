package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderStateExample() {
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

        public Criteria andRefundedAmountOfCashIsNull() {
            addCriterion("fRefundedAmountOfCash is null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashIsNotNull() {
            addCriterion("fRefundedAmountOfCash is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCash =", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashNotEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCash <>", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashGreaterThan(BigDecimal value) {
            addCriterion("fRefundedAmountOfCash >", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCash >=", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashLessThan(BigDecimal value) {
            addCriterion("fRefundedAmountOfCash <", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCash <=", value, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountOfCash in", values, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashNotIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountOfCash not in", values, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountOfCash between", value1, value2, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountOfCash not between", value1, value2, "refundedAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftIsNull() {
            addCriterion("fRefundedAmountOfGift is null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftIsNotNull() {
            addCriterion("fRefundedAmountOfGift is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfGift =", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftNotEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfGift <>", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftGreaterThan(BigDecimal value) {
            addCriterion("fRefundedAmountOfGift >", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfGift >=", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftLessThan(BigDecimal value) {
            addCriterion("fRefundedAmountOfGift <", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfGift <=", value, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountOfGift in", values, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftNotIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountOfGift not in", values, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountOfGift between", value1, value2, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfGiftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountOfGift not between", value1, value2, "refundedAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashIsNull() {
            addCriterion("fPaidAmountOfCash is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashIsNotNull() {
            addCriterion("fPaidAmountOfCash is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCash =", value, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCash <>", value, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfCash >", value, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCash >=", value, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfCash <", value, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCash <=", value, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfCash in", values, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfCash not in", values, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfCash between", value1, value2, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfCash not between", value1, value2, "paidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftIsNull() {
            addCriterion("fPaidAmountOfGift is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftIsNotNull() {
            addCriterion("fPaidAmountOfGift is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfGift =", value, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfGift <>", value, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfGift >", value, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfGift >=", value, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfGift <", value, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfGift <=", value, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfGift in", values, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfGift not in", values, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfGift between", value1, value2, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfGiftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfGift not between", value1, value2, "paidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashIsNull() {
            addCriterion("fPostPaidAmountOfCash is null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashIsNotNull() {
            addCriterion("fPostPaidAmountOfCash is not null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfCash =", value, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashNotEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfCash <>", value, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashGreaterThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfCash >", value, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfCash >=", value, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashLessThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfCash <", value, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfCash <=", value, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfCash in", values, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashNotIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfCash not in", values, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfCash between", value1, value2, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfCash not between", value1, value2, "postPaidAmountOfCash");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftIsNull() {
            addCriterion("fPostPaidAmountOfGift is null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftIsNotNull() {
            addCriterion("fPostPaidAmountOfGift is not null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfGift =", value, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftNotEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfGift <>", value, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftGreaterThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfGift >", value, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfGift >=", value, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftLessThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfGift <", value, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfGift <=", value, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfGift in", values, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftNotIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfGift not in", values, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfGift between", value1, value2, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfGiftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfGift not between", value1, value2, "postPaidAmountOfGift");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponIsNull() {
            addCriterion("fPaidAmountOfCoupon is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponIsNotNull() {
            addCriterion("fPaidAmountOfCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCoupon =", value, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCoupon <>", value, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfCoupon >", value, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCoupon >=", value, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfCoupon <", value, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfCoupon <=", value, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfCoupon in", values, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfCoupon not in", values, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfCoupon between", value1, value2, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfCoupon not between", value1, value2, "paidAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponIsNull() {
            addCriterion("fRefundedAmountOfCoupon is null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponIsNotNull() {
            addCriterion("fRefundedAmountOfCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCoupon =", value, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponNotEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCoupon <>", value, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponGreaterThan(BigDecimal value) {
            addCriterion("fRefundedAmountOfCoupon >", value, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCoupon >=", value, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponLessThan(BigDecimal value) {
            addCriterion("fRefundedAmountOfCoupon <", value, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountOfCoupon <=", value, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountOfCoupon in", values, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponNotIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountOfCoupon not in", values, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountOfCoupon between", value1, value2, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountOfCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountOfCoupon not between", value1, value2, "refundedAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponIsNull() {
            addCriterion("fPostPadiAmountOfCoupon is null");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponIsNotNull() {
            addCriterion("fPostPadiAmountOfCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponEqualTo(BigDecimal value) {
            addCriterion("fPostPadiAmountOfCoupon =", value, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponNotEqualTo(BigDecimal value) {
            addCriterion("fPostPadiAmountOfCoupon <>", value, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponGreaterThan(BigDecimal value) {
            addCriterion("fPostPadiAmountOfCoupon >", value, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPadiAmountOfCoupon >=", value, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponLessThan(BigDecimal value) {
            addCriterion("fPostPadiAmountOfCoupon <", value, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPadiAmountOfCoupon <=", value, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponIn(List<BigDecimal> values) {
            addCriterion("fPostPadiAmountOfCoupon in", values, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponNotIn(List<BigDecimal> values) {
            addCriterion("fPostPadiAmountOfCoupon not in", values, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPadiAmountOfCoupon between", value1, value2, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andPostPadiAmountOfCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPadiAmountOfCoupon not between", value1, value2, "postPadiAmountOfCoupon");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountIsNull() {
            addCriterion("fQuickTurnoverAmount is null");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountIsNotNull() {
            addCriterion("fQuickTurnoverAmount is not null");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountEqualTo(BigDecimal value) {
            addCriterion("fQuickTurnoverAmount =", value, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountNotEqualTo(BigDecimal value) {
            addCriterion("fQuickTurnoverAmount <>", value, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountGreaterThan(BigDecimal value) {
            addCriterion("fQuickTurnoverAmount >", value, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fQuickTurnoverAmount >=", value, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountLessThan(BigDecimal value) {
            addCriterion("fQuickTurnoverAmount <", value, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fQuickTurnoverAmount <=", value, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountIn(List<BigDecimal> values) {
            addCriterion("fQuickTurnoverAmount in", values, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountNotIn(List<BigDecimal> values) {
            addCriterion("fQuickTurnoverAmount not in", values, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fQuickTurnoverAmount between", value1, value2, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andQuickTurnoverAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fQuickTurnoverAmount not between", value1, value2, "quickTurnoverAmount");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeIsNull() {
            addCriterion("fCommissionFee is null");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeIsNotNull() {
            addCriterion("fCommissionFee is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeEqualTo(BigDecimal value) {
            addCriterion("fCommissionFee =", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeNotEqualTo(BigDecimal value) {
            addCriterion("fCommissionFee <>", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeGreaterThan(BigDecimal value) {
            addCriterion("fCommissionFee >", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fCommissionFee >=", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeLessThan(BigDecimal value) {
            addCriterion("fCommissionFee <", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fCommissionFee <=", value, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeIn(List<BigDecimal> values) {
            addCriterion("fCommissionFee in", values, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeNotIn(List<BigDecimal> values) {
            addCriterion("fCommissionFee not in", values, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fCommissionFee between", value1, value2, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andCommissionFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fCommissionFee not between", value1, value2, "commissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeIsNull() {
            addCriterion("fNeedCommissionFee is null");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeIsNotNull() {
            addCriterion("fNeedCommissionFee is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeEqualTo(BigDecimal value) {
            addCriterion("fNeedCommissionFee =", value, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeNotEqualTo(BigDecimal value) {
            addCriterion("fNeedCommissionFee <>", value, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeGreaterThan(BigDecimal value) {
            addCriterion("fNeedCommissionFee >", value, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fNeedCommissionFee >=", value, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeLessThan(BigDecimal value) {
            addCriterion("fNeedCommissionFee <", value, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fNeedCommissionFee <=", value, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeIn(List<BigDecimal> values) {
            addCriterion("fNeedCommissionFee in", values, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeNotIn(List<BigDecimal> values) {
            addCriterion("fNeedCommissionFee not in", values, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fNeedCommissionFee between", value1, value2, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andNeedCommissionFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fNeedCommissionFee not between", value1, value2, "needCommissionFee");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardIsNull() {
            addCriterion("fPaidAmountOfFreeCard is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardIsNotNull() {
            addCriterion("fPaidAmountOfFreeCard is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfFreeCard =", value, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfFreeCard <>", value, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfFreeCard >", value, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfFreeCard >=", value, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfFreeCard <", value, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfFreeCard <=", value, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfFreeCard in", values, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfFreeCard not in", values, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfFreeCard between", value1, value2, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfFreeCardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfFreeCard not between", value1, value2, "paidAmountOfFreeCard");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNull() {
            addCriterion("fBalanceAmount is null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNotNull() {
            addCriterion("fBalanceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountEqualTo(BigDecimal value) {
            addCriterion("fBalanceAmount =", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotEqualTo(BigDecimal value) {
            addCriterion("fBalanceAmount <>", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThan(BigDecimal value) {
            addCriterion("fBalanceAmount >", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fBalanceAmount >=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThan(BigDecimal value) {
            addCriterion("fBalanceAmount <", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fBalanceAmount <=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIn(List<BigDecimal> values) {
            addCriterion("fBalanceAmount in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotIn(List<BigDecimal> values) {
            addCriterion("fBalanceAmount not in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fBalanceAmount between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fBalanceAmount not between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponIsNull() {
            addCriterion("fPaidAmountOfSellerCoupon is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponIsNotNull() {
            addCriterion("fPaidAmountOfSellerCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfSellerCoupon =", value, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfSellerCoupon <>", value, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfSellerCoupon >", value, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfSellerCoupon >=", value, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfSellerCoupon <", value, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfSellerCoupon <=", value, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfSellerCoupon in", values, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfSellerCoupon not in", values, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfSellerCoupon between", value1, value2, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfSellerCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfSellerCoupon not between", value1, value2, "paidAmountOfSellerCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponIsNull() {
            addCriterion("fPaidAmountOfYmtCoupon is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponIsNotNull() {
            addCriterion("fPaidAmountOfYmtCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtCoupon =", value, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtCoupon <>", value, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtCoupon >", value, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtCoupon >=", value, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtCoupon <", value, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtCoupon <=", value, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfYmtCoupon in", values, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfYmtCoupon not in", values, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfYmtCoupon between", value1, value2, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtCouponNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfYmtCoupon not between", value1, value2, "paidAmountOfYmtCoupon");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyIsNull() {
            addCriterion("fPaidAmountOfThirdParty is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyIsNotNull() {
            addCriterion("fPaidAmountOfThirdParty is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfThirdParty =", value, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfThirdParty <>", value, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfThirdParty >", value, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfThirdParty >=", value, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfThirdParty <", value, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfThirdParty <=", value, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfThirdParty in", values, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfThirdParty not in", values, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfThirdParty between", value1, value2, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfThirdPartyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfThirdParty not between", value1, value2, "paidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountIsNull() {
            addCriterion("fPaidAmountOfYmtAccount is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountIsNotNull() {
            addCriterion("fPaidAmountOfYmtAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtAccount =", value, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountNotEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtAccount <>", value, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountGreaterThan(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtAccount >", value, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtAccount >=", value, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountLessThan(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtAccount <", value, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPaidAmountOfYmtAccount <=", value, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfYmtAccount in", values, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountNotIn(List<BigDecimal> values) {
            addCriterion("fPaidAmountOfYmtAccount not in", values, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfYmtAccount between", value1, value2, "paidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountOfYmtAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPaidAmountOfYmtAccount not between", value1, value2, "paidAmountOfYmtAccount");
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

        public Criteria andPostPaidAmountOfThirdPartyIsNull() {
            addCriterion("fPostPaidAmountOfThirdParty is null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyIsNotNull() {
            addCriterion("fPostPaidAmountOfThirdParty is not null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfThirdParty =", value, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyNotEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfThirdParty <>", value, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyGreaterThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfThirdParty >", value, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfThirdParty >=", value, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyLessThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfThirdParty <", value, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfThirdParty <=", value, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfThirdParty in", values, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyNotIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfThirdParty not in", values, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfThirdParty between", value1, value2, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfThirdPartyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfThirdParty not between", value1, value2, "postPaidAmountOfThirdParty");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountIsNull() {
            addCriterion("fPostPaidAmountOfYmtAccount is null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountIsNotNull() {
            addCriterion("fPostPaidAmountOfYmtAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfYmtAccount =", value, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountNotEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfYmtAccount <>", value, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountGreaterThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfYmtAccount >", value, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfYmtAccount >=", value, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountLessThan(BigDecimal value) {
            addCriterion("fPostPaidAmountOfYmtAccount <", value, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fPostPaidAmountOfYmtAccount <=", value, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfYmtAccount in", values, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountNotIn(List<BigDecimal> values) {
            addCriterion("fPostPaidAmountOfYmtAccount not in", values, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfYmtAccount between", value1, value2, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andPostPaidAmountOfYmtAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fPostPaidAmountOfYmtAccount not between", value1, value2, "postPaidAmountOfYmtAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountIsNull() {
            addCriterion("fRefundedAmountToAccount is null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountIsNotNull() {
            addCriterion("fRefundedAmountToAccount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountToAccount =", value, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountNotEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountToAccount <>", value, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountGreaterThan(BigDecimal value) {
            addCriterion("fRefundedAmountToAccount >", value, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountToAccount >=", value, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountLessThan(BigDecimal value) {
            addCriterion("fRefundedAmountToAccount <", value, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedAmountToAccount <=", value, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountToAccount in", values, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountNotIn(List<BigDecimal> values) {
            addCriterion("fRefundedAmountToAccount not in", values, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountToAccount between", value1, value2, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedAmountToAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedAmountToAccount not between", value1, value2, "refundedAmountToAccount");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyIsNull() {
            addCriterion("fRefundedPaidAmountToThirdParty is null");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyIsNotNull() {
            addCriterion("fRefundedPaidAmountToThirdParty is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyEqualTo(BigDecimal value) {
            addCriterion("fRefundedPaidAmountToThirdParty =", value, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyNotEqualTo(BigDecimal value) {
            addCriterion("fRefundedPaidAmountToThirdParty <>", value, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyGreaterThan(BigDecimal value) {
            addCriterion("fRefundedPaidAmountToThirdParty >", value, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedPaidAmountToThirdParty >=", value, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyLessThan(BigDecimal value) {
            addCriterion("fRefundedPaidAmountToThirdParty <", value, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedPaidAmountToThirdParty <=", value, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyIn(List<BigDecimal> values) {
            addCriterion("fRefundedPaidAmountToThirdParty in", values, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyNotIn(List<BigDecimal> values) {
            addCriterion("fRefundedPaidAmountToThirdParty not in", values, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedPaidAmountToThirdParty between", value1, value2, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPaidAmountToThirdPartyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedPaidAmountToThirdParty not between", value1, value2, "refundedPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyIsNull() {
            addCriterion("fRefundedPostPaidAmountToThirdParty is null");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyIsNotNull() {
            addCriterion("fRefundedPostPaidAmountToThirdParty is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyEqualTo(BigDecimal value) {
            addCriterion("fRefundedPostPaidAmountToThirdParty =", value, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyNotEqualTo(BigDecimal value) {
            addCriterion("fRefundedPostPaidAmountToThirdParty <>", value, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyGreaterThan(BigDecimal value) {
            addCriterion("fRefundedPostPaidAmountToThirdParty >", value, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedPostPaidAmountToThirdParty >=", value, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyLessThan(BigDecimal value) {
            addCriterion("fRefundedPostPaidAmountToThirdParty <", value, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fRefundedPostPaidAmountToThirdParty <=", value, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyIn(List<BigDecimal> values) {
            addCriterion("fRefundedPostPaidAmountToThirdParty in", values, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyNotIn(List<BigDecimal> values) {
            addCriterion("fRefundedPostPaidAmountToThirdParty not in", values, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedPostPaidAmountToThirdParty between", value1, value2, "refundedPostPaidAmountToThirdParty");
            return (Criteria) this;
        }

        public Criteria andRefundedPostPaidAmountToThirdPartyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fRefundedPostPaidAmountToThirdParty not between", value1, value2, "refundedPostPaidAmountToThirdParty");
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