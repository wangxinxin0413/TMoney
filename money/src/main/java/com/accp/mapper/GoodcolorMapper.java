package com.accp.mapper;

import com.accp.domain.Goodcolor;

public interface GoodcolorMapper {
    int deleteByPrimaryKey(Integer goodcolorid);

    int insert(Goodcolor record);

    int insertSelective(Goodcolor record);

    Goodcolor selectByPrimaryKey(Integer goodcolorid);

    int updateByPrimaryKeySelective(Goodcolor record);

    int updateByPrimaryKey(Goodcolor record);
}