package com.accp.mapper;

import org.apache.ibatis.annotations.Select;

import com.accp.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    @Select("select count(1) as bool,uid,uname from User where uname=#{uname} and upwd=#{upwd}")
    User queryLogin(User user);
    
}