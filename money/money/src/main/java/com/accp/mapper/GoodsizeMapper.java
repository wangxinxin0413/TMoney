package com.accp.mapper;

import com.accp.domain.Goodsize;

public interface GoodsizeMapper {
    int deleteByPrimaryKey(Integer goodsizeid);

    int insert(Goodsize record);

    int insertSelective(Goodsize record);

    Goodsize selectByPrimaryKey(Integer goodsizeid);

    int updateByPrimaryKeySelective(Goodsize record);

    int updateByPrimaryKey(Goodsize record);
}