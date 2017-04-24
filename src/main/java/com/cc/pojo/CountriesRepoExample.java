package com.cc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CountriesRepoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountriesRepoExample() {
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

        public Criteria andStoreldIsNull() {
            addCriterion("storeld is null");
            return (Criteria) this;
        }

        public Criteria andStoreldIsNotNull() {
            addCriterion("storeld is not null");
            return (Criteria) this;
        }

        public Criteria andStoreldEqualTo(String value) {
            addCriterion("storeld =", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldNotEqualTo(String value) {
            addCriterion("storeld <>", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldGreaterThan(String value) {
            addCriterion("storeld >", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldGreaterThanOrEqualTo(String value) {
            addCriterion("storeld >=", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldLessThan(String value) {
            addCriterion("storeld <", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldLessThanOrEqualTo(String value) {
            addCriterion("storeld <=", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldLike(String value) {
            addCriterion("storeld like", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldNotLike(String value) {
            addCriterion("storeld not like", value, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldIn(List<String> values) {
            addCriterion("storeld in", values, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldNotIn(List<String> values) {
            addCriterion("storeld not in", values, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldBetween(String value1, String value2) {
            addCriterion("storeld between", value1, value2, "storeld");
            return (Criteria) this;
        }

        public Criteria andStoreldNotBetween(String value1, String value2) {
            addCriterion("storeld not between", value1, value2, "storeld");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(String value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(String value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(String value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(String value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLike(String value) {
            addCriterion("article_type like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotLike(String value) {
            addCriterion("article_type not like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<String> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<String> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(String value1, String value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(String value1, String value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
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

        public Criteria andDigitalObjectIdentifierIsNull() {
            addCriterion("digital_object_identifier is null");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierIsNotNull() {
            addCriterion("digital_object_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierEqualTo(String value) {
            addCriterion("digital_object_identifier =", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierNotEqualTo(String value) {
            addCriterion("digital_object_identifier <>", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierGreaterThan(String value) {
            addCriterion("digital_object_identifier >", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("digital_object_identifier >=", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierLessThan(String value) {
            addCriterion("digital_object_identifier <", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierLessThanOrEqualTo(String value) {
            addCriterion("digital_object_identifier <=", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierLike(String value) {
            addCriterion("digital_object_identifier like", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierNotLike(String value) {
            addCriterion("digital_object_identifier not like", value, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierIn(List<String> values) {
            addCriterion("digital_object_identifier in", values, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierNotIn(List<String> values) {
            addCriterion("digital_object_identifier not in", values, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierBetween(String value1, String value2) {
            addCriterion("digital_object_identifier between", value1, value2, "digitalObjectIdentifier");
            return (Criteria) this;
        }

        public Criteria andDigitalObjectIdentifierNotBetween(String value1, String value2) {
            addCriterion("digital_object_identifier not between", value1, value2, "digitalObjectIdentifier");
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

        public Criteria andEntryDateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(String value) {
            addCriterion("entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(String value) {
            addCriterion("entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(String value) {
            addCriterion("entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(String value) {
            addCriterion("entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(String value) {
            addCriterion("entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(String value) {
            addCriterion("entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLike(String value) {
            addCriterion("entry_date like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotLike(String value) {
            addCriterion("entry_date not like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<String> values) {
            addCriterion("entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<String> values) {
            addCriterion("entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(String value1, String value2) {
            addCriterion("entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(String value1, String value2) {
            addCriterion("entry_date not between", value1, value2, "entryDate");
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

        public Criteria andSummaryLanguageIsNull() {
            addCriterion("summary_language is null");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageIsNotNull() {
            addCriterion("summary_language is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageEqualTo(String value) {
            addCriterion("summary_language =", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageNotEqualTo(String value) {
            addCriterion("summary_language <>", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageGreaterThan(String value) {
            addCriterion("summary_language >", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("summary_language >=", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageLessThan(String value) {
            addCriterion("summary_language <", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageLessThanOrEqualTo(String value) {
            addCriterion("summary_language <=", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageLike(String value) {
            addCriterion("summary_language like", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageNotLike(String value) {
            addCriterion("summary_language not like", value, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageIn(List<String> values) {
            addCriterion("summary_language in", values, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageNotIn(List<String> values) {
            addCriterion("summary_language not in", values, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageBetween(String value1, String value2) {
            addCriterion("summary_language between", value1, value2, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andSummaryLanguageNotBetween(String value1, String value2) {
            addCriterion("summary_language not between", value1, value2, "summaryLanguage");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(String value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(String value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(String value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(String value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(String value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(String value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLike(String value) {
            addCriterion("pages like", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotLike(String value) {
            addCriterion("pages not like", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<String> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<String> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(String value1, String value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(String value1, String value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceIsNull() {
            addCriterion("publish_place is null");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceIsNotNull() {
            addCriterion("publish_place is not null");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceEqualTo(String value) {
            addCriterion("publish_place =", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotEqualTo(String value) {
            addCriterion("publish_place <>", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceGreaterThan(String value) {
            addCriterion("publish_place >", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("publish_place >=", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceLessThan(String value) {
            addCriterion("publish_place <", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceLessThanOrEqualTo(String value) {
            addCriterion("publish_place <=", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceLike(String value) {
            addCriterion("publish_place like", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotLike(String value) {
            addCriterion("publish_place not like", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceIn(List<String> values) {
            addCriterion("publish_place in", values, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotIn(List<String> values) {
            addCriterion("publish_place not in", values, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceBetween(String value1, String value2) {
            addCriterion("publish_place between", value1, value2, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotBetween(String value1, String value2) {
            addCriterion("publish_place not between", value1, value2, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNull() {
            addCriterion("pub_date is null");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNotNull() {
            addCriterion("pub_date is not null");
            return (Criteria) this;
        }

        public Criteria andPubDateEqualTo(String value) {
            addCriterion("pub_date =", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotEqualTo(String value) {
            addCriterion("pub_date <>", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThan(String value) {
            addCriterion("pub_date >", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThanOrEqualTo(String value) {
            addCriterion("pub_date >=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThan(String value) {
            addCriterion("pub_date <", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThanOrEqualTo(String value) {
            addCriterion("pub_date <=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLike(String value) {
            addCriterion("pub_date like", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotLike(String value) {
            addCriterion("pub_date not like", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateIn(List<String> values) {
            addCriterion("pub_date in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotIn(List<String> values) {
            addCriterion("pub_date not in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateBetween(String value1, String value2) {
            addCriterion("pub_date between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotBetween(String value1, String value2) {
            addCriterion("pub_date not between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubTitleIsNull() {
            addCriterion("pub_title is null");
            return (Criteria) this;
        }

        public Criteria andPubTitleIsNotNull() {
            addCriterion("pub_title is not null");
            return (Criteria) this;
        }

        public Criteria andPubTitleEqualTo(String value) {
            addCriterion("pub_title =", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleNotEqualTo(String value) {
            addCriterion("pub_title <>", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleGreaterThan(String value) {
            addCriterion("pub_title >", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pub_title >=", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleLessThan(String value) {
            addCriterion("pub_title <", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleLessThanOrEqualTo(String value) {
            addCriterion("pub_title <=", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleLike(String value) {
            addCriterion("pub_title like", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleNotLike(String value) {
            addCriterion("pub_title not like", value, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleIn(List<String> values) {
            addCriterion("pub_title in", values, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleNotIn(List<String> values) {
            addCriterion("pub_title not in", values, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleBetween(String value1, String value2) {
            addCriterion("pub_title between", value1, value2, "pubTitle");
            return (Criteria) this;
        }

        public Criteria andPubTitleNotBetween(String value1, String value2) {
            addCriterion("pub_title not between", value1, value2, "pubTitle");
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

        public Criteria andStartPageIsNull() {
            addCriterion("start_page is null");
            return (Criteria) this;
        }

        public Criteria andStartPageIsNotNull() {
            addCriterion("start_page is not null");
            return (Criteria) this;
        }

        public Criteria andStartPageEqualTo(String value) {
            addCriterion("start_page =", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotEqualTo(String value) {
            addCriterion("start_page <>", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThan(String value) {
            addCriterion("start_page >", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThanOrEqualTo(String value) {
            addCriterion("start_page >=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThan(String value) {
            addCriterion("start_page <", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThanOrEqualTo(String value) {
            addCriterion("start_page <=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLike(String value) {
            addCriterion("start_page like", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotLike(String value) {
            addCriterion("start_page not like", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageIn(List<String> values) {
            addCriterion("start_page in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotIn(List<String> values) {
            addCriterion("start_page not in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageBetween(String value1, String value2) {
            addCriterion("start_page between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotBetween(String value1, String value2) {
            addCriterion("start_page not between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsIsNull() {
            addCriterion("subject_terms is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsIsNotNull() {
            addCriterion("subject_terms is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsEqualTo(String value) {
            addCriterion("subject_terms =", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsNotEqualTo(String value) {
            addCriterion("subject_terms <>", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsGreaterThan(String value) {
            addCriterion("subject_terms >", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsGreaterThanOrEqualTo(String value) {
            addCriterion("subject_terms >=", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsLessThan(String value) {
            addCriterion("subject_terms <", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsLessThanOrEqualTo(String value) {
            addCriterion("subject_terms <=", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsLike(String value) {
            addCriterion("subject_terms like", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsNotLike(String value) {
            addCriterion("subject_terms not like", value, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsIn(List<String> values) {
            addCriterion("subject_terms in", values, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsNotIn(List<String> values) {
            addCriterion("subject_terms not in", values, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsBetween(String value1, String value2) {
            addCriterion("subject_terms between", value1, value2, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectTermsNotBetween(String value1, String value2) {
            addCriterion("subject_terms not between", value1, value2, "subjectTerms");
            return (Criteria) this;
        }

        public Criteria andSubjectsIsNull() {
            addCriterion("subjects is null");
            return (Criteria) this;
        }

        public Criteria andSubjectsIsNotNull() {
            addCriterion("subjects is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectsEqualTo(String value) {
            addCriterion("subjects =", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsNotEqualTo(String value) {
            addCriterion("subjects <>", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsGreaterThan(String value) {
            addCriterion("subjects >", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsGreaterThanOrEqualTo(String value) {
            addCriterion("subjects >=", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsLessThan(String value) {
            addCriterion("subjects <", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsLessThanOrEqualTo(String value) {
            addCriterion("subjects <=", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsLike(String value) {
            addCriterion("subjects like", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsNotLike(String value) {
            addCriterion("subjects not like", value, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsIn(List<String> values) {
            addCriterion("subjects in", values, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsNotIn(List<String> values) {
            addCriterion("subjects not in", values, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsBetween(String value1, String value2) {
            addCriterion("subjects between", value1, value2, "subjects");
            return (Criteria) this;
        }

        public Criteria andSubjectsNotBetween(String value1, String value2) {
            addCriterion("subjects not between", value1, value2, "subjects");
            return (Criteria) this;
        }

        public Criteria andFindCopyIsNull() {
            addCriterion("find_copy is null");
            return (Criteria) this;
        }

        public Criteria andFindCopyIsNotNull() {
            addCriterion("find_copy is not null");
            return (Criteria) this;
        }

        public Criteria andFindCopyEqualTo(String value) {
            addCriterion("find_copy =", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyNotEqualTo(String value) {
            addCriterion("find_copy <>", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyGreaterThan(String value) {
            addCriterion("find_copy >", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyGreaterThanOrEqualTo(String value) {
            addCriterion("find_copy >=", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyLessThan(String value) {
            addCriterion("find_copy <", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyLessThanOrEqualTo(String value) {
            addCriterion("find_copy <=", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyLike(String value) {
            addCriterion("find_copy like", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyNotLike(String value) {
            addCriterion("find_copy not like", value, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyIn(List<String> values) {
            addCriterion("find_copy in", values, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyNotIn(List<String> values) {
            addCriterion("find_copy not in", values, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyBetween(String value1, String value2) {
            addCriterion("find_copy between", value1, value2, "findCopy");
            return (Criteria) this;
        }

        public Criteria andFindCopyNotBetween(String value1, String value2) {
            addCriterion("find_copy not between", value1, value2, "findCopy");
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