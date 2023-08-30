// OwnerController.java文件，用于定义Controller类
package cn.kgc.controller;

import cn.kgc.entity.Owner;
import cn.kgc.entity.House;
import cn.kgc.service.OwnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OwnerController {

    // 注入Service接口对象
    @Autowired
    private OwnerService ownerService;

    // 查询所有业主信息的方法，并跳转到显示页面
    @RequestMapping("/showAllOwner")
    public ModelAndView showAllOwner() {
        ModelAndView mv = new ModelAndView();
        List<Owner> list = ownerService.getAllOwner();
        mv.addObject("list", list);
        mv.setViewName("showAllOwner");
        return mv;
    }

    // 根据业主id查询所有房屋信息的方法，并跳转到显示页面
    @RequestMapping("/showHouseByOwnerId")
    public ModelAndView showHouseByOwnerId(int ownerId) {
        ModelAndView mv = new ModelAndView();
        List<House> list = ownerService.getHouseByOwnerId(ownerId);
        mv.addObject("list", list);
        mv.setViewName("showHouseByOwnerId");
        return mv;
    }

    // 根据房屋id删除房屋信息的方法，并返回到原来的页面
    @RequestMapping("/deleteHouseByHouseId")
    public String deleteHouseByHouseId(int houseId, int ownerId) {
        boolean flag = ownerService.deleteHouseByHouseId(houseId);
        if (flag) {
            return "redirect:/showHouseByOwnerId?ownerId=" + ownerId;
        } else {
            return "error";
        }
    }

    // 根据房屋id跳转到修改房屋信息的表单页面，并显示该房屋信息的原始值
    @RequestMapping("/updateHouseByHouseId")
    public ModelAndView updateHouseByHouseId(int houseId, String houseNumber, String building, String unit, String address, int ownerId) {
        ModelAndView mv = new ModelAndView();
        // 创建一个房屋对象，并设置其属性值
        House house = new House(houseId, houseNumber, building, unit, address, ownerId);
        // 将房屋对象传递给视图
        mv.addObject("house", house);
        // 设置视图名称为updateHouse
        mv.setViewName("updateHouse");
        return mv;
    }

    // 根据房屋id更新房屋信息的方法，并返回到原来的页面
    @RequestMapping("/updateHouse")
    public String updateHouseByHouseId(House house, int ownerId) {
        boolean flag = ownerService.updateHouseByHouseId(house);
        if (flag) {
            return "redirect:/showHouseByOwnerId?ownerId=" + ownerId;
        } else {
            return "error";
        }
    }
    // 跳转到新增业主信息的表单页面，并显示空白的输入框
    @RequestMapping("/addOwner")
    public ModelAndView addOwner() {
        ModelAndView mv = new ModelAndView();
        // 创建一个业主对象，并设置其属性值为null或0
        Owner owner = new Owner(0, null, null, 0, null, null);
        // 将业主对象传递给视图
        mv.addObject("owner", owner);
        // 设置视图名称为addOwner
        mv.setViewName("addOwner");
        return mv;
    }
    // 插入业主信息的方法，并返回到原来的页面
    @RequestMapping("/addOwnerByForm")
    public String addOwner(Owner owner) {
        boolean flag = ownerService.addOwner(owner);
        if (flag) {
            return "redirect:/showAllOwner";
        } else {
            return "error";
        }
    }
}
