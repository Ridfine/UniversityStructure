package org.example;

import java.util.*;

public class Generator {
    private final String[] faculties = {
            "Mediko-biologicheskiy",
            "Geologicheskiy fakultet",
            "Istoricheskiy fakultet",
            "Fakultet kompyuternykh nauk",
            "Matematicheskiy fakultet",
            "Fakultet mezhdunarodnykh otnosheniy",
            "Fakultet prikladnoy matematiki, informatiki i mekhaniki",
            "Fakultet romano-germanskoy filologii",
            "Farmatsevticheskiy fakultet",
            "Fizicheskiy fakultet"
    };

    private int freeUniversityId = 0;


    public ArrayList<String> generateUniversityNames(int numNames){
        Set<String> universityNames = new HashSet<>();
        Random random = new Random();
        while(universityNames.size() < numNames){
            String name = generateRandomName(random);
            universityNames.add(name);
        }
        return new ArrayList<>(universityNames);
    }
    private String generateRandomName(Random random) {
        StringBuilder sb = new StringBuilder();
        int length = random.nextInt(7) + 3; // Генерируем рандомную длину от 5 до 14 символов

        for (int i = 0; i < length; i++) {
            int randomChar = random.nextInt(26) + 65; // Генерируем рандомную заглавную букву от A до Z
            sb.append((char) randomChar);
        }

        return sb.toString();
    }
    public ArrayList<Student> generate_students(Group group, Map<String, String> nameId){
        int numStudents = (int) (Math.random() * 1) + 1;
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++){
            String name = "StudentName" + i;
            String surname = "StudentSurname" + i;
            String fatherName = "StudentFatherName" + i;
            int age = (int) (Math.random() * 5) + 20;
            Student newStudents = new Student(group.getGroup_id() + "." + i, nameId.get("universityId"), nameId.get("facultiId"),nameId.get("groupId"), name, surname, fatherName, age);
            students.add(newStudents);
        }

        return students;
    }
    public ArrayList<Group> generate_groups(Faculti faculti, Map<String, String> nameId){
        int numGroups = (int) (Math.random() * 1) + 1;
        ArrayList<Group> groups = new ArrayList<>();
        for (int i = 0; i < numGroups; i++){
            Group newGroup = new Group(faculti.getFacultiId() + "-d." + i, nameId.get("facultiId"));
            nameId.put("groupId", newGroup.getGroup_id());
            ArrayList<Student> students = generate_students(newGroup, nameId);
            newGroup.setStudents(students);
            newGroup.setHeadman(students.get((int) (Math.random() * students.size())));
            groups.add(newGroup);
        }
        return groups;
    }

    public ArrayList<Teacher> generate_teatchers(Department department, Map<String, String> nameId){
        int numTeatchers = (int) (Math.random() * 1) + 1;
        ArrayList<Teacher> teatchers = new ArrayList<>();
        for (int i = 0; i < numTeatchers; i++){
            String name = "TeacherName" + i;
            String surname = "TeacherSurname" + i;
            String fatherName = "TeacherFatherName" + i;
            int age = (int) (Math.random() * 40) + 30;
            Teacher newTeatchers = new Teacher(department.getDepartment_id() + "." + i, nameId.get("universityId"), nameId.get("facultiId"), nameId.get("departmentId"), name, surname, fatherName, age);
            teatchers.add(newTeatchers);
        }
        return teatchers;
    }

    public ArrayList<Department> generate_departments(Faculti faculti, Map<String, String> nameId){
        int numDepartments = (int) (Math.random() * 1) + 1;
        ArrayList<Department> departments = new ArrayList<>();
        for (int i = 0; i < numDepartments; i++){
            String departmantName = "departmantName" + i;
            Department newDepartment = new Department(faculti.getFacultiId() + "-d." + i, departmantName, nameId.get("facultiId"));
            nameId.put("departmentId", newDepartment.getDepartment_id());
            newDepartment.setTeachers(generate_teatchers(newDepartment,nameId));

            departments.add(newDepartment);
        }

        return departments;
    }
    public ArrayList<Faculti> generate_faculties(University university, Map<String, String> nameId){
        int numFaculti = (int) (Math.random() * 1) + 1;
        ArrayList<Faculti> faculties = new ArrayList<>();
        for (int i = 0; i < numFaculti; i++){
            Faculti newFaculti = new Faculti(university.getUniversityId() + "." + i, this.faculties[i], university.getUniversityId());
            nameId.put("facultiId", newFaculti.getFacultiId());
            newFaculti.setGroups(generate_groups(newFaculti, nameId));
            newFaculti.setDepertments(generate_departments(newFaculti, nameId));
            faculties.add(newFaculti);
        }
        return faculties;
    }

    public ArrayList<University> generate_universities(int numUniversity){
        ArrayList<String> universityNames = generateUniversityNames(numUniversity);
        ArrayList<University> universities = new ArrayList<>();
        for (int i = 0; i < numUniversity; i++){
            Map<String, String> nameId = new HashMap<String, String>();
            University newUnivesity = new University(String.valueOf(this.freeUniversityId), universityNames.get(i));
            nameId.put("universityId", newUnivesity.getUniversityId());
            System.out.println(this.freeUniversityId);
            this.freeUniversityId += 1;
            newUnivesity.setFaculties(generate_faculties(newUnivesity, nameId));
            universities.add(newUnivesity);
        }
        return universities;
    }
}
