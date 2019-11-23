package com.accp.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.Goodcolor;

public interface GoodcolorMapper {
    int deleteByPrimaryKey(Integer goodcolorid);

    int insert(Goodcolor record);

    int insertSelective(Goodcolor record);

    Goodcolor selectByPrimaryKey(Integer goodcolorid);

    int updateByPrimaryKeySelective(Goodcolor record);

    int updateByPrimaryKey(Goodcolor record);
    
    @Select("SELECT * FROM `goodcolor` WHERE goodcolor.`goodcololoveid`<>0 AND goodcolorname=#{goodcolorname}")
    Goodcolor  selectcolor(@Param("goodcolorname") String goodcolorname);
}