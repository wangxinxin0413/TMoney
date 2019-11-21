package com.accp.mapper;

import com.accp.domain.upplier;

public interface upplierMapper {
    int deleteByPrimaryKey(Integer supplierid);

    int insert(upplier record);

    int insertSelective(upplier record);

    upplier selectByPrimaryKey(Integer supplierid);

    int updateByPrimaryKeySelective(upplier record);

    int updateByPrimaryKeyWithBLOBs(upplier record);

    int updateByPrimaryKey(upplier record);
}