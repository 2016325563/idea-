package cn.kgc.entity;

import java.util.List;

public class Project {
    private Integer projId;
    private String projName;
    List<Emp> ListEmp;

    public List<Emp> getListEmp() {
        return ListEmp;
    }

    public void setListEmp(List<Emp> listEmp) {
        ListEmp = listEmp;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projId=" + projId +
                ", projName='" + projName + '\'' +
                '}';
    }

    public Project() {
    }

    public Project(Integer projId, String projName) {
        this.projId = projId;
        this.projName = projName;
    }

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }
}
