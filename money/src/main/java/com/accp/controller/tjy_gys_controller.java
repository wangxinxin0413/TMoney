package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.supplier;
import com.accp.domain.upplier;
import com.accp.service.tjy_gys_service;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/tjygys")
public class tjy_gys_controller {

	@Autowired
	tjy_gys_service service2;
	
	//查询
	@RequestMapping("/sqlidall")
	@ResponseBody
	public PageInfo<upplier> selectidall(Integer pageNum,String Suppliershen,String Suppliershi,String Suppliername) {
		System.out.println(pageNum+"wwdwdwdw");
		return service2.selectidall(pageNum,8,Suppliershen,Suppliershi,Suppliername);
	}
	
	//新增
	@RequestMapping("/ins")
	@ResponseBody
	public int insertSelective(upplier supp) {
		supp.setRemark("1");
		return service2.insertSelective(supp);
	}
	
	//假删除
	@RequestMapping("/del")
	@ResponseBody
	public int updetass(Integer supplierid) {
		System.out.println(supplierid);
		service2.updetass(supplierid);
		return 1;
	}
	
	//修改
	@RequestMapping("/upd")
	@ResponseBody
	public int upds(upplier supp){
		 System.out.println(supp.getSupplierjd());
		 service2.delup(supp);
		 return 1;
	}
}
