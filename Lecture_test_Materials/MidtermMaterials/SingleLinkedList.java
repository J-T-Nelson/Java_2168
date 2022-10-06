package midtermprep_demo;

public class SingleLinkedList<E> {

    //non-member method
    public E getMax(){       
        
        return null;
    }      
    
    
    //do not need to change the rest
    private Node<E> head;
    private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(E newItem) {
        head = new Node<E>(newItem, head);
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        node.next = new Node<E>(item, node.next);
        size++;
    }

    private E removeFirst() {
        if (head != null) {
            Node<E> temp = head;
            head = head.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = node.next.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private Node<E> getNode(int index) {
        Node<E> current = head; 
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }

        Node<E> targetNode = getNode(index);
        return targetNode.data;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }

        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> nodeBeforeTarget = getNode(index - 1);
            addAfter(nodeBeforeTarget, item);
        }
    }

    public boolean add(E item) {
        add(size, item);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder listInfo = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            listInfo.append(current.data.toString());
            current = current.next;
        }
        listInfo.append("]");
        return listInfo.toString();
    }

    private static class Node<E> { //static nested class

        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
            next = null;
        }

        private Node(E data, Node<E> successorRef) {
            this.data = data;
            next = successorRef;
        }
    }

    public static void main(String[] args) {
        Node<String> tom = new Node<String>("Tom");
        Node<String> dick = new Node<String>("Dick");
        Node<String> harry = new Node<String>("Harry");
        Node<String> sam = new Node<String>("Sam");

        tom.next = dick;
        dick.next = harry;
        harry.next = sam;

        Node<String> bill = new Node<String>("Bill", tom);

        Node<String> sue = new Node<String>("Sue", sam);
        //harry.next = sue;
        //dick.next.next = sue;
        tom.next.next.next = sue;

        //tom.next = harry;
        tom.next = tom.next.next;
    }
}
