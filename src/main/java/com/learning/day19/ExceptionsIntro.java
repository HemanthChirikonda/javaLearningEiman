package com.learning.day19;

import java.util.Scanner;

public class ExceptionsIntro {
    public static void main(String[] args) {
        // Exception: Abnormal termination of program.
        //	types of Exceptions:
//		                 1. Checked Exception
//		                              ->checked at compile time, Extends the "Exception" class
//		                              -> methods that might throw a checked Exception must declare it in their "throws" clause.
//		                              -> handle it using try/Catch block.
//		                 2. UnChecked Exception
//		                              -> not checked at compile time., Extends the "RuntimeException" class
//	                                  -> methods that might throw an UnChecked Exception no need declare it in their "throws" clause.
//		                              -> caught explicitly.


        //Exception Handling: To stop the abnormal termination of program, we use Exception Handling.
//		                      Try, catch and finally.

        //		Exception handling hierarchy

//	     Throwable -MainClass
//		 Exception - subclass
//		 RuntimeException - subclass
//		 IOExceptions
//		 SQLExceptions
//		 ClassNotFoundException
//		 ArrayIndexOutOfBoundException
//		 StringIndexOutOfBoundException


        // printing the Exception:
        // Exception -> name and message
        // getMessage() -> message
        // printStackTrace() -> name, message, location

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a =scan.nextInt();
        System.out.println("Enter b value: ");
        int b =scan.nextInt();

        try{
            // risky code
            System.out.println("a/b = "+a/b);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("This is a Next 100 lines of Code ");

     ATM myATM = new ATM();

     try{
         myATM.withdraw(40);
     }catch (Only100sException | MinWithdrawAmount e){
         System.out.println(e);
     }finally {
         System.out.println("Thank you..!");
     }
     // 20, 10 finished, 100

    }
}
