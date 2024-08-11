package com.learning.day4;

public class LoopingStatements {
    public static void main(String[] args) {

        // For loop
        // While Loop
        /// Do while Loop


        // For Loop

        //		for(statement1 ; statement2 ; statement3 ) {
//			           body - > code
//		          }


//            for(initialization ; condition ; increment / decrement){
//                      body -> code
//              }


              int number = 0;

              for(int i=1; i <=10; i++){
                  number = number +1;
                  System.out.println(number);
              }
//              i =1 =>  1<=10 => true=> inside a loops to execute body of for loop => i++ => i =2
//              i=2  =>  2<=10  =>true =>   inside a loops to execute body of for loop => i++ => i =3



//              i=10 => 10 <=10 => true => inside a loops to execute body of for loop => i++ => i =11
//              i= 11 => 11 <=10 false => stop


        // 5, 10, 15, 20,...... 100

        for(int i=1; i <=20; i++){
            System.out.println(i*5);
        }



        // -------------------------------------------------------------------------------

        for(int outer=1; outer<=5; outer++){
            System.out.println("-----------------------outer: "+outer);    // line 1
            for (int inner =100; inner<=105; inner++){       // line 2 : another loop
                System.out.println("inner: "+inner);
            }

        }


        //   loop1 : 1 =>   1 < 5 => true => inside a outer loop
//                                => inside line 1: System.out.println("-----------------------outer: "+outer);
//                                => inside line 2: another loop
//                                => inner loop 1: 100 => 100 <= 105 => true => inside inner loop
//                                                                         => System.out.println("inner: "+inner);
//                                                     => 101 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 102 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 103 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 104 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 105 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 106 <= 105 => false => stop inner loop
//                                => after loop:   end of first outer loop
        //   loop1 : 2 =>   2 < 5 => true => inside a outer loop
//                                => inside line 1: System.out.println("-----------------------outer: "+outer);
//                                => inside line 2: another loop
//                                => inner loop 1: 100 => 100 <= 105 => true => inside inner loop
//                                                                         => System.out.println("inner: "+inner);
//                                                     => 101 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 102 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 103 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 104 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 105 <= 105 => true => inside inner loop
//                                                                          => System.out.println("inner: "+inner);
//                                                     => 106 <= 105 => false => stop inner loop
//                                => after loop:   end of first outer loop

        // task print 5 store = each store should print 5 apples and 5 oranges
        //    store 1
        //    apple 1
        //    apple 2
        //    apple 3
        //    apple 4
        //    apple 5
        //   orange 1
        //   orange 2
        //   orange 3
        //   orange 4
        //   orange 5
        //     store 2


        //----------------------------------------------------------------------------

        // while loop


//		 while(condition) {
//			 body
//		 }

//		 initialization
//		 while(condition) {
//		 body

//		 increment / decrement
//	    }



        // 1, 2, 3, 4,5,.... 10

        int i =1;
        while(i <=10){
            System.out.println(i);
           i++;
        }


        System.out.println("---------------------------------------");

        //do while



//		 initialization
//		 do {
////			 code body
//		 }
//		while(condition)



        int k= 1000;
        do{
            System.out.println("hello");
            k++;
        }while (k <10);

        // task print 5 store = each store should print 5 apples and 5 oranges
        //    store 1   => for
        //    apple 1   => while
        //    apple 2
        //    apple 3
        //    apple 4
        //    apple 5
        //   orange 1   => do while
        //   orange 2
        //   orange 3
        //   orange 4
        //   orange 5
        //     store 2

        //         0 1 2 3 4
        //		 0 * * * * *         row no - 0   => missing - 0
      //		 1 * * * *           row no -1   => missing  - 1
      //		 2 * * *             row no -2   => missing  - 2
      //		 3 * *
      //		 4 *


     for(int m=0; m <5; m++){
         for(int n =0; n<5-m; n++){
             System.out.print("* ");
         }
         System.out.println();
     }

//		*
//		* *
//		* * *
//		* * * *
//		* * * * *

//		----------------------------

//		       *
//		     * *
//		   * * *
//		 * * * *
//     * * * * *

// ---------------------------------
//           * * * * *
//		       * * * *
//		         * * *
//		           * *
//		             *
//		 ------------------------------------

    }


}
