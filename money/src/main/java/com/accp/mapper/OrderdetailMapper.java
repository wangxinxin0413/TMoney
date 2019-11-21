package com.accp.mapper;

import com.accp.domain.Orderdetail;

public interface OrderdetailMapper {
    int deleteByPrimaryKey(Integer detailid);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    Orderdetail selectByPrimaryKey(Integer detailid);

    int updateByPrimaryKeySelective(Orderdetail record);

    int updateByPrimaryKey(Orderdetail record);
}