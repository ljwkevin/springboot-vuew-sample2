package com.citi.ordermatching.serviceImpl;

import com.citi.ordermatching.dao.OrderbookMapper;
import com.citi.ordermatching.domain.Orderbook;
import com.citi.ordermatching.service.OrderbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dell on 2018/8/12.
 */
@Service
public class OrderbookServiceImpl implements OrderbookService {

     @Autowired
     private OrderbookMapper orderbookMapper;

    @Override
    public List<Orderbook> findBidBySymbol(String symbol) {
        return orderbookMapper.findBidBySymbol(symbol);
    }

    @Override
    public List<Orderbook> findAskBySymbol(String symbol) {
        return orderbookMapper.findAskBySymbol(symbol);
    }

    @Override
    public void addOrderbookItem(Orderbook orderbook) {
        orderbookMapper.insertSelective(orderbook);
    }

    @Override
    public boolean deleteOrderbookItem(int orderbookid) {

        int flag=orderbookMapper.deleteByPrimaryKey(orderbookid);
        if(flag!=-1){
            return true;
        }
        return false;
    }
}
