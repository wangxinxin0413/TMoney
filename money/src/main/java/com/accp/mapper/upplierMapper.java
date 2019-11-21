package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.upplier;

public interface upplierMapper {
    int deleteByPrimaryKey(Integer supplierid);

    int insert(upplier record);

    int insertSelective(upplier record);

    upplier selectByPrimaryKey(Integer supplierid);

    int updateByPrimaryKeySelective(upplier record);

    int updateByPrimaryKeyWithBLOBs(upplier record);

    int updateByPrimaryKey(upplier record);
    //带条件查询
    List<upplier> selectidall(@Param("Suppliershen") String Suppliershen,@Param("Suppliershi") String Suppliershi,@Param("Suppliername") String Suppliername);
    
    //假删除
    @Select("UPDATE supplier SET remark='0' WHERE supplier.`Supplierid`=#{Supplierid}")
    int updetass(@Param("Supplierid") Integer Supplierid);
}