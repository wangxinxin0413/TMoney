package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.domain.Shop;
import com.accp.domain.gooddianpo;

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
    
    @Select("SELECT user.uid,user.uname,shop.* FROM `user`LEFT JOIN userrelevanceshop ON user.`uid`=userrelevanceshop.`uid`LEFT JOIN shop ON shop.`shopid`=userrelevanceshop.`shopid`WHERE user.uid=#{uid}")
    List<gooddianpo> shops(Integer uid);

   
}