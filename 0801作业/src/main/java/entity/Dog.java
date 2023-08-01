package entity;

public class Dog {
    private String color;
    private String breed;
    private int age;
    private String gender;

    // 省略构造方法

    // 获取颜色
    public String getColor() {
        return color;
    }

    // 设置颜色
    public void setColor(String color) {
        this.color = color;
    }

    // 获取品种
    public String getBreed() {
        return breed;
    }

    // 设置品种
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 获取性别
    public String getGender() {
        return gender;
    }

    // 设置性别
    public void setGender(String gender) {
        this.gender = gender;
    }
}