package com.accp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.Gooddetails;

public interface GooddetailsMapper {
    int deleteByPrimaryKey(Integer gooddetailsid);

    int insert(Gooddetails record);

    int insertSelective(Gooddetails record);

    Gooddetails selectByPrimaryKey(Integer gooddetailsid);

    int updateByPrimaryKeySelective(Gooddetails record);

    int updateByPrimaryKey(Gooddetails record);
    
    @Select("SELECT * FROM `gooddetails` WHERE goodcolorid=#{goodcolorid} AND goodsizeid=#{goodsizeid} AND goodid=#{goodid}")
    Gooddetails selectdeta(@Param("goodcolorid") Integer goodcolorid,@Param("goodsizeid") Integer goodsizeid,@Param("goodid") Integer goodid);
    
    @Insert("INSERT INTO `gooddetails` VALUE(0,#{goodid},#{goodcolorid},#{goodsizeid},#{goodtiaoxinma},#{gooddetailscount},'','')")
    int insesds(@Param("goodid") Integer Goodid,@Param("goodcolorid") Integer goodcolorid,@Param("goodsizeid") Integer goodsizeid,@Param("goodtiaoxinma") String goodtiaoxinma,@Param("gooddetailscount") Integer gooddetailscount);
}