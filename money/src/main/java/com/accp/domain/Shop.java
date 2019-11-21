package com.accp.domain;

public class Shop {
    private Integer shopid;

    private String shopname;

    private String shopsynopsis;

    private String shopcontacts;

    private String shoptelephone;

    private String shopsheng;

    private String shopshi;

    private String shopqu;

    private String shopadd;

    private String remark;

    private String remark1;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopsynopsis() {
        return shopsynopsis;
    }

    public void setShopsynopsis(String shopsynopsis) {
        this.shopsynopsis = shopsynopsis == null ? null : shopsynopsis.trim();
    }

    public String getShopcontacts() {
        return shopcontacts;
    }

    public void setShopcontacts(String shopcontacts) {
        this.shopcontacts = shopcontacts == null ? null : shopcontacts.trim();
    }

    public String getShoptelephone() {
        return shoptelephone;
    }

    public void setShoptelephone(String shoptelephone) {
        this.shoptelephone = shoptelephone == null ? null : shoptelephone.trim();
    }

    public String getShopsheng() {
        return shopsheng;
    }

    public void setShopsheng(String shopsheng) {
        this.shopsheng = shopsheng == null ? null : shopsheng.trim();
    }

    public String getShopshi() {
        return shopshi;
    }

    public void setShopshi(String shopshi) {
        this.shopshi = shopshi == null ? null : shopshi.trim();
    }

    public String getShopqu() {
        return shopqu;
    }

    public void setShopqu(String shopqu) {
        this.shopqu = shopqu == null ? null : shopqu.trim();
    }

    public String getShopadd() {
        return shopadd;
    }

    public void setShopadd(String shopadd) {
        this.shopadd = shopadd == null ? null : shopadd.trim();
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