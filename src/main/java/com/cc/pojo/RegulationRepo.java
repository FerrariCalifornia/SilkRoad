package com.cc.pojo;

import java.util.Date;

public class RegulationRepo {
    private String id;

    private String doi;

    private String url;

    private String title;

    private String status;

    private Date datePublication;

    private String onlineIsbn;

    private String authorKeywords;

    private String definition;

    private String fullText;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getOnlineIsbn() {
        return onlineIsbn;
    }

    public void setOnlineIsbn(String onlineIsbn) {
        this.onlineIsbn = onlineIsbn;
    }

    public String getAuthorKeywords() {
        return authorKeywords;
    }

    public void setAuthorKeywords(String authorKeywords) {
        this.authorKeywords = authorKeywords;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }
}