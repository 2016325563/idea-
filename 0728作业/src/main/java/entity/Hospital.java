package cn.kgc.entity;

import java.util.List;

public class Hospital {

    private Integer hopId;
    private String hopName;
    private String hopAddress;
    private String hopPho;
    List<Doctor> doctors;
    private String MaleDoctorCount;

    public String getMaleDoctorCount() {
        return MaleDoctorCount;
    }

    public void setMaleDoctorCount(String maleDoctorCount) {
        MaleDoctorCount = maleDoctorCount;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hopId=" + hopId +
                ", hopName='" + hopName + '\'' +
                ", hopAddress='" + hopAddress + '\'' +
                ", hopPho='" + hopPho + '\'' +
                '}';
    }

    public Hospital(Integer hopId, String hopName, String hopAddress, String hopPho, List<Doctor> doctors) {
        this.hopId = hopId;
        this.hopName = hopName;
        this.hopAddress = hopAddress;
        this.hopPho = hopPho;
        this.doctors = doctors;
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

    public String getHopAddress() {
        return hopAddress;
    }

    public void setHopAddress(String hopAddress) {
        this.hopAddress = hopAddress;
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

    public Hospital(Integer hopId, String hopName, String hopAddress, String hopPho) {
        this.hopId = hopId;
        this.hopName = hopName;
        this.hopAddress = hopAddress;
        this.hopPho = hopPho;
    }


}
