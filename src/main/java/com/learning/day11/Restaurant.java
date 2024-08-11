package com.learning.day11;

import java.util.Scanner;

public class Restaurant {
    static int orderIndex=0;
    static int personIndex=0;
    static Orders[] orders = new Orders[20];
    static Person[] persons = new Person[20];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our restaurant!");

        boolean stop= false;
         Person  currentPerson = null;
        while(!stop){
            System.out.println("1.New Person");
            System.out.println("2.Exiting Person");
            System.out.println("3.Show All Persons");
            System.out.println("4.Create Order");
            System.out.println("5.Show All Orders");
            System.out.println("6.Stop");
            int choice = scanner.nextInt();
            scanner.nextLine();
//            if(choice == 1){
//                System.out.println("Enter your id: ");
//                int id = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("Enter your name: ");
//                String name = scanner.nextLine();
//                currentPerson = new Person(id, name);
//                persons[personIndex]= currentPerson;
//                personIndex++;
//            }else if(choice == 2){
//                System.out.println("Enter your person Index: ");
//                int  persinIndexInput = scanner.nextInt();
//                scanner.nextLine();
//                if(persinIndexInput <= personIndex){
//                    currentPerson = persons[persinIndexInput];
//                }else{
//                    System.out.println("Person does not exit: ");
//                }
//            }else {
//                stop = true;
//            }

            switch(choice){
                case 1 :
                    System.out.println("Enter your id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                currentPerson = new Person(id, name);
                persons[personIndex]= currentPerson;
                personIndex++;
                    System.out.println(currentPerson);
                    break;
                case 2:
                    System.out.println("Enter your person Index: ");
                int  persinIndexInput = scanner.nextInt();
                scanner.nextLine();
                if(persinIndexInput <= personIndex){
                    currentPerson = persons[persinIndexInput];
                    System.out.println(currentPerson);
                }else{
                    System.out.println("Person does not exit: ");
                }

                    break;
                case 3:
                      for(Person p : persons){
                         if(p != null){
                             System.out.println(p);
                         }
                      }
                    break;
                case 4:
                 //code
                    break;
                case 5:
        if(orderIndex > 0){
            for(int index =0; index <= orderIndex; index++){
                System.out.println(orders[index]);
            }
        }else{
            System.out.println("No orders Placed Yet.....");
        }
                    break;
                case 6:
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }



        }


    }
}



// 1. Get All Orders
// 2. Make a Order
     // product details
     // person details a. Exiting Person
                         // code
     //                b. New Person
                         //code
     // person
     // this person will be added to order
// 3. Exit