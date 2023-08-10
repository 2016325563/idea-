package cn.kgc.controller;

import cn.kgc.entity.Actor;
import cn.kgc.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ActorController {

    @Autowired
    ActorService actorService;

    @RequestMapping("/addActor")
    public @ResponseBody
    void addActor(@RequestBody Actor actor) {


        Integer row = actorService.addActor(actor);
        if (row > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    @RequestMapping("/getAllActorOrAlike")
    public String getAllActorOrAlike(Model model, String representativeWorks) {
        List<Actor> actors = actorService.getAllActorOrAlike(representativeWorks);
        model.addAttribute("ActorList", actors);
        return "index";
    }

    @RequestMapping("/delById")
    public String delById(Integer actorId) {
        Integer row = actorService.delById(actorId);
        if (row > 0) {
            System.out.println("删除成功");
            return "redirect:getAllActorOrAlike";
        } else {
            System.out.println("删除失败");
            return null;
        }
    }


}

