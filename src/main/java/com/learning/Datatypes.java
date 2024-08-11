package com.learning;

public class Datatypes {

    public static void main(String[] args) {
        // primitive data types.  => values
        int a = 10;
        // Non - primitive data types. => actions and attributes.
        // String =>


//        8 primitive data types

// 		1. byte      -  1 byte         -128 to 127
//		2. short     -  2 bytes        -32768 to 32767
//		3. int       -  4 bytes       -2,147,483,648   to  2,147,483,647
//		4. long      -  8 bytes       -9,223,372,036,854,775,808   to 9,223,372,036,854,775,807
//		5. float     -  4 bytes          store up to 6 to 7 decimal digits
//		                              ex: 12.2222222
//		6. double    -  8 bytes         store up to 15 decimal digits
//		                              ex: 12.22222222345678
//		7. boolean   - 1 bit            true or false
//		8. char      - 2 bytes           signle charactor , need single quotes

      byte b = 10;



        System.out.println(b);

          b=30;

        System.out.println(b);

 // memory =>  1b      2b         4b     8b
//            byte => short =>   int => long =>
//                    memory =>  4b         8b
                  //            float  => double
//                         1b
                       // boolean => true or false

//                         2b
//                         char => single char , use single quotes.

        b=15;
        System.out.println(b);
//        variable =>

        // defining a variable

        // datatypeOfVarivale    variableName = varibaleValue ;
        float c = 1.5f;
        double d = 1.5;
        boolean e =  true;

//        type casting

//        wideing casting   - automatically -> converting smaller type to larger type
//                         byte -> short -> char -> int -> long -> float -> double
//		  Narrowing Casting - manually -> larger type to smaller type
//                         byte <- short <- char <- int <- long <- float <- double


               byte f = 126;
               int g = f;

        System.out.println(g);


        long h = 1234567890;
        int  i = 120;
         i = (int)h;
        System.out.println(i);


        float j = 123.45678f;
        System.out.println(j);
        int k= (int)j;

        System.out.println(k);

        byte smallerValue = 126;

        System.out.println(smallerValue);     // memory =>  1 byte

        int largerValue = smallerValue;

        System.out.println(largerValue);      // memory =>  4 bytes


        short midsizeValue =   (short) largerValue;            // memory =>   2bytes

        System.out.println(midsizeValue);

        char character1 = 'a';
        System.out.println(character1);

        char character2 = 'v';
        System.out.println(character2);

        boolean checkPoint = false;

        int character1IntValue = character1;

      System.out.println(character1IntValue);


      //   write a 10th char after char "A"

       char character3 = 'A';  // 65
        System.out.println(character3);
       char character4 = 'A'+10; // 65+10 = 75 => K
        System.out.println(character4);






    }
}
