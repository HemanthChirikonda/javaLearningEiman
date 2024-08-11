package com.learning.day9;

import java.util.Objects;

public final class Student {

    final String school = "xyz";
    public String name;
    public int age;
    public String grade;

    @Override
    public String toString() {
        return "Name "+ name+ " grade "+ grade;
    }


    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this.name, ((Student) obj).name) && Objects.equals(this.age, ((Student) obj).age);
    }
}
