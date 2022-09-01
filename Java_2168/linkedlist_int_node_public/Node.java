package linkedlist_int_node_public;

/**
 * public Node class for storing int values in a single linked list.
 * Node class (code not in textbook)
 * 
 * @author cindy
 */
 public class Node {
    private int data;   //store int values in each Node object
    private Node next;  //reference the next Node object in a single linked list
    
    //no-argument constructor
    public Node(){
       data = 0;
       next = null;
   }
       
    //constructor for creating a new standalone Node object
    //   that stores the given int value and does not have an immediate following neighbor. 
    public Node(int data) {
        this.data = data;
        next = null;        //no neighbor after the new Node object
    }
    
    //getter, setter for each data field
    public int getData(){
        return data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
 
}
