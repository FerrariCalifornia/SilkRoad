package com.cc.pojo;

public class RegulationRepoWithBLOBs extends RegulationRepo {
    private String abstractA;

    private String scope;

    private String purpose;

    public String getAbstractA() {
        return abstractA;
    }

    public void setAbstractA(String abstractA) {
        this.abstractA = abstractA;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}