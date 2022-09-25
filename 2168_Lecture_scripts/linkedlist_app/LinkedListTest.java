//LinkedListTest.java (Code not in textbook.)
//* Demo basic usage of different methods in class java.util.LinkedList.
//* Demo use of linked list of Integer objects and linked list of String objects
//* Compare the use of ArrayList and LinkedList classes.
//* Since both java.util.ArrayList and java.util.LinkedList implement the java.util.List interface,
//*   the use of LinkedList is very similar to ArrayList.

package linkedlist_app;

//import java.util.ArrayList;

//import the definition of LinkedList in Java API
import java.util.LinkedList;
//import the definition of List interface in Java API
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        //The line below was included for comparison ArrayList vs LinkedList
        //ArrayList<Integer> myList = new ArrayList<>();

        System.out.println("------Linked List of Integer objects----");
        //declare a reference variable named myList of type List<Integer>,
        //  create an empty linked list of Integer objects, and have myList refer to it.
        List<Integer> myList = new LinkedList<>();

        //populate the linked list of Integer objects:
        //  append an Integer object for 10 to the linked list of Integer objects: myList
        //myList.add(new Integer(10));
        myList.add(5); //5 is automatically wrapped in an Integer object
        myList.add(20);
        myList.add(10);
        myList.add(100);

        //dump the integers in the linked list: myList
        System.out.println("integers in the linked list myList: ");
        //equivalent to: System.out.println(myList.toString()),
        //   call toString() method in LinkedList and display the result
        System.out.println(myList);

        //get the 2nd integer in myList and print it
        System.out.println("The integer at index [1] in the linked list myList: ");
        System.out.println(myList.get(1));

        //find the location of 20 and display it
        System.out.println("The index of integer 20 in the linked list myList: ");
        System.out.println(myList.indexOf(20));
        //find the location of non-existing value 1000 and display it
        System.out.println("The index of integer 1000 in the linked list myList: ");
        System.out.println(myList.indexOf(1000));

        //remove the 2nd integer in the linked list myList
        myList.remove(1);
        System.out.println("After removing the 2nd integer in the linked list myList: ");
        System.out.println(myList);

        //The line below was included for comparison ArrayList vs LinkedList        
        //ArrayList<String> courses = new ArrayList<>();
        
        System.out.println("\n------Linked List of String objects----");        
        //create an empty Linked list of String objects and have courses refer to it.
        List<String> courses = new LinkedList<>();
        //append 3 String objects to the linked list of String objects
        courses.add("cis2168");
        courses.add("cis1068");
        courses.add("cis3309");
        //dump the contents in the linked list: courses
        System.out.println("All Strings in the linked list courses: ");
        System.out.println(courses);

        //remove the 3rd course in the linked list
        courses.remove(2);          //remove by location
        //dump the new contents in the linked list: courses
        System.out.println("After removing the 3rd String, all remaining Strings in the linked list courses: ");
        System.out.println(courses);

        //remove the course: cis1068
        courses.remove("cis1068");     //remove by content
        //dump  the new contents in the linked list: courses
        System.out.println("After removing the string cis1068, all remaining Strings in the linked list courses: ");
        System.out.println(courses);
    }

}

/*----Program Output
------Linked List of Integer objects----
integers in the linked list myList:
[10, 5, 20, 10, 100]
The integer at index [1] in the linked list myList:
5
The index of integer 20 in the linked list myList:
2
The index of integer 1000 in the linked list myList:
-1
After removing the 2nd integer in the linked list myList:
[10, 20, 10, 100]

------Linked List of String objects----
All Strings in the linked list courses:
[cis2168, cis1068, cis3309]
After removing the 3rd String, all remaining Strings in the linked list courses:
[cis2168, cis1068]
After removing the string cis1068, all remaining Strings in the linked list courses:
[cis2168]

*/
