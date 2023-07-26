package cn.kgc.entity;

public class Phone {
    private Integer phoneId;
    private String phoneNum;
    private Integer stuId;

    public Phone(Integer phoneId, String phoneNum, Integer stuId) {
        this.phoneId = phoneId;
        this.phoneNum = phoneNum;
        this.stuId = stuId;
    }

    public Phone() {
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneId=" + phoneId +
                ", phoneNum='" + phoneNum + '\'' +
                ", stuId=" + stuId +
                '}';
    }
}
