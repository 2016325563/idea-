package cn.kgc.user.controller;

import cn.kgc.user.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
@Controller
@SessionAttributes("userDetails")

public class OrderController {

    @Autowired
    IOrderService iOrderService;

    @GetMapping("/orderList")
    public String showOrderListPage() {
        return "orderList";
    }

    @GetMapping("/delById")
    @ResponseBody
    public String delById(@RequestParam("id") Integer id) {
        Integer row = iOrderService.delById(id);
        if (row > 0) {
            return "success";

        } else {
            return "error";
        }
    }

    @ModelAttribute("userDetails")
    public UserDetails getUserInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            return (UserDetails) authentication.getPrincipal();
        } else {
            // 处理未经身份验证的情况，可以返回默认的UserDetails对象或者null
            return null; // 或者返回一个默认的UserDetails对象
        }
    }
}
