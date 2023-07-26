package entity;

import entity.School;

import java.util.List;

public class Class {
    private int classId;        // 班级ID
    private String className;   // 班级名称
    private int schoolId;       // 学校ID
    // 添加一个学校对象引用，表示与该班级关联的学校信息
    private School school;

    // 添加一个学生列表，表示该班级的所有学生
    private List<Student> students;

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                //", schoolId=" + schoolId +
                ", school=" + school +
               // ", students=" + students +
                '}';
    }
// 构造方法，getters和setters


    public Class() {
    }

    public Class(int classId, String className, int schoolId, School school, List<Student> students) {
        this.classId = classId;
        this.className = className;
        this.schoolId = schoolId;
        this.school = school;
        this.students = students;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
