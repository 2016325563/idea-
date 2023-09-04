package cn.kgc.controller;

import cn.kgc.entity.Animal;
import cn.kgc.service.AnimalService;
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
public class AnimalController {
    @Autowired
    private AnimalService animalService;


    @PostMapping("/animal/add")
    public String addAnimal(Animal animal) {
        animalService.insert(animal);
        return "redirect:/";
    }


    @GetMapping("/animalDelete/{id}")
    public String deleteById(@PathVariable(value = "id") int id) {
        animalService.deleteById(id);
        return "redirect:/";
    }
}