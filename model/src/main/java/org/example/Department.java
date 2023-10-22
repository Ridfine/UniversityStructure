package org.example;

import java.util.ArrayList;

public class Department {
    private String department_id;
    private String departmentName;
    private String faculti_id;
    private ArrayList<Teacher> teachers;

    public Department() {
    }

    public Department(String department_id, String departmentName, String faculti_id, ArrayList<Teacher> teachers) {
        this.department_id = department_id;
        this.departmentName = departmentName;
        this.faculti_id = faculti_id;
        this.teachers = teachers;
    }

    public Department(String department_id, String departmentName, String faculti_id) {
        this.department_id = department_id;
        this.departmentName = departmentName;
        this.faculti_id = faculti_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFaculti_id() {
        return faculti_id;
    }

    public void setFaculti_id(String faculti_id) {
        this.faculti_id = faculti_id;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }
}
