package cn.kgc.entity;

import org.springframework.stereotype.Component;

// 创建业主类，对应业主表
@Component
public class Owner {
    // 定义属性，对应字段
    private int ownerId; // 业主id
    private String name; // 名字
    private String gender; // 性别
    private int age; // 年龄
    private String nation; // 民族
    private String origin; // 籍贯

    // 定义无参构造方法
    public Owner() {
    }

    // 定义有参构造方法
    public Owner(int ownerId, String name, String gender, int age, String nation, String origin) {
        this.ownerId = ownerId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nation = nation;
        this.origin = origin;
    }

    // 定义getters和setters方法
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
