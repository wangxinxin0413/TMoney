package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Position;
import com.accp.domain.Shop;
import com.accp.domain.User;
import com.accp.service.ShopService;
import com.accp.service.UserService;
import com.accp.service.positionService;
//测试用连接项目用的要做的话请新建一个controller
@Controller
@RequestMapping("/ha")
public class controllerAll {
	@Autowired
	ShopService shopservice;
	@Autowired
	UserService userservice;	
	@Autowired
	positionService positionservice;
	
	//项目进入地址
	@RequestMapping("/index")
	public String jo1(){
		return "index";
	}

	//所有页面跳转方法
	@RequestMapping("/tiao")
	public String jo(String htmlt){
		
		return htmlt;
	}
	
	
	//点击登录
	@RequestMapping("/tologin")
	public String login(String uname,String upwd,HttpServletRequest request){
		HttpSession session=request.getSession();
		User user=new User();
		user.setUname(uname);
		user.setUpwd(upwd);		
		User u=userservice.queryLogin(user);
		if(u.getBool()>0) {
			session.setAttribute("user", u);			
			return "redirect:Afterlogin";
		}
		return "index";	
	}
	
	
	//登陆后的跳转
	@RequestMapping("/Afterlogin")
	public String Afterlogin(Model model) {
		return "login";
	}
	
	
	//点击跳转到店铺管理页面
	@RequestMapping("/Tostore_management")
	public String Tostoremanagement() {
		return "store_management";
		
	}
	
	//门店查询
	@RequestMapping("/queryShop")
	@ResponseBody
	public List<Shop>queryShop(){
		
		List<Shop>list=shopservice.queryShop();
		return list;
		
	}
	
	//shopadd店铺新增
	@RequestMapping("/shopadd")
	public String shopadd(Shop shop){
		
		shopservice.addshop(shop);
		return "store_management";		
	}
	
	//根据id查询店铺
	@RequestMapping("/queryedit")
	@ResponseBody
	public Shop queryedit(Integer shopid) {
		Shop s=shopservice.queryedit(shopid);
		return s;
	}
	
	
	//shopdel删除店铺
	@RequestMapping("/shopdel")
	@ResponseBody
	public String shopdel(Integer shopid){
		shopservice.shopdel(shopid);
		return "store_management";
	}
	
	//修改店铺shopupdate
	 @RequestMapping("/shopupdate") 
	 public String doUpdate(@ModelAttribute Shop shop,Model model) {
		 	System.out.println(shop);
		 int i=shopservice.shopupdate(shop);
		 return "redirect:Tostore_management";
	 }
	
		
	
	//queryposition职位查询
	@RequestMapping("/queryposition")
	@ResponseBody
	public List<Position>queryposition(){
		List<Position>list=positionservice.queryposition();
		return list;
		
	}
	
	//queryuangong员工查询
	@RequestMapping("/queryuangong")
	@ResponseBody
	public List<Position>queryuangong(){
		List<Position>list=positionservice.queryuangong();
		return list;
	}
	
}
