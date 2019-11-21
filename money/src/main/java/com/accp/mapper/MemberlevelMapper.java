package com.accp.mapper;

import java.util.List;

import com.accp.domain.Memberlevel;

public interface MemberlevelMapper {
    int deleteByPrimaryKey(Integer memberlevelid);

    int insert(Memberlevel record);

    int insertSelective(Memberlevel record);

    Memberlevel selectByPrimaryKey(Integer memberlevelid);

    int updateByPrimaryKeySelective(Memberlevel record);

    int updateByPrimaryKey(Memberlevel record);
    
    List<Memberlevel> queryAllLevel();
}