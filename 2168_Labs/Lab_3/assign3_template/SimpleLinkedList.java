// CIS2168
// Section: 003
// Assignment 3
//File: SimpleLinkedList.java. 
// Author: Jon Tanner Nelson, Email: tuk58589@temple.edu

package assign3_template;

/**
 * CLASS HEADER: 
    * SimpleLinkedList is a simplifed implementation of the SingleLinkedList Class from base Java. 
    * Only int primitives can be operated on within the list. Ints can be added by index or appended to the end. 
    * Ints can be removed by index or value. 
    * A SimpleLinkedList can be checked for whether it contains a specific int 
    * The size of a SimpleLinkedList can be returned 
 */
public class SimpleLinkedList {

    //Remove the first occurrence of the specified number from this linked list. 
    // If success, return true. Otherwise, return false.
    public boolean removeByValue(int keyValue) {

        if(!this.contains(keyValue)){ // if a match exists, continue, else, return false
            return false;
        }

        if(this.head.data == keyValue){ //when the keyValue is found in the head node, reset the head node to the next node and set the current head.next to null for garbage collection
            Node temp = this.head;
            this.head = head.next;
            temp.next = null;
            size --;
            return true;
        } 
        Node current = this.head.next; // setting current to index 1 Node
        Node previous = this.head; // setting previous to index 0 Node
        while(true){ // keyValue is not in head, so compare each Node's data to keyValue until match is found
            if(current.data == keyValue){
                previous.next = current.next;
                current.next = null;
                size --;
                return true;
            }
            previous = current;
            current = current.next;
        }
    }

    //add int to list at specified index
    public void add(int index, int newValue) {
    
        Node newNode = new Node(newValue);

        if(this.head == null){ // when the list is empty, simply assign new node as head. 
            this.head = newNode;
            size ++;
            return;
        }
        if(index == 0){ //handling index of 0, newNode becomes the head of the LinkedList
            newNode.next = this.head;
            this.head = newNode;
            size ++;
            return;
        }
        if(index < 0){ // handling negative indeces 
            throw new IndexOutOfBoundsException(index + " is negative and thus an invalid entry");
        }

        Node pointer = this.head;

        if(this.size() <= index){ // when the index of insertion is greater than the current index range, add the newNode to the end of the current LinkedList
    
            while(pointer.next != null){ // since there is itterate through the whole list and append new Node to end of list
                pointer = pointer.next;
            }
            pointer.next = newNode; 
            System.out.println("index out of bounds, adding new Node at the end of LinkedList.");
        } else {
            for(int i = 1; i < index; i++){
                // pushing pointer up to the node which will connect to new node
                pointer = pointer.next;
            }
            Node temp = pointer.next;
            pointer.next = newNode;
            newNode.next = temp;
        }
        size ++;
    }

    //Get the integer item at the specified position and return the integer value. 
    //If the index is not valid, throw an exception 
    public int get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node target = this.head;
        for(int i = 0; i < index; i++){ //move target node up until index = i, return data 
            target = target.next;
        }
        return target.data;
    }
        


    //Search SimpleLinkedList for keyValue, return the index if found. Otherwise return -1.
    public int indexOf(int keyValue) {

        int returnValue = -1; // return value is -1 by default
        Node current = this.head;
        for(int i = 0; i < this.size; i++){ // loop through list and compare each value within to keyValue. if a match is found, return index of current which = i
            if(current.data == keyValue){
                returnValue = i;
                break;
            }
            current = current.next;
        }
        return returnValue;
    }

    //Verify if keyValue is within the list or not
    // Returns true if yes, false otherwise.
    public boolean contains(int keyValue) {

        if(this.indexOf(keyValue) == -1){ // check if there is a match, if not return false
            return false;
        } else{
            return true;
        }
    }

    //returns the number of ints that are in this linked list
    public int size() {
        int linkedListSize = this.size;
        return linkedListSize;
    }

   // remove Node by index
    public void removeByIndex(int index) {

        if(index < 0 | index >= size){ // handling negative indeces 
            throw new IndexOutOfBoundsException(index + " is either negative or larger than the index range and thus an invalid entry");
        }

        if(index == 0){ //when the index is = 0, reset the head node to the next node and set the current head.next to null for garbage collection
            Node temp = this.head;
            this.head = head.next;
            temp.next = null;
            size --;
            return;
        }

        Node current = this.head.next; // index must be >0, move current to index to be removed, set previous.next to current.next to retain all elements that arent at index
        Node previous = this.head;
        for(int i = 1; i != index; i++){ //
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        current.next = null;
        size --;
        return;
    }

    //-------End of Assign 3 --------/ 
    
    //Following code were covered in Lec#6. 
    //Don't change them.
    //Nested class Node, enclosing class: SimpleLinkedList
    private static class Node {

        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            next = null;
        }
        
        //constructor used to create a Node that has a following neighbor
        private Node(int dataNew, Node nextNew) {
            data = dataNew;
            next = nextNew;
        }

        @Override
        public String toString() {
            return data + "";  //"10"
        }        
    }

    //the reference to the first Node in this linked list.
    private Node head;
    //the size of this linked list
    private int size;

    //create an empty linked list
    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    //append newItem
    public boolean add(int newItem) {
        Node temp = new Node(newItem);
        if (head == null) { //empty list
            head = temp;
        } else { //non-empty list
            //locate last node
            Node current = head;    //start with the first node
            while (current.next != null) {  //check if current node is not the last node
                current = current.next;     //move on to the next node on the list
            }
            current.next = temp;    //append the new node immediately following the current node
        }
        size++;
        return true;
    }

    //return a string that contains all integers (in the original sequence) in the linked list.
    @Override
    public String toString() {
        String result = "";     //result string
        Node current = head;        //start with first Node
        while (current != null) {   //check if there is still nodes remaining
            result += current.data; //add the integer in current Node to the result string
            result += "-->";
            current = current.next; //move on to the next Node
        }
        return result;
    }
}
