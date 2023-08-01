package entity;

public class Car {
    private String color;
    private String brand;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    // 省略构造方法
    public void SayHi() {
        /*模仿句式:我是一辆xx色的 xx 牌子的车，车里有一只xx 颜色的*/
        System.out.println("我是一辆" + this.getColor() + "的" + this.getBrand() + "的车子,车里有一只" + dog.getColor() + "颜色的" + dog.getBreed());

    }

    // 获取颜色
    public String getColor() {
        return color;
    }

    // 设置颜色
    public void setColor(String color) {
        this.color = color;
    }

    // 获取品牌
    public String getBrand() {
        return brand;
    }

    // 设置品牌
    public void setBrand(String brand) {
        this.brand = brand;
    }
}


