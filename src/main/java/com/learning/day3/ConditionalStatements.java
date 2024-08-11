package com.learning.day3;

public class ConditionalStatements {

    public static void main(String[] args) {


        // 4 conditional statements
        // if
        // if else
        // else if
        // switch


        //1. If Statement

        // if(condition){
        // body --> we will write a code
        // }

        // WAP to find weather given person is minor or major
        // age > 18 => major , age < 18 => minor
        int age = 21;

        if (age < 18) {
            System.out.println("minor");
        }

        if (age >= 18) {
            System.out.println("major");
        }

        // WAP to find weather given person is senior citizen  or not
        // if age > 50 => senior citizen


        if (age < 50) {
            System.out.println("not a senior citizen");
        }


        if (age >= 50) {
            System.out.println("senior citizen");
        }

//        2   if else

        // if(condition){
        // body --> we will write a code
        // } else{
        //   body --> we will write a code
        //}

        if (age < 18) {   //=> false
            System.out.println("minor");
        } else {
            System.out.println("major");
        }


        if (age < 50) {
            System.out.println("not a senior citizen");
        } else {
            System.out.println("senior citizen");
        }

//3  else if


        // if(condition 1){
        // body --> we will write a code
        // } else if(condition 2){
        //   body --> we will write a code
        //}else{
        //   body --> we will write a code
        // }


        if (age < 18) {
            System.out.println("minor");
        } else if(age >= 18 && age <50){
            System.out.println("major and not a senior citizen");
        } else {
            System.out.println("senior citizen");
        }


        // write a program to find out the grades based on markes

        // 100- 90 - A
        // 89 - 80 - B
        // 79 - 70 - C
        // 69 - 60 - D
        // 59 - 50 - E
        // < 50 - F



//        4.  Swicth


        // switch

        // switch (expression){
        // case var1:
        // code
        // break;
        // case var2:
        // code
        // break;
        // default:
        // code

        // }

       // find a color

        String color = "yellow";

        switch (color){
            case "red":
                // code
                System.out.println("This is a red color");
                break;
            case "yellow":
                // code
                System.out.println("This is a yellow color");
                break;
            case "green":
                //code
                System.out.println("This is a green color");
                break;
            default:
                //code
                System.out.println("I dont know this color");
                break;
        }


        // write swicth statement to find a month based on number
        int month = 4;


    }


}