package cn.kgc.entity;

// 创建房屋类，对应房屋表
public class House {
    // 定义属性，对应字段
    private int houseId; // 房屋id
    private String houseNumber; // 房屋门牌号
    private String building; // 楼栋
    private String unit; // 单元号
    private String address; // 地址
    private int ownerId; //业主id

    // 定义无参构造方法
    public House() {
    }

    // 定义有参构造方法
    public House(int houseId, String houseNumber, String building, String unit, String address, int ownerId) {
        this.houseId = houseId;
        this.houseNumber = houseNumber;
        this.building = building;
        this.unit = unit;
        this.address = address;
        this.ownerId = ownerId;
    }

    // 定义getters和setters方法
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}