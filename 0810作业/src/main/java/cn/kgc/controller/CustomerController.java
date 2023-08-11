package cn.kgc.controller;

import cn.kgc.entity.Customer;
import cn.kgc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("addCustom")
    public String addCustom(Customer customer) {
        Integer row = customerService.addCustom(customer);

        if (row > 0) {
            return "login";
        } else {
            return "register";
        }

    }

    @RequestMapping("doLogin")
    public Object doLogin(Model model, Customer customer) {
        Customer customer1 = customerService.doLogin(customer);
        if (customer1 != null && customer1.getCustomerId() != null) {
            model.addAttribute("customer", customer1);
            return new RedirectView("getAllGoods", true); // 跳转到另一个控制层方法
        } else {
            return "login";
        }

    }
}
