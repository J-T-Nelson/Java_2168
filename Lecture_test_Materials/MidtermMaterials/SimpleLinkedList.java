package midtermprep_demo;

public class SimpleLinkedList {


    //member method
      public int getMax() {
        return 0;
    }  
    

    //do not need to change the rest
    private Node head;
    private int size;

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean add(int newItem) {
        Node temp = new Node(newItem);

        if (head == null) {
            head = temp;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }

        size++;
        return true;
    }

    @Override
    public String toString() {
        String listInfo = "";
        Node current = head;
        while (current != null) {
            listInfo += current.data + "-->";
            current = current.next;
        }
        return listInfo;
    }    
    
    
    
    private class Node {

        private int data;
        private Node next;

        private Node() {
            data = 0;
            next = null;
        }

        private Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
