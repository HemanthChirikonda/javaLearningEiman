package com.learning.day14_15_16_17;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {


//        Map => key and value pairs => pair we call it ENTRY.

        // 1. HashMap
        // 2. LinkedHash Map
        // 3. Tree Map



        // Aim of DS => O(1)


        //    Arrays        >    Binary Trees             >    Balanced Binary Tree       >     HashFunction
//             O(N)            O(logN) ->  not 100%                 O(logN)                        O(1)

        // We want All operations to be O(1).

        // Hash Functions => it defined the relation between keys and memory Index.


        // Collisions  => inserting multiple key values into single memory location.


        // HashMap<KeyDatatype, valueDatatype>   variableName = new HashMap<KeyDatatype, valueDatatype>();

        HashMap<String, Integer>  personsWithAgeMap = new HashMap<>();

        personsWithAgeMap.put("eiman", 19);
        personsWithAgeMap.put("hemanth", 27);
        personsWithAgeMap.put("joy", 34);
        personsWithAgeMap.put(null, 88);
        personsWithAgeMap.put("roy", 24);

        System.out.println(personsWithAgeMap);

        // HashMap does not follow the insertion order.
        // HashMap will accept null as key.
        Set<String> keys = personsWithAgeMap.keySet();  // to get the keys set.
        System.out.println(keys);

        for (String key :keys){
            System.out.println("key "+ key);
            System.out.println("value " +personsWithAgeMap.get(key));
            System.out.println("----------------------");
        }

        Set<Map.Entry<String, Integer>> entrySet = personsWithAgeMap.entrySet();

        System.out.println(entrySet);

        for (Map.Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("----------------------");
        }

        // ----------------------------------------------------------------------------

//         LinkedHashMap
//         uses double LinkedList
//         need more memory
//         LinkedHAshMap will accept null as key
//         LinkedHAshMap also follow the insertion order.
//// LinkedHashMap<KeyDatatype, valueDatatype>   variableName = new LinkedHashMap<KeyDatatype, valueDatatype>();


//        -----------------------------------------------------------------------------------

//        TreeMap -> Class -> SortedMap -> Interface  => time complexity => O(logN).

        // Balanced Binary trees => AVL Trees or Red Black trees. => O(logN)

//        TreeMap<KeyDatatype, valueDatatype>   variableName = new TreeMap<KeyDatatype, valueDatatype>();

        TreeMap<Double, String> prices = new TreeMap<>();
        prices.put(525.32, "dell");
        prices.put(110.50, "mobile");
        prices.put(56.25, "1 gen airpods");

        prices.put(1020.99, "mac air m1");

        System.out.println(prices);

        // TreeMap follow the sorting order based on keys.
        // TreeMap does not allow null as key.

        System.out.println(prices.firstEntry());
        System.out.println(prices.firstKey());
        System.out.println(prices.lastEntry());
        System.out.println(prices.lastKey());


        //                                         HashMap                                          LinkedHashMap                                      TreeMap
//                                               uses Arrays                                      doubleLinkedList                             Balanced binary Trees
//        best case                           can achieve O(1)                                     can achieve O(1)                                  O(1)
//        worst case                                O(N)                                                O(logN)                                      O(logN)  => 100%
//                                         we can store null as key                             we can store null as key                     we can not store null as key
//                                    does not follow the insertion order                     does follow the insertion order                does follow the sorting order
       }
}
