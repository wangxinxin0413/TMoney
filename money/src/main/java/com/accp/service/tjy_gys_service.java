package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.good_spgl_sqlall;
import com.accp.domain.supplier;
import com.accp.domain.upplier;
import com.accp.mapper.upplierMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class tjy_gys_service {

	@Autowired
	upplierMapper upplie;
	//带条件查询
	public PageInfo<upplier> selectidall(Integer pageNum,Integer pageSize,String Suppliershen,String Suppliershi,String Suppliername) {
		Page page=PageHelper.startPage(pageNum, pageSize);
		upplie.selectidall(Suppliershen, Suppliershi, Suppliername);
		return page.toPageInfo();
	}
	
	//新增
	public int insertSelective(upplier supp) {
		return upplie.insertSelective(supp);
	}
	
	//修改
	public int updetass(Integer Supplierid) {
		return upplie.updetass(Supplierid);
	}
	//修改
	public int delup(upplier supp) {
		 int a=upplie.deleteByPrimaryKey(supp.getSupplierid());
		 if(a==1) {
			 insertSelective(supp);
		 } 
		 return 1;
	}
}
