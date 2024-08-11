package com.learning.day9;

public class ObjectClassIntro {
//     Object class is a root/parent class for all the objects that are created inside a java.

//		  - toString();
//		      -> it will return the String representation of Objects.
//		  - equals(Object obj);
//		      -> it will used ti indicate whether some other object is equal or not to current object.
//		      -> by default it will check weather both belongs to same memoery location or not.
//		  - hashCode();
//		      -> it will return the hash code values of obejct.
//		  - getClass();
//		      -> it provides the infromation about the class.
//		  - clone();
//		      -> it will create the new copy of the object and retruns it.
//		  - finalize();
//		      ->it will be called by garbage collector on an object when garbage collector determines
//		         that there are no more references to that object.
public static void main(String[] args) {

    Student s1= new Student();
    s1.name= "eiman";
    s1.age= 19;
    s1.grade="A";
    System.out.println(s1.hashCode());

    Student s2= new Student();
    s2.name= "eiman";
    s2.age= 19;
    s2.grade="B";
    System.out.println(s2.hashCode());
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s2.getClass());
    System.out.println(s1 == s2); // checks the memory location => Shallow comparison
    System.out.println(s1.equals(s2)); //Deep comparison => be default, checks the memory location
    System.out.println();

//    final keyword to have constant values.

    final int a = 10;

    // final keyword with method => in subclass => it can not be overridden

    // final keyword with class => that class can not extended by other classes.



}


     // Abstract
    //  Product   -> id, name , price, rating  - > Abstract class
    //		             -> checkTotalSales() - > this is a normal method
    //----------------------------------------------------------------
    //   Laptop  -- > screenSize, RAM, SSD, processes
    //		             -> checkCharging,   checkLogin => methods

    //----------------------------------------- phase 2
    //		             -> constructor
    //		             -> Override the default toString to print the Object
    //		                 with id, name , price,  screenSize, RAM, SSD, processor

    //----------------------------------------- phase 3
    //                     -> Override the default equals to compare two Objects
    //		                 compression condition    id, ram, ssd, processor needs to be same to be equal
    //----------------------------------------------------------------
    //   Table   -- >    height, width, length
    //		             -> area method, volume method

    //-----------------------------------------phase 2
    //                   -> constructor
    //		             -> Override the default toString to print the Object
    //		                 with id, name , price,  height, width, length

    //----------------------------------------- phase 3
    //                     -> Override the default equals to compare two Objects
    //		                 compression condition    id, length, height, width needs to be same to be equal
    //----------------------------------------------------------------
    //    Light  ->  wats, lumen
    //                   -> noOfAmps,  checkPowerUTil

    //-----------------------------------------phase 2
    //                   -> constructor
    //                   -> Override the default toString to print the Object
    //		                 with id, name , price,  wats, lumen

    //----------------------------------------- phase 3
    //                     -> Override the default equals to compare two Objects
    //		                 compression condition    id, wats, lumen  needs to be same to be equal

    // create getters and setters -Product, Laptop,Table, Light
    // min 2 object of each.

}
