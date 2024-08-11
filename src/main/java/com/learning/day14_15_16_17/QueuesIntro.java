package com.learning.day14_15_16_17;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuesIntro {
    public static void main(String[] args) {

        // Queues :

//        FIFO => First In First Out    - O(N)

        // ArrayList and LinkedList are used to implement Queues.


        // enqueue -> insert an item
        // dequeue() -> delete an item
        // peek()  -> return a values.




        // ------------throws Excweptions              ----------- return a value
        // add()                                               offer()
        //remove()                                              poll()
        //element()                                            peek();

        // Queues are very useful when a resource is shared with several consumers.
        // Queues are very imp in CPU schedules.


        //Queue<datatype> variiableName = new LinkedList<datatype>();

        Queue<String> persons = new LinkedList<>();

        persons.add("a");
        persons.add("b");
        persons.add("c");
        persons.add("d");
        persons.add("e");
        persons.add("f");
        persons.add("g");


        System.out.println(   persons.peek());
        System.out.println(persons.remove());
        System.out.println(   persons.peek());

        System.out.println(persons.poll());

        System.out.println(persons.peek());
        System.out.println(persons.element());

        // ---------------------------------------------------------------------

        // Priority Queue

        // it will sort the queue based on priority.
        // we will assign a priority values to each and every single item.
        // elements with high priority wwill serv before low priority elements.


        //-----------------------------------------------------------------------



        // DoubleEndedQueue - Deque
        Deque <Integer> queue = new ArrayDeque<>();

        // addFirst()
        //addLast()
        // removeFirst()
        // removeLast();





        //--------------------------------------------------------------------------

        Deque<Integer> stacks = new ArrayDeque<>();

        // stacks by deque is much faster then normal stack DS
        // because normal stacks DS is synchronized as it extended from vector.
        // thats why arrayDeque stack is faster than normal stack DS.



    }
}
