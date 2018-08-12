package com.citi.ordermatching.dao;

import com.citi.ordermatching.domain.Orderbook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderbookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderbook record);

    int insertSelective(Orderbook record);

    Orderbook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderbook record);

    int updateByPrimaryKey(Orderbook record);
}