package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Goodtype;
import com.accp.domain.gooddianpo;
import com.accp.service.tjy_spgl_service;
import com.accp.service.tjy_spib_service;

@Controller
@RequestMapping("/tjy")
public class tjy_spib_controller {

	@Autowired
	tjy_spib_service service;
	
	@Autowired
	tjy_spgl_service service1;
	
	//查看所有
	@RequestMapping("/all")
	@ResponseBody
	public List<Goodtype> selectAll(){
		System.out.println("ssssswwwwewewewewewewewe");
		return service.selectAll();
	}
	
	//删除
	@RequestMapping("/del")
	@ResponseBody
	public String deleteByPrimaryKey(Integer goodtypeid){
		return service.deleteByPrimaryKey(goodtypeid)+"";
	}
	
	//修改
	@RequestMapping("/upd")
	@ResponseBody
	public String updateByPrimaryKey(String name,Integer id){
		Goodtype s=new Goodtype();
		s.setGoodtypeid(id);
		s.setGoodtypename(name);
		return service.updateByPrimaryKey(s)+"";
	}

	//新增
	@RequestMapping("/ins")
	@ResponseBody
	public String insertSelective(String name){
		return service.insertSelective(name)+"";
	}

}
