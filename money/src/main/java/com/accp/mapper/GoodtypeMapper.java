package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.domain.Goodtype;

public interface GoodtypeMapper {
    int deleteByPrimaryKey(Integer goodtypeid);

    int insert(Goodtype record);

    int insertSelective(Goodtype record);

    Goodtype selectByPrimaryKey(Integer goodtypeid);

    int updateByPrimaryKeySelective(Goodtype record);

    int updateByPrimaryKey(Goodtype record);
    
    @Select("SELECT * FROM `goodtype`")
    List<Goodtype> selectAll();
    
    @Select("SELECT * FROM `goodtype` where goodtypename=#{goodtypename}")
    Goodtype selectname(String goodtypename);
}