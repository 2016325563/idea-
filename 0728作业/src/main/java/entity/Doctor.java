package cn.kgc.entity;

import java.util.List;

public class Doctor {
    private Integer docId;
    private String docName;
    private String docSex;
    private Integer docAge;
    private Integer hopId;
    List<Hospital> hospitals;

    @Override
    public String toString() {
        return "Doctor{" +
                "docId=" + docId +
                ", docName='" + docName + '\'' +
                ", docSex='" + docSex + '\'' +
                ", docAge=" + docAge +
                ", hopId=" + hopId +
                '}';
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocSex() {
        return docSex;
    }

    public void setDocSex(String docSex) {
        this.docSex = docSex;
    }

    public Integer getDocAge() {
        return docAge;
    }

    public void setDocAge(Integer docAge) {
        this.docAge = docAge;
    }

    public Integer getHopId() {
        return hopId;
    }

    public void setHopId(Integer hopId) {
        this.hopId = hopId;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public Doctor(Integer docId, String docName, String docSex, Integer docAge, Integer hopId) {
        this.docId = docId;
        this.docName = docName;
        this.docSex = docSex;
        this.docAge = docAge;
        this.hopId = hopId;
    }

    public Doctor() {
    }
}
