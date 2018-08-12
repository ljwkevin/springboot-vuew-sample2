package com.citi.ordermatching.controller;

import com.citi.ordermatching.domain.Stock;
import com.citi.ordermatching.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dell on 2018/8/12.
 */

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    /*
     Some comment to test!
     */
    @RequestMapping("/findAllStocks")
    @ResponseBody
    public List<Stock> findAllStocks(){
        return stockService.findAllStocks();
    }
}
