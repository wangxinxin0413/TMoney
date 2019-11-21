package com.accp.domain;

public class User {
    private Integer uid;

    private String uname;

    private Integer tradeid;

    private String upwd;

    private String uphone;

    private Integer utypeid;

    private String remark;

    private String remark1;
    
  private int bool;
    
    
    public int getBool() {
		return bool;
	}

	public void setBool(int bool) {
		this.bool = bool;
	}

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getTradeid() {
        return tradeid;
    }

    public void setTradeid(Integer tradeid) {
        this.tradeid = tradeid;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public Integer getUtypeid() {
        return utypeid;
    }

    public void setUtypeid(Integer utypeid) {
        this.utypeid = utypeid;
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