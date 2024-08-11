package com.learning.day13;

public class StringIntro {

    public static void main(String[] args) {
        // its a predefined non primitive datatype.
        // which is an object that represents sequence of char values.

        // Java.lang.String

        // Strings are immutable ->  Once a string is created, its values can not be changed.


        // String -> implements -> Serializable , Comparable , CharSequence
        // String clas is final in Java.

        // Java Memory
        //		1. Heap Memory
//		     -> Java Objects will be stored in heap, which is some portion of memory dedicated to storing objects and arrays.
//		     -> Heap memory is shared among all threads in JVM.

        //	    2. Stack Memory
//		     -> Java uses stack memory to store local variables and method call information.
//		     ->Each thread in JVM has its own stack, which is used for method calls and local variables.

        char[] cs= {'a', 'c', 'd', 'e'};
        String s = new String(cs);
        System.out.println(s);

//        String can be created in two ways
//            1. String literal -> ""  -> stored inside a String literal pool
//            2. new Keyword   -> new  -> stroed inside a heap memory.


        String s1 = "hello world";
        System.out.println(s1);
        String s2 = "hello world";
        System.out.println(s2);
        String s4 = new String("hello world");
        String s5 = new String("hello world");
        String s6 = new String("eiman");
        System.out.println(s4);

        System.out.println(s1==s2); // true
        System.out.println(s1==s4); // false
        System.out.println(s4.equals(s2));  // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s4 == s5); // false

        s1= "hello";
        s1= "hello worl";
        System.out.println(s1);
//            012345678910
        s1 = "hello world";
        System.out.println(s1.length());
        System.out.println(s1.charAt(6));
        System.out.println(s1.indexOf('w'));
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(1,7));

        // concatenation, we use + operator

        System.out.println("hello " + "eiman");
        System.out.println("hello ".concat("eiman"));

        //  StringBuilder and StringBuffer  -> mutable
        //		   -> this classes will allow you to modify strings without creating new objects each time.
//		   -> both classes will provide similar functionlity, but they differ in their thread safty.

        //		 Stringbuiler => its is not thread safe.
//		              -> which means its not suitable for multithreaded environments.
//		              -> however it is more efficient than StringBuffer.

//		 StringBuffer => its is thread safe.
//         -> which means its suitable for multithreaded environments.
//         -> however it is less efficient than StringBuilder

        StringBuilder sb = new StringBuilder();

        sb.append("I am");
        sb.append(" java");
        sb.append(" developer");

        System.out.println(sb);

        String s7 = sb.toString();
        System.out.println(s7);

        StringBuffer sbuf = new StringBuffer();
        sbuf.append(s7);
        sbuf.reverse();

        System.out.println(sbuf);

        //		 Welcome to Store
//
//		 a. add item to Inventory
//		 b. check Inventory
//		 if you select "a" option it will show these options
//		 1. create laptop
//		 2. create table
//		 3. create light
//		         if select option 1 , it will ask question to create a laptop
//		         if select option 2, it will ask question to create a table
//		         if select option 3 , it will ask question to create a light


    }
}
