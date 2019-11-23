package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Integral;
import com.accp.service.wxx_jf_service;

@Controller
@RequestMapping("/jf")
public class wxx_jf_controller {
	@Autowired
	private wxx_jf_service ser;
	
	//查询积分设置
	@RequestMapping("/queryIntegral")
	@ResponseBody
	public Integral queryIntegral() {
		return ser.queryIntegral();
	}
	
	//修改积分设置状态
	@RequestMapping("/updateRemark")
	@ResponseBody
	public int updateRemark(String remark){
		return ser.updateRemark(remark);
	}
	
	//修改积分
	@RequestMapping("/updateIntegral")
	@ResponseBody
	public int updateIntegral(double integralratio){
		return ser.updateIntegral(integralratio);
	}
	
}
