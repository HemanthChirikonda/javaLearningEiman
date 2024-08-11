package com.learning.day14_15_16_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterableIntro {
    public static void main(String[] args) {

        // Iterable

        // it's a parent for all the collections

        // it is used to read data from all the collection implementation classes.
        // we can read and remove the data using Iterator.

        // hasNext();
        // next();
        // remove();

        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("roy");
        listOfNames.add("joy");
        listOfNames.add("jack");
        listOfNames.add("kim");
        listOfNames.add("james");

        Iterator<String> iterator = listOfNames.iterator();

        System.out.println(iterator.hasNext());  // it will check weather it has a next item or not.
        System.out.println(iterator.next());  // it will give us the values of next item.
        System.out.println("--------------------------");
         while(iterator.hasNext()){
             System.out.println(iterator.next());
         }


        HashMap<String, Integer> personsMap = new HashMap<>();

        personsMap.put("eiman", 20);
        personsMap.put("hemanth", 27);
        personsMap.put("joy", 34);
        personsMap.put(null, 88);
        personsMap.put("roy", 24);
        System.out.println(personsMap);


        Iterator<String> iterator1 = personsMap.keySet().iterator();

        System.out.println("-----------------------");
        while (iterator1.hasNext()){
            String key = iterator1.next();
            System.out.println("key : "+key);
            System.out.println("value : "+personsMap.get(key));
            System.out.println("-----------");
        }


        Iterator<Map.Entry<String, Integer>> iterator2 = personsMap.entrySet().iterator();
        System.out.println("-----------------------");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }



    }
}
