package recursive_struct_demo;

public class LinkedListRec<E> {

    private Node<E> head;

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    } 

    public int size() {
        return size(this.head);
    }
        
    private int size(Node<E> head) {
        if (head == null) {
            return 0;
        } else {
            return 1 + size(head.next);
        }
    }
    
    @Override
    public String toString() {
        return toString(this.head);
    }    
    
    private String toString(Node<E> head) {
        if (head == null) {
            return "";
        } else {
            return head.data + "\n" + toString(head.next);
        }
    }

    //----//
    
    public void replace(E oldObj, E newObj) {
        replace(this.head, oldObj, newObj);
    }    

    private void replace(Node<E> head, E oldObj, E newObj) {
        if (head != null) {
            if (oldObj.equals(head.data)) {
                head.data = newObj;
            }
            replace(head.next, oldObj, newObj);
        }
    }

    public void add(E data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            add(head, data);
        }
    }    

    private void add(Node<E> head, E data) {
        if (head.next == null) {           
            head.next = new Node<>(data);
        } else {
            add(head.next, data); 
        }
    }

    public boolean remove(E outData) {        
        if (head == null) {  //empty list
            return false;
        } else if (head.data.equals(outData)) {  //first node
            head = head.next;
            return true;
        } else {
            return remove(head.next, head, outData);  //at least 1 node
        }
        
    }
    
    private boolean remove(Node<E> head, Node<E> pred, E outData) {
        if (head == null) { // Base case --  empty list.       
            return false;
        } else if (head.data.equals(outData)) { // 2nd base case.
            pred.next = head.next; // Remove head.
            return true;
        } else {
            return remove(head.next, head, outData);
        }
    }
}