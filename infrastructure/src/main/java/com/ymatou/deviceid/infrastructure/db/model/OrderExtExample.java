package com.ymatou.deviceid.infrastructure.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExtExample() {
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

        public Criteria andOrderSourceIsNull() {
            addCriterion("sOrderSource is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("sOrderSource is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("sOrderSource =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("sOrderSource <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("sOrderSource >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("sOrderSource >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("sOrderSource <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("sOrderSource <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("sOrderSource like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("sOrderSource not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("sOrderSource in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("sOrderSource not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("sOrderSource between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("sOrderSource not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPIsNull() {
            addCriterion("sOrderSourceIP is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPIsNotNull() {
            addCriterion("sOrderSourceIP is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPEqualTo(String value) {
            addCriterion("sOrderSourceIP =", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPNotEqualTo(String value) {
            addCriterion("sOrderSourceIP <>", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPGreaterThan(String value) {
            addCriterion("sOrderSourceIP >", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPGreaterThanOrEqualTo(String value) {
            addCriterion("sOrderSourceIP >=", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPLessThan(String value) {
            addCriterion("sOrderSourceIP <", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPLessThanOrEqualTo(String value) {
            addCriterion("sOrderSourceIP <=", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPLike(String value) {
            addCriterion("sOrderSourceIP like", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPNotLike(String value) {
            addCriterion("sOrderSourceIP not like", value, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPIn(List<String> values) {
            addCriterion("sOrderSourceIP in", values, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPNotIn(List<String> values) {
            addCriterion("sOrderSourceIP not in", values, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPBetween(String value1, String value2) {
            addCriterion("sOrderSourceIP between", value1, value2, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIPNotBetween(String value1, String value2) {
            addCriterion("sOrderSourceIP not between", value1, value2, "orderSourceIP");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("iOrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("iOrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("iOrderType =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("iOrderType <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("iOrderType >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iOrderType >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("iOrderType <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("iOrderType <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("iOrderType in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("iOrderType not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("iOrderType between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iOrderType not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNull() {
            addCriterion("sTerminalSource is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNotNull() {
            addCriterion("sTerminalSource is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceEqualTo(String value) {
            addCriterion("sTerminalSource =", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotEqualTo(String value) {
            addCriterion("sTerminalSource <>", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThan(String value) {
            addCriterion("sTerminalSource >", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThanOrEqualTo(String value) {
            addCriterion("sTerminalSource >=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThan(String value) {
            addCriterion("sTerminalSource <", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThanOrEqualTo(String value) {
            addCriterion("sTerminalSource <=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLike(String value) {
            addCriterion("sTerminalSource like", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotLike(String value) {
            addCriterion("sTerminalSource not like", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIn(List<String> values) {
            addCriterion("sTerminalSource in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotIn(List<String> values) {
            addCriterion("sTerminalSource not in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceBetween(String value1, String value2) {
            addCriterion("sTerminalSource between", value1, value2, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotBetween(String value1, String value2) {
            addCriterion("sTerminalSource not between", value1, value2, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardIsNull() {
            addCriterion("bIsNeedUploadIdCard is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardIsNotNull() {
            addCriterion("bIsNeedUploadIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardEqualTo(Boolean value) {
            addCriterion("bIsNeedUploadIdCard =", value, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardNotEqualTo(Boolean value) {
            addCriterion("bIsNeedUploadIdCard <>", value, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardGreaterThan(Boolean value) {
            addCriterion("bIsNeedUploadIdCard >", value, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bIsNeedUploadIdCard >=", value, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardLessThan(Boolean value) {
            addCriterion("bIsNeedUploadIdCard <", value, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardLessThanOrEqualTo(Boolean value) {
            addCriterion("bIsNeedUploadIdCard <=", value, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardIn(List<Boolean> values) {
            addCriterion("bIsNeedUploadIdCard in", values, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardNotIn(List<Boolean> values) {
            addCriterion("bIsNeedUploadIdCard not in", values, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardBetween(Boolean value1, Boolean value2) {
            addCriterion("bIsNeedUploadIdCard between", value1, value2, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andIsNeedUploadIdCardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bIsNeedUploadIdCard not between", value1, value2, "isNeedUploadIdCard");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceIsNull() {
            addCriterion("sAppTerminalSource is null");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceIsNotNull() {
            addCriterion("sAppTerminalSource is not null");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceEqualTo(String value) {
            addCriterion("sAppTerminalSource =", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceNotEqualTo(String value) {
            addCriterion("sAppTerminalSource <>", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceGreaterThan(String value) {
            addCriterion("sAppTerminalSource >", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceGreaterThanOrEqualTo(String value) {
            addCriterion("sAppTerminalSource >=", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceLessThan(String value) {
            addCriterion("sAppTerminalSource <", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceLessThanOrEqualTo(String value) {
            addCriterion("sAppTerminalSource <=", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceLike(String value) {
            addCriterion("sAppTerminalSource like", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceNotLike(String value) {
            addCriterion("sAppTerminalSource not like", value, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceIn(List<String> values) {
            addCriterion("sAppTerminalSource in", values, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceNotIn(List<String> values) {
            addCriterion("sAppTerminalSource not in", values, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceBetween(String value1, String value2) {
            addCriterion("sAppTerminalSource between", value1, value2, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andAppTerminalSourceNotBetween(String value1, String value2) {
            addCriterion("sAppTerminalSource not between", value1, value2, "appTerminalSource");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("sDeviceId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("sDeviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("sDeviceId =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("sDeviceId <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("sDeviceId >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("sDeviceId >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("sDeviceId <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("sDeviceId <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("sDeviceId like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("sDeviceId not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("sDeviceId in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("sDeviceId not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("sDeviceId between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("sDeviceId not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardIsNull() {
            addCriterion("bHaveUploadedIdCard is null");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardIsNotNull() {
            addCriterion("bHaveUploadedIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardEqualTo(Boolean value) {
            addCriterion("bHaveUploadedIdCard =", value, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardNotEqualTo(Boolean value) {
            addCriterion("bHaveUploadedIdCard <>", value, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardGreaterThan(Boolean value) {
            addCriterion("bHaveUploadedIdCard >", value, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bHaveUploadedIdCard >=", value, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardLessThan(Boolean value) {
            addCriterion("bHaveUploadedIdCard <", value, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardLessThanOrEqualTo(Boolean value) {
            addCriterion("bHaveUploadedIdCard <=", value, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardIn(List<Boolean> values) {
            addCriterion("bHaveUploadedIdCard in", values, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardNotIn(List<Boolean> values) {
            addCriterion("bHaveUploadedIdCard not in", values, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardBetween(Boolean value1, Boolean value2) {
            addCriterion("bHaveUploadedIdCard between", value1, value2, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andHaveUploadedIdCardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bHaveUploadedIdCard not between", value1, value2, "haveUploadedIdCard");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaIsNull() {
            addCriterion("bDeliveredOfChina is null");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaIsNotNull() {
            addCriterion("bDeliveredOfChina is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaEqualTo(Boolean value) {
            addCriterion("bDeliveredOfChina =", value, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaNotEqualTo(Boolean value) {
            addCriterion("bDeliveredOfChina <>", value, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaGreaterThan(Boolean value) {
            addCriterion("bDeliveredOfChina >", value, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bDeliveredOfChina >=", value, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaLessThan(Boolean value) {
            addCriterion("bDeliveredOfChina <", value, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaLessThanOrEqualTo(Boolean value) {
            addCriterion("bDeliveredOfChina <=", value, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaIn(List<Boolean> values) {
            addCriterion("bDeliveredOfChina in", values, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaNotIn(List<Boolean> values) {
            addCriterion("bDeliveredOfChina not in", values, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaBetween(Boolean value1, Boolean value2) {
            addCriterion("bDeliveredOfChina between", value1, value2, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andDeliveredOfChinaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bDeliveredOfChina not between", value1, value2, "deliveredOfChina");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderIsNull() {
            addCriterion("bIsFirstOrder is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderIsNotNull() {
            addCriterion("bIsFirstOrder is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderEqualTo(Boolean value) {
            addCriterion("bIsFirstOrder =", value, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderNotEqualTo(Boolean value) {
            addCriterion("bIsFirstOrder <>", value, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderGreaterThan(Boolean value) {
            addCriterion("bIsFirstOrder >", value, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bIsFirstOrder >=", value, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderLessThan(Boolean value) {
            addCriterion("bIsFirstOrder <", value, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("bIsFirstOrder <=", value, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderIn(List<Boolean> values) {
            addCriterion("bIsFirstOrder in", values, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderNotIn(List<Boolean> values) {
            addCriterion("bIsFirstOrder not in", values, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("bIsFirstOrder between", value1, value2, "isFirstOrder");
            return (Criteria) this;
        }

        public Criteria andIsFirstOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bIsFirstOrder not between", value1, value2, "isFirstOrder");
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

        public Criteria andInterfaceVersionIsNull() {
            addCriterion("sInterfaceVersion is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionIsNotNull() {
            addCriterion("sInterfaceVersion is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionEqualTo(String value) {
            addCriterion("sInterfaceVersion =", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotEqualTo(String value) {
            addCriterion("sInterfaceVersion <>", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionGreaterThan(String value) {
            addCriterion("sInterfaceVersion >", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sInterfaceVersion >=", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionLessThan(String value) {
            addCriterion("sInterfaceVersion <", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionLessThanOrEqualTo(String value) {
            addCriterion("sInterfaceVersion <=", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionLike(String value) {
            addCriterion("sInterfaceVersion like", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotLike(String value) {
            addCriterion("sInterfaceVersion not like", value, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionIn(List<String> values) {
            addCriterion("sInterfaceVersion in", values, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotIn(List<String> values) {
            addCriterion("sInterfaceVersion not in", values, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionBetween(String value1, String value2) {
            addCriterion("sInterfaceVersion between", value1, value2, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andInterfaceVersionNotBetween(String value1, String value2) {
            addCriterion("sInterfaceVersion not between", value1, value2, "interfaceVersion");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("sEquipmentId is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("sEquipmentId is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(String value) {
            addCriterion("sEquipmentId =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(String value) {
            addCriterion("sEquipmentId <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(String value) {
            addCriterion("sEquipmentId >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("sEquipmentId >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(String value) {
            addCriterion("sEquipmentId <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("sEquipmentId <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLike(String value) {
            addCriterion("sEquipmentId like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotLike(String value) {
            addCriterion("sEquipmentId not like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<String> values) {
            addCriterion("sEquipmentId in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<String> values) {
            addCriterion("sEquipmentId not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(String value1, String value2) {
            addCriterion("sEquipmentId between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("sEquipmentId not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderIsNull() {
            addCriterion("bNewSellerOrder is null");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderIsNotNull() {
            addCriterion("bNewSellerOrder is not null");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderEqualTo(Boolean value) {
            addCriterion("bNewSellerOrder =", value, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderNotEqualTo(Boolean value) {
            addCriterion("bNewSellerOrder <>", value, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderGreaterThan(Boolean value) {
            addCriterion("bNewSellerOrder >", value, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bNewSellerOrder >=", value, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderLessThan(Boolean value) {
            addCriterion("bNewSellerOrder <", value, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("bNewSellerOrder <=", value, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderIn(List<Boolean> values) {
            addCriterion("bNewSellerOrder in", values, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderNotIn(List<Boolean> values) {
            addCriterion("bNewSellerOrder not in", values, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("bNewSellerOrder between", value1, value2, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewSellerOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bNewSellerOrder not between", value1, value2, "newSellerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderIsNull() {
            addCriterion("bNewCustomerOrder is null");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderIsNotNull() {
            addCriterion("bNewCustomerOrder is not null");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderEqualTo(Boolean value) {
            addCriterion("bNewCustomerOrder =", value, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderNotEqualTo(Boolean value) {
            addCriterion("bNewCustomerOrder <>", value, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderGreaterThan(Boolean value) {
            addCriterion("bNewCustomerOrder >", value, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bNewCustomerOrder >=", value, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderLessThan(Boolean value) {
            addCriterion("bNewCustomerOrder <", value, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("bNewCustomerOrder <=", value, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderIn(List<Boolean> values) {
            addCriterion("bNewCustomerOrder in", values, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderNotIn(List<Boolean> values) {
            addCriterion("bNewCustomerOrder not in", values, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("bNewCustomerOrder between", value1, value2, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andNewCustomerOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bNewCustomerOrder not between", value1, value2, "newCustomerOrder");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedIsNull() {
            addCriterion("bAutoAccepted is null");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedIsNotNull() {
            addCriterion("bAutoAccepted is not null");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedEqualTo(Boolean value) {
            addCriterion("bAutoAccepted =", value, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedNotEqualTo(Boolean value) {
            addCriterion("bAutoAccepted <>", value, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedGreaterThan(Boolean value) {
            addCriterion("bAutoAccepted >", value, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bAutoAccepted >=", value, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedLessThan(Boolean value) {
            addCriterion("bAutoAccepted <", value, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedLessThanOrEqualTo(Boolean value) {
            addCriterion("bAutoAccepted <=", value, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedIn(List<Boolean> values) {
            addCriterion("bAutoAccepted in", values, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedNotIn(List<Boolean> values) {
            addCriterion("bAutoAccepted not in", values, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedBetween(Boolean value1, Boolean value2) {
            addCriterion("bAutoAccepted between", value1, value2, "autoAccepted");
            return (Criteria) this;
        }

        public Criteria andAutoAcceptedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bAutoAccepted not between", value1, value2, "autoAccepted");
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