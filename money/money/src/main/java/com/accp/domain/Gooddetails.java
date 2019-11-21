package com.accp.domain;

public class Gooddetails {
    private Integer gooddetailsid;

    private Integer goodcolorid;

    private Integer goodsizeid;

    private Integer gooddetailscount;

    private String remark;

    private String remark1;

    public Integer getGooddetailsid() {
        return gooddetailsid;
    }

    public void setGooddetailsid(Integer gooddetailsid) {
        this.gooddetailsid = gooddetailsid;
    }

    public Integer getGoodcolorid() {
        return goodcolorid;
    }

    public void setGoodcolorid(Integer goodcolorid) {
        this.goodcolorid = goodcolorid;
    }

    public Integer getGoodsizeid() {
        return goodsizeid;
    }

    public void setGoodsizeid(Integer goodsizeid) {
        this.goodsizeid = goodsizeid;
    }

    public Integer getGooddetailscount() {
        return gooddetailscount;
    }

    public void setGooddetailscount(Integer gooddetailscount) {
        this.gooddetailscount = gooddetailscount;
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