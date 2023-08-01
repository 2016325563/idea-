package entity;

import Service.Print;

import java.util.List;

public class Student {
    private Integer stuId;
    private String stuName;
    private Friend friend;
    private Print print;
    private List<String> list;
    private List<Friend> listFriend;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<Friend> getListFriend() {
        return listFriend;
    }

    public void setListFriend(List<Friend> listFriend) {
        this.listFriend = listFriend;
    }

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

    public void sayHi() {
//        print.printin();
        System.out.println("hello:我叫" + stuName + ",ID号是:" + stuId + ",朋友的名字是" + friend.getName());

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

    public Student() {
        System.out.println("进入了空的构造方法");
    }

    public Student(Integer stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public Student(Integer stuId, String stuName, Friend friend, Print print) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.friend = friend;
        this.print = print;
    }
}
