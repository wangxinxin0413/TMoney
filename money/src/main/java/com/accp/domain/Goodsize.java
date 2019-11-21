package com.accp.domain;

public class Goodsize {
    private Integer goodsizeid;

    private String goodsizename;

    private String remark;

    private String remark1;

    public Integer getGoodsizeid() {
        return goodsizeid;
    }

    public void setGoodsizeid(Integer goodsizeid) {
        this.goodsizeid = goodsizeid;
    }

    public String getGoodsizename() {
        return goodsizename;
    }

    public void setGoodsizename(String goodsizename) {
        this.goodsizename = goodsizename == null ? null : goodsizename.trim();
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