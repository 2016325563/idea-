package cn.kgc.service.Impl;

import cn.kgc.entity.Stock;
import cn.kgc.mapper.StockMapper;
import cn.kgc.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockMapper stockMapper;


    public Stock selectStockQuantityById(Integer computerId) {


        return stockMapper.selectStockQuantityById(computerId);
    }

    public Integer updateStockQuantityById(Integer computerId, Integer NowId) {

        Stock stock = selectStockQuantityById(computerId);
        if (stock.getStockQuantity() <= 0) {

            throw new RuntimeException("电脑库存不足," + "订单号码为" + NowId + "的订单异常,请重新处理");
        }


        Integer row = stockMapper.updateStockQuantityById(computerId);
        if (row > 0) {

            System.out.println("出库成功");
        }
        return row;
    }
}
