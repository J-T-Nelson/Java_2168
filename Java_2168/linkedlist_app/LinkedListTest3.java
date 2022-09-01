//LinkedListTest3.java (Code not in textbook.)
//* Demo: use Linked list of objects of Computer class and its subclasses.
//* Create and populate a Linked list of Computer objects,
//*   display each item in the linked list, 
//*   display the location of a specific Computer object in the linked list
//* Since both java.util.ArrayList and java.util.LinkedList implement the java.util.List interface,
//*    using LinkedList is very similar to ArrayList.
//* For easy comparison, the lines with ArrayList are included but commented.


package linkedlist_app;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cindy
 */
public class LinkedListTest3 {

    public static void main(String[] args) {
        //if using ArrayList, uncomment the line below.
        //List<Computer> lab2 = new ArrayList<>();
        
        System.out.println("-----Linked List-----------");        
        
        //Declare a variable named lab2 of type List<Computer>.
        //Create a new empty LinkedList of Computer objects (or objects of its subclasses),
        //  make lab2 reference this new linked list.
        List<Computer> lab2 = new LinkedList<>();
       
        //the remaining code is the same as if lab2 is ArrayList<Computer>
        //appending new computers or notebooks to the end of the linked list.
        lab2.add(new Computer("dell", 3, 16));
        lab2.add(new Notebook("Toshiba", 4, 24, 17, 3.5));
        lab2.add(new Computer("dell", 3.2, 8));
        
        //dump data contents in the linked list lab2
        //use for-each loop to go through each element in the linked list lab2
        for (Computer c : lab2) {
            System.out.println(c);
        }
        
        Computer someComputer = new Computer("Dell", 5, 24);
        //add someComputer to be the third computer in the list, the old 3rd computer is the new 4th computer
        lab2.add(2, someComputer);
        
        //get and print the data about the third computer
        System.out.println("3rd computer: " + lab2.get(2)); 
        
        Notebook laptop1 = new Notebook("Lenovo", 4, 16, 13, 2.5);
        //replace the fourth computer
        lab2.set(3, laptop1);

        //get and print the location (index) of someComputer
        System.out.println(lab2.indexOf(someComputer)); 
        
        //check if laptop1 is in linked list lab2
        System.out.println(lab2.contains(laptop1));
    }
}

/*-------Program Output
-----Linked List-----------
Brand: dell, cpuSpeed: 3.0, ramSize: 16.0
Brand: Toshiba, cpuSpeed: 4.0, ramSize: 24.0, Screen size: 17.0, weight: 3.5
Brand: dell, cpuSpeed: 3.2, ramSize: 8.0

3rd computer: Brand: Dell, cpuSpeed: 5.0, ramSize: 24.0
2
true
*/