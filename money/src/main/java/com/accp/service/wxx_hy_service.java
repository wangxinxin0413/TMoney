package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Member;
import com.accp.domain.Memberlevel;
import com.accp.mapper.MemberMapper;
import com.accp.mapper.MemberlevelMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class wxx_hy_service {
	@Autowired
	MemberlevelMapper dao;
	@Autowired
	MemberMapper Mdao;
	
	//查询所有会员等级
	public List<Memberlevel> queryAllLevel(){
		return dao.queryAllLevel();
	}
	
	//删除会员等级
	public int deleteByPrimaryKey(int memberlevelid) {
		return dao.deleteByPrimaryKey(memberlevelid);
	}
	
	//查询所有会员信息、
	public PageInfo<Member> queryAllXinxi(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Member> list = Mdao.queryAllXinxi();
		PageInfo<Member> page = new PageInfo<Member>(list);
		return page;
	}
}
