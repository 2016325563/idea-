package cn.kgc.controller;

import cn.kgc.entity.Goods;
import cn.kgc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("getAllGoods")
    public String getAllGoods(Model model, String goodsName, HttpSession session, /*默认显示第一个*/
                              @RequestParam(name = "page", defaultValue = "1", required = true) Integer page) {
        page = (page - 1) * 2;
        List<Goods> goods = goodsService.getAllGoods(goodsName, page);

        Integer totalPage = goodsService.getRowCount(null);

        model.addAttribute("goods", goods);
        model.addAttribute("totalPage", totalPage);

        return "index";
    }

}

//    @RequestMapping("getAllGoods")
//    public String getAllGoods(Model model, String goodsName, HttpSession session, /*默认显示第一个*/
//                              @RequestParam(name = "page", defaultValue = "1", required = true) Integer page) {
//        page = (page - 1) * 2;
//        List<Goods> goods = goodsService.getAllGoods(goodsName, page);
//        session.setAttribute("goodsName", goodsName);
//        Integer totalPage = goodsService.getRowCount(goodsName);
//        if (goods != null && !goods.isEmpty()) {
//            model.addAttribute("goods", goods);
//            model.addAttribute("totalPage", totalPage);
//
//            return "index";
//        } else {
//            System.out.println("获取失败");
//            return "login";
//        }
//
//    }

