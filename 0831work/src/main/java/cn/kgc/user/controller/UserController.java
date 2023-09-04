package cn.kgc.user.controller;

import cn.kgc.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class UserController {


    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
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

  /*  @GetMapping("/dologin")
    public String dologin(String name, Model model) {
        User user = (User) userDetailsService.loadUserByUsername(name);
        model.addAttribute("user", user);
        return "login";
    }*/

}
