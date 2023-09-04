package cn.kgc.user.controller;

import cn.kgc.user.entity.Product;
import cn.kgc.user.service.IProductService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

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
public class ProductController {


    @Autowired
    IProductService iProductService;

    @GetMapping("/productList")
    public String showProductListPage(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "pageSize", defaultValue = "12") Integer pageSize, Model model) {


        Page<Product> pageProduct = iProductService.getProductByPage(page, pageSize);

        model.addAttribute("pageProduct", pageProduct);

        return "productList";
    }

    @GetMapping("/productDetail")
    public String showProductDetailPage(Model model, @RequestParam(value = "id") Integer id) {
        Product product = iProductService.getProductById(id);

        model.addAttribute("product", product);
        return "productDetail";
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
