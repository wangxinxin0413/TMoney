package com.accp.domain;

public class Goodtype {
    private Integer goodtypeid;

    private String goodtypename;

    private String remark;

    private String remark1;

    public Integer getGoodtypeid() {
        return goodtypeid;
    }

    public void setGoodtypeid(Integer goodtypeid) {
        this.goodtypeid = goodtypeid;
    }

    public String getGoodtypename() {
        return goodtypename;
    }

    public void setGoodtypename(String goodtypename) {
        this.goodtypename = goodtypename == null ? null : goodtypename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}