package com.learning.day14_15_16_17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListIntro {
    public static void main(String[] args) {

        // 1. ArrayList
//         2. LinkedList
//         3. Vector
//         4. Stack

//          1. ArrayList
//
//            ArrayList<DataType>  variableName =  new ArrayList<Datatype>();

            ArrayList<String> persons = new ArrayList<String>();
            persons.add("Eiman");
            persons.add("jack");
            persons.add("kim");
            persons.add("Jhon");

        System.out.println(persons.size());
        System.out.println(persons);
        System.out.println(persons.remove(1));
        System.out.println(persons);
        persons.add(1, "ana");
        System.out.println(persons);

//         1. Search based on Index -> O(1)
//         2. Search for Arbitrary element without index -> O(N)
//         3. Inserting at the end -> O(1)
//         4. Inserting at the Arbitrary index -> O(N)
//         5. remove last item -> O(1)
//         6. Removing at the Arbitrary index -> O(N)

        // we have to shift a lot whenever we are updating the items in arraylist.

        for(int i=0 ; i<persons.size(); i++){
            System.out.println(persons.get(i));
        }

        for(String item : persons){
            System.out.println(item);
        }

 //-------------------------------------------------------------------------------------

        // Linked List

        // StartingNode -> HeadNode

        // Node -> data, next

        // data -> contains the values
        // next -> contains the address of next item.


        // Only through head node we can access all other items.

        // items are not storing next to each-other.

        // 1. search of first item -> O(1)
        // 2. Search for Arbitrary element -> O(N)
        // 3. insert the first -> O(1)
        // 4. inserting at  Arbitrary position -> O(N)
        // 5. remove first item -> O(1)
        // 6. remove item from Arbitrary position -> O(N)

//        LinkedList<DataType>  variableName = new LinkedList<DataType>();
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        System.out.println(numbers);

        numbers.addFirst(500);
        System.out.println(numbers);
        numbers.addLast(1000);
        System.out.println(numbers);

        System.out.println(numbers.size());
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
//   ---------------------------------------------------------------------------
        // Vector

//      its similier to arrayList
//      its synchronized -> every operation, it will lock the resources and unlock after the operation.
//  ----------------------------------------------------------------------------

//       Stacks
//      its synchronized -> uses Vector.
//      LIFO structure -> Last In First Out

        // -> pop() -> removes the top element
//         -> push() -> add the element at the top
//         -> peek() -> value of top element.

//        Stack<DataType> variableName = new Stack<DataType>();

        Stack<Integer> numberStack = new Stack<>();
        numberStack.push(100);
        numberStack.push(200);
        numberStack.push(300);
        numberStack.push(400);
        System.out.println(numberStack);
        System.out.println(numberStack.peek());
        System.out.println(numberStack.pop());
        System.out.println(numberStack);



     }
}
