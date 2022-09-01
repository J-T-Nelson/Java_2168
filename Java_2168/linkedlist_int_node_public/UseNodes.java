package linkedlist_int_node_public;

/**
 * Demo how to use public Node class.
 * Use the public Node class to do the following:
 *    create standalone Node objects,
 *    connect Node objects to form a single linked list,
 *    do something with nodes in the single linked list,
 *    add new Node to first/last location, 
 *    remove the first or last Node,
 *    traverse the entire single linked list
 * Code not in textbook.
 * @author cindy
 */
public class UseNodes {

    public static void main(String[] args) {
        //create 3 new standalone Node objects without any following neighbors
        Node first = new Node(20);
        Node second = new Node(60);
        Node third = new Node(100);

        //connect nodes to form a single linked list
        first.setNext(second);
        second.setNext(third);
        
        //mark the third node as the last node
        Node last = third;        

        //add new Node to first location
        Node newFirst = new Node(30);
        newFirst.setNext(first);
        first = newFirst;

        //add new Node to last location (append)
        Node newLast = new Node(40);
        //third.setNext(newLast);
        last.setNext(newLast);
        last = newLast;

        //remove first Node
        first = first.getNext();

        //remove the last Node
        third.setNext(null);
        last = third;

        //traverse the entire single linked list
        Node current = first;
        while (current != null) {
            System.out.println(current.getData());
            //move on to the next node
            current = current.getNext();
        }
    }
}
