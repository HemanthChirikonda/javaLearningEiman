package com.learning.day11;

public class ArraysIntro {

    public static void main(String[] args) {

//        dataType[] nameOfTheArray = { elements };
           int[] array1 = {1,2,3,4,5,6,7};

           array1[2] = 100;
           for(int index=0; index< array1.length; index++){
               System.out.println(array1[index]);
           }

//        datatype[]  nameOfTheArray  = new datatype[size];
          int[]       array2          = new int[7];
        for(int index=0; index< array2.length; index++){
            System.out.println(array2[index]);
        }


        String[] array3 = new String[5];

        array3[0] = "roy";
        array3[1] = "ana";
        array3[2] = "bob";
        array3[3] = "dave";
        array3[4] = "jack";
        for(int index=0; index< array3.length; index++){
            System.out.println(array3[index]);
        }

        for(String item : array3){
            System.out.println(item);
        }

        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

        Person[] persons = new Person[15];

        persons[0] = new Person(1, "bob");
        persons[1] = new Person(2, "dave");
        persons[2] = new Person(3, "jack");
        persons[3] = new Person(4, "dave");

        for(int index=0; index<persons.length; index++){
            System.out.println(persons[index]);
        }

        for(Person p : persons){
            System.out.println(p);
        }

    }
}
