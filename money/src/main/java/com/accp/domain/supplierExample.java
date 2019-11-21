package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class supplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public supplierExample() {
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

        public Criteria andSupplieridIsNull() {
            addCriterion("Supplierid is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("Supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("Supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("Supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("Supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("Supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("Supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("Supplierid <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("Supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("Supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("Supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("Supplierid not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("Suppliername is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("Suppliername is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("Suppliername =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("Suppliername <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("Suppliername >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("Suppliername >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("Suppliername <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("Suppliername <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("Suppliername like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("Suppliername not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("Suppliername in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("Suppliername not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("Suppliername between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("Suppliername not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernaIsNull() {
            addCriterion("Supplierna is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernaIsNotNull() {
            addCriterion("Supplierna is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernaEqualTo(String value) {
            addCriterion("Supplierna =", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaNotEqualTo(String value) {
            addCriterion("Supplierna <>", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaGreaterThan(String value) {
            addCriterion("Supplierna >", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaGreaterThanOrEqualTo(String value) {
            addCriterion("Supplierna >=", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaLessThan(String value) {
            addCriterion("Supplierna <", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaLessThanOrEqualTo(String value) {
            addCriterion("Supplierna <=", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaLike(String value) {
            addCriterion("Supplierna like", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaNotLike(String value) {
            addCriterion("Supplierna not like", value, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaIn(List<String> values) {
            addCriterion("Supplierna in", values, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaNotIn(List<String> values) {
            addCriterion("Supplierna not in", values, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaBetween(String value1, String value2) {
            addCriterion("Supplierna between", value1, value2, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSuppliernaNotBetween(String value1, String value2) {
            addCriterion("Supplierna not between", value1, value2, "supplierna");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleIsNull() {
            addCriterion("Supplierpeople is null");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleIsNotNull() {
            addCriterion("Supplierpeople is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleEqualTo(String value) {
            addCriterion("Supplierpeople =", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleNotEqualTo(String value) {
            addCriterion("Supplierpeople <>", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleGreaterThan(String value) {
            addCriterion("Supplierpeople >", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("Supplierpeople >=", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleLessThan(String value) {
            addCriterion("Supplierpeople <", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleLessThanOrEqualTo(String value) {
            addCriterion("Supplierpeople <=", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleLike(String value) {
            addCriterion("Supplierpeople like", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleNotLike(String value) {
            addCriterion("Supplierpeople not like", value, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleIn(List<String> values) {
            addCriterion("Supplierpeople in", values, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleNotIn(List<String> values) {
            addCriterion("Supplierpeople not in", values, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleBetween(String value1, String value2) {
            addCriterion("Supplierpeople between", value1, value2, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSupplierpeopleNotBetween(String value1, String value2) {
            addCriterion("Supplierpeople not between", value1, value2, "supplierpeople");
            return (Criteria) this;
        }

        public Criteria andSuppliermailIsNull() {
            addCriterion("Suppliermail is null");
            return (Criteria) this;
        }

        public Criteria andSuppliermailIsNotNull() {
            addCriterion("Suppliermail is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliermailEqualTo(String value) {
            addCriterion("Suppliermail =", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotEqualTo(String value) {
            addCriterion("Suppliermail <>", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailGreaterThan(String value) {
            addCriterion("Suppliermail >", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailGreaterThanOrEqualTo(String value) {
            addCriterion("Suppliermail >=", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailLessThan(String value) {
            addCriterion("Suppliermail <", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailLessThanOrEqualTo(String value) {
            addCriterion("Suppliermail <=", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailLike(String value) {
            addCriterion("Suppliermail like", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotLike(String value) {
            addCriterion("Suppliermail not like", value, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailIn(List<String> values) {
            addCriterion("Suppliermail in", values, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotIn(List<String> values) {
            addCriterion("Suppliermail not in", values, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailBetween(String value1, String value2) {
            addCriterion("Suppliermail between", value1, value2, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSuppliermailNotBetween(String value1, String value2) {
            addCriterion("Suppliermail not between", value1, value2, "suppliermail");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNull() {
            addCriterion("Supplierphone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNotNull() {
            addCriterion("Supplierphone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneEqualTo(String value) {
            addCriterion("Supplierphone =", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotEqualTo(String value) {
            addCriterion("Supplierphone <>", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThan(String value) {
            addCriterion("Supplierphone >", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Supplierphone >=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThan(String value) {
            addCriterion("Supplierphone <", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThanOrEqualTo(String value) {
            addCriterion("Supplierphone <=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLike(String value) {
            addCriterion("Supplierphone like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotLike(String value) {
            addCriterion("Supplierphone not like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIn(List<String> values) {
            addCriterion("Supplierphone in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotIn(List<String> values) {
            addCriterion("Supplierphone not in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneBetween(String value1, String value2) {
            addCriterion("Supplierphone between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotBetween(String value1, String value2) {
            addCriterion("Supplierphone not between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSuppliershenIsNull() {
            addCriterion("Suppliershen is null");
            return (Criteria) this;
        }

        public Criteria andSuppliershenIsNotNull() {
            addCriterion("Suppliershen is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliershenEqualTo(String value) {
            addCriterion("Suppliershen =", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenNotEqualTo(String value) {
            addCriterion("Suppliershen <>", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenGreaterThan(String value) {
            addCriterion("Suppliershen >", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenGreaterThanOrEqualTo(String value) {
            addCriterion("Suppliershen >=", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenLessThan(String value) {
            addCriterion("Suppliershen <", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenLessThanOrEqualTo(String value) {
            addCriterion("Suppliershen <=", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenLike(String value) {
            addCriterion("Suppliershen like", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenNotLike(String value) {
            addCriterion("Suppliershen not like", value, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenIn(List<String> values) {
            addCriterion("Suppliershen in", values, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenNotIn(List<String> values) {
            addCriterion("Suppliershen not in", values, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenBetween(String value1, String value2) {
            addCriterion("Suppliershen between", value1, value2, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSuppliershenNotBetween(String value1, String value2) {
            addCriterion("Suppliershen not between", value1, value2, "suppliershen");
            return (Criteria) this;
        }

        public Criteria andSupplierquIsNull() {
            addCriterion("Supplierqu is null");
            return (Criteria) this;
        }

        public Criteria andSupplierquIsNotNull() {
            addCriterion("Supplierqu is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierquEqualTo(String value) {
            addCriterion("Supplierqu =", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquNotEqualTo(String value) {
            addCriterion("Supplierqu <>", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquGreaterThan(String value) {
            addCriterion("Supplierqu >", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquGreaterThanOrEqualTo(String value) {
            addCriterion("Supplierqu >=", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquLessThan(String value) {
            addCriterion("Supplierqu <", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquLessThanOrEqualTo(String value) {
            addCriterion("Supplierqu <=", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquLike(String value) {
            addCriterion("Supplierqu like", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquNotLike(String value) {
            addCriterion("Supplierqu not like", value, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquIn(List<String> values) {
            addCriterion("Supplierqu in", values, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquNotIn(List<String> values) {
            addCriterion("Supplierqu not in", values, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquBetween(String value1, String value2) {
            addCriterion("Supplierqu between", value1, value2, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierquNotBetween(String value1, String value2) {
            addCriterion("Supplierqu not between", value1, value2, "supplierqu");
            return (Criteria) this;
        }

        public Criteria andSupplierjdIsNull() {
            addCriterion("Supplierjd is null");
            return (Criteria) this;
        }

        public Criteria andSupplierjdIsNotNull() {
            addCriterion("Supplierjd is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierjdEqualTo(String value) {
            addCriterion("Supplierjd =", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdNotEqualTo(String value) {
            addCriterion("Supplierjd <>", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdGreaterThan(String value) {
            addCriterion("Supplierjd >", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdGreaterThanOrEqualTo(String value) {
            addCriterion("Supplierjd >=", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdLessThan(String value) {
            addCriterion("Supplierjd <", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdLessThanOrEqualTo(String value) {
            addCriterion("Supplierjd <=", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdLike(String value) {
            addCriterion("Supplierjd like", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdNotLike(String value) {
            addCriterion("Supplierjd not like", value, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdIn(List<String> values) {
            addCriterion("Supplierjd in", values, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdNotIn(List<String> values) {
            addCriterion("Supplierjd not in", values, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdBetween(String value1, String value2) {
            addCriterion("Supplierjd between", value1, value2, "supplierjd");
            return (Criteria) this;
        }

        public Criteria andSupplierjdNotBetween(String value1, String value2) {
            addCriterion("Supplierjd not between", value1, value2, "supplierjd");
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