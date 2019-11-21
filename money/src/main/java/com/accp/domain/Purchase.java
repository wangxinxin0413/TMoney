package com.accp.domain;

import java.util.Date;

public class Purchase {
    private Integer purchaseid;

    private String purchasedanhao;

    private Date purchasedate;

    private Integer supplierid;

    private String suppliername;

    private Integer uid;

    private String purchasebz;

    private String uname;

    private String examine;

    private String remark;

    private String remark1;

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getPurchasedanhao() {
        return purchasedanhao;
    }

    public void setPurchasedanhao(String purchasedanhao) {
        this.purchasedanhao = purchasedanhao == null ? null : purchasedanhao.trim();
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPurchasebz() {
        return purchasebz;
    }

    public void setPurchasebz(String purchasebz) {
        this.purchasebz = purchasebz == null ? null : purchasebz.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine == null ? null : examine.trim();
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