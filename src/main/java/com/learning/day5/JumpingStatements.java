package com.learning.day5;

public class JumpingStatements {
    public static void main(String[] args) {
        // break         -> to stop the loop
       //  continue      -> to skip current iteration of the loop


        for(int i =1; i<=200000;i++){
            System.out.println(i);
            if(i == 20){
                System.out.println("I found it");
                break;
            }
        }



        for(int i =1; i <=100; i++){
            if(i % 3 == 0 ){
                continue;
            }

            System.out.println(i);
        }


    }
}
