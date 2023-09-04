package cn.kgc.controller;

import cn.kgc.entity.Zoo;
import cn.kgc.mapper.ZooMapper;
import cn.kgc.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */
@Controller
public class ZooController {
    @Autowired
    private ZooService zooService;
    @Autowired
    private ZooMapper zooMapper;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("zoos", zooService.ZooWithAnimal());
        return "index";
    }


   /* @PostMapping("/zoo/update")
    public String updateZoo(Zoo zoo) {
        zooService.updateZoo(zoo);
        return "redirect:/";
    }*/


    @GetMapping("/zoo/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Zoo zoo = zooMapper.selectById(id);
        model.addAttribute("zoo", zoo);
        return "modZoo";
    }

    @PostMapping("/zoo/update")
    public String updateZoo(@ModelAttribute("zoo") Zoo zoo) {
        zooService.updateZoo(zoo);
        return "redirect:/";
    }


}