package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.accp.domain.Goodtype;
import com.accp.mapper.GoodtypeMapper;

@Service
public class tjy_spib_service {

	@Autowired
	GoodtypeMapper GoodtypeMappe;
	
	//查询全部
	public List<Goodtype> selectAll(){
		return GoodtypeMappe.selectAll();
	}
	//删除
	public int deleteByPrimaryKey(Integer goodtypeid){
		return GoodtypeMappe.deleteByPrimaryKey(goodtypeid);
	}
	//修改
	public int updateByPrimaryKey(Goodtype Goodty){
			return GoodtypeMappe.updateByPrimaryKey(Goodty);
	}
	//新增
	public int insertSelective(String name){
		Goodtype goodty=new Goodtype();
		goodty.setGoodtypename(name);
		return GoodtypeMappe.insertSelective(goodty);
	}
}
