package cn.kgc.controller;

import cn.kgc.entity.ClassRoom;
import cn.kgc.entity.Computer;
import cn.kgc.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClassRoomController {

    @Autowired
    ClassRoomService classRoomService;

    public void addClass() {

        Integer row = classRoomService.addClass(new ClassRoom(null, "测试电脑", 0));

        System.out.println("插入的电脑数量" + row);
    }

    public void alikeClassName() {

        List<ClassRoom> classRooms = classRoomService.alikeClassName("4");
        for (ClassRoom classRoom : classRooms) {

            /*+"\t"*/
            System.out.println(classRoom.getId() + "\t" + classRoom.getName() + "\t" + classRoom.getFloor());
        }


    }


    public void getAllInfoById() {
        List<ClassRoom> classRooms = classRoomService.getAllInfoById(3);
        System.out.println(classRooms.size());

        for (ClassRoom classRoom : classRooms) {
            System.out.println(classRoom.getComputers().size());
            List<Computer> computers = classRoom.getComputers();
            for (Computer computer : computers) {
                System.out.print(classRoom.getId() + "\t" + classRoom.getName() + "\t" + classRoom.getFloor() + "\t");

                System.out.println(computer.getId() + "\t" + computer.getName() + "\t" + computer.getPrice() + "\t" + computer.getColor() + "\t" + computer.getBrand() + "\t" + computer.getClassroomId());
                // 其他电脑属性...
            }
        }
    }

}
