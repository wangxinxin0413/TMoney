package com.accp.domain;

public class good_spgl_sqlall {

	//商品id
	private int goodid;
	//商品详情id
	private int gooddetailsid;
	//商品类别名称
	private String goodtypename;
	//商品详情名字
	private String goodname;
	//商品条形码
	private String goodtiaoxinma;
	//商品型号
	private String goodsizename;
	//商品颜色
	private String goodcolorname;
	//商品数量
    private int gooddetailscount;
	//商品销售价格
	private int goodTagprice;
	//商品进货价
	private int goodCostprice;
	//商品图片
	private String goodphoto;
	
	public String getGoodphoto() {
		return goodphoto;
	}
	public void setGoodphoto(String goodphoto) {
		this.goodphoto = goodphoto;
	}
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public int getGooddetailsid() {
		return gooddetailsid;
	}
	public void setGooddetailsid(int gooddetailsid) {
		this.gooddetailsid = gooddetailsid;
	}
	public String getGoodtypename() {
		return goodtypename;
	}
	public void setGoodtypename(String goodtypename) {
		this.goodtypename = goodtypename;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getGoodtiaoxinma() {
		return goodtiaoxinma;
	}
	public void setGoodtiaoxinma(String goodtiaoxinma) {
		this.goodtiaoxinma = goodtiaoxinma;
	}
	public String getGoodsizename() {
		return goodsizename;
	}
	public void setGoodsizename(String goodsizename) {
		this.goodsizename = goodsizename;
	}
	public String getGoodcolorname() {
		return goodcolorname;
	}
	public void setGoodcolorname(String goodcolorname) {
		this.goodcolorname = goodcolorname;
	}
	public int getGooddetailscount() {
		return gooddetailscount;
	}
	public void setGooddetailscount(int gooddetailscount) {
		this.gooddetailscount = gooddetailscount;
	}
	public int getGoodTagprice() {
		return goodTagprice;
	}
	public void setGoodTagprice(int goodTagprice) {
		this.goodTagprice = goodTagprice;
	}
	public int getGoodCostprice() {
		return goodCostprice;
	}
	public void setGoodCostprice(int goodCostprice) {
		this.goodCostprice = goodCostprice;
	}
	
}
