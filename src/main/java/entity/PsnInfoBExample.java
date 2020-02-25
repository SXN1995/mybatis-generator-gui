package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PsnInfoBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PsnInfoBExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPsnNoIsNull() {
            addCriterion("psn_no is null");
            return (Criteria) this;
        }

        public Criteria andPsnNoIsNotNull() {
            addCriterion("psn_no is not null");
            return (Criteria) this;
        }

        public Criteria andPsnNoEqualTo(String value) {
            addCriterion("psn_no =", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoNotEqualTo(String value) {
            addCriterion("psn_no <>", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoGreaterThan(String value) {
            addCriterion("psn_no >", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoGreaterThanOrEqualTo(String value) {
            addCriterion("psn_no >=", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoLessThan(String value) {
            addCriterion("psn_no <", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoLessThanOrEqualTo(String value) {
            addCriterion("psn_no <=", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoLike(String value) {
            addCriterion("psn_no like", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoNotLike(String value) {
            addCriterion("psn_no not like", value, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoIn(List<String> values) {
            addCriterion("psn_no in", values, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoNotIn(List<String> values) {
            addCriterion("psn_no not in", values, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoBetween(String value1, String value2) {
            addCriterion("psn_no between", value1, value2, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnNoNotBetween(String value1, String value2) {
            addCriterion("psn_no not between", value1, value2, "psnNo");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeIsNull() {
            addCriterion("psn_mgtcode is null");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeIsNotNull() {
            addCriterion("psn_mgtcode is not null");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeEqualTo(String value) {
            addCriterion("psn_mgtcode =", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeNotEqualTo(String value) {
            addCriterion("psn_mgtcode <>", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeGreaterThan(String value) {
            addCriterion("psn_mgtcode >", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("psn_mgtcode >=", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeLessThan(String value) {
            addCriterion("psn_mgtcode <", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeLessThanOrEqualTo(String value) {
            addCriterion("psn_mgtcode <=", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeLike(String value) {
            addCriterion("psn_mgtcode like", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeNotLike(String value) {
            addCriterion("psn_mgtcode not like", value, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeIn(List<String> values) {
            addCriterion("psn_mgtcode in", values, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeNotIn(List<String> values) {
            addCriterion("psn_mgtcode not in", values, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeBetween(String value1, String value2) {
            addCriterion("psn_mgtcode between", value1, value2, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andPsnMgtcodeNotBetween(String value1, String value2) {
            addCriterion("psn_mgtcode not between", value1, value2, "psnMgtcode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAlisIsNull() {
            addCriterion("alis is null");
            return (Criteria) this;
        }

        public Criteria andAlisIsNotNull() {
            addCriterion("alis is not null");
            return (Criteria) this;
        }

        public Criteria andAlisEqualTo(String value) {
            addCriterion("alis =", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisNotEqualTo(String value) {
            addCriterion("alis <>", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisGreaterThan(String value) {
            addCriterion("alis >", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisGreaterThanOrEqualTo(String value) {
            addCriterion("alis >=", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisLessThan(String value) {
            addCriterion("alis <", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisLessThanOrEqualTo(String value) {
            addCriterion("alis <=", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisLike(String value) {
            addCriterion("alis like", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisNotLike(String value) {
            addCriterion("alis not like", value, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisIn(List<String> values) {
            addCriterion("alis in", values, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisNotIn(List<String> values) {
            addCriterion("alis not in", values, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisBetween(String value1, String value2) {
            addCriterion("alis between", value1, value2, "alis");
            return (Criteria) this;
        }

        public Criteria andAlisNotBetween(String value1, String value2) {
            addCriterion("alis not between", value1, value2, "alis");
            return (Criteria) this;
        }

        public Criteria andGendIsNull() {
            addCriterion("gend is null");
            return (Criteria) this;
        }

        public Criteria andGendIsNotNull() {
            addCriterion("gend is not null");
            return (Criteria) this;
        }

        public Criteria andGendEqualTo(String value) {
            addCriterion("gend =", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendNotEqualTo(String value) {
            addCriterion("gend <>", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendGreaterThan(String value) {
            addCriterion("gend >", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendGreaterThanOrEqualTo(String value) {
            addCriterion("gend >=", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendLessThan(String value) {
            addCriterion("gend <", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendLessThanOrEqualTo(String value) {
            addCriterion("gend <=", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendLike(String value) {
            addCriterion("gend like", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendNotLike(String value) {
            addCriterion("gend not like", value, "gend");
            return (Criteria) this;
        }

        public Criteria andGendIn(List<String> values) {
            addCriterion("gend in", values, "gend");
            return (Criteria) this;
        }

        public Criteria andGendNotIn(List<String> values) {
            addCriterion("gend not in", values, "gend");
            return (Criteria) this;
        }

        public Criteria andGendBetween(String value1, String value2) {
            addCriterion("gend between", value1, value2, "gend");
            return (Criteria) this;
        }

        public Criteria andGendNotBetween(String value1, String value2) {
            addCriterion("gend not between", value1, value2, "gend");
            return (Criteria) this;
        }

        public Criteria andBrdyIsNull() {
            addCriterion("brdy is null");
            return (Criteria) this;
        }

        public Criteria andBrdyIsNotNull() {
            addCriterion("brdy is not null");
            return (Criteria) this;
        }

        public Criteria andBrdyEqualTo(Date value) {
            addCriterionForJDBCDate("brdy =", value, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyNotEqualTo(Date value) {
            addCriterionForJDBCDate("brdy <>", value, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyGreaterThan(Date value) {
            addCriterionForJDBCDate("brdy >", value, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("brdy >=", value, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyLessThan(Date value) {
            addCriterionForJDBCDate("brdy <", value, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("brdy <=", value, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyIn(List<Date> values) {
            addCriterionForJDBCDate("brdy in", values, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyNotIn(List<Date> values) {
            addCriterionForJDBCDate("brdy not in", values, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("brdy between", value1, value2, "brdy");
            return (Criteria) this;
        }

        public Criteria andBrdyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("brdy not between", value1, value2, "brdy");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgIsNull() {
            addCriterion("hsecfc_codg is null");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgIsNotNull() {
            addCriterion("hsecfc_codg is not null");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgEqualTo(String value) {
            addCriterion("hsecfc_codg =", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgNotEqualTo(String value) {
            addCriterion("hsecfc_codg <>", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgGreaterThan(String value) {
            addCriterion("hsecfc_codg >", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgGreaterThanOrEqualTo(String value) {
            addCriterion("hsecfc_codg >=", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgLessThan(String value) {
            addCriterion("hsecfc_codg <", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgLessThanOrEqualTo(String value) {
            addCriterion("hsecfc_codg <=", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgLike(String value) {
            addCriterion("hsecfc_codg like", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgNotLike(String value) {
            addCriterion("hsecfc_codg not like", value, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgIn(List<String> values) {
            addCriterion("hsecfc_codg in", values, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgNotIn(List<String> values) {
            addCriterion("hsecfc_codg not in", values, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgBetween(String value1, String value2) {
            addCriterion("hsecfc_codg between", value1, value2, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andHsecfcCodgNotBetween(String value1, String value2) {
            addCriterion("hsecfc_codg not between", value1, value2, "hsecfcCodg");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMobIsNull() {
            addCriterion("mob is null");
            return (Criteria) this;
        }

        public Criteria andMobIsNotNull() {
            addCriterion("mob is not null");
            return (Criteria) this;
        }

        public Criteria andMobEqualTo(String value) {
            addCriterion("mob =", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotEqualTo(String value) {
            addCriterion("mob <>", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobGreaterThan(String value) {
            addCriterion("mob >", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobGreaterThanOrEqualTo(String value) {
            addCriterion("mob >=", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobLessThan(String value) {
            addCriterion("mob <", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobLessThanOrEqualTo(String value) {
            addCriterion("mob <=", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobLike(String value) {
            addCriterion("mob like", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotLike(String value) {
            addCriterion("mob not like", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobIn(List<String> values) {
            addCriterion("mob in", values, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotIn(List<String> values) {
            addCriterion("mob not in", values, "mob");
            return (Criteria) this;
        }

        public Criteria andMobBetween(String value1, String value2) {
            addCriterion("mob between", value1, value2, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotBetween(String value1, String value2) {
            addCriterion("mob not between", value1, value2, "mob");
            return (Criteria) this;
        }

        public Criteria andNatyIsNull() {
            addCriterion("naty is null");
            return (Criteria) this;
        }

        public Criteria andNatyIsNotNull() {
            addCriterion("naty is not null");
            return (Criteria) this;
        }

        public Criteria andNatyEqualTo(String value) {
            addCriterion("naty =", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyNotEqualTo(String value) {
            addCriterion("naty <>", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyGreaterThan(String value) {
            addCriterion("naty >", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyGreaterThanOrEqualTo(String value) {
            addCriterion("naty >=", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyLessThan(String value) {
            addCriterion("naty <", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyLessThanOrEqualTo(String value) {
            addCriterion("naty <=", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyLike(String value) {
            addCriterion("naty like", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyNotLike(String value) {
            addCriterion("naty not like", value, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyIn(List<String> values) {
            addCriterion("naty in", values, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyNotIn(List<String> values) {
            addCriterion("naty not in", values, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyBetween(String value1, String value2) {
            addCriterion("naty between", value1, value2, "naty");
            return (Criteria) this;
        }

        public Criteria andNatyNotBetween(String value1, String value2) {
            addCriterion("naty not between", value1, value2, "naty");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeIsNull() {
            addCriterion("nat_regn_code is null");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeIsNotNull() {
            addCriterion("nat_regn_code is not null");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeEqualTo(String value) {
            addCriterion("nat_regn_code =", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeNotEqualTo(String value) {
            addCriterion("nat_regn_code <>", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeGreaterThan(String value) {
            addCriterion("nat_regn_code >", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nat_regn_code >=", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeLessThan(String value) {
            addCriterion("nat_regn_code <", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeLessThanOrEqualTo(String value) {
            addCriterion("nat_regn_code <=", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeLike(String value) {
            addCriterion("nat_regn_code like", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeNotLike(String value) {
            addCriterion("nat_regn_code not like", value, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeIn(List<String> values) {
            addCriterion("nat_regn_code in", values, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeNotIn(List<String> values) {
            addCriterion("nat_regn_code not in", values, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeBetween(String value1, String value2) {
            addCriterion("nat_regn_code between", value1, value2, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andNatRegnCodeNotBetween(String value1, String value2) {
            addCriterion("nat_regn_code not between", value1, value2, "natRegnCode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPolstasIsNull() {
            addCriterion("polstas is null");
            return (Criteria) this;
        }

        public Criteria andPolstasIsNotNull() {
            addCriterion("polstas is not null");
            return (Criteria) this;
        }

        public Criteria andPolstasEqualTo(String value) {
            addCriterion("polstas =", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasNotEqualTo(String value) {
            addCriterion("polstas <>", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasGreaterThan(String value) {
            addCriterion("polstas >", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasGreaterThanOrEqualTo(String value) {
            addCriterion("polstas >=", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasLessThan(String value) {
            addCriterion("polstas <", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasLessThanOrEqualTo(String value) {
            addCriterion("polstas <=", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasLike(String value) {
            addCriterion("polstas like", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasNotLike(String value) {
            addCriterion("polstas not like", value, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasIn(List<String> values) {
            addCriterion("polstas in", values, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasNotIn(List<String> values) {
            addCriterion("polstas not in", values, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasBetween(String value1, String value2) {
            addCriterion("polstas between", value1, value2, "polstas");
            return (Criteria) this;
        }

        public Criteria andPolstasNotBetween(String value1, String value2) {
            addCriterion("polstas not between", value1, value2, "polstas");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateIsNull() {
            addCriterion("patc_job_date is null");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateIsNotNull() {
            addCriterion("patc_job_date is not null");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateEqualTo(Date value) {
            addCriterionForJDBCDate("patc_job_date =", value, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("patc_job_date <>", value, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateGreaterThan(Date value) {
            addCriterionForJDBCDate("patc_job_date >", value, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patc_job_date >=", value, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateLessThan(Date value) {
            addCriterionForJDBCDate("patc_job_date <", value, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patc_job_date <=", value, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateIn(List<Date> values) {
            addCriterionForJDBCDate("patc_job_date in", values, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("patc_job_date not in", values, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patc_job_date between", value1, value2, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andPatcJobDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patc_job_date not between", value1, value2, "patcJobDate");
            return (Criteria) this;
        }

        public Criteria andResdNatIsNull() {
            addCriterion("resd_nat is null");
            return (Criteria) this;
        }

        public Criteria andResdNatIsNotNull() {
            addCriterion("resd_nat is not null");
            return (Criteria) this;
        }

        public Criteria andResdNatEqualTo(String value) {
            addCriterion("resd_nat =", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatNotEqualTo(String value) {
            addCriterion("resd_nat <>", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatGreaterThan(String value) {
            addCriterion("resd_nat >", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatGreaterThanOrEqualTo(String value) {
            addCriterion("resd_nat >=", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatLessThan(String value) {
            addCriterion("resd_nat <", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatLessThanOrEqualTo(String value) {
            addCriterion("resd_nat <=", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatLike(String value) {
            addCriterion("resd_nat like", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatNotLike(String value) {
            addCriterion("resd_nat not like", value, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatIn(List<String> values) {
            addCriterion("resd_nat in", values, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatNotIn(List<String> values) {
            addCriterion("resd_nat not in", values, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatBetween(String value1, String value2) {
            addCriterion("resd_nat between", value1, value2, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdNatNotBetween(String value1, String value2) {
            addCriterion("resd_nat not between", value1, value2, "resdNat");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsIsNull() {
            addCriterion("resd_loc_admdvs is null");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsIsNotNull() {
            addCriterion("resd_loc_admdvs is not null");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsEqualTo(String value) {
            addCriterion("resd_loc_admdvs =", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsNotEqualTo(String value) {
            addCriterion("resd_loc_admdvs <>", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsGreaterThan(String value) {
            addCriterion("resd_loc_admdvs >", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsGreaterThanOrEqualTo(String value) {
            addCriterion("resd_loc_admdvs >=", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsLessThan(String value) {
            addCriterion("resd_loc_admdvs <", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsLessThanOrEqualTo(String value) {
            addCriterion("resd_loc_admdvs <=", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsLike(String value) {
            addCriterion("resd_loc_admdvs like", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsNotLike(String value) {
            addCriterion("resd_loc_admdvs not like", value, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsIn(List<String> values) {
            addCriterion("resd_loc_admdvs in", values, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsNotIn(List<String> values) {
            addCriterion("resd_loc_admdvs not in", values, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsBetween(String value1, String value2) {
            addCriterion("resd_loc_admdvs between", value1, value2, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdLocAdmdvsNotBetween(String value1, String value2) {
            addCriterion("resd_loc_admdvs not between", value1, value2, "resdLocAdmdvs");
            return (Criteria) this;
        }

        public Criteria andResdAddrIsNull() {
            addCriterion("resd_addr is null");
            return (Criteria) this;
        }

        public Criteria andResdAddrIsNotNull() {
            addCriterion("resd_addr is not null");
            return (Criteria) this;
        }

        public Criteria andResdAddrEqualTo(String value) {
            addCriterion("resd_addr =", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrNotEqualTo(String value) {
            addCriterion("resd_addr <>", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrGreaterThan(String value) {
            addCriterion("resd_addr >", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrGreaterThanOrEqualTo(String value) {
            addCriterion("resd_addr >=", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrLessThan(String value) {
            addCriterion("resd_addr <", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrLessThanOrEqualTo(String value) {
            addCriterion("resd_addr <=", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrLike(String value) {
            addCriterion("resd_addr like", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrNotLike(String value) {
            addCriterion("resd_addr not like", value, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrIn(List<String> values) {
            addCriterion("resd_addr in", values, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrNotIn(List<String> values) {
            addCriterion("resd_addr not in", values, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrBetween(String value1, String value2) {
            addCriterion("resd_addr between", value1, value2, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrNotBetween(String value1, String value2) {
            addCriterion("resd_addr not between", value1, value2, "resdAddr");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeIsNull() {
            addCriterion("resd_addr_poscode is null");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeIsNotNull() {
            addCriterion("resd_addr_poscode is not null");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeEqualTo(String value) {
            addCriterion("resd_addr_poscode =", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeNotEqualTo(String value) {
            addCriterion("resd_addr_poscode <>", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeGreaterThan(String value) {
            addCriterion("resd_addr_poscode >", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeGreaterThanOrEqualTo(String value) {
            addCriterion("resd_addr_poscode >=", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeLessThan(String value) {
            addCriterion("resd_addr_poscode <", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeLessThanOrEqualTo(String value) {
            addCriterion("resd_addr_poscode <=", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeLike(String value) {
            addCriterion("resd_addr_poscode like", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeNotLike(String value) {
            addCriterion("resd_addr_poscode not like", value, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeIn(List<String> values) {
            addCriterion("resd_addr_poscode in", values, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeNotIn(List<String> values) {
            addCriterion("resd_addr_poscode not in", values, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeBetween(String value1, String value2) {
            addCriterion("resd_addr_poscode between", value1, value2, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdAddrPoscodeNotBetween(String value1, String value2) {
            addCriterion("resd_addr_poscode not between", value1, value2, "resdAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsIsNull() {
            addCriterion("live_admdvs is null");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsIsNotNull() {
            addCriterion("live_admdvs is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsEqualTo(String value) {
            addCriterion("live_admdvs =", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsNotEqualTo(String value) {
            addCriterion("live_admdvs <>", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsGreaterThan(String value) {
            addCriterion("live_admdvs >", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsGreaterThanOrEqualTo(String value) {
            addCriterion("live_admdvs >=", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsLessThan(String value) {
            addCriterion("live_admdvs <", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsLessThanOrEqualTo(String value) {
            addCriterion("live_admdvs <=", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsLike(String value) {
            addCriterion("live_admdvs like", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsNotLike(String value) {
            addCriterion("live_admdvs not like", value, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsIn(List<String> values) {
            addCriterion("live_admdvs in", values, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsNotIn(List<String> values) {
            addCriterion("live_admdvs not in", values, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsBetween(String value1, String value2) {
            addCriterion("live_admdvs between", value1, value2, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAdmdvsNotBetween(String value1, String value2) {
            addCriterion("live_admdvs not between", value1, value2, "liveAdmdvs");
            return (Criteria) this;
        }

        public Criteria andLiveAddrIsNull() {
            addCriterion("live_addr is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddrIsNotNull() {
            addCriterion("live_addr is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddrEqualTo(String value) {
            addCriterion("live_addr =", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotEqualTo(String value) {
            addCriterion("live_addr <>", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrGreaterThan(String value) {
            addCriterion("live_addr >", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("live_addr >=", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrLessThan(String value) {
            addCriterion("live_addr <", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrLessThanOrEqualTo(String value) {
            addCriterion("live_addr <=", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrLike(String value) {
            addCriterion("live_addr like", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotLike(String value) {
            addCriterion("live_addr not like", value, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrIn(List<String> values) {
            addCriterion("live_addr in", values, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotIn(List<String> values) {
            addCriterion("live_addr not in", values, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrBetween(String value1, String value2) {
            addCriterion("live_addr between", value1, value2, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrNotBetween(String value1, String value2) {
            addCriterion("live_addr not between", value1, value2, "liveAddr");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeIsNull() {
            addCriterion("live_addr_poscode is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeIsNotNull() {
            addCriterion("live_addr_poscode is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeEqualTo(String value) {
            addCriterion("live_addr_poscode =", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeNotEqualTo(String value) {
            addCriterion("live_addr_poscode <>", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeGreaterThan(String value) {
            addCriterion("live_addr_poscode >", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeGreaterThanOrEqualTo(String value) {
            addCriterion("live_addr_poscode >=", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeLessThan(String value) {
            addCriterion("live_addr_poscode <", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeLessThanOrEqualTo(String value) {
            addCriterion("live_addr_poscode <=", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeLike(String value) {
            addCriterion("live_addr_poscode like", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeNotLike(String value) {
            addCriterion("live_addr_poscode not like", value, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeIn(List<String> values) {
            addCriterion("live_addr_poscode in", values, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeNotIn(List<String> values) {
            addCriterion("live_addr_poscode not in", values, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeBetween(String value1, String value2) {
            addCriterion("live_addr_poscode between", value1, value2, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andLiveAddrPoscodeNotBetween(String value1, String value2) {
            addCriterion("live_addr_poscode not between", value1, value2, "liveAddrPoscode");
            return (Criteria) this;
        }

        public Criteria andResdbookNoIsNull() {
            addCriterion("resdbook_no is null");
            return (Criteria) this;
        }

        public Criteria andResdbookNoIsNotNull() {
            addCriterion("resdbook_no is not null");
            return (Criteria) this;
        }

        public Criteria andResdbookNoEqualTo(String value) {
            addCriterion("resdbook_no =", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoNotEqualTo(String value) {
            addCriterion("resdbook_no <>", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoGreaterThan(String value) {
            addCriterion("resdbook_no >", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoGreaterThanOrEqualTo(String value) {
            addCriterion("resdbook_no >=", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoLessThan(String value) {
            addCriterion("resdbook_no <", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoLessThanOrEqualTo(String value) {
            addCriterion("resdbook_no <=", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoLike(String value) {
            addCriterion("resdbook_no like", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoNotLike(String value) {
            addCriterion("resdbook_no not like", value, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoIn(List<String> values) {
            addCriterion("resdbook_no in", values, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoNotIn(List<String> values) {
            addCriterion("resdbook_no not in", values, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoBetween(String value1, String value2) {
            addCriterion("resdbook_no between", value1, value2, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andResdbookNoNotBetween(String value1, String value2) {
            addCriterion("resdbook_no not between", value1, value2, "resdbookNo");
            return (Criteria) this;
        }

        public Criteria andMrgStasIsNull() {
            addCriterion("mrg_stas is null");
            return (Criteria) this;
        }

        public Criteria andMrgStasIsNotNull() {
            addCriterion("mrg_stas is not null");
            return (Criteria) this;
        }

        public Criteria andMrgStasEqualTo(String value) {
            addCriterion("mrg_stas =", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasNotEqualTo(String value) {
            addCriterion("mrg_stas <>", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasGreaterThan(String value) {
            addCriterion("mrg_stas >", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasGreaterThanOrEqualTo(String value) {
            addCriterion("mrg_stas >=", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasLessThan(String value) {
            addCriterion("mrg_stas <", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasLessThanOrEqualTo(String value) {
            addCriterion("mrg_stas <=", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasLike(String value) {
            addCriterion("mrg_stas like", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasNotLike(String value) {
            addCriterion("mrg_stas not like", value, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasIn(List<String> values) {
            addCriterion("mrg_stas in", values, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasNotIn(List<String> values) {
            addCriterion("mrg_stas not in", values, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasBetween(String value1, String value2) {
            addCriterion("mrg_stas between", value1, value2, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andMrgStasNotBetween(String value1, String value2) {
            addCriterion("mrg_stas not between", value1, value2, "mrgStas");
            return (Criteria) this;
        }

        public Criteria andHlconIsNull() {
            addCriterion("hlcon is null");
            return (Criteria) this;
        }

        public Criteria andHlconIsNotNull() {
            addCriterion("hlcon is not null");
            return (Criteria) this;
        }

        public Criteria andHlconEqualTo(String value) {
            addCriterion("hlcon =", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconNotEqualTo(String value) {
            addCriterion("hlcon <>", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconGreaterThan(String value) {
            addCriterion("hlcon >", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconGreaterThanOrEqualTo(String value) {
            addCriterion("hlcon >=", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconLessThan(String value) {
            addCriterion("hlcon <", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconLessThanOrEqualTo(String value) {
            addCriterion("hlcon <=", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconLike(String value) {
            addCriterion("hlcon like", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconNotLike(String value) {
            addCriterion("hlcon not like", value, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconIn(List<String> values) {
            addCriterion("hlcon in", values, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconNotIn(List<String> values) {
            addCriterion("hlcon not in", values, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconBetween(String value1, String value2) {
            addCriterion("hlcon between", value1, value2, "hlcon");
            return (Criteria) this;
        }

        public Criteria andHlconNotBetween(String value1, String value2) {
            addCriterion("hlcon not between", value1, value2, "hlcon");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andSurvStasIsNull() {
            addCriterion("surv_stas is null");
            return (Criteria) this;
        }

        public Criteria andSurvStasIsNotNull() {
            addCriterion("surv_stas is not null");
            return (Criteria) this;
        }

        public Criteria andSurvStasEqualTo(String value) {
            addCriterion("surv_stas =", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasNotEqualTo(String value) {
            addCriterion("surv_stas <>", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasGreaterThan(String value) {
            addCriterion("surv_stas >", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasGreaterThanOrEqualTo(String value) {
            addCriterion("surv_stas >=", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasLessThan(String value) {
            addCriterion("surv_stas <", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasLessThanOrEqualTo(String value) {
            addCriterion("surv_stas <=", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasLike(String value) {
            addCriterion("surv_stas like", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasNotLike(String value) {
            addCriterion("surv_stas not like", value, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasIn(List<String> values) {
            addCriterion("surv_stas in", values, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasNotIn(List<String> values) {
            addCriterion("surv_stas not in", values, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasBetween(String value1, String value2) {
            addCriterion("surv_stas between", value1, value2, "survStas");
            return (Criteria) this;
        }

        public Criteria andSurvStasNotBetween(String value1, String value2) {
            addCriterion("surv_stas not between", value1, value2, "survStas");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagIsNull() {
            addCriterion("mul_prov_mnt_flag is null");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagIsNotNull() {
            addCriterion("mul_prov_mnt_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagEqualTo(String value) {
            addCriterion("mul_prov_mnt_flag =", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagNotEqualTo(String value) {
            addCriterion("mul_prov_mnt_flag <>", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagGreaterThan(String value) {
            addCriterion("mul_prov_mnt_flag >", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagGreaterThanOrEqualTo(String value) {
            addCriterion("mul_prov_mnt_flag >=", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagLessThan(String value) {
            addCriterion("mul_prov_mnt_flag <", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagLessThanOrEqualTo(String value) {
            addCriterion("mul_prov_mnt_flag <=", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagLike(String value) {
            addCriterion("mul_prov_mnt_flag like", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagNotLike(String value) {
            addCriterion("mul_prov_mnt_flag not like", value, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagIn(List<String> values) {
            addCriterion("mul_prov_mnt_flag in", values, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagNotIn(List<String> values) {
            addCriterion("mul_prov_mnt_flag not in", values, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagBetween(String value1, String value2) {
            addCriterion("mul_prov_mnt_flag between", value1, value2, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andMulProvMntFlagNotBetween(String value1, String value2) {
            addCriterion("mul_prov_mnt_flag not between", value1, value2, "mulProvMntFlag");
            return (Criteria) this;
        }

        public Criteria andAdmdutIsNull() {
            addCriterion("admdut is null");
            return (Criteria) this;
        }

        public Criteria andAdmdutIsNotNull() {
            addCriterion("admdut is not null");
            return (Criteria) this;
        }

        public Criteria andAdmdutEqualTo(String value) {
            addCriterion("admdut =", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutNotEqualTo(String value) {
            addCriterion("admdut <>", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutGreaterThan(String value) {
            addCriterion("admdut >", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutGreaterThanOrEqualTo(String value) {
            addCriterion("admdut >=", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutLessThan(String value) {
            addCriterion("admdut <", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutLessThanOrEqualTo(String value) {
            addCriterion("admdut <=", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutLike(String value) {
            addCriterion("admdut like", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutNotLike(String value) {
            addCriterion("admdut not like", value, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutIn(List<String> values) {
            addCriterion("admdut in", values, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutNotIn(List<String> values) {
            addCriterion("admdut not in", values, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutBetween(String value1, String value2) {
            addCriterion("admdut between", value1, value2, "admdut");
            return (Criteria) this;
        }

        public Criteria andAdmdutNotBetween(String value1, String value2) {
            addCriterion("admdut not between", value1, value2, "admdut");
            return (Criteria) this;
        }

        public Criteria andEmpStasIsNull() {
            addCriterion("emp_stas is null");
            return (Criteria) this;
        }

        public Criteria andEmpStasIsNotNull() {
            addCriterion("emp_stas is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStasEqualTo(String value) {
            addCriterion("emp_stas =", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasNotEqualTo(String value) {
            addCriterion("emp_stas <>", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasGreaterThan(String value) {
            addCriterion("emp_stas >", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasGreaterThanOrEqualTo(String value) {
            addCriterion("emp_stas >=", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasLessThan(String value) {
            addCriterion("emp_stas <", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasLessThanOrEqualTo(String value) {
            addCriterion("emp_stas <=", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasLike(String value) {
            addCriterion("emp_stas like", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasNotLike(String value) {
            addCriterion("emp_stas not like", value, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasIn(List<String> values) {
            addCriterion("emp_stas in", values, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasNotIn(List<String> values) {
            addCriterion("emp_stas not in", values, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasBetween(String value1, String value2) {
            addCriterion("emp_stas between", value1, value2, "empStas");
            return (Criteria) this;
        }

        public Criteria andEmpStasNotBetween(String value1, String value2) {
            addCriterion("emp_stas not between", value1, value2, "empStas");
            return (Criteria) this;
        }

        public Criteria andRetrTypeIsNull() {
            addCriterion("retr_type is null");
            return (Criteria) this;
        }

        public Criteria andRetrTypeIsNotNull() {
            addCriterion("retr_type is not null");
            return (Criteria) this;
        }

        public Criteria andRetrTypeEqualTo(String value) {
            addCriterion("retr_type =", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeNotEqualTo(String value) {
            addCriterion("retr_type <>", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeGreaterThan(String value) {
            addCriterion("retr_type >", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("retr_type >=", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeLessThan(String value) {
            addCriterion("retr_type <", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeLessThanOrEqualTo(String value) {
            addCriterion("retr_type <=", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeLike(String value) {
            addCriterion("retr_type like", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeNotLike(String value) {
            addCriterion("retr_type not like", value, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeIn(List<String> values) {
            addCriterion("retr_type in", values, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeNotIn(List<String> values) {
            addCriterion("retr_type not in", values, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeBetween(String value1, String value2) {
            addCriterion("retr_type between", value1, value2, "retrType");
            return (Criteria) this;
        }

        public Criteria andRetrTypeNotBetween(String value1, String value2) {
            addCriterion("retr_type not between", value1, value2, "retrType");
            return (Criteria) this;
        }

        public Criteria andGradSchlIsNull() {
            addCriterion("grad_schl is null");
            return (Criteria) this;
        }

        public Criteria andGradSchlIsNotNull() {
            addCriterion("grad_schl is not null");
            return (Criteria) this;
        }

        public Criteria andGradSchlEqualTo(String value) {
            addCriterion("grad_schl =", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlNotEqualTo(String value) {
            addCriterion("grad_schl <>", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlGreaterThan(String value) {
            addCriterion("grad_schl >", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlGreaterThanOrEqualTo(String value) {
            addCriterion("grad_schl >=", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlLessThan(String value) {
            addCriterion("grad_schl <", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlLessThanOrEqualTo(String value) {
            addCriterion("grad_schl <=", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlLike(String value) {
            addCriterion("grad_schl like", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlNotLike(String value) {
            addCriterion("grad_schl not like", value, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlIn(List<String> values) {
            addCriterion("grad_schl in", values, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlNotIn(List<String> values) {
            addCriterion("grad_schl not in", values, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlBetween(String value1, String value2) {
            addCriterion("grad_schl between", value1, value2, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andGradSchlNotBetween(String value1, String value2) {
            addCriterion("grad_schl not between", value1, value2, "gradSchl");
            return (Criteria) this;
        }

        public Criteria andEducIsNull() {
            addCriterion("educ is null");
            return (Criteria) this;
        }

        public Criteria andEducIsNotNull() {
            addCriterion("educ is not null");
            return (Criteria) this;
        }

        public Criteria andEducEqualTo(String value) {
            addCriterion("educ =", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducNotEqualTo(String value) {
            addCriterion("educ <>", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducGreaterThan(String value) {
            addCriterion("educ >", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducGreaterThanOrEqualTo(String value) {
            addCriterion("educ >=", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducLessThan(String value) {
            addCriterion("educ <", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducLessThanOrEqualTo(String value) {
            addCriterion("educ <=", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducLike(String value) {
            addCriterion("educ like", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducNotLike(String value) {
            addCriterion("educ not like", value, "educ");
            return (Criteria) this;
        }

        public Criteria andEducIn(List<String> values) {
            addCriterion("educ in", values, "educ");
            return (Criteria) this;
        }

        public Criteria andEducNotIn(List<String> values) {
            addCriterion("educ not in", values, "educ");
            return (Criteria) this;
        }

        public Criteria andEducBetween(String value1, String value2) {
            addCriterion("educ between", value1, value2, "educ");
            return (Criteria) this;
        }

        public Criteria andEducNotBetween(String value1, String value2) {
            addCriterion("educ not between", value1, value2, "educ");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvIsNull() {
            addCriterion("pro_tech_duty_lv is null");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvIsNotNull() {
            addCriterion("pro_tech_duty_lv is not null");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvEqualTo(String value) {
            addCriterion("pro_tech_duty_lv =", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvNotEqualTo(String value) {
            addCriterion("pro_tech_duty_lv <>", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvGreaterThan(String value) {
            addCriterion("pro_tech_duty_lv >", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvGreaterThanOrEqualTo(String value) {
            addCriterion("pro_tech_duty_lv >=", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvLessThan(String value) {
            addCriterion("pro_tech_duty_lv <", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvLessThanOrEqualTo(String value) {
            addCriterion("pro_tech_duty_lv <=", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvLike(String value) {
            addCriterion("pro_tech_duty_lv like", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvNotLike(String value) {
            addCriterion("pro_tech_duty_lv not like", value, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvIn(List<String> values) {
            addCriterion("pro_tech_duty_lv in", values, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvNotIn(List<String> values) {
            addCriterion("pro_tech_duty_lv not in", values, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvBetween(String value1, String value2) {
            addCriterion("pro_tech_duty_lv between", value1, value2, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andProTechDutyLvNotBetween(String value1, String value2) {
            addCriterion("pro_tech_duty_lv not between", value1, value2, "proTechDutyLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvIsNull() {
            addCriterion("nat_prof_qua_lv is null");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvIsNotNull() {
            addCriterion("nat_prof_qua_lv is not null");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvEqualTo(String value) {
            addCriterion("nat_prof_qua_lv =", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvNotEqualTo(String value) {
            addCriterion("nat_prof_qua_lv <>", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvGreaterThan(String value) {
            addCriterion("nat_prof_qua_lv >", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvGreaterThanOrEqualTo(String value) {
            addCriterion("nat_prof_qua_lv >=", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvLessThan(String value) {
            addCriterion("nat_prof_qua_lv <", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvLessThanOrEqualTo(String value) {
            addCriterion("nat_prof_qua_lv <=", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvLike(String value) {
            addCriterion("nat_prof_qua_lv like", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvNotLike(String value) {
            addCriterion("nat_prof_qua_lv not like", value, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvIn(List<String> values) {
            addCriterion("nat_prof_qua_lv in", values, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvNotIn(List<String> values) {
            addCriterion("nat_prof_qua_lv not in", values, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvBetween(String value1, String value2) {
            addCriterion("nat_prof_qua_lv between", value1, value2, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andNatProfQuaLvNotBetween(String value1, String value2) {
            addCriterion("nat_prof_qua_lv not between", value1, value2, "natProfQuaLv");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rid like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rid not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andCrterIsNull() {
            addCriterion("crter is null");
            return (Criteria) this;
        }

        public Criteria andCrterIsNotNull() {
            addCriterion("crter is not null");
            return (Criteria) this;
        }

        public Criteria andCrterEqualTo(String value) {
            addCriterion("crter =", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterNotEqualTo(String value) {
            addCriterion("crter <>", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterGreaterThan(String value) {
            addCriterion("crter >", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterGreaterThanOrEqualTo(String value) {
            addCriterion("crter >=", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterLessThan(String value) {
            addCriterion("crter <", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterLessThanOrEqualTo(String value) {
            addCriterion("crter <=", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterLike(String value) {
            addCriterion("crter like", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterNotLike(String value) {
            addCriterion("crter not like", value, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterIn(List<String> values) {
            addCriterion("crter in", values, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterNotIn(List<String> values) {
            addCriterion("crter not in", values, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterBetween(String value1, String value2) {
            addCriterion("crter between", value1, value2, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterNotBetween(String value1, String value2) {
            addCriterion("crter not between", value1, value2, "crter");
            return (Criteria) this;
        }

        public Criteria andCrterNameIsNull() {
            addCriterion("crter_name is null");
            return (Criteria) this;
        }

        public Criteria andCrterNameIsNotNull() {
            addCriterion("crter_name is not null");
            return (Criteria) this;
        }

        public Criteria andCrterNameEqualTo(String value) {
            addCriterion("crter_name =", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameNotEqualTo(String value) {
            addCriterion("crter_name <>", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameGreaterThan(String value) {
            addCriterion("crter_name >", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameGreaterThanOrEqualTo(String value) {
            addCriterion("crter_name >=", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameLessThan(String value) {
            addCriterion("crter_name <", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameLessThanOrEqualTo(String value) {
            addCriterion("crter_name <=", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameLike(String value) {
            addCriterion("crter_name like", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameNotLike(String value) {
            addCriterion("crter_name not like", value, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameIn(List<String> values) {
            addCriterion("crter_name in", values, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameNotIn(List<String> values) {
            addCriterion("crter_name not in", values, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameBetween(String value1, String value2) {
            addCriterion("crter_name between", value1, value2, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrterNameNotBetween(String value1, String value2) {
            addCriterion("crter_name not between", value1, value2, "crterName");
            return (Criteria) this;
        }

        public Criteria andCrteTimeIsNull() {
            addCriterion("crte_time is null");
            return (Criteria) this;
        }

        public Criteria andCrteTimeIsNotNull() {
            addCriterion("crte_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrteTimeEqualTo(Date value) {
            addCriterion("crte_time =", value, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeNotEqualTo(Date value) {
            addCriterion("crte_time <>", value, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeGreaterThan(Date value) {
            addCriterion("crte_time >", value, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crte_time >=", value, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeLessThan(Date value) {
            addCriterion("crte_time <", value, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeLessThanOrEqualTo(Date value) {
            addCriterion("crte_time <=", value, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeIn(List<Date> values) {
            addCriterion("crte_time in", values, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeNotIn(List<Date> values) {
            addCriterion("crte_time not in", values, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeBetween(Date value1, Date value2) {
            addCriterion("crte_time between", value1, value2, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteTimeNotBetween(Date value1, Date value2) {
            addCriterion("crte_time not between", value1, value2, "crteTime");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsIsNull() {
            addCriterion("crte_optins is null");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsIsNotNull() {
            addCriterion("crte_optins is not null");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsEqualTo(String value) {
            addCriterion("crte_optins =", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsNotEqualTo(String value) {
            addCriterion("crte_optins <>", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsGreaterThan(String value) {
            addCriterion("crte_optins >", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsGreaterThanOrEqualTo(String value) {
            addCriterion("crte_optins >=", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsLessThan(String value) {
            addCriterion("crte_optins <", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsLessThanOrEqualTo(String value) {
            addCriterion("crte_optins <=", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsLike(String value) {
            addCriterion("crte_optins like", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsNotLike(String value) {
            addCriterion("crte_optins not like", value, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsIn(List<String> values) {
            addCriterion("crte_optins in", values, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsNotIn(List<String> values) {
            addCriterion("crte_optins not in", values, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsBetween(String value1, String value2) {
            addCriterion("crte_optins between", value1, value2, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andCrteOptinsNotBetween(String value1, String value2) {
            addCriterion("crte_optins not between", value1, value2, "crteOptins");
            return (Criteria) this;
        }

        public Criteria andOpterIsNull() {
            addCriterion("opter is null");
            return (Criteria) this;
        }

        public Criteria andOpterIsNotNull() {
            addCriterion("opter is not null");
            return (Criteria) this;
        }

        public Criteria andOpterEqualTo(String value) {
            addCriterion("opter =", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterNotEqualTo(String value) {
            addCriterion("opter <>", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterGreaterThan(String value) {
            addCriterion("opter >", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterGreaterThanOrEqualTo(String value) {
            addCriterion("opter >=", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterLessThan(String value) {
            addCriterion("opter <", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterLessThanOrEqualTo(String value) {
            addCriterion("opter <=", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterLike(String value) {
            addCriterion("opter like", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterNotLike(String value) {
            addCriterion("opter not like", value, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterIn(List<String> values) {
            addCriterion("opter in", values, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterNotIn(List<String> values) {
            addCriterion("opter not in", values, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterBetween(String value1, String value2) {
            addCriterion("opter between", value1, value2, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterNotBetween(String value1, String value2) {
            addCriterion("opter not between", value1, value2, "opter");
            return (Criteria) this;
        }

        public Criteria andOpterNameIsNull() {
            addCriterion("opter_name is null");
            return (Criteria) this;
        }

        public Criteria andOpterNameIsNotNull() {
            addCriterion("opter_name is not null");
            return (Criteria) this;
        }

        public Criteria andOpterNameEqualTo(String value) {
            addCriterion("opter_name =", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameNotEqualTo(String value) {
            addCriterion("opter_name <>", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameGreaterThan(String value) {
            addCriterion("opter_name >", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameGreaterThanOrEqualTo(String value) {
            addCriterion("opter_name >=", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameLessThan(String value) {
            addCriterion("opter_name <", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameLessThanOrEqualTo(String value) {
            addCriterion("opter_name <=", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameLike(String value) {
            addCriterion("opter_name like", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameNotLike(String value) {
            addCriterion("opter_name not like", value, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameIn(List<String> values) {
            addCriterion("opter_name in", values, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameNotIn(List<String> values) {
            addCriterion("opter_name not in", values, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameBetween(String value1, String value2) {
            addCriterion("opter_name between", value1, value2, "opterName");
            return (Criteria) this;
        }

        public Criteria andOpterNameNotBetween(String value1, String value2) {
            addCriterion("opter_name not between", value1, value2, "opterName");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNull() {
            addCriterion("opt_time is null");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNotNull() {
            addCriterion("opt_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptTimeEqualTo(Date value) {
            addCriterion("opt_time =", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotEqualTo(Date value) {
            addCriterion("opt_time <>", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThan(Date value) {
            addCriterion("opt_time >", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opt_time >=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThan(Date value) {
            addCriterion("opt_time <", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThanOrEqualTo(Date value) {
            addCriterion("opt_time <=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeIn(List<Date> values) {
            addCriterion("opt_time in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotIn(List<Date> values) {
            addCriterion("opt_time not in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeBetween(Date value1, Date value2) {
            addCriterion("opt_time between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotBetween(Date value1, Date value2) {
            addCriterion("opt_time not between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptinsIsNull() {
            addCriterion("optins is null");
            return (Criteria) this;
        }

        public Criteria andOptinsIsNotNull() {
            addCriterion("optins is not null");
            return (Criteria) this;
        }

        public Criteria andOptinsEqualTo(String value) {
            addCriterion("optins =", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsNotEqualTo(String value) {
            addCriterion("optins <>", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsGreaterThan(String value) {
            addCriterion("optins >", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsGreaterThanOrEqualTo(String value) {
            addCriterion("optins >=", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsLessThan(String value) {
            addCriterion("optins <", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsLessThanOrEqualTo(String value) {
            addCriterion("optins <=", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsLike(String value) {
            addCriterion("optins like", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsNotLike(String value) {
            addCriterion("optins not like", value, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsIn(List<String> values) {
            addCriterion("optins in", values, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsNotIn(List<String> values) {
            addCriterion("optins not in", values, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsBetween(String value1, String value2) {
            addCriterion("optins between", value1, value2, "optins");
            return (Criteria) this;
        }

        public Criteria andOptinsNotBetween(String value1, String value2) {
            addCriterion("optins not between", value1, value2, "optins");
            return (Criteria) this;
        }

        public Criteria andVerIsNull() {
            addCriterion("ver is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("ver is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(String value) {
            addCriterion("ver =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(String value) {
            addCriterion("ver <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(String value) {
            addCriterion("ver >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(String value) {
            addCriterion("ver >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(String value) {
            addCriterion("ver <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(String value) {
            addCriterion("ver <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLike(String value) {
            addCriterion("ver like", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotLike(String value) {
            addCriterion("ver not like", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<String> values) {
            addCriterion("ver in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<String> values) {
            addCriterion("ver not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(String value1, String value2) {
            addCriterion("ver between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(String value1, String value2) {
            addCriterion("ver not between", value1, value2, "ver");
            return (Criteria) this;
        }
    }

    /**
     */
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