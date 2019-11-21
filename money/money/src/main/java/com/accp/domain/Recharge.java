package com.accp.domain;

import java.util.Date;

public class Recharge {
    private Integer rechargeid;

    private Integer memberid;

    private Double rechargemoney;

    private String membername;

    private String memberphone;

    private Double memberprice;

    private Double membermoney;

    private String rechargetext;

    private Date rechargedate;

    private Double rechargezs;

    private String remark;

    private String remark1;

    public Integer getRechargeid() {
        return rechargeid;
    }

    public void setRechargeid(Integer rechargeid) {
        this.rechargeid = rechargeid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Double getRechargemoney() {
        return rechargemoney;
    }

    public void setRechargemoney(Double rechargemoney) {
        this.rechargemoney = rechargemoney;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public String getMemberphone() {
        return memberphone;
    }

    public void setMemberphone(String memberphone) {
        this.memberphone = memberphone == null ? null : memberphone.trim();
    }

    public Double getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Double memberprice) {
        this.memberprice = memberprice;
    }

    public Double getMembermoney() {
        return membermoney;
    }

    public void setMembermoney(Double membermoney) {
        this.membermoney = membermoney;
    }

    public String getRechargetext() {
        return rechargetext;
    }

    public void setRechargetext(String rechargetext) {
        this.rechargetext = rechargetext == null ? null : rechargetext.trim();
    }

    public Date getRechargedate() {
        return rechargedate;
    }

    public void setRechargedate(Date rechargedate) {
        this.rechargedate = rechargedate;
    }

    public Double getRechargezs() {
        return rechargezs;
    }

    public void setRechargezs(Double rechargezs) {
        this.rechargezs = rechargezs;
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