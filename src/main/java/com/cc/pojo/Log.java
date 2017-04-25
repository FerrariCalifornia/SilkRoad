package com.cc.pojo;

import java.util.Date;

public class Log {
    private String id;

    private Date clickTime;

    private String keywords;

    private String res_id;

    private String resType;

    private Integer resTypeId;

    private String role;

    private String url;

    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getClickTime() {
        return clickTime;
    }

    public void setClickTime(Date clickTime) {
        this.clickTime = clickTime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getResId() {
        return res_id;
    }

    public void setResId(String resId) {
        this.res_id = resId;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public Integer getResTypeId() {
        return resTypeId;
    }

    public void setResTypeId(Integer resTypeId) {
        this.resTypeId = resTypeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "id='" + id + '\'' +
                ", clickTime=" + clickTime +
                ", keywords='" + keywords + '\'' +
                ", resId='" + res_id + '\'' +
                ", resType='" + resType + '\'' +
                ", resTypeId=" + resTypeId +
                ", role='" + role + '\'' +
                ", url='" + url + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public Log(Integer resTypeId, String userId) {
        this.resTypeId = resTypeId;
        this.userId = userId;
    }
}