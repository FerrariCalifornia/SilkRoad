package com.cc.pojo;

import java.util.Date;

public class PebookRepo {
    private String id;

    private String title;

    private String language;

    private String issnOnline;

    private String isbnOnline;

    private String doi;

    private Date datePublication;

    private Integer pages;

    private String bookTitle;

    private String issnPrint;

    private String isbnPrint;

    private String metaUrl;

    private String textUrl;

    private String bookType;

    private String summary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIssnOnline() {
        return issnOnline;
    }

    public void setIssnOnline(String issnOnline) {
        this.issnOnline = issnOnline;
    }

    public String getIsbnOnline() {
        return isbnOnline;
    }

    public void setIsbnOnline(String isbnOnline) {
        this.isbnOnline = isbnOnline;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getIssnPrint() {
        return issnPrint;
    }

    public void setIssnPrint(String issnPrint) {
        this.issnPrint = issnPrint;
    }

    public String getIsbnPrint() {
        return isbnPrint;
    }

    public void setIsbnPrint(String isbnPrint) {
        this.isbnPrint = isbnPrint;
    }

    public String getMetaUrl() {
        return metaUrl;
    }

    public void setMetaUrl(String metaUrl) {
        this.metaUrl = metaUrl;
    }

    public String getTextUrl() {
        return textUrl;
    }

    public void setTextUrl(String textUrl) {
        this.textUrl = textUrl;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}