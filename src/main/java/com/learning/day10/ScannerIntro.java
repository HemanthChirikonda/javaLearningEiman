package com.learning.day10;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // Scanner class is used to get input from user.

        // it's imported from java.util

        // 1. Scanner Object -> System.in
        // 2. nextLine(); next(); -> String type input
        // 3. nextInt();
        // 4. nextBoolean(); ...


//        Scanner s1 = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        String name = s1.nextLine();
//        System.out.println("This is your name: "+name);
//
//        System.out.println("Enter your age: ");
//        int age = s1.nextInt();
//        System.out.println("This is your age: "+age);
//
//        System.out.println("Enter your score: ");
//        int score = s1.nextInt();
//        System.out.println("This is your score: "+score);
//                 s1.nextLine();
//
//        System.out.println("Enter your grade: ");
//        String grade = s1.nextLine();
//        System.out.println("This is your grade: "+grade);
//
//         s1.close();

         // create a person class and create a object by taking a input using scanner
//	      -> firstName
//	      -> lastName
//	      -> phonenumber
//	      -> email
//	      -> dob 12-4-2022
//	      -> age
//	      -> address
//		  -> salary
//		  -> hasOwnhouse


        Scanner s2 = new Scanner(System.in);
        System.out.println("Welcome to my Office");
        boolean stop = false;

        while (!stop){
            System.out.println("1. do you want to register ?");
            System.out.println("2. Do you want book an appointment?");
            System.out.println("3. Do you want to exit ?");

            int option = s2.nextInt();  // selecting an option
            s2.nextLine();

            if(option == 1){
                System.out.println("Enter your name: ");
                String p_name = s2.nextLine();
                System.out.println("This is your name: "+p_name);

                System.out.println("Enter your age: ");
                int p_age = s2.nextInt();
                System.out.println("This is your age: "+p_age);
                s2.nextLine();
            } else if(option == 2){
                System.out.println("appointment time :");
                String appointment_time = s2.nextLine();
                System.out.println("appointment_time :" + appointment_time);

                System.out.println("appointment date :");
                String appointment_date = s2.nextLine();
                System.out.println("appointment_date :" + appointment_date);
            } else if (option == 3) {
                System.out.println(" User Exited Successfully......!");
                stop= true;

            }
        }

    }
}
