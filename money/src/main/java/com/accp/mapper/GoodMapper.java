package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Good;
import com.accp.domain.good_spgl_sqlall;

public interface GoodMapper {
    int deleteByPrimaryKey(Integer goodid);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer goodid);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
    //spglsqlAll
    List<good_spgl_sqlall> spglsqlAll(@Param("goodtypeid") Integer goodtypeid,@Param("goodname") String goodname,@Param("shopid") Integer shopid);
}