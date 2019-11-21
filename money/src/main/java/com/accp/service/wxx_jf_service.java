package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
