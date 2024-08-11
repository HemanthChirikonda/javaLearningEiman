package com.learning;

public class Operators {

    public static void main(String[] args) {


        // 5 types of operators
        //
        //
        //
        // 1. Arthmetic Operators
//		             + , -, / , * , ++, --, %
//		2. Assignment Operators
//		             =, +=, -=, *=, /=, &=, |=, ^=, >>=, <<=
//		3. Comparsion Operators
//		             ==, !=, > , < , >=, <=
//		4. Logical Operators
//		             &&, || , !
//		5. Bitwise Operators


        // 1. Arthmetic Operators

        int a = 10;

        int b =15;

        int sum = a+b;
        int sub = a-b;
        int div = a/b;
        int mul = a*b;
        int rem = a%b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(rem);
        System.out.println("---------------------------");

         a++;

        b = a++;
        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------------------");
        int x= 10;      // x=10;
        int y = x++;    // y=10; x=11;
        int z = y++ + x++; //  10 + 11;   z=21; y =11; x= 12

        System.out.println(x);  // 12 ?
        System.out.println(y);  // 11
        System.out.println(z);  // 10+11
        System.out.println("---------------------------");


        int i =15;            // i =15
        System.out.println("i " + i);
        int j = i++ + i++;    //  j = 15+1 + 15 = 31 ;  i =17
        System.out.println("i " + i);
        System.out.println("j " + j);
        int k = i++ + j++ + i++; // k = 17+1 + 31 + 17 = 66 ; j = 32; i = 19
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("k " + k);

        int m = 12;


        int n = 13;

        int o = 15;

        // m 12
        x= m++ + n++ + o++  + m++;  // 12+1 + 13 + 15 + 12; = 53 ; m = 14; n =14; 0 =16

        y = x++ + m++ + n++;  //  y = 53 + 14 + 14, x = 54, m = 15 ; n = 15


        System.out.println(x);
        System.out.println(y);

        x =0;

        y =0;

        m =10;
        n =11;
        o=12;

        x = ++m + ++n; //  11 + 12 = 23
        y = ++m + ++o; // 12 + 13 = 25

        System.out.println(x);
        System.out.println(y);

//        2. Assignment Operators
//            =, +=, -=, *=, /=, &=, |=, ^=, >>=, <<=


             int num = 10;
               num += 11; // num = num+11; 10+11;

        System.out.println(num);

                num -=10;   // num = 21-10;

        System.out.println(num);  // 11


            num *= 2;  // num = num * 2;  num = 11*2;

        System.out.println(num);  // 22


           num /=2;// num = num/2= 22/2 = 11


        System.out.println(num);


        //		3. Comparsion Operators
       //		             ==, !=, > , < , >=, <=

        System.out.println(10 == 11);   // false

        System.out.println(10 != 11);    // true

        System.out.println(10 > 11 );    // false

        System.out.println( 10 < 11);     // true

        System.out.println(10 >= 11);     // false

        System.out.println(10 <= 11);     // true



        int age1 = 15;
        int age2 = 20;

        System.out.println(age1 >= age2);
        System.out.println(age1 == age2);

        //		4. Logical Operators
       //		             &&, || , !

//        &&  - AND
//           true && true => true

//        ||  - OR
//          true || false => true
//          false || true => true

//        !   - NOT

//        true => false
//        false => true


        int num1 = 10;

        int num2 = 15;

        int num3 = 20;

//                           false       &&    true
        System.out.println((num1 > num2) && (num2 < num3) );      // false

//                                           false      ||  true       =>   true
//                                     (false && true)  ||  !(false)    =>
        System.out.println(((num1 > num2) && (num2 < num3)) || !(num1> num3 ));   // true

//
        System.out.println(num1 > num3 && num2 > num1 || num1 < num2 && num3 > num1);   // true

//                            (false) && ( true || true && true) = false
        System.out.println((num1 >= num3) && (num2 > num1 || num1 < num2 && num3 > num1)); // true




    }
}
