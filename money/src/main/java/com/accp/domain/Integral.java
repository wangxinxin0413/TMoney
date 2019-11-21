package com.accp.domain;

public class Integral {
    private Integer integralid;

    private Double integralratio;

    private String remark;

    private String remark1;

    public Integer getIntegralid() {
        return integralid;
    }

    public void setIntegralid(Integer integralid) {
        this.integralid = integralid;
    }

    public Double getIntegralratio() {
        return integralratio;
    }

    public void setIntegralratio(Double integralratio) {
        this.integralratio = integralratio;
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