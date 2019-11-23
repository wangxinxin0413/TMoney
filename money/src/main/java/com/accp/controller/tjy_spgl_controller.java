package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Goodtype;
import com.accp.domain.good_spgl_sqlall;
import com.accp.domain.gooddianpo;
import com.accp.service.tjy_spgl_service;
import com.accp.service.tjy_spib_service;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/tjy_spgl")
public class tjy_spgl_controller {

	@Autowired
	tjy_spib_service service;
	
	@Autowired
	tjy_spgl_service service1;
	
	
	//根据登入人的id查询他所关联的店铺
	@RequestMapping("/shops")
	@ResponseBody
	public List<gooddianpo> shops(Integer uid){
		//我测试写的死值
		return service1.shops(1);
	}
	//spglsqlAll
	@RequestMapping("/spglsqlAll")
	@ResponseBody
	public PageInfo<good_spgl_sqlall> spglsqlAll(Integer pageNum,Integer goodtypeid,String goodname,Integer shopid){
		if(goodtypeid==null || goodtypeid.equals(0)) {
			System.out.println("1");
		}
		if(goodname.equals(null) || goodname.equals("")) {
			System.out.println("2");
		}
		if(shopid==null || shopid.equals(0)) {
			System.out.println("3");
		}
		return service1.spglsqlAll(pageNum,4,goodtypeid,goodname,shopid);
	}
	
	//删除
	@RequestMapping("/del")
	@ResponseBody
     public void deleteByPrimaryKey(Integer gooddetailsid){
		System.out.println("删除"+gooddetailsid);
    	 service1.deleteByPrimaryKey(gooddetailsid);
     }
}
