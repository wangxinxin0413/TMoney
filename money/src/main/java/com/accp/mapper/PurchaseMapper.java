package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.domain.Purchase;
import com.accp.domain.good_spgl_sqlall;

public interface PurchaseMapper {
    int deleteByPrimaryKey(Integer purchaseid);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    Purchase selectByPrimaryKey(Integer purchaseid);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);
    
    //查询没有下架的商品
    @Select("SELECT good.`goodid` AS id,good.`goodphoto`,gooddetails.`gooddetailsid`,goodtype.`goodtypename`,\r\n" + 
    		"good.`goodname`,gooddetails.`goodtiaoxinma`,goodsize.`goodsizename`,\r\n" + 
    		"goodcolor.`goodcolorname`,gooddetails.`gooddetailscount`,good.goodTagprice,good.goodCostprice FROM gooddetails\r\n" + 
    		"LEFT JOIN good ON good.`goodid`=gooddetails.`goodid`\r\n" + 
    		"LEFT JOIN goodsize ON goodsize.`goodsizeid`=gooddetails.`goodsizeid`\r\n" + 
    		"LEFT JOIN goodcolor ON goodcolor.`goodcolorid`=gooddetails.`goodcolorid`\r\n" + 
    		"LEFT JOIN goodtype ON good.`goodtypeid`=`goodtype`.`goodtypeid`")
    List<good_spgl_sqlall> selectall();
}