package com.accp.domain;

public class Memberlevel {
    private Integer memberlevelid;

    private String memberlevelname;

    private Double memberleveldiscount;

    private Double membercount;

    private String remark;

    private String remark1;

    public Integer getMemberlevelid() {
        return memberlevelid;
    }

    public void setMemberlevelid(Integer memberlevelid) {
        this.memberlevelid = memberlevelid;
    }

    public String getMemberlevelname() {
        return memberlevelname;
    }

    public void setMemberlevelname(String memberlevelname) {
        this.memberlevelname = memberlevelname == null ? null : memberlevelname.trim();
    }

    public Double getMemberleveldiscount() {
        return memberleveldiscount;
    }

    public void setMemberleveldiscount(Double memberleveldiscount) {
        this.memberleveldiscount = memberleveldiscount;
    }

    public Double getMembercount() {
        return membercount;
    }

    public void setMembercount(Double membercount) {
        this.membercount = membercount;
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