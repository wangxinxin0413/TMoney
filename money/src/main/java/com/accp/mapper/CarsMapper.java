package com.accp.mapper;

import com.accp.domain.Cars;

public interface CarsMapper {
    int deleteByPrimaryKey(Integer carsid);

    int insert(Cars record);

    int insertSelective(Cars record);

    Cars selectByPrimaryKey(Integer carsid);

    int updateByPrimaryKeySelective(Cars record);

    int updateByPrimaryKey(Cars record);
}