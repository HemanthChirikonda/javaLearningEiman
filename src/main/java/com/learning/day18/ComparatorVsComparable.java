package com.learning.day18;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorVsComparable {

    public static void main(String[] args) {

//         Comparable                                          Comparator
//        comparable is interface -> Java.lang                   Comparator is interface -> Java.Util
//        it is used to compare current object                       it is used to compare two different objects
//        with other Object
//        compareTo(Object obj);                                  compare(Object obj1, Object obj2);

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("eiman", 19, 3.5, 3);
        Student student1 = new Student("roy", 35, 2.5, 5);
        Student student2 = new Student("joy", 42, 3.8, 1);
        Student student3 = new Student("jack", 26, 2.7, 6);
        Student student4 = new Student("kim", 12, 3.2, 2);
        Student student5 = new Student("rayn", 65, 2.3, 4);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        Collections.sort(students);
        for (Student s : students){
            System.out.println(s);
        }


        System.out.println("-----------------------------------------------------------------------------------------");
        Collections.sort(students, new StudentAgeComparator());
        for (Student s : students){
            System.out.println(s);
        }
    }
}
