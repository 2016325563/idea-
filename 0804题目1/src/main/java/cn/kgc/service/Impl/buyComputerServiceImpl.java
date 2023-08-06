package cn.kgc.service.Impl;


import cn.kgc.entity.Computer;
import cn.kgc.entity.Order;
import cn.kgc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    private Integer NowId;

    public HashMap<String, Object> creatOrder(String accountName, Integer computerId) {


        Computer computer = computerService.selectComputerPriceById(computerId);
        /*导入订单*/
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        Order order = null;
        /*默认是未支付的状态*/
        order = new Order(null, format, computerId, 1, computer.getComputerPrice(), 0, "未支付或库存不足");
        orderService.insOrder(order);
        /*获得最新的订单号码*/

        NowId = orderService.getNewId();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("computer", computer);
        map.put("NowId", NowId);

        return map;
    }


    public void buyComputer(String accountName, Integer computerId, Map map) {


        Computer computer = (Computer) map.get("computer");
        Integer NowId = (Integer) map.get("NowId");



        /*更新库存的数量*/
        Integer OutboundStatus = stockService.updateStockQuantityById(computerId, NowId);
        /*更新账户的余额*/
        Integer paymentStatus = accountService.updateAccountBalanceByName(accountName, computer.getComputerPrice(), NowId);


        if (OutboundStatus == 1 && paymentStatus == 1) {
            orderService.upOrderStatus(NowId);
        }


    }
}
