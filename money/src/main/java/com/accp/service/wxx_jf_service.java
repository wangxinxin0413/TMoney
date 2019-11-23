package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Integral;
import com.accp.mapper.IntegralMapper;

@Service
public class wxx_jf_service {
	@Autowired
	private IntegralMapper dao;
	
	//查询积分设置
	public Integral queryIntegral() {
		return dao.queryIntegral();
	}
	
	//修改积分设置状态
	public int updateRemark(String remark){
		return dao.updateRemark(remark);
	}
	
	//修改积分
	public int updateIntegral(double integralratio){
		return dao.updateIntegral(integralratio);
	}
}
