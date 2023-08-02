package cn.kgc.entity;

import cn.kgc.service.Print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*可以自动指定的对象名字 默认是小写的对对象名字*/
@Component
/*      ("stu")*/


public class Student {
    @Value("1001")
    private Integer stuId;
    @Value("1001")

    private String stuName;
    @Value("1001")
    private Integer stuAge;
    @Value("1001")
    private String stuSex;
    /*自动的注入对象*/
    @Autowired
    private Friend friend;
    @Autowired
    /*注意是小写的 因为是小写的!!!!!创建对象的时候*/
    @Qualifier("blackPrint")
    private Print print;

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
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

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Student(Integer stuId, String stuName, Integer stuAge, String stuSex) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
    }

    public Student() {
    }
}
