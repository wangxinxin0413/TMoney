package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Position;
import com.accp.domain.Shop;
import com.accp.mapper.PositionMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.UserMapper;

@Service
public class positionService {

	@Autowired
	UserMapper usermapper;
	@Autowired
	ShopMapper shopmapper;
	@Autowired
	PositionMapper positionmapper;
	
	public List<Position>queryposition(){
		return positionmapper.queryposition();
	}
	
	public List<Position>queryuangong(){
		return positionmapper.queryuangong();
	}
	
}
