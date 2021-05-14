package com.zwl.entity;

/**
 * @author Weilei Zhang
 * @Program: Student
 * @Description: TODO
 * @create 2021-05-14 19:13
 */
public class Student {
    private Integer studentID;
    private String name;
    private Integer age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Integer studentID, String name, Integer age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }
}
