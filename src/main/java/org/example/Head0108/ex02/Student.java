package org.example.Head0108.ex02;

public class Student {
    private String name;
    private int age;
    private String studentsId;

    public Student(String name, int sge, String studentsId) {
        this.name = name;
        this.age = age;
        this.studentsId = studentsId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setStudentsId(String studentsId) {
        this.studentsId = studentsId;
    }

    @Override
    public String toString() {
        return "Student{naem='" + name + "', age=" + age + ", syudentId='" + studentsId + "'}";
    }
}
