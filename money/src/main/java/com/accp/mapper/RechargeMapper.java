package com.accp.mapper;

import com.accp.domain.Recharge;

public interface RechargeMapper {
    int insert(Recharge record);

    int insertSelective(Recharge record);
}