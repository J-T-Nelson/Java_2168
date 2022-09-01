//LinkedListTest0.java (Code not in textbook.)
//* Some code are demoed in the lecture.
//* Demo basic usage of class java.util.LinkedList.
//* Demo use of linked list of Integer objects and linked list of String objects
//* Compare the use of ArrayList and LinkedList classes.
//* Since both java.util.ArrayList and java.util.LinkedList implement the java.util.List interface,
//*   the use of LinkedList is very similar to ArrayList.

package linkedlist_app;

import java.util.ArrayList;

//import the definition of LinkedList in Java API
import java.util.LinkedList;
//import the definition of List interface in Java API
import java.util.List;

public class LinkedListTest0 {

    public static void main(String[] args) {
        
        //1. Handle Linked List of String objects.
        
        //declare a variable named dessertsLL, create a new empty LinkedList of String objects,
        // then make dessertsLL reference this new LinkedList object.
        LinkedList<String> dessertsLL = new LinkedList<>();
        //An ArrayList of String objects.
        ArrayList<String> dessertsAL = new ArrayList<>();

        //append a new String to the end of the LinkedList of String objects
        dessertsLL.add("ice cream");
        //print the data contents in the LinkedList of String objects.
        //toString() method is implicitly called.
        System.out.println(dessertsLL);

        //do the same for the ArrayList of String objects.
        dessertsAL.add("ice cream");
        System.out.println(dessertsAL);
        
        //2. Handle Linked List of Integer objects.
        
        //declare a variable named numbersLL, create a new empty LinkedList of Integer objects,
        // then make numbersLL reference this new LinkedList object.
        LinkedList<Integer> numbersLL = new LinkedList<>();
        //An ArrayList of Integer objects.
        ArrayList<Integer> numbersAL = new ArrayList<>();
        
        //Append two numbers 10, 5 to the end of the LinkedList of Integer objects.
        numbersLL.add(10);
        numbersLL.add(5);
        //print the data contents in the LinkedList of Integer objects.
        //toString() method is implicitly called.        
        System.out.println(numbersLL);

        //do the same for the ArrayList of Integer objects.
        numbersAL.add(10);
        numbersAL.add(5);
        System.out.println(numbersAL);

        //3. Handle List of Integer objects 
        
        //declare a variable named numbers of List type. 
        //It can reference either an ArrayList<Integer> or a LinkedList<Integer> 
        //So the acutal list can be either type.
        List<Integer> numbers;
        
        //If the actual list is a LinkedList of Integer object, then: 
        //  Create an empty LinkedList of Integer objects, 
        //     make numbers reference this LinkedList.
        numbers = new LinkedList<>();      
        
        //If the actual list is an ArrayList of Integer object, then: 
        //  Create an empty ArrayList of Integer objects, 
        //     make numbers reference this ArrayList.       
        numbers = new ArrayList<>();
        
        //Using the list numbers in the same way regardless of your choice of ArayList or LinkedList.
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers);
        
    }
}
