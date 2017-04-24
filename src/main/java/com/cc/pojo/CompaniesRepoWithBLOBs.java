package com.cc.pojo;

public class CompaniesRepoWithBLOBs extends CompaniesRepo {
    private String summary;

    private String overview;

    private String financials;

    private String executives;

    private String competitors;

    private String rankings;

    private String history;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getFinancials() {
        return financials;
    }

    public void setFinancials(String financials) {
        this.financials = financials;
    }

    public String getExecutives() {
        return executives;
    }

    public void setExecutives(String executives) {
        this.executives = executives;
    }

    public String getCompetitors() {
        return competitors;
    }

    public void setCompetitors(String competitors) {
        this.competitors = competitors;
    }

    public String getRankings() {
        return rankings;
    }

    public void setRankings(String rankings) {
        this.rankings = rankings;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}