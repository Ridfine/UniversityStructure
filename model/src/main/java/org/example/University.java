package org.example;

import java.util.ArrayList;

public class University {
    private String universityId;
    private String universityName;
    private ArrayList<Faculti> faculties;

    public University() {
    }
    public University(String universityId, String universityName) {
        this.universityId = universityId;
        this.universityName = universityName;
    }

    public University(String universityId, String universityName, ArrayList<Faculti> faculties) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.faculties = faculties;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<Faculti> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculti> faculties) {
        this.faculties = faculties;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
}
