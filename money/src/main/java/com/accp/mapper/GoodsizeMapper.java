package com.accp.mapper;

import org.apache.ibatis.annotations.Select;

import com.accp.domain.Goodsize;

public interface GoodsizeMapper {
    int deleteByPrimaryKey(Integer goodsizeid);

    int insert(Goodsize record);

    int insertSelective(Goodsize record);

    Goodsize selectByPrimaryKey(Integer goodsizeid);

    int updateByPrimaryKeySelective(Goodsize record);

    int updateByPrimaryKey(Goodsize record);
    
    @Select("SELECT * FROM `goodsize` WHERE  goodsizename=#{goodsizename}")
    Goodsize selectsize(String goodsizename);
 }