package cn.kgc.controller;

import cn.kgc.entity.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */@Controller
public class ZooController {
    @Autowired
    private ZooService zooService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("zoos", zooService.getAllZoos());
        return "index";
    }

    @PostMapping("/zoo/add")
    public String addZoo(Zoo zoo) {
        zooService.addZoo(zoo);
        return "redirect:/";
    }

    @PostMapping("/zoo/update")
    public String updateZoo(Zoo zoo) {
        zooService.updateZoo(zoo);
        return "redirect:/";
    }

    @GetMapping("/zoo/{id}/delete")
    public String deleteZoo(@PathVariable int id) {
        zooService.deleteZoo(id);
        return "redirect:/";
    }
}