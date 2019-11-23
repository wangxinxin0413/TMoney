package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GooddetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GooddetailsExample() {
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

        public Criteria andGooddetailsidIsNull() {
            addCriterion("gooddetailsid is null");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidIsNotNull() {
            addCriterion("gooddetailsid is not null");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidEqualTo(Integer value) {
            addCriterion("gooddetailsid =", value, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidNotEqualTo(Integer value) {
            addCriterion("gooddetailsid <>", value, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidGreaterThan(Integer value) {
            addCriterion("gooddetailsid >", value, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gooddetailsid >=", value, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidLessThan(Integer value) {
            addCriterion("gooddetailsid <", value, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("gooddetailsid <=", value, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidIn(List<Integer> values) {
            addCriterion("gooddetailsid in", values, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidNotIn(List<Integer> values) {
            addCriterion("gooddetailsid not in", values, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidBetween(Integer value1, Integer value2) {
            addCriterion("gooddetailsid between", value1, value2, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGooddetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("gooddetailsid not between", value1, value2, "gooddetailsid");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridIsNull() {
            addCriterion("goodcolorid is null");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridIsNotNull() {
            addCriterion("goodcolorid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridEqualTo(Integer value) {
            addCriterion("goodcolorid =", value, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridNotEqualTo(Integer value) {
            addCriterion("goodcolorid <>", value, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridGreaterThan(Integer value) {
            addCriterion("goodcolorid >", value, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodcolorid >=", value, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridLessThan(Integer value) {
            addCriterion("goodcolorid <", value, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridLessThanOrEqualTo(Integer value) {
            addCriterion("goodcolorid <=", value, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridIn(List<Integer> values) {
            addCriterion("goodcolorid in", values, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridNotIn(List<Integer> values) {
            addCriterion("goodcolorid not in", values, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridBetween(Integer value1, Integer value2) {
            addCriterion("goodcolorid between", value1, value2, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodcoloridNotBetween(Integer value1, Integer value2) {
            addCriterion("goodcolorid not between", value1, value2, "goodcolorid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidIsNull() {
            addCriterion("goodsizeid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidIsNotNull() {
            addCriterion("goodsizeid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidEqualTo(Integer value) {
            addCriterion("goodsizeid =", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidNotEqualTo(Integer value) {
            addCriterion("goodsizeid <>", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidGreaterThan(Integer value) {
            addCriterion("goodsizeid >", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsizeid >=", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidLessThan(Integer value) {
            addCriterion("goodsizeid <", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsizeid <=", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidIn(List<Integer> values) {
            addCriterion("goodsizeid in", values, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidNotIn(List<Integer> values) {
            addCriterion("goodsizeid not in", values, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidBetween(Integer value1, Integer value2) {
            addCriterion("goodsizeid between", value1, value2, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsizeid not between", value1, value2, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaIsNull() {
            addCriterion("goodtiaoxinma is null");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaIsNotNull() {
            addCriterion("goodtiaoxinma is not null");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaEqualTo(String value) {
            addCriterion("goodtiaoxinma =", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaNotEqualTo(String value) {
            addCriterion("goodtiaoxinma <>", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaGreaterThan(String value) {
            addCriterion("goodtiaoxinma >", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaGreaterThanOrEqualTo(String value) {
            addCriterion("goodtiaoxinma >=", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaLessThan(String value) {
            addCriterion("goodtiaoxinma <", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaLessThanOrEqualTo(String value) {
            addCriterion("goodtiaoxinma <=", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaLike(String value) {
            addCriterion("goodtiaoxinma like", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaNotLike(String value) {
            addCriterion("goodtiaoxinma not like", value, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaIn(List<String> values) {
            addCriterion("goodtiaoxinma in", values, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaNotIn(List<String> values) {
            addCriterion("goodtiaoxinma not in", values, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaBetween(String value1, String value2) {
            addCriterion("goodtiaoxinma between", value1, value2, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGoodtiaoxinmaNotBetween(String value1, String value2) {
            addCriterion("goodtiaoxinma not between", value1, value2, "goodtiaoxinma");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountIsNull() {
            addCriterion("gooddetailscount is null");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountIsNotNull() {
            addCriterion("gooddetailscount is not null");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountEqualTo(Integer value) {
            addCriterion("gooddetailscount =", value, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountNotEqualTo(Integer value) {
            addCriterion("gooddetailscount <>", value, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountGreaterThan(Integer value) {
            addCriterion("gooddetailscount >", value, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gooddetailscount >=", value, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountLessThan(Integer value) {
            addCriterion("gooddetailscount <", value, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountLessThanOrEqualTo(Integer value) {
            addCriterion("gooddetailscount <=", value, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountIn(List<Integer> values) {
            addCriterion("gooddetailscount in", values, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountNotIn(List<Integer> values) {
            addCriterion("gooddetailscount not in", values, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountBetween(Integer value1, Integer value2) {
            addCriterion("gooddetailscount between", value1, value2, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andGooddetailscountNotBetween(Integer value1, Integer value2) {
            addCriterion("gooddetailscount not between", value1, value2, "gooddetailscount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
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