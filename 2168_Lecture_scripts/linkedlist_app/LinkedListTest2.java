//LinkedListTest2.java 
//* Modified based on book code in Section 2.3
//* Demo: use array and Linked list
//* Create, populate, and process each element in a Linked list of Integer objects
//* Since both java.util.ArrayList and java.util.LinkedList implement the java.util.List interface,
//*   using LinkedList is very similar to using ArrayList.
//* For easy comparison, the lines with ArrayList are included but commented.

package linkedlist_app;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cindy
 */
public class LinkedListTest2 {

    public static void main(String[] args) {
        //If using ArrayList uncomment the line below.
        //List<Integer> intList = new ArrayList<>();
        
        //declare a reference variable named intList of type List<Integer>,
        //  create an empty linked list of Integer objects,
        //    and make intList reference to this new linked list.
        List<Integer> intList = new LinkedList<>();
             
        //populate the linked list using an int array
        //Use regular for loop
        int[] intArr = {5, 7, 2, 15};
        for (int i = 0; i < intArr.length; i++) {
            intList.add(intArr[i]);  //autoboxing is done. Each int value is wrapped in an Integer object
        }
        System.out.println(intList);    //[5, 7, 2, 15]

        //Process each element in the linked list of Integer objects: intList.
        // Compute and display the sum of all integers in the linked list.
        int sum = 0;
        for (int value : intList) { //for-each loop
            sum += value;
        }
        System.out.println("sum is " + sum); 
    }
}
/*----Program Output:
sum is 29
*/