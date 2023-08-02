package cn.kgc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassRoom {

    /*根据之前给出的字段给出两个实体类的字段,使用合适的类型*/
    private Integer id;         // 教室ID，整数类型
    private String name;    // 名称，字符串类型
    private Integer floor;      // 楼层，整数类型
    @Autowired
    private List<Computer> computers;

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }


    public ClassRoom() {
    }

    public ClassRoom(Integer id, String name, int floor) {
        this.id = id;
        this.name = name;
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
