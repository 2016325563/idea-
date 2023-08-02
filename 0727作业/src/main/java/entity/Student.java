package cn.kgc.entity;

public class Student {
    private int stuId;          // 学生ID
    private String stuName;     // 学生姓名
    private String stuSex;      // 学生性别
    private int stuAge;         // 学生年龄
    private String stuAddress;  // 学生地址
    private int classId;        // 班级ID
    // 添加一个班级对象引用，表示与该学生关联的班级信息
    private Class classInfo;
    // 构造方法，getters和setters

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuAddress='" + stuAddress + '\'' +
              //  ", classId=" + classId +
                ", classInfo=" + classInfo +
                '}';
    }

    public Student() {
    }

    public Student(int stuId, String stuName, String stuSex, int stuAge, String stuAddress, int classId, Class classInfo) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
        this.classId = classId;
        this.classInfo = classInfo;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Class getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(Class classInfo) {
        this.classInfo = classInfo;
    }


}
