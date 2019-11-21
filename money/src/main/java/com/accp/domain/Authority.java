package com.accp.domain;

public class Authority {
    private Integer authorityid;

    private String authorityname;

    private Integer authorityloveid;

    private String remark;

    private String remark1;

    public Integer getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(Integer authorityid) {
        this.authorityid = authorityid;
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname == null ? null : authorityname.trim();
    }

    public Integer getAuthorityloveid() {
        return authorityloveid;
    }

    public void setAuthorityloveid(Integer authorityloveid) {
        this.authorityloveid = authorityloveid;
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