package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.domain.Position;
import com.accp.domain.Shop;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer positionid);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer positionid);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    
    @Select("SELECT * FROM `position`")
    List<Position>queryposition();
    
    @Select("select u.*,p.*, s.shopname from `user` as u inner join `position` as p,shop as s\r\n" + 
    		"where u.`utypeid`= p.`positionid` and u.`remark`=s.`shopid`")
    List<Position>queryuangong();
}