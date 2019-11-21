package com.accp.mapper;

import java.util.List;

import com.accp.domain.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
    
    List<Member> queryAllXinxi();
}