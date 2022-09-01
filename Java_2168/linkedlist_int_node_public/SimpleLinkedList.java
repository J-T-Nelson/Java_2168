package linkedlist_int_node_public;

/**
 * The class SimpleLinkedList is the simplest linked list structure.
 * An object of this class is a singly linked list of integers (int values).
 * It uses the public class Node.
 * Code not in textbook.
 * 
 * @author cindy
 */
public class SimpleLinkedList {

    private Node head;  //the reference to the first Node in this linked list
    private int size;   //the number of items in the linked list

    //create an empty linked list
    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    //append newItem to this linked list
    public boolean add(int newItem) {
        Node temp = new Node(newItem);
        if (head == null) { //empty list
            head = temp;
        } else { //non-empty list
            //locate the last node
            Node current = head;                    //start with the first Node
            //while (current != null) {             //this line will generate a run time error: NullPointerException
            while (current.getNext() != null) {     //check if current Node is the last Node in this linked list
                current = current.getNext();        //move on to the next Node in this linked list
            }
            current.setNext(temp);                  //add new Node immediately following the current Node
        }
        size++;
        return true;
    }

    //return a string containing all integers in this linked list in their original sequence
    //override toString() class in class Object.
    @Override
    public String toString() {
        String listInfo = "";

        Node current = head;                //start with the first Node
        while (current != null) {           //check if there is still Node remaining and not processed yet.
            listInfo += current.getData();    //add data in current Node to result string
            listInfo += "-->";
            current = current.getNext();    //move on to the next Node in this linked list
        }
        return listInfo;
    }
}
