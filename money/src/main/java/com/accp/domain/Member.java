package com.accp.domain;

import java.util.Date;

public class Member {
    private Integer memberid;

    private String membername;

    private String memberphone;

    private Integer memberlevelid;

	private String memberpwd;

    private Integer membercount;

    private Double memberprice;

    private Double membermoney;

    private Integer memberintegral;

    private String memberdizhi;

    private String memberdizhis;

    private String memberdizhiqu;

    private String memberdizhiss;

    private Date memberdate;

    private String remark;

    private String remark1;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
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

    public Integer getMemberlevelid() {
        return memberlevelid;
    }

    public void setMemberlevelid(Integer memberlevelid) {
        this.memberlevelid = memberlevelid;
    }

    public String getMemberpwd() {
        return memberpwd;
    }

    public void setMemberpwd(String memberpwd) {
        this.memberpwd = memberpwd == null ? null : memberpwd.trim();
    }

    public Integer getMembercount() {
        return membercount;
    }

    public void setMembercount(Integer membercount) {
        this.membercount = membercount;
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

    public Integer getMemberintegral() {
        return memberintegral;
    }

    public void setMemberintegral(Integer memberintegral) {
        this.memberintegral = memberintegral;
    }

    public String getMemberdizhi() {
        return memberdizhi;
    }

    public void setMemberdizhi(String memberdizhi) {
        this.memberdizhi = memberdizhi == null ? null : memberdizhi.trim();
    }

    public String getMemberdizhis() {
        return memberdizhis;
    }

    public void setMemberdizhis(String memberdizhis) {
        this.memberdizhis = memberdizhis == null ? null : memberdizhis.trim();
    }

    public String getMemberdizhiqu() {
        return memberdizhiqu;
    }

    public void setMemberdizhiqu(String memberdizhiqu) {
        this.memberdizhiqu = memberdizhiqu == null ? null : memberdizhiqu.trim();
    }

    public String getMemberdizhiss() {
        return memberdizhiss;
    }

    public void setMemberdizhiss(String memberdizhiss) {
        this.memberdizhiss = memberdizhiss == null ? null : memberdizhiss.trim();
    }

    public Date getMemberdate() {
        return memberdate;
    }

    public void setMemberdate(Date memberdate) {
        this.memberdate = memberdate;
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