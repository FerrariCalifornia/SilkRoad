package com.cc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UansrRepoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UansrRepoExample() {
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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

        public Criteria andOrginalPublicationIsNull() {
            addCriterion("orginal_publication is null");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationIsNotNull() {
            addCriterion("orginal_publication is not null");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationEqualTo(String value) {
            addCriterion("orginal_publication =", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationNotEqualTo(String value) {
            addCriterion("orginal_publication <>", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationGreaterThan(String value) {
            addCriterion("orginal_publication >", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationGreaterThanOrEqualTo(String value) {
            addCriterion("orginal_publication >=", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationLessThan(String value) {
            addCriterion("orginal_publication <", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationLessThanOrEqualTo(String value) {
            addCriterion("orginal_publication <=", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationLike(String value) {
            addCriterion("orginal_publication like", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationNotLike(String value) {
            addCriterion("orginal_publication not like", value, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationIn(List<String> values) {
            addCriterion("orginal_publication in", values, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationNotIn(List<String> values) {
            addCriterion("orginal_publication not in", values, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationBetween(String value1, String value2) {
            addCriterion("orginal_publication between", value1, value2, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationNotBetween(String value1, String value2) {
            addCriterion("orginal_publication not between", value1, value2, "orginalPublication");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
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

        public Criteria andStartPageEqualTo(Integer value) {
            addCriterion("start_page =", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotEqualTo(Integer value) {
            addCriterion("start_page <>", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThan(Integer value) {
            addCriterion("start_page >", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_page >=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThan(Integer value) {
            addCriterion("start_page <", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThanOrEqualTo(Integer value) {
            addCriterion("start_page <=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageIn(List<Integer> values) {
            addCriterion("start_page in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotIn(List<Integer> values) {
            addCriterion("start_page not in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageBetween(Integer value1, Integer value2) {
            addCriterion("start_page between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotBetween(Integer value1, Integer value2) {
            addCriterion("start_page not between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andEndPageIsNull() {
            addCriterion("end_page is null");
            return (Criteria) this;
        }

        public Criteria andEndPageIsNotNull() {
            addCriterion("end_page is not null");
            return (Criteria) this;
        }

        public Criteria andEndPageEqualTo(Integer value) {
            addCriterion("end_page =", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageNotEqualTo(Integer value) {
            addCriterion("end_page <>", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageGreaterThan(Integer value) {
            addCriterion("end_page >", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_page >=", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageLessThan(Integer value) {
            addCriterion("end_page <", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageLessThanOrEqualTo(Integer value) {
            addCriterion("end_page <=", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageIn(List<Integer> values) {
            addCriterion("end_page in", values, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageNotIn(List<Integer> values) {
            addCriterion("end_page not in", values, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageBetween(Integer value1, Integer value2) {
            addCriterion("end_page between", value1, value2, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageNotBetween(Integer value1, Integer value2) {
            addCriterion("end_page not between", value1, value2, "endPage");
            return (Criteria) this;
        }

        public Criteria andPageCounterIsNull() {
            addCriterion("page_counter is null");
            return (Criteria) this;
        }

        public Criteria andPageCounterIsNotNull() {
            addCriterion("page_counter is not null");
            return (Criteria) this;
        }

        public Criteria andPageCounterEqualTo(Integer value) {
            addCriterion("page_counter =", value, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterNotEqualTo(Integer value) {
            addCriterion("page_counter <>", value, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterGreaterThan(Integer value) {
            addCriterion("page_counter >", value, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_counter >=", value, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterLessThan(Integer value) {
            addCriterion("page_counter <", value, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterLessThanOrEqualTo(Integer value) {
            addCriterion("page_counter <=", value, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterIn(List<Integer> values) {
            addCriterion("page_counter in", values, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterNotIn(List<Integer> values) {
            addCriterion("page_counter not in", values, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterBetween(Integer value1, Integer value2) {
            addCriterion("page_counter between", value1, value2, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andPageCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("page_counter not between", value1, value2, "pageCounter");
            return (Criteria) this;
        }

        public Criteria andCitingPaperIsNull() {
            addCriterion("citing_paper is null");
            return (Criteria) this;
        }

        public Criteria andCitingPaperIsNotNull() {
            addCriterion("citing_paper is not null");
            return (Criteria) this;
        }

        public Criteria andCitingPaperEqualTo(String value) {
            addCriterion("citing_paper =", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperNotEqualTo(String value) {
            addCriterion("citing_paper <>", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperGreaterThan(String value) {
            addCriterion("citing_paper >", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperGreaterThanOrEqualTo(String value) {
            addCriterion("citing_paper >=", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperLessThan(String value) {
            addCriterion("citing_paper <", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperLessThanOrEqualTo(String value) {
            addCriterion("citing_paper <=", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperLike(String value) {
            addCriterion("citing_paper like", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperNotLike(String value) {
            addCriterion("citing_paper not like", value, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperIn(List<String> values) {
            addCriterion("citing_paper in", values, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperNotIn(List<String> values) {
            addCriterion("citing_paper not in", values, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperBetween(String value1, String value2) {
            addCriterion("citing_paper between", value1, value2, "citingPaper");
            return (Criteria) this;
        }

        public Criteria andCitingPaperNotBetween(String value1, String value2) {
            addCriterion("citing_paper not between", value1, value2, "citingPaper");
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

        public Criteria andInstitutionOwnerIsNull() {
            addCriterion("institution_owner is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerIsNotNull() {
            addCriterion("institution_owner is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerEqualTo(String value) {
            addCriterion("institution_owner =", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerNotEqualTo(String value) {
            addCriterion("institution_owner <>", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerGreaterThan(String value) {
            addCriterion("institution_owner >", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("institution_owner >=", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerLessThan(String value) {
            addCriterion("institution_owner <", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerLessThanOrEqualTo(String value) {
            addCriterion("institution_owner <=", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerLike(String value) {
            addCriterion("institution_owner like", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerNotLike(String value) {
            addCriterion("institution_owner not like", value, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerIn(List<String> values) {
            addCriterion("institution_owner in", values, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerNotIn(List<String> values) {
            addCriterion("institution_owner not in", values, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerBetween(String value1, String value2) {
            addCriterion("institution_owner between", value1, value2, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andInstitutionOwnerNotBetween(String value1, String value2) {
            addCriterion("institution_owner not between", value1, value2, "institutionOwner");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionIsNull() {
            addCriterion("author_with_institution is null");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionIsNotNull() {
            addCriterion("author_with_institution is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionEqualTo(String value) {
            addCriterion("author_with_institution =", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionNotEqualTo(String value) {
            addCriterion("author_with_institution <>", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionGreaterThan(String value) {
            addCriterion("author_with_institution >", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("author_with_institution >=", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionLessThan(String value) {
            addCriterion("author_with_institution <", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionLessThanOrEqualTo(String value) {
            addCriterion("author_with_institution <=", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionLike(String value) {
            addCriterion("author_with_institution like", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionNotLike(String value) {
            addCriterion("author_with_institution not like", value, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionIn(List<String> values) {
            addCriterion("author_with_institution in", values, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionNotIn(List<String> values) {
            addCriterion("author_with_institution not in", values, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionBetween(String value1, String value2) {
            addCriterion("author_with_institution between", value1, value2, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andAuthorWithInstitutionNotBetween(String value1, String value2) {
            addCriterion("author_with_institution not between", value1, value2, "authorWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordIsNull() {
            addCriterion("author_keyword is null");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordIsNotNull() {
            addCriterion("author_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordEqualTo(String value) {
            addCriterion("author_keyword =", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordNotEqualTo(String value) {
            addCriterion("author_keyword <>", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordGreaterThan(String value) {
            addCriterion("author_keyword >", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("author_keyword >=", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordLessThan(String value) {
            addCriterion("author_keyword <", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordLessThanOrEqualTo(String value) {
            addCriterion("author_keyword <=", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordLike(String value) {
            addCriterion("author_keyword like", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordNotLike(String value) {
            addCriterion("author_keyword not like", value, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordIn(List<String> values) {
            addCriterion("author_keyword in", values, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordNotIn(List<String> values) {
            addCriterion("author_keyword not in", values, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordBetween(String value1, String value2) {
            addCriterion("author_keyword between", value1, value2, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andAuthorKeywordNotBetween(String value1, String value2) {
            addCriterion("author_keyword not between", value1, value2, "authorKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordIsNull() {
            addCriterion("index_keyword is null");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordIsNotNull() {
            addCriterion("index_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordEqualTo(String value) {
            addCriterion("index_keyword =", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordNotEqualTo(String value) {
            addCriterion("index_keyword <>", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordGreaterThan(String value) {
            addCriterion("index_keyword >", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("index_keyword >=", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordLessThan(String value) {
            addCriterion("index_keyword <", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordLessThanOrEqualTo(String value) {
            addCriterion("index_keyword <=", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordLike(String value) {
            addCriterion("index_keyword like", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordNotLike(String value) {
            addCriterion("index_keyword not like", value, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordIn(List<String> values) {
            addCriterion("index_keyword in", values, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordNotIn(List<String> values) {
            addCriterion("index_keyword not in", values, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordBetween(String value1, String value2) {
            addCriterion("index_keyword between", value1, value2, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andIndexKeywordNotBetween(String value1, String value2) {
            addCriterion("index_keyword not between", value1, value2, "indexKeyword");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberIsNull() {
            addCriterion("analysis_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberIsNotNull() {
            addCriterion("analysis_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberEqualTo(String value) {
            addCriterion("analysis_serial_number =", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberNotEqualTo(String value) {
            addCriterion("analysis_serial_number <>", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberGreaterThan(String value) {
            addCriterion("analysis_serial_number >", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("analysis_serial_number >=", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberLessThan(String value) {
            addCriterion("analysis_serial_number <", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("analysis_serial_number <=", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberLike(String value) {
            addCriterion("analysis_serial_number like", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberNotLike(String value) {
            addCriterion("analysis_serial_number not like", value, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberIn(List<String> values) {
            addCriterion("analysis_serial_number in", values, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberNotIn(List<String> values) {
            addCriterion("analysis_serial_number not in", values, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberBetween(String value1, String value2) {
            addCriterion("analysis_serial_number between", value1, value2, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisSerialNumberNotBetween(String value1, String value2) {
            addCriterion("analysis_serial_number not between", value1, value2, "analysisSerialNumber");
            return (Criteria) this;
        }

        public Criteria andCasIsNull() {
            addCriterion("cas is null");
            return (Criteria) this;
        }

        public Criteria andCasIsNotNull() {
            addCriterion("cas is not null");
            return (Criteria) this;
        }

        public Criteria andCasEqualTo(String value) {
            addCriterion("cas =", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotEqualTo(String value) {
            addCriterion("cas <>", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasGreaterThan(String value) {
            addCriterion("cas >", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasGreaterThanOrEqualTo(String value) {
            addCriterion("cas >=", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasLessThan(String value) {
            addCriterion("cas <", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasLessThanOrEqualTo(String value) {
            addCriterion("cas <=", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasLike(String value) {
            addCriterion("cas like", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotLike(String value) {
            addCriterion("cas not like", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasIn(List<String> values) {
            addCriterion("cas in", values, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotIn(List<String> values) {
            addCriterion("cas not in", values, "cas");
            return (Criteria) this;
        }

        public Criteria andCasBetween(String value1, String value2) {
            addCriterion("cas between", value1, value2, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotBetween(String value1, String value2) {
            addCriterion("cas not between", value1, value2, "cas");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andFundingInfoIsNull() {
            addCriterion("funding_info is null");
            return (Criteria) this;
        }

        public Criteria andFundingInfoIsNotNull() {
            addCriterion("funding_info is not null");
            return (Criteria) this;
        }

        public Criteria andFundingInfoEqualTo(String value) {
            addCriterion("funding_info =", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoNotEqualTo(String value) {
            addCriterion("funding_info <>", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoGreaterThan(String value) {
            addCriterion("funding_info >", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoGreaterThanOrEqualTo(String value) {
            addCriterion("funding_info >=", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoLessThan(String value) {
            addCriterion("funding_info <", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoLessThanOrEqualTo(String value) {
            addCriterion("funding_info <=", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoLike(String value) {
            addCriterion("funding_info like", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoNotLike(String value) {
            addCriterion("funding_info not like", value, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoIn(List<String> values) {
            addCriterion("funding_info in", values, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoNotIn(List<String> values) {
            addCriterion("funding_info not in", values, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoBetween(String value1, String value2) {
            addCriterion("funding_info between", value1, value2, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andFundingInfoNotBetween(String value1, String value2) {
            addCriterion("funding_info not between", value1, value2, "fundingInfo");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNull() {
            addCriterion("reference is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNotNull() {
            addCriterion("reference is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceEqualTo(String value) {
            addCriterion("reference =", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotEqualTo(String value) {
            addCriterion("reference <>", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThan(String value) {
            addCriterion("reference >", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("reference >=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThan(String value) {
            addCriterion("reference <", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThanOrEqualTo(String value) {
            addCriterion("reference <=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLike(String value) {
            addCriterion("reference like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotLike(String value) {
            addCriterion("reference not like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceIn(List<String> values) {
            addCriterion("reference in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotIn(List<String> values) {
            addCriterion("reference not in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceBetween(String value1, String value2) {
            addCriterion("reference between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotBetween(String value1, String value2) {
            addCriterion("reference not between", value1, value2, "reference");
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

        public Criteria andEditorIsNull() {
            addCriterion("editor is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("editor is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("editor =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("editor <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("editor >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("editor >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("editor <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("editor <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("editor like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("editor not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("editor in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("editor not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("editor between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("editor not between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andFundingAgentIsNull() {
            addCriterion("funding_agent is null");
            return (Criteria) this;
        }

        public Criteria andFundingAgentIsNotNull() {
            addCriterion("funding_agent is not null");
            return (Criteria) this;
        }

        public Criteria andFundingAgentEqualTo(String value) {
            addCriterion("funding_agent =", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentNotEqualTo(String value) {
            addCriterion("funding_agent <>", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentGreaterThan(String value) {
            addCriterion("funding_agent >", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentGreaterThanOrEqualTo(String value) {
            addCriterion("funding_agent >=", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentLessThan(String value) {
            addCriterion("funding_agent <", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentLessThanOrEqualTo(String value) {
            addCriterion("funding_agent <=", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentLike(String value) {
            addCriterion("funding_agent like", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentNotLike(String value) {
            addCriterion("funding_agent not like", value, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentIn(List<String> values) {
            addCriterion("funding_agent in", values, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentNotIn(List<String> values) {
            addCriterion("funding_agent not in", values, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentBetween(String value1, String value2) {
            addCriterion("funding_agent between", value1, value2, "fundingAgent");
            return (Criteria) this;
        }

        public Criteria andFundingAgentNotBetween(String value1, String value2) {
            addCriterion("funding_agent not between", value1, value2, "fundingAgent");
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

        public Criteria andConferenceTitleIsNull() {
            addCriterion("conference_title is null");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleIsNotNull() {
            addCriterion("conference_title is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleEqualTo(String value) {
            addCriterion("conference_title =", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotEqualTo(String value) {
            addCriterion("conference_title <>", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleGreaterThan(String value) {
            addCriterion("conference_title >", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("conference_title >=", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleLessThan(String value) {
            addCriterion("conference_title <", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleLessThanOrEqualTo(String value) {
            addCriterion("conference_title <=", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleLike(String value) {
            addCriterion("conference_title like", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotLike(String value) {
            addCriterion("conference_title not like", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleIn(List<String> values) {
            addCriterion("conference_title in", values, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotIn(List<String> values) {
            addCriterion("conference_title not in", values, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleBetween(String value1, String value2) {
            addCriterion("conference_title between", value1, value2, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotBetween(String value1, String value2) {
            addCriterion("conference_title not between", value1, value2, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceDateIsNull() {
            addCriterion("conference_date is null");
            return (Criteria) this;
        }

        public Criteria andConferenceDateIsNotNull() {
            addCriterion("conference_date is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceDateEqualTo(Date value) {
            addCriterion("conference_date =", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateNotEqualTo(Date value) {
            addCriterion("conference_date <>", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateGreaterThan(Date value) {
            addCriterion("conference_date >", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("conference_date >=", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateLessThan(Date value) {
            addCriterion("conference_date <", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateLessThanOrEqualTo(Date value) {
            addCriterion("conference_date <=", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateIn(List<Date> values) {
            addCriterion("conference_date in", values, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateNotIn(List<Date> values) {
            addCriterion("conference_date not in", values, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateBetween(Date value1, Date value2) {
            addCriterion("conference_date between", value1, value2, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateNotBetween(Date value1, Date value2) {
            addCriterion("conference_date not between", value1, value2, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationIsNull() {
            addCriterion("conference_location is null");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationIsNotNull() {
            addCriterion("conference_location is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationEqualTo(String value) {
            addCriterion("conference_location =", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationNotEqualTo(String value) {
            addCriterion("conference_location <>", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationGreaterThan(String value) {
            addCriterion("conference_location >", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationGreaterThanOrEqualTo(String value) {
            addCriterion("conference_location >=", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationLessThan(String value) {
            addCriterion("conference_location <", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationLessThanOrEqualTo(String value) {
            addCriterion("conference_location <=", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationLike(String value) {
            addCriterion("conference_location like", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationNotLike(String value) {
            addCriterion("conference_location not like", value, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationIn(List<String> values) {
            addCriterion("conference_location in", values, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationNotIn(List<String> values) {
            addCriterion("conference_location not in", values, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationBetween(String value1, String value2) {
            addCriterion("conference_location between", value1, value2, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceLocationNotBetween(String value1, String value2) {
            addCriterion("conference_location not between", value1, value2, "conferenceLocation");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeIsNull() {
            addCriterion("conference_code is null");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeIsNotNull() {
            addCriterion("conference_code is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeEqualTo(String value) {
            addCriterion("conference_code =", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeNotEqualTo(String value) {
            addCriterion("conference_code <>", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeGreaterThan(String value) {
            addCriterion("conference_code >", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("conference_code >=", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeLessThan(String value) {
            addCriterion("conference_code <", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeLessThanOrEqualTo(String value) {
            addCriterion("conference_code <=", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeLike(String value) {
            addCriterion("conference_code like", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeNotLike(String value) {
            addCriterion("conference_code not like", value, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeIn(List<String> values) {
            addCriterion("conference_code in", values, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeNotIn(List<String> values) {
            addCriterion("conference_code not in", values, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeBetween(String value1, String value2) {
            addCriterion("conference_code between", value1, value2, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andConferenceCodeNotBetween(String value1, String value2) {
            addCriterion("conference_code not between", value1, value2, "conferenceCode");
            return (Criteria) this;
        }

        public Criteria andIssnIsNull() {
            addCriterion("issn is null");
            return (Criteria) this;
        }

        public Criteria andIssnIsNotNull() {
            addCriterion("issn is not null");
            return (Criteria) this;
        }

        public Criteria andIssnEqualTo(String value) {
            addCriterion("issn =", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotEqualTo(String value) {
            addCriterion("issn <>", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThan(String value) {
            addCriterion("issn >", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThanOrEqualTo(String value) {
            addCriterion("issn >=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThan(String value) {
            addCriterion("issn <", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThanOrEqualTo(String value) {
            addCriterion("issn <=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLike(String value) {
            addCriterion("issn like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotLike(String value) {
            addCriterion("issn not like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnIn(List<String> values) {
            addCriterion("issn in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotIn(List<String> values) {
            addCriterion("issn not in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnBetween(String value1, String value2) {
            addCriterion("issn between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotBetween(String value1, String value2) {
            addCriterion("issn not between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andCodenIsNull() {
            addCriterion("coden is null");
            return (Criteria) this;
        }

        public Criteria andCodenIsNotNull() {
            addCriterion("coden is not null");
            return (Criteria) this;
        }

        public Criteria andCodenEqualTo(String value) {
            addCriterion("coden =", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenNotEqualTo(String value) {
            addCriterion("coden <>", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenGreaterThan(String value) {
            addCriterion("coden >", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenGreaterThanOrEqualTo(String value) {
            addCriterion("coden >=", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenLessThan(String value) {
            addCriterion("coden <", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenLessThanOrEqualTo(String value) {
            addCriterion("coden <=", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenLike(String value) {
            addCriterion("coden like", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenNotLike(String value) {
            addCriterion("coden not like", value, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenIn(List<String> values) {
            addCriterion("coden in", values, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenNotIn(List<String> values) {
            addCriterion("coden not in", values, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenBetween(String value1, String value2) {
            addCriterion("coden between", value1, value2, "coden");
            return (Criteria) this;
        }

        public Criteria andCodenNotBetween(String value1, String value2) {
            addCriterion("coden not between", value1, value2, "coden");
            return (Criteria) this;
        }

        public Criteria andPubmedIdIsNull() {
            addCriterion("pubmed_id is null");
            return (Criteria) this;
        }

        public Criteria andPubmedIdIsNotNull() {
            addCriterion("pubmed_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubmedIdEqualTo(String value) {
            addCriterion("pubmed_id =", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdNotEqualTo(String value) {
            addCriterion("pubmed_id <>", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdGreaterThan(String value) {
            addCriterion("pubmed_id >", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdGreaterThanOrEqualTo(String value) {
            addCriterion("pubmed_id >=", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdLessThan(String value) {
            addCriterion("pubmed_id <", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdLessThanOrEqualTo(String value) {
            addCriterion("pubmed_id <=", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdLike(String value) {
            addCriterion("pubmed_id like", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdNotLike(String value) {
            addCriterion("pubmed_id not like", value, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdIn(List<String> values) {
            addCriterion("pubmed_id in", values, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdNotIn(List<String> values) {
            addCriterion("pubmed_id not in", values, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdBetween(String value1, String value2) {
            addCriterion("pubmed_id between", value1, value2, "pubmedId");
            return (Criteria) this;
        }

        public Criteria andPubmedIdNotBetween(String value1, String value2) {
            addCriterion("pubmed_id not between", value1, value2, "pubmedId");
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

        public Criteria andOrginalPublicationAbbrIsNull() {
            addCriterion("orginal_publication_abbr is null");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrIsNotNull() {
            addCriterion("orginal_publication_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrEqualTo(String value) {
            addCriterion("orginal_publication_abbr =", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrNotEqualTo(String value) {
            addCriterion("orginal_publication_abbr <>", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrGreaterThan(String value) {
            addCriterion("orginal_publication_abbr >", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("orginal_publication_abbr >=", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrLessThan(String value) {
            addCriterion("orginal_publication_abbr <", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrLessThanOrEqualTo(String value) {
            addCriterion("orginal_publication_abbr <=", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrLike(String value) {
            addCriterion("orginal_publication_abbr like", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrNotLike(String value) {
            addCriterion("orginal_publication_abbr not like", value, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrIn(List<String> values) {
            addCriterion("orginal_publication_abbr in", values, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrNotIn(List<String> values) {
            addCriterion("orginal_publication_abbr not in", values, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrBetween(String value1, String value2) {
            addCriterion("orginal_publication_abbr between", value1, value2, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andOrginalPublicationAbbrNotBetween(String value1, String value2) {
            addCriterion("orginal_publication_abbr not between", value1, value2, "orginalPublicationAbbr");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNull() {
            addCriterion("paper_type is null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNotNull() {
            addCriterion("paper_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeEqualTo(String value) {
            addCriterion("paper_type =", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotEqualTo(String value) {
            addCriterion("paper_type <>", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThan(String value) {
            addCriterion("paper_type >", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("paper_type >=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThan(String value) {
            addCriterion("paper_type <", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThanOrEqualTo(String value) {
            addCriterion("paper_type <=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLike(String value) {
            addCriterion("paper_type like", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotLike(String value) {
            addCriterion("paper_type not like", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIn(List<String> values) {
            addCriterion("paper_type in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotIn(List<String> values) {
            addCriterion("paper_type not in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeBetween(String value1, String value2) {
            addCriterion("paper_type between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotBetween(String value1, String value2) {
            addCriterion("paper_type not between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationIsNull() {
            addCriterion("source_of_publication is null");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationIsNotNull() {
            addCriterion("source_of_publication is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationEqualTo(String value) {
            addCriterion("source_of_publication =", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationNotEqualTo(String value) {
            addCriterion("source_of_publication <>", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationGreaterThan(String value) {
            addCriterion("source_of_publication >", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationGreaterThanOrEqualTo(String value) {
            addCriterion("source_of_publication >=", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationLessThan(String value) {
            addCriterion("source_of_publication <", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationLessThanOrEqualTo(String value) {
            addCriterion("source_of_publication <=", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationLike(String value) {
            addCriterion("source_of_publication like", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationNotLike(String value) {
            addCriterion("source_of_publication not like", value, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationIn(List<String> values) {
            addCriterion("source_of_publication in", values, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationNotIn(List<String> values) {
            addCriterion("source_of_publication not in", values, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationBetween(String value1, String value2) {
            addCriterion("source_of_publication between", value1, value2, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andSourceOfPublicationNotBetween(String value1, String value2) {
            addCriterion("source_of_publication not between", value1, value2, "sourceOfPublication");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(String value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(String value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(String value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(String value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(String value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(String value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLike(String value) {
            addCriterion("eid like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotLike(String value) {
            addCriterion("eid not like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<String> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<String> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(String value1, String value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(String value1, String value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectIsNull() {
            addCriterion("paper_subject is null");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectIsNotNull() {
            addCriterion("paper_subject is not null");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectEqualTo(String value) {
            addCriterion("paper_subject =", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectNotEqualTo(String value) {
            addCriterion("paper_subject <>", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectGreaterThan(String value) {
            addCriterion("paper_subject >", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("paper_subject >=", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectLessThan(String value) {
            addCriterion("paper_subject <", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectLessThanOrEqualTo(String value) {
            addCriterion("paper_subject <=", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectLike(String value) {
            addCriterion("paper_subject like", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectNotLike(String value) {
            addCriterion("paper_subject not like", value, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectIn(List<String> values) {
            addCriterion("paper_subject in", values, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectNotIn(List<String> values) {
            addCriterion("paper_subject not in", values, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectBetween(String value1, String value2) {
            addCriterion("paper_subject between", value1, value2, "paperSubject");
            return (Criteria) this;
        }

        public Criteria andPaperSubjectNotBetween(String value1, String value2) {
            addCriterion("paper_subject not between", value1, value2, "paperSubject");
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