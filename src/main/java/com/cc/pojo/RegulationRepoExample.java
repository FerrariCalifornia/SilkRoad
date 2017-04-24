package com.cc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegulationRepoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegulationRepoExample() {
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

        public Criteria andDoiIsNull() {
            addCriterion("doi is null");
            return (Criteria) this;
        }

        public Criteria andDoiIsNotNull() {
            addCriterion("doi is not null");
            return (Criteria) this;
        }

        public Criteria andDoiEqualTo(String value) {
            addCriterion("doi =", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotEqualTo(String value) {
            addCriterion("doi <>", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThan(String value) {
            addCriterion("doi >", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThanOrEqualTo(String value) {
            addCriterion("doi >=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThan(String value) {
            addCriterion("doi <", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThanOrEqualTo(String value) {
            addCriterion("doi <=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLike(String value) {
            addCriterion("doi like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotLike(String value) {
            addCriterion("doi not like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiIn(List<String> values) {
            addCriterion("doi in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotIn(List<String> values) {
            addCriterion("doi not in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiBetween(String value1, String value2) {
            addCriterion("doi between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotBetween(String value1, String value2) {
            addCriterion("doi not between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDatePublicationIsNull() {
            addCriterion("date_publication is null");
            return (Criteria) this;
        }

        public Criteria andDatePublicationIsNotNull() {
            addCriterion("date_publication is not null");
            return (Criteria) this;
        }

        public Criteria andDatePublicationEqualTo(Date value) {
            addCriterionForJDBCDate("date_publication =", value, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_publication <>", value, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationGreaterThan(Date value) {
            addCriterionForJDBCDate("date_publication >", value, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_publication >=", value, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationLessThan(Date value) {
            addCriterionForJDBCDate("date_publication <", value, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_publication <=", value, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationIn(List<Date> values) {
            addCriterionForJDBCDate("date_publication in", values, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_publication not in", values, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_publication between", value1, value2, "datePublication");
            return (Criteria) this;
        }

        public Criteria andDatePublicationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_publication not between", value1, value2, "datePublication");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnIsNull() {
            addCriterion("online_isbn is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnIsNotNull() {
            addCriterion("online_isbn is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnEqualTo(String value) {
            addCriterion("online_isbn =", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnNotEqualTo(String value) {
            addCriterion("online_isbn <>", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnGreaterThan(String value) {
            addCriterion("online_isbn >", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("online_isbn >=", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnLessThan(String value) {
            addCriterion("online_isbn <", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnLessThanOrEqualTo(String value) {
            addCriterion("online_isbn <=", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnLike(String value) {
            addCriterion("online_isbn like", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnNotLike(String value) {
            addCriterion("online_isbn not like", value, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnIn(List<String> values) {
            addCriterion("online_isbn in", values, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnNotIn(List<String> values) {
            addCriterion("online_isbn not in", values, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnBetween(String value1, String value2) {
            addCriterion("online_isbn between", value1, value2, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andOnlineIsbnNotBetween(String value1, String value2) {
            addCriterion("online_isbn not between", value1, value2, "onlineIsbn");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsIsNull() {
            addCriterion("author_keywords is null");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsIsNotNull() {
            addCriterion("author_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsEqualTo(String value) {
            addCriterion("author_keywords =", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsNotEqualTo(String value) {
            addCriterion("author_keywords <>", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsGreaterThan(String value) {
            addCriterion("author_keywords >", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("author_keywords >=", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsLessThan(String value) {
            addCriterion("author_keywords <", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsLessThanOrEqualTo(String value) {
            addCriterion("author_keywords <=", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsLike(String value) {
            addCriterion("author_keywords like", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsNotLike(String value) {
            addCriterion("author_keywords not like", value, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsIn(List<String> values) {
            addCriterion("author_keywords in", values, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsNotIn(List<String> values) {
            addCriterion("author_keywords not in", values, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsBetween(String value1, String value2) {
            addCriterion("author_keywords between", value1, value2, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordsNotBetween(String value1, String value2) {
            addCriterion("author_keywords not between", value1, value2, "authorKeywords");
            return (Criteria) this;
        }

        public Criteria andDefinitionIsNull() {
            addCriterion("definition is null");
            return (Criteria) this;
        }

        public Criteria andDefinitionIsNotNull() {
            addCriterion("definition is not null");
            return (Criteria) this;
        }

        public Criteria andDefinitionEqualTo(String value) {
            addCriterion("definition =", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotEqualTo(String value) {
            addCriterion("definition <>", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionGreaterThan(String value) {
            addCriterion("definition >", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionGreaterThanOrEqualTo(String value) {
            addCriterion("definition >=", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionLessThan(String value) {
            addCriterion("definition <", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionLessThanOrEqualTo(String value) {
            addCriterion("definition <=", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionLike(String value) {
            addCriterion("definition like", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotLike(String value) {
            addCriterion("definition not like", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionIn(List<String> values) {
            addCriterion("definition in", values, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotIn(List<String> values) {
            addCriterion("definition not in", values, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionBetween(String value1, String value2) {
            addCriterion("definition between", value1, value2, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotBetween(String value1, String value2) {
            addCriterion("definition not between", value1, value2, "definition");
            return (Criteria) this;
        }

        public Criteria andFullTextIsNull() {
            addCriterion("full_text is null");
            return (Criteria) this;
        }

        public Criteria andFullTextIsNotNull() {
            addCriterion("full_text is not null");
            return (Criteria) this;
        }

        public Criteria andFullTextEqualTo(String value) {
            addCriterion("full_text =", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextNotEqualTo(String value) {
            addCriterion("full_text <>", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextGreaterThan(String value) {
            addCriterion("full_text >", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextGreaterThanOrEqualTo(String value) {
            addCriterion("full_text >=", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextLessThan(String value) {
            addCriterion("full_text <", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextLessThanOrEqualTo(String value) {
            addCriterion("full_text <=", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextLike(String value) {
            addCriterion("full_text like", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextNotLike(String value) {
            addCriterion("full_text not like", value, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextIn(List<String> values) {
            addCriterion("full_text in", values, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextNotIn(List<String> values) {
            addCriterion("full_text not in", values, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextBetween(String value1, String value2) {
            addCriterion("full_text between", value1, value2, "fullText");
            return (Criteria) this;
        }

        public Criteria andFullTextNotBetween(String value1, String value2) {
            addCriterion("full_text not between", value1, value2, "fullText");
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