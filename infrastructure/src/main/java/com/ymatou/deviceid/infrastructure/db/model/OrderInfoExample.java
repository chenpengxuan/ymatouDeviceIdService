package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andOrderInfoIdIsNull() {
            addCriterion("sOrderInfoId is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIsNotNull() {
            addCriterion("sOrderInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdEqualTo(String value) {
            addCriterion("sOrderInfoId =", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotEqualTo(String value) {
            addCriterion("sOrderInfoId <>", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThan(String value) {
            addCriterion("sOrderInfoId >", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("sOrderInfoId >=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThan(String value) {
            addCriterion("sOrderInfoId <", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThanOrEqualTo(String value) {
            addCriterion("sOrderInfoId <=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLike(String value) {
            addCriterion("sOrderInfoId like", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotLike(String value) {
            addCriterion("sOrderInfoId not like", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIn(List<String> values) {
            addCriterion("sOrderInfoId in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotIn(List<String> values) {
            addCriterion("sOrderInfoId not in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdBetween(String value1, String value2) {
            addCriterion("sOrderInfoId between", value1, value2, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotBetween(String value1, String value2) {
            addCriterion("sOrderInfoId not between", value1, value2, "orderInfoId");
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

        public Criteria andCatalogIdIsNull() {
            addCriterion("sCatalogId is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIsNotNull() {
            addCriterion("sCatalogId is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogIdEqualTo(String value) {
            addCriterion("sCatalogId =", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotEqualTo(String value) {
            addCriterion("sCatalogId <>", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdGreaterThan(String value) {
            addCriterion("sCatalogId >", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdGreaterThanOrEqualTo(String value) {
            addCriterion("sCatalogId >=", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLessThan(String value) {
            addCriterion("sCatalogId <", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLessThanOrEqualTo(String value) {
            addCriterion("sCatalogId <=", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLike(String value) {
            addCriterion("sCatalogId like", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotLike(String value) {
            addCriterion("sCatalogId not like", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIn(List<String> values) {
            addCriterion("sCatalogId in", values, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotIn(List<String> values) {
            addCriterion("sCatalogId not in", values, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdBetween(String value1, String value2) {
            addCriterion("sCatalogId between", value1, value2, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotBetween(String value1, String value2) {
            addCriterion("sCatalogId not between", value1, value2, "catalogId");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoIsNull() {
            addCriterion("sPropertyInfo is null");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoIsNotNull() {
            addCriterion("sPropertyInfo is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoEqualTo(String value) {
            addCriterion("sPropertyInfo =", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoNotEqualTo(String value) {
            addCriterion("sPropertyInfo <>", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoGreaterThan(String value) {
            addCriterion("sPropertyInfo >", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("sPropertyInfo >=", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoLessThan(String value) {
            addCriterion("sPropertyInfo <", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoLessThanOrEqualTo(String value) {
            addCriterion("sPropertyInfo <=", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoLike(String value) {
            addCriterion("sPropertyInfo like", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoNotLike(String value) {
            addCriterion("sPropertyInfo not like", value, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoIn(List<String> values) {
            addCriterion("sPropertyInfo in", values, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoNotIn(List<String> values) {
            addCriterion("sPropertyInfo not in", values, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoBetween(String value1, String value2) {
            addCriterion("sPropertyInfo between", value1, value2, "propertyInfo");
            return (Criteria) this;
        }

        public Criteria andPropertyInfoNotBetween(String value1, String value2) {
            addCriterion("sPropertyInfo not between", value1, value2, "propertyInfo");
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

        public Criteria andPictureUrlIsNull() {
            addCriterion("sPictureUrl is null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNotNull() {
            addCriterion("sPictureUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualTo(String value) {
            addCriterion("sPictureUrl =", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("sPictureUrl <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("sPictureUrl >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sPictureUrl >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("sPictureUrl <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("sPictureUrl <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLike(String value) {
            addCriterion("sPictureUrl like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotLike(String value) {
            addCriterion("sPictureUrl not like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIn(List<String> values) {
            addCriterion("sPictureUrl in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotIn(List<String> values) {
            addCriterion("sPictureUrl not in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlBetween(String value1, String value2) {
            addCriterion("sPictureUrl between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotBetween(String value1, String value2) {
            addCriterion("sPictureUrl not between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlIsNull() {
            addCriterion("sReferenceUrl is null");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlIsNotNull() {
            addCriterion("sReferenceUrl is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlEqualTo(String value) {
            addCriterion("sReferenceUrl =", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlNotEqualTo(String value) {
            addCriterion("sReferenceUrl <>", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlGreaterThan(String value) {
            addCriterion("sReferenceUrl >", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sReferenceUrl >=", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlLessThan(String value) {
            addCriterion("sReferenceUrl <", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlLessThanOrEqualTo(String value) {
            addCriterion("sReferenceUrl <=", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlLike(String value) {
            addCriterion("sReferenceUrl like", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlNotLike(String value) {
            addCriterion("sReferenceUrl not like", value, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlIn(List<String> values) {
            addCriterion("sReferenceUrl in", values, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlNotIn(List<String> values) {
            addCriterion("sReferenceUrl not in", values, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlBetween(String value1, String value2) {
            addCriterion("sReferenceUrl between", value1, value2, "referenceUrl");
            return (Criteria) this;
        }

        public Criteria andReferenceUrlNotBetween(String value1, String value2) {
            addCriterion("sReferenceUrl not between", value1, value2, "referenceUrl");
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

        public Criteria andAmountIsNull() {
            addCriterion("iAmount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("iAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("iAmount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("iAmount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("iAmount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("iAmount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("iAmount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("iAmount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("iAmount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("iAmount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("iAmount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("iAmount not between", value1, value2, "amount");
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

        public Criteria andSailProtectedIsNull() {
            addCriterion("iSailProtected is null");
            return (Criteria) this;
        }

        public Criteria andSailProtectedIsNotNull() {
            addCriterion("iSailProtected is not null");
            return (Criteria) this;
        }

        public Criteria andSailProtectedEqualTo(Integer value) {
            addCriterion("iSailProtected =", value, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedNotEqualTo(Integer value) {
            addCriterion("iSailProtected <>", value, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedGreaterThan(Integer value) {
            addCriterion("iSailProtected >", value, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSailProtected >=", value, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedLessThan(Integer value) {
            addCriterion("iSailProtected <", value, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedLessThanOrEqualTo(Integer value) {
            addCriterion("iSailProtected <=", value, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedIn(List<Integer> values) {
            addCriterion("iSailProtected in", values, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedNotIn(List<Integer> values) {
            addCriterion("iSailProtected not in", values, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedBetween(Integer value1, Integer value2) {
            addCriterion("iSailProtected between", value1, value2, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSailProtectedNotBetween(Integer value1, Integer value2) {
            addCriterion("iSailProtected not between", value1, value2, "sailProtected");
            return (Criteria) this;
        }

        public Criteria andSKUIsNull() {
            addCriterion("sSKU is null");
            return (Criteria) this;
        }

        public Criteria andSKUIsNotNull() {
            addCriterion("sSKU is not null");
            return (Criteria) this;
        }

        public Criteria andSKUEqualTo(String value) {
            addCriterion("sSKU =", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotEqualTo(String value) {
            addCriterion("sSKU <>", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUGreaterThan(String value) {
            addCriterion("sSKU >", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUGreaterThanOrEqualTo(String value) {
            addCriterion("sSKU >=", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKULessThan(String value) {
            addCriterion("sSKU <", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKULessThanOrEqualTo(String value) {
            addCriterion("sSKU <=", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKULike(String value) {
            addCriterion("sSKU like", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotLike(String value) {
            addCriterion("sSKU not like", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUIn(List<String> values) {
            addCriterion("sSKU in", values, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotIn(List<String> values) {
            addCriterion("sSKU not in", values, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUBetween(String value1, String value2) {
            addCriterion("sSKU between", value1, value2, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotBetween(String value1, String value2) {
            addCriterion("sSKU not between", value1, value2, "SKU");
            return (Criteria) this;
        }

        public Criteria andForVipIsNull() {
            addCriterion("bForVip is null");
            return (Criteria) this;
        }

        public Criteria andForVipIsNotNull() {
            addCriterion("bForVip is not null");
            return (Criteria) this;
        }

        public Criteria andForVipEqualTo(Boolean value) {
            addCriterion("bForVip =", value, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipNotEqualTo(Boolean value) {
            addCriterion("bForVip <>", value, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipGreaterThan(Boolean value) {
            addCriterion("bForVip >", value, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bForVip >=", value, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipLessThan(Boolean value) {
            addCriterion("bForVip <", value, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipLessThanOrEqualTo(Boolean value) {
            addCriterion("bForVip <=", value, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipIn(List<Boolean> values) {
            addCriterion("bForVip in", values, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipNotIn(List<Boolean> values) {
            addCriterion("bForVip not in", values, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipBetween(Boolean value1, Boolean value2) {
            addCriterion("bForVip between", value1, value2, "forVip");
            return (Criteria) this;
        }

        public Criteria andForVipNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bForVip not between", value1, value2, "forVip");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeIsNull() {
            addCriterion("iCatalogType is null");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeIsNotNull() {
            addCriterion("iCatalogType is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeEqualTo(Integer value) {
            addCriterion("iCatalogType =", value, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeNotEqualTo(Integer value) {
            addCriterion("iCatalogType <>", value, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeGreaterThan(Integer value) {
            addCriterion("iCatalogType >", value, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCatalogType >=", value, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeLessThan(Integer value) {
            addCriterion("iCatalogType <", value, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iCatalogType <=", value, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeIn(List<Integer> values) {
            addCriterion("iCatalogType in", values, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeNotIn(List<Integer> values) {
            addCriterion("iCatalogType not in", values, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeBetween(Integer value1, Integer value2) {
            addCriterion("iCatalogType between", value1, value2, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iCatalogType not between", value1, value2, "catalogType");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusIsNull() {
            addCriterion("iCatalogStatus is null");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusIsNotNull() {
            addCriterion("iCatalogStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusEqualTo(Integer value) {
            addCriterion("iCatalogStatus =", value, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusNotEqualTo(Integer value) {
            addCriterion("iCatalogStatus <>", value, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusGreaterThan(Integer value) {
            addCriterion("iCatalogStatus >", value, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCatalogStatus >=", value, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusLessThan(Integer value) {
            addCriterion("iCatalogStatus <", value, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iCatalogStatus <=", value, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusIn(List<Integer> values) {
            addCriterion("iCatalogStatus in", values, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusNotIn(List<Integer> values) {
            addCriterion("iCatalogStatus not in", values, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusBetween(Integer value1, Integer value2) {
            addCriterion("iCatalogStatus between", value1, value2, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andCatalogStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iCatalogStatus not between", value1, value2, "catalogStatus");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("iProductType is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("iProductType is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("iProductType =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("iProductType <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("iProductType >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iProductType >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("iProductType <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iProductType <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("iProductType in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("iProductType not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("iProductType between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iProductType not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("sProductId is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("sProductId is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("sProductId =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("sProductId <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("sProductId >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("sProductId >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("sProductId <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("sProductId <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("sProductId like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("sProductId not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("sProductId in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("sProductId not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("sProductId between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("sProductId not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdIsNull() {
            addCriterion("iProductMainCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdIsNotNull() {
            addCriterion("iProductMainCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdEqualTo(Long value) {
            addCriterion("iProductMainCategoryId =", value, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdNotEqualTo(Long value) {
            addCriterion("iProductMainCategoryId <>", value, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdGreaterThan(Long value) {
            addCriterion("iProductMainCategoryId >", value, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iProductMainCategoryId >=", value, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdLessThan(Long value) {
            addCriterion("iProductMainCategoryId <", value, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("iProductMainCategoryId <=", value, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdIn(List<Long> values) {
            addCriterion("iProductMainCategoryId in", values, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdNotIn(List<Long> values) {
            addCriterion("iProductMainCategoryId not in", values, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdBetween(Long value1, Long value2) {
            addCriterion("iProductMainCategoryId between", value1, value2, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductMainCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("iProductMainCategoryId not between", value1, value2, "productMainCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdIsNull() {
            addCriterion("iProductSubCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdIsNotNull() {
            addCriterion("iProductSubCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdEqualTo(Long value) {
            addCriterion("iProductSubCategoryId =", value, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdNotEqualTo(Long value) {
            addCriterion("iProductSubCategoryId <>", value, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdGreaterThan(Long value) {
            addCriterion("iProductSubCategoryId >", value, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iProductSubCategoryId >=", value, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdLessThan(Long value) {
            addCriterion("iProductSubCategoryId <", value, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("iProductSubCategoryId <=", value, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdIn(List<Long> values) {
            addCriterion("iProductSubCategoryId in", values, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdNotIn(List<Long> values) {
            addCriterion("iProductSubCategoryId not in", values, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdBetween(Long value1, Long value2) {
            addCriterion("iProductSubCategoryId between", value1, value2, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductSubCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("iProductSubCategoryId not between", value1, value2, "productSubCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdIsNull() {
            addCriterion("iProductThirdCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdIsNotNull() {
            addCriterion("iProductThirdCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdEqualTo(Long value) {
            addCriterion("iProductThirdCategoryId =", value, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdNotEqualTo(Long value) {
            addCriterion("iProductThirdCategoryId <>", value, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdGreaterThan(Long value) {
            addCriterion("iProductThirdCategoryId >", value, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iProductThirdCategoryId >=", value, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdLessThan(Long value) {
            addCriterion("iProductThirdCategoryId <", value, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("iProductThirdCategoryId <=", value, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdIn(List<Long> values) {
            addCriterion("iProductThirdCategoryId in", values, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdNotIn(List<Long> values) {
            addCriterion("iProductThirdCategoryId not in", values, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdBetween(Long value1, Long value2) {
            addCriterion("iProductThirdCategoryId between", value1, value2, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductThirdCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("iProductThirdCategoryId not between", value1, value2, "productThirdCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIsNull() {
            addCriterion("iProductBrandId is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIsNotNull() {
            addCriterion("iProductBrandId is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdEqualTo(Long value) {
            addCriterion("iProductBrandId =", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotEqualTo(Long value) {
            addCriterion("iProductBrandId <>", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdGreaterThan(Long value) {
            addCriterion("iProductBrandId >", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iProductBrandId >=", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLessThan(Long value) {
            addCriterion("iProductBrandId <", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("iProductBrandId <=", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIn(List<Long> values) {
            addCriterion("iProductBrandId in", values, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotIn(List<Long> values) {
            addCriterion("iProductBrandId not in", values, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdBetween(Long value1, Long value2) {
            addCriterion("iProductBrandId between", value1, value2, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("iProductBrandId not between", value1, value2, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andBondedAreaIsNull() {
            addCriterion("iBondedArea is null");
            return (Criteria) this;
        }

        public Criteria andBondedAreaIsNotNull() {
            addCriterion("iBondedArea is not null");
            return (Criteria) this;
        }

        public Criteria andBondedAreaEqualTo(Integer value) {
            addCriterion("iBondedArea =", value, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaNotEqualTo(Integer value) {
            addCriterion("iBondedArea <>", value, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaGreaterThan(Integer value) {
            addCriterion("iBondedArea >", value, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("iBondedArea >=", value, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaLessThan(Integer value) {
            addCriterion("iBondedArea <", value, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaLessThanOrEqualTo(Integer value) {
            addCriterion("iBondedArea <=", value, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaIn(List<Integer> values) {
            addCriterion("iBondedArea in", values, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaNotIn(List<Integer> values) {
            addCriterion("iBondedArea not in", values, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaBetween(Integer value1, Integer value2) {
            addCriterion("iBondedArea between", value1, value2, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andBondedAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("iBondedArea not between", value1, value2, "bondedArea");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("sProductCode is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("sProductCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("sProductCode =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("sProductCode <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("sProductCode >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sProductCode >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("sProductCode <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("sProductCode <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("sProductCode like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("sProductCode not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("sProductCode in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("sProductCode not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("sProductCode between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("sProductCode not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andTariffTypeIsNull() {
            addCriterion("iTariffType is null");
            return (Criteria) this;
        }

        public Criteria andTariffTypeIsNotNull() {
            addCriterion("iTariffType is not null");
            return (Criteria) this;
        }

        public Criteria andTariffTypeEqualTo(Integer value) {
            addCriterion("iTariffType =", value, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeNotEqualTo(Integer value) {
            addCriterion("iTariffType <>", value, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeGreaterThan(Integer value) {
            addCriterion("iTariffType >", value, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTariffType >=", value, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeLessThan(Integer value) {
            addCriterion("iTariffType <", value, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iTariffType <=", value, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeIn(List<Integer> values) {
            addCriterion("iTariffType in", values, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeNotIn(List<Integer> values) {
            addCriterion("iTariffType not in", values, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeBetween(Integer value1, Integer value2) {
            addCriterion("iTariffType between", value1, value2, "tariffType");
            return (Criteria) this;
        }

        public Criteria andTariffTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iTariffType not between", value1, value2, "tariffType");
            return (Criteria) this;
        }

        public Criteria andFlightIsNull() {
            addCriterion("fFlight is null");
            return (Criteria) this;
        }

        public Criteria andFlightIsNotNull() {
            addCriterion("fFlight is not null");
            return (Criteria) this;
        }

        public Criteria andFlightEqualTo(BigDecimal value) {
            addCriterion("fFlight =", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotEqualTo(BigDecimal value) {
            addCriterion("fFlight <>", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThan(BigDecimal value) {
            addCriterion("fFlight >", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fFlight >=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThan(BigDecimal value) {
            addCriterion("fFlight <", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fFlight <=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightIn(List<BigDecimal> values) {
            addCriterion("fFlight in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotIn(List<BigDecimal> values) {
            addCriterion("fFlight not in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fFlight between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fFlight not between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("iPriceType is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("iPriceType is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Integer value) {
            addCriterion("iPriceType =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Integer value) {
            addCriterion("iPriceType <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Integer value) {
            addCriterion("iPriceType >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPriceType >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Integer value) {
            addCriterion("iPriceType <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iPriceType <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Integer> values) {
            addCriterion("iPriceType in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Integer> values) {
            addCriterion("iPriceType not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Integer value1, Integer value2) {
            addCriterion("iPriceType between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iPriceType not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPackageNoIsNull() {
            addCriterion("sPackageNo is null");
            return (Criteria) this;
        }

        public Criteria andPackageNoIsNotNull() {
            addCriterion("sPackageNo is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNoEqualTo(String value) {
            addCriterion("sPackageNo =", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotEqualTo(String value) {
            addCriterion("sPackageNo <>", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoGreaterThan(String value) {
            addCriterion("sPackageNo >", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoGreaterThanOrEqualTo(String value) {
            addCriterion("sPackageNo >=", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoLessThan(String value) {
            addCriterion("sPackageNo <", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoLessThanOrEqualTo(String value) {
            addCriterion("sPackageNo <=", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoLike(String value) {
            addCriterion("sPackageNo like", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotLike(String value) {
            addCriterion("sPackageNo not like", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoIn(List<String> values) {
            addCriterion("sPackageNo in", values, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotIn(List<String> values) {
            addCriterion("sPackageNo not in", values, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoBetween(String value1, String value2) {
            addCriterion("sPackageNo between", value1, value2, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotBetween(String value1, String value2) {
            addCriterion("sPackageNo not between", value1, value2, "packageNo");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelIsNull() {
            addCriterion("iProductRefundChannel is null");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelIsNotNull() {
            addCriterion("iProductRefundChannel is not null");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelEqualTo(Integer value) {
            addCriterion("iProductRefundChannel =", value, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelNotEqualTo(Integer value) {
            addCriterion("iProductRefundChannel <>", value, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelGreaterThan(Integer value) {
            addCriterion("iProductRefundChannel >", value, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("iProductRefundChannel >=", value, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelLessThan(Integer value) {
            addCriterion("iProductRefundChannel <", value, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelLessThanOrEqualTo(Integer value) {
            addCriterion("iProductRefundChannel <=", value, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelIn(List<Integer> values) {
            addCriterion("iProductRefundChannel in", values, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelNotIn(List<Integer> values) {
            addCriterion("iProductRefundChannel not in", values, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelBetween(Integer value1, Integer value2) {
            addCriterion("iProductRefundChannel between", value1, value2, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("iProductRefundChannel not between", value1, value2, "productRefundChannel");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusIsNull() {
            addCriterion("iProductRefundStatus is null");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusIsNotNull() {
            addCriterion("iProductRefundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusEqualTo(Integer value) {
            addCriterion("iProductRefundStatus =", value, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusNotEqualTo(Integer value) {
            addCriterion("iProductRefundStatus <>", value, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusGreaterThan(Integer value) {
            addCriterion("iProductRefundStatus >", value, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iProductRefundStatus >=", value, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusLessThan(Integer value) {
            addCriterion("iProductRefundStatus <", value, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iProductRefundStatus <=", value, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusIn(List<Integer> values) {
            addCriterion("iProductRefundStatus in", values, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusNotIn(List<Integer> values) {
            addCriterion("iProductRefundStatus not in", values, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("iProductRefundStatus between", value1, value2, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iProductRefundStatus not between", value1, value2, "productRefundStatus");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("fProductPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("fProductPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("fProductPrice =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("fProductPrice <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("fProductPrice >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fProductPrice >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("fProductPrice <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fProductPrice <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("fProductPrice in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("fProductPrice not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProductPrice between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProductPrice not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountIsNull() {
            addCriterion("fSubsidyAmount is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountIsNotNull() {
            addCriterion("fSubsidyAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountEqualTo(BigDecimal value) {
            addCriterion("fSubsidyAmount =", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountNotEqualTo(BigDecimal value) {
            addCriterion("fSubsidyAmount <>", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountGreaterThan(BigDecimal value) {
            addCriterion("fSubsidyAmount >", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fSubsidyAmount >=", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountLessThan(BigDecimal value) {
            addCriterion("fSubsidyAmount <", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fSubsidyAmount <=", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountIn(List<BigDecimal> values) {
            addCriterion("fSubsidyAmount in", values, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountNotIn(List<BigDecimal> values) {
            addCriterion("fSubsidyAmount not in", values, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fSubsidyAmount between", value1, value2, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fSubsidyAmount not between", value1, value2, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNull() {
            addCriterion("sProductInfo is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNotNull() {
            addCriterion("sProductInfo is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoEqualTo(String value) {
            addCriterion("sProductInfo =", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotEqualTo(String value) {
            addCriterion("sProductInfo <>", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThan(String value) {
            addCriterion("sProductInfo >", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThanOrEqualTo(String value) {
            addCriterion("sProductInfo >=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThan(String value) {
            addCriterion("sProductInfo <", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThanOrEqualTo(String value) {
            addCriterion("sProductInfo <=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLike(String value) {
            addCriterion("sProductInfo like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotLike(String value) {
            addCriterion("sProductInfo not like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoIn(List<String> values) {
            addCriterion("sProductInfo in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotIn(List<String> values) {
            addCriterion("sProductInfo not in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoBetween(String value1, String value2) {
            addCriterion("sProductInfo between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotBetween(String value1, String value2) {
            addCriterion("sProductInfo not between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceIsNull() {
            addCriterion("fProductOriginalPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceIsNotNull() {
            addCriterion("fProductOriginalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("fProductOriginalPrice =", value, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("fProductOriginalPrice <>", value, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("fProductOriginalPrice >", value, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fProductOriginalPrice >=", value, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceLessThan(BigDecimal value) {
            addCriterion("fProductOriginalPrice <", value, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fProductOriginalPrice <=", value, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("fProductOriginalPrice in", values, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("fProductOriginalPrice not in", values, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProductOriginalPrice between", value1, value2, "productOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fProductOriginalPrice not between", value1, value2, "productOriginalPrice");
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

        public Criteria andSalesTypeIsNull() {
            addCriterion("iSalesType is null");
            return (Criteria) this;
        }

        public Criteria andSalesTypeIsNotNull() {
            addCriterion("iSalesType is not null");
            return (Criteria) this;
        }

        public Criteria andSalesTypeEqualTo(Integer value) {
            addCriterion("iSalesType =", value, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeNotEqualTo(Integer value) {
            addCriterion("iSalesType <>", value, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeGreaterThan(Integer value) {
            addCriterion("iSalesType >", value, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSalesType >=", value, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeLessThan(Integer value) {
            addCriterion("iSalesType <", value, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iSalesType <=", value, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeIn(List<Integer> values) {
            addCriterion("iSalesType in", values, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeNotIn(List<Integer> values) {
            addCriterion("iSalesType not in", values, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeBetween(Integer value1, Integer value2) {
            addCriterion("iSalesType between", value1, value2, "salesType");
            return (Criteria) this;
        }

        public Criteria andSalesTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iSalesType not between", value1, value2, "salesType");
            return (Criteria) this;
        }

        public Criteria andFreightFreeIsNull() {
            addCriterion("bFreightFree is null");
            return (Criteria) this;
        }

        public Criteria andFreightFreeIsNotNull() {
            addCriterion("bFreightFree is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFreeEqualTo(Boolean value) {
            addCriterion("bFreightFree =", value, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeNotEqualTo(Boolean value) {
            addCriterion("bFreightFree <>", value, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeGreaterThan(Boolean value) {
            addCriterion("bFreightFree >", value, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bFreightFree >=", value, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeLessThan(Boolean value) {
            addCriterion("bFreightFree <", value, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("bFreightFree <=", value, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeIn(List<Boolean> values) {
            addCriterion("bFreightFree in", values, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeNotIn(List<Boolean> values) {
            addCriterion("bFreightFree not in", values, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("bFreightFree between", value1, value2, "freightFree");
            return (Criteria) this;
        }

        public Criteria andFreightFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bFreightFree not between", value1, value2, "freightFree");
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

        public Criteria andSupportRtnWithoutReasonIsNull() {
            addCriterion("bSupportRtnWithoutReason is null");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonIsNotNull() {
            addCriterion("bSupportRtnWithoutReason is not null");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonEqualTo(Boolean value) {
            addCriterion("bSupportRtnWithoutReason =", value, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonNotEqualTo(Boolean value) {
            addCriterion("bSupportRtnWithoutReason <>", value, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonGreaterThan(Boolean value) {
            addCriterion("bSupportRtnWithoutReason >", value, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bSupportRtnWithoutReason >=", value, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonLessThan(Boolean value) {
            addCriterion("bSupportRtnWithoutReason <", value, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonLessThanOrEqualTo(Boolean value) {
            addCriterion("bSupportRtnWithoutReason <=", value, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonIn(List<Boolean> values) {
            addCriterion("bSupportRtnWithoutReason in", values, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonNotIn(List<Boolean> values) {
            addCriterion("bSupportRtnWithoutReason not in", values, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonBetween(Boolean value1, Boolean value2) {
            addCriterion("bSupportRtnWithoutReason between", value1, value2, "supportRtnWithoutReason");
            return (Criteria) this;
        }

        public Criteria andSupportRtnWithoutReasonNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bSupportRtnWithoutReason not between", value1, value2, "supportRtnWithoutReason");
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