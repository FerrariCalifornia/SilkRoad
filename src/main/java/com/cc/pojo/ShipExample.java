package com.cc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIndexIsNull() {
            addCriterion("index is null");
            return (Criteria) this;
        }

        public Criteria andIndexIsNotNull() {
            addCriterion("index is not null");
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(String value) {
            addCriterion("index =", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualTo(String value) {
            addCriterion("index <>", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThan(String value) {
            addCriterion("index >", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(String value) {
            addCriterion("index >=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThan(String value) {
            addCriterion("index <", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualTo(String value) {
            addCriterion("index <=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLike(String value) {
            addCriterion("index like", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotLike(String value) {
            addCriterion("index not like", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexIn(List<String> values) {
            addCriterion("index in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotIn(List<String> values) {
            addCriterion("index not in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexBetween(String value1, String value2) {
            addCriterion("index between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotBetween(String value1, String value2) {
            addCriterion("index not between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andGrosstonIsNull() {
            addCriterion("grosston is null");
            return (Criteria) this;
        }

        public Criteria andGrosstonIsNotNull() {
            addCriterion("grosston is not null");
            return (Criteria) this;
        }

        public Criteria andGrosstonEqualTo(Double value) {
            addCriterion("grosston =", value, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonNotEqualTo(Double value) {
            addCriterion("grosston <>", value, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonGreaterThan(Double value) {
            addCriterion("grosston >", value, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonGreaterThanOrEqualTo(Double value) {
            addCriterion("grosston >=", value, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonLessThan(Double value) {
            addCriterion("grosston <", value, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonLessThanOrEqualTo(Double value) {
            addCriterion("grosston <=", value, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonIn(List<Double> values) {
            addCriterion("grosston in", values, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonNotIn(List<Double> values) {
            addCriterion("grosston not in", values, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonBetween(Double value1, Double value2) {
            addCriterion("grosston between", value1, value2, "grosston");
            return (Criteria) this;
        }

        public Criteria andGrosstonNotBetween(Double value1, Double value2) {
            addCriterion("grosston not between", value1, value2, "grosston");
            return (Criteria) this;
        }

        public Criteria andDeadweightIsNull() {
            addCriterion("deadweight is null");
            return (Criteria) this;
        }

        public Criteria andDeadweightIsNotNull() {
            addCriterion("deadweight is not null");
            return (Criteria) this;
        }

        public Criteria andDeadweightEqualTo(Double value) {
            addCriterion("deadweight =", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightNotEqualTo(Double value) {
            addCriterion("deadweight <>", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightGreaterThan(Double value) {
            addCriterion("deadweight >", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightGreaterThanOrEqualTo(Double value) {
            addCriterion("deadweight >=", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightLessThan(Double value) {
            addCriterion("deadweight <", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightLessThanOrEqualTo(Double value) {
            addCriterion("deadweight <=", value, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightIn(List<Double> values) {
            addCriterion("deadweight in", values, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightNotIn(List<Double> values) {
            addCriterion("deadweight not in", values, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightBetween(Double value1, Double value2) {
            addCriterion("deadweight between", value1, value2, "deadweight");
            return (Criteria) this;
        }

        public Criteria andDeadweightNotBetween(Double value1, Double value2) {
            addCriterion("deadweight not between", value1, value2, "deadweight");
            return (Criteria) this;
        }

        public Criteria andEnginetypeIsNull() {
            addCriterion("enginetype is null");
            return (Criteria) this;
        }

        public Criteria andEnginetypeIsNotNull() {
            addCriterion("enginetype is not null");
            return (Criteria) this;
        }

        public Criteria andEnginetypeEqualTo(String value) {
            addCriterion("enginetype =", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotEqualTo(String value) {
            addCriterion("enginetype <>", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeGreaterThan(String value) {
            addCriterion("enginetype >", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeGreaterThanOrEqualTo(String value) {
            addCriterion("enginetype >=", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeLessThan(String value) {
            addCriterion("enginetype <", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeLessThanOrEqualTo(String value) {
            addCriterion("enginetype <=", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeLike(String value) {
            addCriterion("enginetype like", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotLike(String value) {
            addCriterion("enginetype not like", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeIn(List<String> values) {
            addCriterion("enginetype in", values, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotIn(List<String> values) {
            addCriterion("enginetype not in", values, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeBetween(String value1, String value2) {
            addCriterion("enginetype between", value1, value2, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotBetween(String value1, String value2) {
            addCriterion("enginetype not between", value1, value2, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginepowerIsNull() {
            addCriterion("enginepower is null");
            return (Criteria) this;
        }

        public Criteria andEnginepowerIsNotNull() {
            addCriterion("enginepower is not null");
            return (Criteria) this;
        }

        public Criteria andEnginepowerEqualTo(String value) {
            addCriterion("enginepower =", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerNotEqualTo(String value) {
            addCriterion("enginepower <>", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerGreaterThan(String value) {
            addCriterion("enginepower >", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerGreaterThanOrEqualTo(String value) {
            addCriterion("enginepower >=", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerLessThan(String value) {
            addCriterion("enginepower <", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerLessThanOrEqualTo(String value) {
            addCriterion("enginepower <=", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerLike(String value) {
            addCriterion("enginepower like", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerNotLike(String value) {
            addCriterion("enginepower not like", value, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerIn(List<String> values) {
            addCriterion("enginepower in", values, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerNotIn(List<String> values) {
            addCriterion("enginepower not in", values, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerBetween(String value1, String value2) {
            addCriterion("enginepower between", value1, value2, "enginepower");
            return (Criteria) this;
        }

        public Criteria andEnginepowerNotBetween(String value1, String value2) {
            addCriterion("enginepower not between", value1, value2, "enginepower");
            return (Criteria) this;
        }

        public Criteria andBuilddateIsNull() {
            addCriterion("builddate is null");
            return (Criteria) this;
        }

        public Criteria andBuilddateIsNotNull() {
            addCriterion("builddate is not null");
            return (Criteria) this;
        }

        public Criteria andBuilddateEqualTo(String value) {
            addCriterion("builddate =", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateNotEqualTo(String value) {
            addCriterion("builddate <>", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateGreaterThan(String value) {
            addCriterion("builddate >", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateGreaterThanOrEqualTo(String value) {
            addCriterion("builddate >=", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateLessThan(String value) {
            addCriterion("builddate <", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateLessThanOrEqualTo(String value) {
            addCriterion("builddate <=", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateLike(String value) {
            addCriterion("builddate like", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateNotLike(String value) {
            addCriterion("builddate not like", value, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateIn(List<String> values) {
            addCriterion("builddate in", values, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateNotIn(List<String> values) {
            addCriterion("builddate not in", values, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateBetween(String value1, String value2) {
            addCriterion("builddate between", value1, value2, "builddate");
            return (Criteria) this;
        }

        public Criteria andBuilddateNotBetween(String value1, String value2) {
            addCriterion("builddate not between", value1, value2, "builddate");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andDealdateIsNull() {
            addCriterion("dealdate is null");
            return (Criteria) this;
        }

        public Criteria andDealdateIsNotNull() {
            addCriterion("dealdate is not null");
            return (Criteria) this;
        }

        public Criteria andDealdateEqualTo(String value) {
            addCriterion("dealdate =", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotEqualTo(String value) {
            addCriterion("dealdate <>", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateGreaterThan(String value) {
            addCriterion("dealdate >", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateGreaterThanOrEqualTo(String value) {
            addCriterion("dealdate >=", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLessThan(String value) {
            addCriterion("dealdate <", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLessThanOrEqualTo(String value) {
            addCriterion("dealdate <=", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLike(String value) {
            addCriterion("dealdate like", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotLike(String value) {
            addCriterion("dealdate not like", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateIn(List<String> values) {
            addCriterion("dealdate in", values, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotIn(List<String> values) {
            addCriterion("dealdate not in", values, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateBetween(String value1, String value2) {
            addCriterion("dealdate between", value1, value2, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotBetween(String value1, String value2) {
            addCriterion("dealdate not between", value1, value2, "dealdate");
            return (Criteria) this;
        }

        public Criteria andPredictIsNull() {
            addCriterion("predict is null");
            return (Criteria) this;
        }

        public Criteria andPredictIsNotNull() {
            addCriterion("predict is not null");
            return (Criteria) this;
        }

        public Criteria andPredictEqualTo(Double value) {
            addCriterion("predict =", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictNotEqualTo(Double value) {
            addCriterion("predict <>", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictGreaterThan(Double value) {
            addCriterion("predict >", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictGreaterThanOrEqualTo(Double value) {
            addCriterion("predict >=", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictLessThan(Double value) {
            addCriterion("predict <", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictLessThanOrEqualTo(Double value) {
            addCriterion("predict <=", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictIn(List<Double> values) {
            addCriterion("predict in", values, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictNotIn(List<Double> values) {
            addCriterion("predict not in", values, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictBetween(Double value1, Double value2) {
            addCriterion("predict between", value1, value2, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictNotBetween(Double value1, Double value2) {
            addCriterion("predict not between", value1, value2, "predict");
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