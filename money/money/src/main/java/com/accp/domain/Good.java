package com.accp.domain;

public class Good {
    private Integer goodid;

    private Integer goodtypeid;

    private String goodname;

    private String goodphoto;

    private String goodcode;

    private String goodbrand;

    private Integer goodsum;

    private String goodtext;

    private Double goodtagprice;

    private Double goodcostprice;

    private String remark;

    private String remark1;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getGoodtypeid() {
        return goodtypeid;
    }

    public void setGoodtypeid(Integer goodtypeid) {
        this.goodtypeid = goodtypeid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public String getGoodphoto() {
        return goodphoto;
    }

    public void setGoodphoto(String goodphoto) {
        this.goodphoto = goodphoto == null ? null : goodphoto.trim();
    }

    public String getGoodcode() {
        return goodcode;
    }

    public void setGoodcode(String goodcode) {
        this.goodcode = goodcode == null ? null : goodcode.trim();
    }

    public String getGoodbrand() {
        return goodbrand;
    }

    public void setGoodbrand(String goodbrand) {
        this.goodbrand = goodbrand == null ? null : goodbrand.trim();
    }

    public Integer getGoodsum() {
        return goodsum;
    }

    public void setGoodsum(Integer goodsum) {
        this.goodsum = goodsum;
    }

    public String getGoodtext() {
        return goodtext;
    }

    public void setGoodtext(String goodtext) {
        this.goodtext = goodtext == null ? null : goodtext.trim();
    }

    public Double getGoodtagprice() {
        return goodtagprice;
    }

    public void setGoodtagprice(Double goodtagprice) {
        this.goodtagprice = goodtagprice;
    }

    public Double getGoodcostprice() {
        return goodcostprice;
    }

    public void setGoodcostprice(Double goodcostprice) {
        this.goodcostprice = goodcostprice;
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