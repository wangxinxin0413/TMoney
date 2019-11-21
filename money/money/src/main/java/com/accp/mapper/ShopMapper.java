package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.domain.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer shopid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    
    @Select("SELECT s.*, ( SELECT COUNT(*) FROM userrelevanceshop AS r WHERE r.shopid=s.shopid\r\n" + 
    		"GROUP BY r. shopid\r\n" + 
    		")AS `ucount` FROM shop AS s")
    List<Shop>queryShop();
    
    @Select("select * from shop where shopid=#{shopid}")
   Shop queryedit(Integer shopid);
   
}