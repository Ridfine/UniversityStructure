package org.example;

public class Student {
    private String student_id;
    private String university_id;
    private String faculti_id;
    private String group_id;
    private String name;

    public Student() {
    }

    public Student(String student_id, String university_id, String faculti_id, String group_id, String name, String surname, String fatherName, int age) {
        this.student_id = student_id;
        this.university_id = university_id;
        this.faculti_id = faculti_id;
        this.group_id = group_id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
    }

    private String surname;
    private String fatherName;
    private int age;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getFaculti_id() {
        return faculti_id;
    }

    public void setFaculti_id(String faculti_id) {
        this.faculti_id = faculti_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(String university_id) {
        this.university_id = university_id;
    }
}
