package com.cc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompaniesRepoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompaniesRepoExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationIsNull() {
            addCriterion("company_organization is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationIsNotNull() {
            addCriterion("company_organization is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationEqualTo(String value) {
            addCriterion("company_organization =", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationNotEqualTo(String value) {
            addCriterion("company_organization <>", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationGreaterThan(String value) {
            addCriterion("company_organization >", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("company_organization >=", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationLessThan(String value) {
            addCriterion("company_organization <", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationLessThanOrEqualTo(String value) {
            addCriterion("company_organization <=", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationLike(String value) {
            addCriterion("company_organization like", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationNotLike(String value) {
            addCriterion("company_organization not like", value, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationIn(List<String> values) {
            addCriterion("company_organization in", values, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationNotIn(List<String> values) {
            addCriterion("company_organization not in", values, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationBetween(String value1, String value2) {
            addCriterion("company_organization between", value1, value2, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andCompanyOrganizationNotBetween(String value1, String value2) {
            addCriterion("company_organization not between", value1, value2, "companyOrganization");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierIsNull() {
            addCriterion("kw_identifier is null");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierIsNotNull() {
            addCriterion("kw_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierEqualTo(String value) {
            addCriterion("kw_identifier =", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierNotEqualTo(String value) {
            addCriterion("kw_identifier <>", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierGreaterThan(String value) {
            addCriterion("kw_identifier >", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("kw_identifier >=", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierLessThan(String value) {
            addCriterion("kw_identifier <", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierLessThanOrEqualTo(String value) {
            addCriterion("kw_identifier <=", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierLike(String value) {
            addCriterion("kw_identifier like", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierNotLike(String value) {
            addCriterion("kw_identifier not like", value, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierIn(List<String> values) {
            addCriterion("kw_identifier in", values, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierNotIn(List<String> values) {
            addCriterion("kw_identifier not in", values, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierBetween(String value1, String value2) {
            addCriterion("kw_identifier between", value1, value2, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andKwIdentifierNotBetween(String value1, String value2) {
            addCriterion("kw_identifier not between", value1, value2, "kwIdentifier");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPublicationNameIsNull() {
            addCriterion("publication_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicationNameIsNotNull() {
            addCriterion("publication_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationNameEqualTo(String value) {
            addCriterion("publication_name =", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotEqualTo(String value) {
            addCriterion("publication_name <>", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameGreaterThan(String value) {
            addCriterion("publication_name >", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("publication_name >=", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameLessThan(String value) {
            addCriterion("publication_name <", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameLessThanOrEqualTo(String value) {
            addCriterion("publication_name <=", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameLike(String value) {
            addCriterion("publication_name like", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotLike(String value) {
            addCriterion("publication_name not like", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameIn(List<String> values) {
            addCriterion("publication_name in", values, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotIn(List<String> values) {
            addCriterion("publication_name not in", values, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameBetween(String value1, String value2) {
            addCriterion("publication_name between", value1, value2, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotBetween(String value1, String value2) {
            addCriterion("publication_name not between", value1, value2, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublishNoIsNull() {
            addCriterion("publish_no is null");
            return (Criteria) this;
        }

        public Criteria andPublishNoIsNotNull() {
            addCriterion("publish_no is not null");
            return (Criteria) this;
        }

        public Criteria andPublishNoEqualTo(String value) {
            addCriterion("publish_no =", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotEqualTo(String value) {
            addCriterion("publish_no <>", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoGreaterThan(String value) {
            addCriterion("publish_no >", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoGreaterThanOrEqualTo(String value) {
            addCriterion("publish_no >=", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoLessThan(String value) {
            addCriterion("publish_no <", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoLessThanOrEqualTo(String value) {
            addCriterion("publish_no <=", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoLike(String value) {
            addCriterion("publish_no like", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotLike(String value) {
            addCriterion("publish_no not like", value, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoIn(List<String> values) {
            addCriterion("publish_no in", values, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotIn(List<String> values) {
            addCriterion("publish_no not in", values, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoBetween(String value1, String value2) {
            addCriterion("publish_no between", value1, value2, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPublishNoNotBetween(String value1, String value2) {
            addCriterion("publish_no not between", value1, value2, "publishNo");
            return (Criteria) this;
        }

        public Criteria andPage1stIsNull() {
            addCriterion("page_1st is null");
            return (Criteria) this;
        }

        public Criteria andPage1stIsNotNull() {
            addCriterion("page_1st is not null");
            return (Criteria) this;
        }

        public Criteria andPage1stEqualTo(Integer value) {
            addCriterion("page_1st =", value, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stNotEqualTo(Integer value) {
            addCriterion("page_1st <>", value, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stGreaterThan(Integer value) {
            addCriterion("page_1st >", value, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_1st >=", value, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stLessThan(Integer value) {
            addCriterion("page_1st <", value, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stLessThanOrEqualTo(Integer value) {
            addCriterion("page_1st <=", value, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stIn(List<Integer> values) {
            addCriterion("page_1st in", values, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stNotIn(List<Integer> values) {
            addCriterion("page_1st not in", values, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stBetween(Integer value1, Integer value2) {
            addCriterion("page_1st between", value1, value2, "page1st");
            return (Criteria) this;
        }

        public Criteria andPage1stNotBetween(Integer value1, Integer value2) {
            addCriterion("page_1st not between", value1, value2, "page1st");
            return (Criteria) this;
        }

        public Criteria andPageCountIsNull() {
            addCriterion("page_count is null");
            return (Criteria) this;
        }

        public Criteria andPageCountIsNotNull() {
            addCriterion("page_count is not null");
            return (Criteria) this;
        }

        public Criteria andPageCountEqualTo(Integer value) {
            addCriterion("page_count =", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotEqualTo(Integer value) {
            addCriterion("page_count <>", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountGreaterThan(Integer value) {
            addCriterion("page_count >", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_count >=", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountLessThan(Integer value) {
            addCriterion("page_count <", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountLessThanOrEqualTo(Integer value) {
            addCriterion("page_count <=", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountIn(List<Integer> values) {
            addCriterion("page_count in", values, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotIn(List<Integer> values) {
            addCriterion("page_count not in", values, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountBetween(Integer value1, Integer value2) {
            addCriterion("page_count between", value1, value2, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("page_count not between", value1, value2, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPublishYearIsNull() {
            addCriterion("publish_year is null");
            return (Criteria) this;
        }

        public Criteria andPublishYearIsNotNull() {
            addCriterion("publish_year is not null");
            return (Criteria) this;
        }

        public Criteria andPublishYearEqualTo(Integer value) {
            addCriterion("publish_year =", value, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearNotEqualTo(Integer value) {
            addCriterion("publish_year <>", value, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearGreaterThan(Integer value) {
            addCriterion("publish_year >", value, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_year >=", value, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearLessThan(Integer value) {
            addCriterion("publish_year <", value, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearLessThanOrEqualTo(Integer value) {
            addCriterion("publish_year <=", value, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearIn(List<Integer> values) {
            addCriterion("publish_year in", values, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearNotIn(List<Integer> values) {
            addCriterion("publish_year not in", values, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearBetween(Integer value1, Integer value2) {
            addCriterion("publish_year between", value1, value2, "publishYear");
            return (Criteria) this;
        }

        public Criteria andPublishYearNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_year not between", value1, value2, "publishYear");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesIsNull() {
            addCriterion("published_places is null");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesIsNotNull() {
            addCriterion("published_places is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesEqualTo(String value) {
            addCriterion("published_places =", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesNotEqualTo(String value) {
            addCriterion("published_places <>", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesGreaterThan(String value) {
            addCriterion("published_places >", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesGreaterThanOrEqualTo(String value) {
            addCriterion("published_places >=", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesLessThan(String value) {
            addCriterion("published_places <", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesLessThanOrEqualTo(String value) {
            addCriterion("published_places <=", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesLike(String value) {
            addCriterion("published_places like", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesNotLike(String value) {
            addCriterion("published_places not like", value, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesIn(List<String> values) {
            addCriterion("published_places in", values, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesNotIn(List<String> values) {
            addCriterion("published_places not in", values, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesBetween(String value1, String value2) {
            addCriterion("published_places between", value1, value2, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishedPlacesNotBetween(String value1, String value2) {
            addCriterion("published_places not between", value1, value2, "publishedPlaces");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsIsNull() {
            addCriterion("publish_regions is null");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsIsNotNull() {
            addCriterion("publish_regions is not null");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsEqualTo(String value) {
            addCriterion("publish_regions =", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsNotEqualTo(String value) {
            addCriterion("publish_regions <>", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsGreaterThan(String value) {
            addCriterion("publish_regions >", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsGreaterThanOrEqualTo(String value) {
            addCriterion("publish_regions >=", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsLessThan(String value) {
            addCriterion("publish_regions <", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsLessThanOrEqualTo(String value) {
            addCriterion("publish_regions <=", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsLike(String value) {
            addCriterion("publish_regions like", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsNotLike(String value) {
            addCriterion("publish_regions not like", value, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsIn(List<String> values) {
            addCriterion("publish_regions in", values, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsNotIn(List<String> values) {
            addCriterion("publish_regions not in", values, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsBetween(String value1, String value2) {
            addCriterion("publish_regions between", value1, value2, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishRegionsNotBetween(String value1, String value2) {
            addCriterion("publish_regions not between", value1, value2, "publishRegions");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectIsNull() {
            addCriterion("publish_subject is null");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectIsNotNull() {
            addCriterion("publish_subject is not null");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectEqualTo(String value) {
            addCriterion("publish_subject =", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectNotEqualTo(String value) {
            addCriterion("publish_subject <>", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectGreaterThan(String value) {
            addCriterion("publish_subject >", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("publish_subject >=", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectLessThan(String value) {
            addCriterion("publish_subject <", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectLessThanOrEqualTo(String value) {
            addCriterion("publish_subject <=", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectLike(String value) {
            addCriterion("publish_subject like", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectNotLike(String value) {
            addCriterion("publish_subject not like", value, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectIn(List<String> values) {
            addCriterion("publish_subject in", values, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectNotIn(List<String> values) {
            addCriterion("publish_subject not in", values, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectBetween(String value1, String value2) {
            addCriterion("publish_subject between", value1, value2, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andPublishSubjectNotBetween(String value1, String value2) {
            addCriterion("publish_subject not between", value1, value2, "publishSubject");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("res_type like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("res_type not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andDocTypeIsNull() {
            addCriterion("doc_type is null");
            return (Criteria) this;
        }

        public Criteria andDocTypeIsNotNull() {
            addCriterion("doc_type is not null");
            return (Criteria) this;
        }

        public Criteria andDocTypeEqualTo(String value) {
            addCriterion("doc_type =", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotEqualTo(String value) {
            addCriterion("doc_type <>", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeGreaterThan(String value) {
            addCriterion("doc_type >", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("doc_type >=", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeLessThan(String value) {
            addCriterion("doc_type <", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeLessThanOrEqualTo(String value) {
            addCriterion("doc_type <=", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeLike(String value) {
            addCriterion("doc_type like", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotLike(String value) {
            addCriterion("doc_type not like", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeIn(List<String> values) {
            addCriterion("doc_type in", values, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotIn(List<String> values) {
            addCriterion("doc_type not in", values, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeBetween(String value1, String value2) {
            addCriterion("doc_type between", value1, value2, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotBetween(String value1, String value2) {
            addCriterion("doc_type not between", value1, value2, "docType");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestIsNull() {
            addCriterion("id_of_proquest is null");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestIsNotNull() {
            addCriterion("id_of_proquest is not null");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestEqualTo(String value) {
            addCriterion("id_of_proquest =", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestNotEqualTo(String value) {
            addCriterion("id_of_proquest <>", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestGreaterThan(String value) {
            addCriterion("id_of_proquest >", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestGreaterThanOrEqualTo(String value) {
            addCriterion("id_of_proquest >=", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestLessThan(String value) {
            addCriterion("id_of_proquest <", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestLessThanOrEqualTo(String value) {
            addCriterion("id_of_proquest <=", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestLike(String value) {
            addCriterion("id_of_proquest like", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestNotLike(String value) {
            addCriterion("id_of_proquest not like", value, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestIn(List<String> values) {
            addCriterion("id_of_proquest in", values, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestNotIn(List<String> values) {
            addCriterion("id_of_proquest not in", values, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestBetween(String value1, String value2) {
            addCriterion("id_of_proquest between", value1, value2, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andIdOfProquestNotBetween(String value1, String value2) {
            addCriterion("id_of_proquest not between", value1, value2, "idOfProquest");
            return (Criteria) this;
        }

        public Criteria andDocUrlIsNull() {
            addCriterion("doc_url is null");
            return (Criteria) this;
        }

        public Criteria andDocUrlIsNotNull() {
            addCriterion("doc_url is not null");
            return (Criteria) this;
        }

        public Criteria andDocUrlEqualTo(String value) {
            addCriterion("doc_url =", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotEqualTo(String value) {
            addCriterion("doc_url <>", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlGreaterThan(String value) {
            addCriterion("doc_url >", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("doc_url >=", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLessThan(String value) {
            addCriterion("doc_url <", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLessThanOrEqualTo(String value) {
            addCriterion("doc_url <=", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLike(String value) {
            addCriterion("doc_url like", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotLike(String value) {
            addCriterion("doc_url not like", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlIn(List<String> values) {
            addCriterion("doc_url in", values, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotIn(List<String> values) {
            addCriterion("doc_url not in", values, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlBetween(String value1, String value2) {
            addCriterion("doc_url between", value1, value2, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotBetween(String value1, String value2) {
            addCriterion("doc_url not between", value1, value2, "docUrl");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(String value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(String value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(String value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(String value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(String value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLike(String value) {
            addCriterion("last_update like", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotLike(String value) {
            addCriterion("last_update not like", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<String> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<String> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(String value1, String value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(String value1, String value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andResDatabaseIsNull() {
            addCriterion("res_database is null");
            return (Criteria) this;
        }

        public Criteria andResDatabaseIsNotNull() {
            addCriterion("res_database is not null");
            return (Criteria) this;
        }

        public Criteria andResDatabaseEqualTo(String value) {
            addCriterion("res_database =", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseNotEqualTo(String value) {
            addCriterion("res_database <>", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseGreaterThan(String value) {
            addCriterion("res_database >", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseGreaterThanOrEqualTo(String value) {
            addCriterion("res_database >=", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseLessThan(String value) {
            addCriterion("res_database <", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseLessThanOrEqualTo(String value) {
            addCriterion("res_database <=", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseLike(String value) {
            addCriterion("res_database like", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseNotLike(String value) {
            addCriterion("res_database not like", value, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseIn(List<String> values) {
            addCriterion("res_database in", values, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseNotIn(List<String> values) {
            addCriterion("res_database not in", values, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseBetween(String value1, String value2) {
            addCriterion("res_database between", value1, value2, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andResDatabaseNotBetween(String value1, String value2) {
            addCriterion("res_database not between", value1, value2, "resDatabase");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
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