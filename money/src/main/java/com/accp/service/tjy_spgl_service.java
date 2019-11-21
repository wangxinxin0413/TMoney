package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Gooddetails;
import com.accp.domain.good_spgl_sqlall;
import com.accp.domain.gooddianpo;
import com.accp.mapper.GoodMapper;
import com.accp.mapper.GooddetailsMapper;
import com.accp.mapper.ShopMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class tjy_spgl_service {

	@Autowired
	ShopMapper ShopMappe;
	
	@Autowired
	GoodMapper GoodMappe;
	
	@Autowired
	GooddetailsMapper Gooddetails;
	
	//根据登入人的id查询他所关联的店铺
	 public List<gooddianpo> shops(Integer uid){
		 return ShopMappe.shops(uid);
	 }
	 
	//spglsqlAll
	public PageInfo<good_spgl_sqlall> spglsqlAll(Integer pageNum,Integer pageSize,Integer goodtypeid,String goodname,Integer shopid){
		Page page=PageHelper.startPage(pageNum, pageSize);
		GoodMappe.spglsqlAll(goodtypeid, goodname, shopid);
		return page.toPageInfo();
	}
	
	//删除
	public int deleteByPrimaryKey(Integer gooddetailsid){
		return Gooddetails.deleteByPrimaryKey(gooddetailsid);
	}
}
