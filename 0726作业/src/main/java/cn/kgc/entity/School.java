package cn.kgc.entity;

import java.util.List;

public class School {

    private Integer sid;
    private String schoolName;
    private String schoolAddress;
    private String schoolPhone;

    @Override
    public String toString() {
        return "School{" +
                "sid=" + sid +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolPhone='" + schoolPhone + '\'' +
                '}';
    }

// 构造方法


    public School() {
    }

    public School(Integer sid, String schoolName, String schoolAddress, String schoolPhone) {
        this.sid = sid;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolPhone = schoolPhone;
    }

    // Getters 和 Setters
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

}
