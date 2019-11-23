package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Member;
import com.accp.domain.Memberlevel;
import com.accp.service.wxx_hy_service;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/hy")
public class wxx_hy_controller {
	@Autowired
	wxx_hy_service ser;
	
	//查询所有会员等级
	@RequestMapping("/queryAllLevel")
	@ResponseBody
	public List<Memberlevel> queryAllLevel(){
		return ser.queryAllLevel();
	}

	//根据会员等级id删除会员等级
	@RequestMapping("/del")
	@ResponseBody
	public int del(int memberlevelid) {
		return ser.deleteByPrimaryKey(memberlevelid);
	}
	
	//查询所有会员信息
	@RequestMapping("/queryAllXinxi")
	@ResponseBody
	public PageInfo<Member> queryAllXinxi(int pageNum,int pageSize,String memberlevelname,String like){
		return ser.queryAllXinxi(pageNum, pageSize,memberlevelname,like);
	}
	
}
