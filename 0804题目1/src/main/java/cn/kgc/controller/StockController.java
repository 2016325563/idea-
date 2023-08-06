package cn.kgc.controller;

import cn.kgc.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class StockController {

    @Autowired
    StockService stockService;

    public void selectStockQuantityById(Integer computerId) {
        stockService.selectStockQuantityById(computerId);
    }

    public void updateStockQuantityById(Integer computerId) {

        stockService.updateStockQuantityById(computerId);

    }


}
