// CIS2168
// Section: 003
// Assignment 3
//File: SimpleLinkedListTest.java. 
// Author: Jon Tanner Nelson, Email: tuk58589@temple.edu

package Lab_3.assign3_template;

/**
 * CLASS HEADER:
    * Testing different methods for the SimpleLinkedList.java class (both successful and failed calls)
    * NOTE TO TA OR PROFESSOR: My testing is quite explicit in the printed text, therefore few comments exist. 
    * Cases which throw program halting errors are commented out to start. Feel free to uncomment them to test. 
 */
public class SimpleLinkedListTest {

    public static void main(String[] args) {     
        
        //create an empty list
        SimpleLinkedList sLL1 = new SimpleLinkedList();
        
        //append integers
        sLL1.add(10);
        sLL1.add(20);
        sLL1.add(30);
        sLL1.add(12);
        sLL1.add(205);
        sLL1.add(3066);
        
        //dump the contents in the list in the original order
        System.out.println(sLL1);
 
        System.out.println(sLL1.size()); // testing size accuracy

        System.out.println("index of 30 should be 2" + 
                            "\nresult from call: " + sLL1.indexOf(30));
        System.out.println("index of 3052 should be -1, as the value is not within the list" + 
                            "\nresult from call: " + sLL1.indexOf(3052));

        System.out.println("Does sLL2 contain the number 205? \nAnswer: " + sLL1.contains(205));
        
        System.out.println("Does sLL2 contain the number 42? \nAnswer: " + sLL1.contains(42));

        System.out.println("getting data at index 3, should be 12\n" + "Result: " + sLL1.get(3));
        //System.out.println("getting data at index 7, should throw an exception\n" + "Result: " + sLL1.get(7));
        //^^ COMENTED OUT EXCEPTION LINE FOR TESTING ^^
        
        System.out.println("testing add(),\nList before adding anything: " + sLL1.toString());
        sLL1.add(0, 67);
        System.out.println("list after adding new node with data = 67: " + sLL1.toString());
        
        sLL1.add(4, 677);
        System.out.println("list after adding node with data = 677 to index = 4: " + sLL1.toString());
        sLL1.add(90, 6777);
        System.out.println("list after adding node with data = 6777 to index = 90: " + sLL1.toString());
        //sLL1.add(-1, 67777);
        //System.out.println("list after adding node with data = 67777 to index = -1: " + sLL1.toString());
        //^^ COMENTED OUT EXCEPTION LINE FOR TESTING ^^
        
        System.out.println("testing removal by value, removing 677\nsize before = " + sLL1.size() +"\ntrue if removed, false if not: " + sLL1.removeByValue(677));
        System.out.println("List after removal: " + sLL1.toString() + "\nsize after removal = " + sLL1.size());

        System.out.println("testing removal by value, removing 67 which is the head value\nsize before = " + sLL1.size() +"\ntrue if removed, false if not: " + sLL1.removeByValue(67));
        System.out.println("List after removal: " + sLL1.toString() + "\nsize after removal = " + sLL1.size());

        System.out.println("testing removal by value, removing 51325 which is not in the list\nsize before = " + sLL1.size() +"\ntrue if removed, false if not: " + sLL1.removeByValue(51325));
        System.out.println("List after removal: " + sLL1.toString() + "\nsize after removal = " + sLL1.size());


        System.out.println("Testing removal by index, list before: " + sLL1.toString()+ "\nremoving value at index 2");
        sLL1.removeByIndex(2);
        System.out.println("List after: " + sLL1.toString());

        System.out.println("Testing removal by index failure case, list before: " + sLL1.toString()+ "\nremoving value at index 10");
        sLL1.removeByIndex(10);
        System.out.println("List after: " + sLL1.toString());
    }   
}
