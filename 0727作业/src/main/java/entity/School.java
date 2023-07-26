package entity;

import java.util.List;

public class School {


    private int schoolId;           // 学校ID
    private String schoolName;      // 学校名称
    private String schoolAddress;   // 学校地址
    // 添加一个班级列表，表示该学校的所有班级
    private List<Class> classes;
    // 构造方法，getters和setters


    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", classes=" + classes +
                '}';
    }

    public School() {
    }

    public School(int schoolId, String schoolName, String schoolAddress, List<Class> classes) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.classes = classes;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
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

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}
