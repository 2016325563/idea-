package entity;

public class School {

    /*补充实体类
     *补充名称,地址,电话字段
     *
     * */
    private String name;
    private String address;
    private String phoneNumber;
    private int totalClasses;
    private Class aClass;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public void setTotalClasses(int totalClasses) {
        this.totalClasses = totalClasses;
    }

    public School() {
    }

    // 构造方法
    public School(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.totalClasses = 0;
    }


    // 添加班级的方法
    public void addClass() {
        totalClasses++;
    }

    /*给出一个sayHi方法,输出的语句是 我这里是xx学校，地址在xx,电话xx,我有 xx班级，该班级中有 xx学生，该学生年龄是:xx ,电话是： xxx*/
    // 获取学校信息的方法
    public void sayHi() {
        System.out.println("我这里是" + name + "学校。地址在" + address + "，电话" + phoneNumber + "。我有" + totalClasses + "个班级," + "该班级中有" + aClass.getStudent().getId() + "个学生,该学生的年龄是" + aClass.getStudent().getAge() + ",电话是" + aClass.getStudent().getPhoneNumber());
    }
}
