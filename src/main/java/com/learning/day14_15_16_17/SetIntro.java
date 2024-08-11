package com.learning.day14_15_16_17;

import java.util.*;

public class SetIntro {

    public static void main(String[] args) {

        // Set => All the items in a set are unique => interface
        // venn - diagrams.
        // => unions , intersection

        // 1. HashSet       =>   class => uses => 1D Arrays
        // 2. LinkedHashset =>   class => uses the hash functions / LinkedList
        // 3. TreeSet       =>   class  => uses => balanced binary tree => red - black trees.

        // Set<Datatype> name = new HashSet<Datatype>();

        //1. HashSet.
        // hashset does n ot follow the insertion order.

        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        set1.add("f");
        set1.add("g");
        set1.add("h");
        set1.add("i");

        System.out.println(set1);

        Set<String> set2  = new HashSet<>();

        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("d");
        set2.add("l");
        System.out.println(set2);


//        set1.retainAll(set2); // intersection of both sets and storing it in set1

        System.out.println(set1);

        set1.removeAll(set2);  // intersection of both sets and removes the inspection items from set1

        System.out.println(set1);

        // ------------------------------------------------------------------------------
        // LinkedHashSet

        // LinkedHashSet maintains the insertion order

        // it also needs more memory than hashset

       //---------------------------------------------------------------------------------
//        3. TreeSet -> Class => SortedSet(interface) => Set (interface)

        // Balanced Binary Trees

        // time complexity-  O(log(n))

        //------------------------------------------ ? -----------------------------------1000
        //--------------------?--------------------- 500
        //---------?----------250
        //-----?----125
        //---?--64

        // 1 => searched element.


        //SortedSet<datatype> name = new TreeSet<Datatype>();

        SortedSet<Integer> set3 = new TreeSet<>();
        set3.add(9);
        set3.add(1);
        set3.add(8);
        set3.add(4);
        set3.add(7);
        set3.add(5);
        set3.add(2);
        set3.add(3);
        set3.add(6);

        System.out.println(set3);

        Set<Integer> set4 = set3.subSet(3, 6);
        System.out.println(set4);

        System.out.println(set3.tailSet(6));

        System.out.println(set3.headSet(5));

        System.out.println(set3.first()); // min number
        System.out.println(set3.last()); // max number


        SortedSet<String>  set5 = new TreeSet<>();

        set5.add("f");
        set5.add("b");
        set5.add("d");
        set5.add("A");
        set5.add("e");
        set5.add("c");
        set5.add("g");
        set5.add("a");
        set5.add("D");

        System.out.println(set5);



        //HashSet       => 1D arrays              => O(N)                            => does not  insertion order
        //LinkedHashSet => LinkedList             => best case O(log(n), worst O(N)  => does insertion order.
        //TreeSet       => Balanced Binary Trees  => O(log(n)                        => sorting order.


    }
}
