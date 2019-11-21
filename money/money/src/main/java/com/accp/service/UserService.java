package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.User;
import com.accp.mapper.UserMapper;

@Service
public class UserService {

	
	@Autowired
	UserMapper usermapper;
	
	public User queryLogin(User user) {
		return usermapper.queryLogin(user);
	}
	
	public List<User>queryAfterLogin(){
		return null;
		
	}
	
}
