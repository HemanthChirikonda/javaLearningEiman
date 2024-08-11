package com.learning.day18;

public class Student  implements  Comparable<Student>{

    private String name;
    private int age;
    private double gpa;
    private int id;

    public Student(String name, int age, double gpa, int id) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        return this.id - obj.id;
    }

}
