package cn.kgc.controller;

import cn.kgc.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/animals")
    @ResponseBody
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @PostMapping("/animal")
    @ResponseBody
    public void addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
    }

    @PutMapping("/animal")
    @ResponseBody
    public void updateAnimal(@RequestBody Animal animal) {
        animalService.updateAnimal(animal);
    }

    @DeleteMapping("/animal/{id}")
    @ResponseBody
    public void deleteAnimal(@PathVariable int id) {
        animalService.deleteAnimal(id);
    }