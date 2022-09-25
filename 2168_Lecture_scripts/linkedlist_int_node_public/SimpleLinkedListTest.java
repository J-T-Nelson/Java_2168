package linkedlist_int_node_public;

/**
 * Demo how to use SimpleLinkedList class.
 * Use the class SimpleLinkedList to create a single linked list of integers of int type,
 * Then add some integers to the linked list.
 * 
 * @author cindy
 */
public class SimpleLinkedListTest {

    public static void main(String[] args) {
        //create an empty list
        SimpleLinkedList numbers = new SimpleLinkedList();
        
        //append 3 integers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        //dump the contents in the list
        System.out.println(numbers);        
        //below is equivalent to the above line
        //System.out.println(numbers.toString());    
    }
}
