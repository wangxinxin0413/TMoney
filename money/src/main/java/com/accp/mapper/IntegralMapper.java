package com.accp.mapper;

import com.accp.domain.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Integer integralid);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Integer integralid);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
    
    Integral queryIntegral();
    
    int updateRemark(String remark);
    
    int updateIntegral(double integralratio);
}