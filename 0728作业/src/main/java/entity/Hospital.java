package entity;

import java.util.List;

public class Hospital {

    private Integer hopId;
    private String hopName;
    private String hopAdress;
    private String hopPho;
    List<Doctor> doctors;

    @Override
    public String toString() {
        return "Hospital{" +
                "hopId=" + hopId +
                ", hopName='" + hopName + '\'' +
                ", hopAdress='" + hopAdress + '\'' +
                ", hopPho=" + hopPho +
                '}';
    }

    public Integer getHopId() {
        return hopId;
    }

    public void setHopId(Integer hopId) {
        this.hopId = hopId;
    }

    public String getHopName() {
        return hopName;
    }

    public void setHopName(String hopName) {
        this.hopName = hopName;
    }

    public String getHopAdress() {
        return hopAdress;
    }

    public void setHopAdress(String hopAdress) {
        this.hopAdress = hopAdress;
    }

    public String getHopPho() {
        return hopPho;
    }

    public void setHopPho(String hopPho) {
        this.hopPho = hopPho;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Hospital() {
    }

    public Hospital(Integer hopId, String hopName, String hopAdress, String hopPho, List<Doctor> doctors) {
        this.hopId = hopId;
        this.hopName = hopName;
        this.hopAdress = hopAdress;
        this.hopPho = hopPho;
        this.doctors = doctors;
    }
}
