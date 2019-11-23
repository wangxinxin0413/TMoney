package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Good;
import com.accp.domain.Goodcolor;
import com.accp.domain.Gooddetails;
import com.accp.domain.Goodsize;
import com.accp.domain.Goodtype;
import com.accp.domain.Shoprelevancegood;
import com.accp.domain.good_spgl_sqlall;
import com.accp.domain.gooddianpo;
import com.accp.mapper.GoodMapper;
import com.accp.mapper.GoodcolorMapper;
import com.accp.mapper.GooddetailsMapper;
import com.accp.mapper.GoodsizeMapper;
import com.accp.mapper.GoodtypeMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.ShoprelevancegoodMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class tjy_spgl_service {

	@Autowired
	ShopMapper ShopMappe;
	
	@Autowired
	GoodtypeMapper Goodty;
	
	@Autowired
	GoodMapper GoodMappe;
	
	@Autowired
	GooddetailsMapper Goodde;
	
	@Autowired
	GoodcolorMapper Goodcol;
	
	@Autowired
	GoodsizeMapper Goodsiz;
	
	@Autowired
	ShoprelevancegoodMapper ShoprelevancegoodMa;
	
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
	
	//spglsqlAll
	public List<good_spgl_sqlall> spglsqlAlls(Integer goodtypeid,String goodname,Integer shopid){
		return GoodMappe.spglsqlAll(goodtypeid, goodname, shopid);
			
	}
	
	//删除
	public int deleteByPrimaryKey(Integer gooddetailsid){
		return Goodde.deleteByPrimaryKey(gooddetailsid);
	}
	
	//文件上传
	public int insert(Good g) {
		return GoodMappe.insertSelective(g);
	}
	//按name查询Goodtype表
	public Goodtype selecttype(String goodtypename) {
		return Goodty.selectname(goodtypename);
	}
	//新增Goodtype表
	public int indestype(Goodtype y) {
		return Goodty.insertSelective(y);
	}
	//按name查询good表
	public Good selectname(String goodname) {
		return GoodMappe.selectname(goodname);
	}
	//新增good表
	public int indesgood(Good g) {
		return GoodMappe.insertSelective(g);
	 }
	//查询商品货号
	public String seleclimit() {
		return GoodMappe.seleclimit();	
	}
	//查询颜色
	public Goodcolor selectcolor(String goodcolorname){
		return Goodcol.selectcolor(goodcolorname);
	}
	//新增颜色
	public int insertcolor(Goodcolor r){
			return Goodcol.insertSelective(r);
	}
	//查尺码
	public Goodsize selectsize(String goodsizename){
		return Goodsiz.selectsize(goodsizename);
	}
	//新增尺码
	public int insertsize(Goodsize e){
		return Goodsiz.insertSelective(e);
	}
	//查询商品子表
	public Gooddetails selectdeta(Integer goodcolorid,Integer goodsizeid,Integer goodid) {
		return Goodde.selectdeta(goodcolorid, goodsizeid, goodid);
	}
	//查询商品子表
	public int insertdeta(Gooddetails s) {
		return Goodde.insesds(s.getGoodid(),s.getGoodcolorid(),s.getGoodsizeid(),s.getGoodtiaoxinma(),s.getGooddetailscount());
	}
	
	//看看是哪个店铺的
	public void insershop(Integer shopid,Integer goodid) {
		Shoprelevancegood d=new Shoprelevancegood();
		d.setShopid(shopid);
		d.setGoodid(goodid);
		ShoprelevancegoodMa.insertSelective(d);
	}
}
