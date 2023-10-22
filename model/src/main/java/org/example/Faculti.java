package org.example;

import java.util.ArrayList;

public class Faculti {
    private String facultiId;
    private String facultiName;
    private ArrayList<Department> depertments;
    private ArrayList<Group> groups;
    private String university_id;


    public Faculti() {
    }

    public Faculti(String facultiId, String facultiName, ArrayList<Department> depertments, ArrayList<Group> groups, String university_id) {
        this.facultiId = facultiId;
        this.facultiName = facultiName;
        this.depertments = depertments;
        this.groups = groups;
        this.university_id = university_id;
    }

    public Faculti(String facultiId, String facultiName, String university_id) {
        this.facultiId = facultiId;
        this.facultiName = facultiName;
        this.university_id = university_id;
    }

    public String getFacultiName() {
        return facultiName;
    }

    public void setFacultiName(String facultiName) {
        this.facultiName = facultiName;
    }

    public ArrayList<Department> getDepertments() {
        return depertments;
    }

    public void setDepertments(ArrayList<Department> depertments) {
        this.depertments = depertments;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public String getFacultiId() {
        return facultiId;
    }

    public void setFacultiId(String facultiId) {
        this.facultiId = facultiId;
    }

    public String getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(String university_id) {
        this.university_id = university_id;
    }
}
