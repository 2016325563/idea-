package cn.kgc.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private String stuSex;
    private String stuAddress;

    @Override
    public String toString() {
        return "student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex='" + stuSex + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                '}';
    }

    public Student() {
        System.out.println("空的无参构造------------");
    }

    public Student(Integer stuId, String stuName, Integer stuAge, String stuSex, String stuAddress) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
        this.stuAddress = stuAddress;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

}
