package com.accp.domain;

public class Goodcolor {
    private Integer goodcolorid;

    private String goodcolorname;

    private Integer goodcololoveid;

    private String remark;

    private String remark1;

    public Integer getGoodcolorid() {
        return goodcolorid;
    }

    public void setGoodcolorid(Integer goodcolorid) {
        this.goodcolorid = goodcolorid;
    }

    public String getGoodcolorname() {
        return goodcolorname;
    }

    public void setGoodcolorname(String goodcolorname) {
        this.goodcolorname = goodcolorname == null ? null : goodcolorname.trim();
    }

    public Integer getGoodcololoveid() {
        return goodcololoveid;
    }

    public void setGoodcololoveid(Integer goodcololoveid) {
        this.goodcololoveid = goodcololoveid;
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