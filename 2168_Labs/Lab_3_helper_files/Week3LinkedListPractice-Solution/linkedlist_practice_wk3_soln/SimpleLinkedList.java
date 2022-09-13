package linkedlist_practice_wk3_soln;

public class SimpleLinkedList { 

    private static class Node { 
         private int data;
         private Node next;
         
         private Node(int data){
             this.data = data;
             next = null;
         }
     }

    //-------Week 3 Linked List Practice BEGIN------------//
    //Question 2:
    //rewrite the generic method addAfter for SimpleLinkedList class
            //precondition: node is not null
        //    private void addAfter(Node<E> node, E data) {
        //        node.next = new Node<>(data, node.next);
        //        size++;
        //    }
    //and test it in main()
    
    //Example:
    //Before:
    //   node-->20-->30-->100
    //   data: 60
    //After:
    //   node-->20-->60-->30-->100
    
    //Solution:
    //precondition: node is not null
    private void addAfter(Node node, int data) {
        Node newNode = new Node(data);     
        newNode.next = node.next; //60-->30-->100
        node.next = newNode;      //node-->20-->60->30-->100
        
        size++;
    }    
    
    //can directly call and test method addAfter from another instance method
    public void testAddAfter(){
        //add 60 after the first item in this list
        addAfter(head, 60);
    }
    
    public static void main(String[] args) {
        //create a few standalone Node objects
        Node first = new Node(20);
        
        //create an empty SimpleLinkedList named myList
        SimpleLinkedList myList = new SimpleLinkedList();
        //make the node containing 20 as the first node in myList
        myList.head = first;
        myList.size = 1;
        System.out.println(myList);        
        
        //must use a SimpleLinkedList object to call the instance method addAfter(...) 
        //    from static method main(..)
        //add 60 after the node containing 20 in myList.
        //Note - both variable first and head data field in myList reference the same Node object.
        //     - so the two lines below are equivalent
        myList.addAfter(first, 60);
        //or use the following line
        myList.addAfter(myList.head, 60);        
        System.out.println(myList);        
        
        //can also use myList to call the public instance method testAddAfter() from 
        //   static method main(..)
        myList.testAddAfter();        
        System.out.println(myList);
        
    }    
    
    //-------Week 3 Linked List Practice END------------//
    
    //add(int)
    public boolean add(int newItem) {
        Node newNode = new Node(newItem);
        //empty list
        if (head == null) {
            head = newNode;           
        } else {
            //non-empty list
            //locate last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; 

        }

        size++;
        return true;
    }

    //toString()
    @Override
    public String toString() {
        String listInfo = "";
        //traverse nodes
        Node current = head;
        while (current != null) {
            listInfo += current.data + "-->";
            current = current.next;
        }

        return listInfo;
    }

    private Node head;
    private int size;

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }     
}

