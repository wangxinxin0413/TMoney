package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
    
    List<Member> queryAllXinxi(@Param("memberlevelname")String memberlevelname,@Param("like") String like);
}