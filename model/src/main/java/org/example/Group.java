package org.example;

import java.util.ArrayList;

public class Group {
    private String group_id;
    private ArrayList<Student>students;
    private String faculti_id;
    private Student headman;

    public Group() {
    }

    public Group(String group_id, ArrayList<Student> students, String faculti_id, Student headman) {
        this.group_id = group_id;
        this.students = students;
        this.faculti_id = faculti_id;
        this.headman = headman;
    }

    public Group(String group_id, String faculti_id) {
        this.group_id = group_id;
        this.faculti_id = faculti_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getFaculti_id() {
        return faculti_id;
    }

    public void setFaculti_id(String faculti_id) {
        this.faculti_id = faculti_id;
    }

    public Student getHeadman() {
        return headman;
    }

    public void setHeadman(Student headman) {
        this.headman = headman;
    }

}
