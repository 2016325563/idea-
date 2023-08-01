package entity;

public class Class {

    /*创建班级类的实体
     *
     *包含字段班级的id,班级的名称,保留班级的对象--学生,用于在bean中使用注入
     *
     *
     * */

    private int id;
    private String name;
    private Student student;

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

    public Student getStudent() {
        return student;
    }

    public Class() {
    }

    // 构造方法
    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 学生注入的方法
    public void setStudent(Student student) {
        this.student = student;
    }

    // 获取班级信息的方法
    public void getClassInfo() {
        System.out.println("该班级中有" + student.getName() + "学生，该学生年龄是：" + student.getAge() + "，电话是：" + student.getPhoneNumber());
    }
}
