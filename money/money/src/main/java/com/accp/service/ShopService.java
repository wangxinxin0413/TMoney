package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Shop;
import com.accp.mapper.PositionMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.UserMapper;

@Service
public class ShopService {
		@Autowired
		UserMapper usermapper;
		@Autowired
		ShopMapper shopmapper;
		@Autowired
		PositionMapper positionmapper;
		
	public List<Shop>queryShop(){
		return shopmapper.queryShop();
	}
	
	
	//新增
	public int addshop(Shop shop) {
		return shopmapper.insert(shop);
	}
	
	//id查询
	public Shop queryedit(Integer shopid) {
		//System.out.println("id:"+shopid);
		Shop shop=shopmapper.queryedit(shopid);
		return shop;
	}
	//删除店铺
	public int shopdel(Integer shopid) {
		return shopmapper.deleteByPrimaryKey(shopid);
	}
	
	
	//shopupdate
	public int shopupdate(Shop shop) {
		return shopmapper.updateByPrimaryKey(shop);
	}
	
	
	
}
