package cn.kgc.service.Impl;


import cn.kgc.entity.Computer;
import cn.kgc.entity.Order;
import cn.kgc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class buyComputerServiceImpl implements buyComputerService {

    @Autowired
    AccountService accountService;
    @Autowired
    ComputerService computerService;
    @Autowired
    OrderService orderService;
    @Autowired
    StockService stockService;


    public void buyComputer(String accountName, Integer computerId) {

        Computer computer = computerService.selectComputerPriceById(computerId);

        /*更新库存的数量*/
        Integer OutboundStatus = stockService.updateStockQuantityById(computerId);
        /*更新账户的余额*/
        Integer paymentStatus = accountService.updateAccountBalanceByName(accountName, computer.getComputerPrice());
        /*导入订单*/
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        Order order = null;
        if (OutboundStatus > 0 && paymentStatus > 0) {
            order = new Order(null, format, computerId, 1, computer.getComputerPrice(), paymentStatus, "支付成功,库存充足");
        } else if (OutboundStatus > 0 && paymentStatus <= 0) {

            order = new Order(null, format, computerId, 1, computer.getComputerPrice(), paymentStatus, "待支付,库存充足");

        } else {

            order = new Order(null, format, computerId, 1, computer.getComputerPrice(), paymentStatus, "支付成功,待补货");

        }

        orderService.insOrder(order);

    }
}
