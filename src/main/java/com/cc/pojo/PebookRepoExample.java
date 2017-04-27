package com.cc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PebookRepoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PebookRepoExample() {
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

        public Criteria andIssnOnlineIsNull() {
            addCriterion("issn_online is null");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineIsNotNull() {
            addCriterion("issn_online is not null");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineEqualTo(String value) {
            addCriterion("issn_online =", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineNotEqualTo(String value) {
            addCriterion("issn_online <>", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineGreaterThan(String value) {
            addCriterion("issn_online >", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("issn_online >=", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineLessThan(String value) {
            addCriterion("issn_online <", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineLessThanOrEqualTo(String value) {
            addCriterion("issn_online <=", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineLike(String value) {
            addCriterion("issn_online like", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineNotLike(String value) {
            addCriterion("issn_online not like", value, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineIn(List<String> values) {
            addCriterion("issn_online in", values, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineNotIn(List<String> values) {
            addCriterion("issn_online not in", values, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineBetween(String value1, String value2) {
            addCriterion("issn_online between", value1, value2, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIssnOnlineNotBetween(String value1, String value2) {
            addCriterion("issn_online not between", value1, value2, "issnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineIsNull() {
            addCriterion("isbn_online is null");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineIsNotNull() {
            addCriterion("isbn_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineEqualTo(String value) {
            addCriterion("isbn_online =", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineNotEqualTo(String value) {
            addCriterion("isbn_online <>", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineGreaterThan(String value) {
            addCriterion("isbn_online >", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("isbn_online >=", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineLessThan(String value) {
            addCriterion("isbn_online <", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineLessThanOrEqualTo(String value) {
            addCriterion("isbn_online <=", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineLike(String value) {
            addCriterion("isbn_online like", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineNotLike(String value) {
            addCriterion("isbn_online not like", value, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineIn(List<String> values) {
            addCriterion("isbn_online in", values, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineNotIn(List<String> values) {
            addCriterion("isbn_online not in", values, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineBetween(String value1, String value2) {
            addCriterion("isbn_online between", value1, value2, "isbnOnline");
            return (Criteria) this;
        }

        public Criteria andIsbnOnlineNotBetween(String value1, String value2) {
            addCriterion("isbn_online not between", value1, value2, "isbnOnline");
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

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andBookTitleIsNull() {
            addCriterion("book_title is null");
            return (Criteria) this;
        }

        public Criteria andBookTitleIsNotNull() {
            addCriterion("book_title is not null");
            return (Criteria) this;
        }

        public Criteria andBookTitleEqualTo(String value) {
            addCriterion("book_title =", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotEqualTo(String value) {
            addCriterion("book_title <>", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleGreaterThan(String value) {
            addCriterion("book_title >", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleGreaterThanOrEqualTo(String value) {
            addCriterion("book_title >=", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLessThan(String value) {
            addCriterion("book_title <", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLessThanOrEqualTo(String value) {
            addCriterion("book_title <=", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLike(String value) {
            addCriterion("book_title like", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotLike(String value) {
            addCriterion("book_title not like", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleIn(List<String> values) {
            addCriterion("book_title in", values, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotIn(List<String> values) {
            addCriterion("book_title not in", values, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleBetween(String value1, String value2) {
            addCriterion("book_title between", value1, value2, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotBetween(String value1, String value2) {
            addCriterion("book_title not between", value1, value2, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andIssnPrintIsNull() {
            addCriterion("issn_print is null");
            return (Criteria) this;
        }

        public Criteria andIssnPrintIsNotNull() {
            addCriterion("issn_print is not null");
            return (Criteria) this;
        }

        public Criteria andIssnPrintEqualTo(String value) {
            addCriterion("issn_print =", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintNotEqualTo(String value) {
            addCriterion("issn_print <>", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintGreaterThan(String value) {
            addCriterion("issn_print >", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintGreaterThanOrEqualTo(String value) {
            addCriterion("issn_print >=", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintLessThan(String value) {
            addCriterion("issn_print <", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintLessThanOrEqualTo(String value) {
            addCriterion("issn_print <=", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintLike(String value) {
            addCriterion("issn_print like", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintNotLike(String value) {
            addCriterion("issn_print not like", value, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintIn(List<String> values) {
            addCriterion("issn_print in", values, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintNotIn(List<String> values) {
            addCriterion("issn_print not in", values, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintBetween(String value1, String value2) {
            addCriterion("issn_print between", value1, value2, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIssnPrintNotBetween(String value1, String value2) {
            addCriterion("issn_print not between", value1, value2, "issnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintIsNull() {
            addCriterion("isbn_print is null");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintIsNotNull() {
            addCriterion("isbn_print is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintEqualTo(String value) {
            addCriterion("isbn_print =", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintNotEqualTo(String value) {
            addCriterion("isbn_print <>", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintGreaterThan(String value) {
            addCriterion("isbn_print >", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintGreaterThanOrEqualTo(String value) {
            addCriterion("isbn_print >=", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintLessThan(String value) {
            addCriterion("isbn_print <", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintLessThanOrEqualTo(String value) {
            addCriterion("isbn_print <=", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintLike(String value) {
            addCriterion("isbn_print like", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintNotLike(String value) {
            addCriterion("isbn_print not like", value, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintIn(List<String> values) {
            addCriterion("isbn_print in", values, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintNotIn(List<String> values) {
            addCriterion("isbn_print not in", values, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintBetween(String value1, String value2) {
            addCriterion("isbn_print between", value1, value2, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andIsbnPrintNotBetween(String value1, String value2) {
            addCriterion("isbn_print not between", value1, value2, "isbnPrint");
            return (Criteria) this;
        }

        public Criteria andMetaUrlIsNull() {
            addCriterion("meta_url is null");
            return (Criteria) this;
        }

        public Criteria andMetaUrlIsNotNull() {
            addCriterion("meta_url is not null");
            return (Criteria) this;
        }

        public Criteria andMetaUrlEqualTo(String value) {
            addCriterion("meta_url =", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlNotEqualTo(String value) {
            addCriterion("meta_url <>", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlGreaterThan(String value) {
            addCriterion("meta_url >", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("meta_url >=", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlLessThan(String value) {
            addCriterion("meta_url <", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlLessThanOrEqualTo(String value) {
            addCriterion("meta_url <=", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlLike(String value) {
            addCriterion("meta_url like", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlNotLike(String value) {
            addCriterion("meta_url not like", value, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlIn(List<String> values) {
            addCriterion("meta_url in", values, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlNotIn(List<String> values) {
            addCriterion("meta_url not in", values, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlBetween(String value1, String value2) {
            addCriterion("meta_url between", value1, value2, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andMetaUrlNotBetween(String value1, String value2) {
            addCriterion("meta_url not between", value1, value2, "metaUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlIsNull() {
            addCriterion("text_url is null");
            return (Criteria) this;
        }

        public Criteria andTextUrlIsNotNull() {
            addCriterion("text_url is not null");
            return (Criteria) this;
        }

        public Criteria andTextUrlEqualTo(String value) {
            addCriterion("text_url =", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlNotEqualTo(String value) {
            addCriterion("text_url <>", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlGreaterThan(String value) {
            addCriterion("text_url >", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlGreaterThanOrEqualTo(String value) {
            addCriterion("text_url >=", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlLessThan(String value) {
            addCriterion("text_url <", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlLessThanOrEqualTo(String value) {
            addCriterion("text_url <=", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlLike(String value) {
            addCriterion("text_url like", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlNotLike(String value) {
            addCriterion("text_url not like", value, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlIn(List<String> values) {
            addCriterion("text_url in", values, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlNotIn(List<String> values) {
            addCriterion("text_url not in", values, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlBetween(String value1, String value2) {
            addCriterion("text_url between", value1, value2, "textUrl");
            return (Criteria) this;
        }

        public Criteria andTextUrlNotBetween(String value1, String value2) {
            addCriterion("text_url not between", value1, value2, "textUrl");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNull() {
            addCriterion("book_type is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNotNull() {
            addCriterion("book_type is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeEqualTo(String value) {
            addCriterion("book_type =", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotEqualTo(String value) {
            addCriterion("book_type <>", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThan(String value) {
            addCriterion("book_type >", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThanOrEqualTo(String value) {
            addCriterion("book_type >=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThan(String value) {
            addCriterion("book_type <", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThanOrEqualTo(String value) {
            addCriterion("book_type <=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLike(String value) {
            addCriterion("book_type like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotLike(String value) {
            addCriterion("book_type not like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeIn(List<String> values) {
            addCriterion("book_type in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotIn(List<String> values) {
            addCriterion("book_type not in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeBetween(String value1, String value2) {
            addCriterion("book_type between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotBetween(String value1, String value2) {
            addCriterion("book_type not between", value1, value2, "bookType");
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