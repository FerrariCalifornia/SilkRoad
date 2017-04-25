package com.cc.pojo;

public class Rec {
    private Integer id;

    private String userId;

    private Integer resTypeId;

    private String recommendIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getResTypeId() {
        return resTypeId;
    }

    public void setResTypeId(Integer resTypeId) {
        this.resTypeId = resTypeId;
    }

    public String getRecommendIds() {
        return recommendIds;
    }

    public void setRecommendIds(String recommendIds) {
        this.recommendIds = recommendIds;
    }
}