package com.accp.mapper;

import com.accp.domain.Gooddetails;

public interface GooddetailsMapper {
    int deleteByPrimaryKey(Integer gooddetailsid);

    int insert(Gooddetails record);

    int insertSelective(Gooddetails record);

    Gooddetails selectByPrimaryKey(Integer gooddetailsid);

    int updateByPrimaryKeySelective(Gooddetails record);

    int updateByPrimaryKey(Gooddetails record);
}