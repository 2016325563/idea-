package cn.kgc.entity;

import org.springframework.stereotype.Component;

@Component

public class Computer {
    private Integer id;         // 电脑ID，整数类型
    private String name;    // 名称，字符串类型
    private double price;   // 价格，浮点数类型
    private String color;   // 颜色，字符串类型
    private String size;    // 尺寸，字符串类型
    private String brand;   // 品牌，字符串类型
    private Integer classroomId; // 教室ID，整数类型，使用包装类Integer，允许为空
    private Integer blackComputerCount; // 新增属性黑色电脑的数量

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", classroomId=" + classroomId +
                '}';
    }

    public Integer getBlackComputerCount() {
        return blackComputerCount;
    }

    public void setBlackComputerCount(Integer blackComputerCount) {
        this.blackComputerCount = blackComputerCount;
    }

    public Computer(int id, String name, double price, String color, String size, String brand, Integer classroomId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.classroomId = classroomId;
    }

    public Computer() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }
}
