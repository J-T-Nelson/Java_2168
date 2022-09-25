package linkedlist_practice_wk3_soln;

public class SingleLinkedList<E> {

    public static void main(String[] args) {
        
    //-------Week 3 Linked List Practice BEGIN------------//
    
    //Question 1:
    //Convert the code below to equivalent code that directly manipulates Node<E> objcts
//        SingleLinkedList<String> movieList = new SingleLinkedList<>();
//        movieList.add("Avengers");
//        movieList.add("Spider Man");
//        movieList.add("Star Wars");
//        System.out.println(movieList);
//        System.out.println(movieList.get(1));
//        String newMovie = "Spider man 2";
//        movieList.add(2, newMovie);
//        System.out.println(movieList);    
    
    //Question 1 Solution:
    
//        SingleLinkedList<String> movieList = new SingleLinkedList<>();    
        Node<String> firstNodeInMovieList = null;
                
//        movieList.add("Avengers");
        Node<String> avenger = new Node<>("Avengers");
        firstNodeInMovieList = avenger;
        
//        movieList.add("Spider Man");
        Node<String> spider = new Node<>("Spider Man");
        avenger.next = spider;        
        //or firstNodeInMovieList.next = spider;

//        movieList.add("Star Wars");
        Node<String> starW = new Node<>("Star Wars");
        spider.next = starW;
        //or firstNodeInMovieList.next.next = starW;

//        System.out.println(movieList);         
        //traverse nodes
        Node<String> current2 = avenger; 
        //or Node<String> current2 = firstNodeInMovieList;
        while (current2 != null) {
            System.out.println(current2.data);
            current2 = current2.next;
        }
        System.out.println("");

        //Current movie list:
        //   [0]               [1]                  [2]
        //"Avengers"-Node --> "Spider Man"-Node --> "Star Wars"-Node
        //    ^                  ^                        ^
        //    |                  |                        |
        //firstNodeInMovieList   |                        |
        //   avenger            spider                  starW
        //                    avenger.next              avenger.next.next
        //                  firstNodeInMovieList.next   firstNodeInMovieList.next.next
        
//      System.out.println(movieList.get(1));
        System.out.println(avenger.next.data);
        //or System.out.println(firstNodeInMovieList.next.data);        
        System.out.println("");

        //Current movie list:
        //   [0]                   [1]                  [2]
        //"Avengers"-Node --> "Spider Man"-Node --> "Star Wars"-Node
        //    ^                  ^                        ^
        //    |                  |                        |
        //firstNodeInMovieList   |                        |
        //   avenger            spider                  starW
        //                    avenger.next              avenger.next.next
        //                     pred                     pred.next                     
        
//        String newMovie = "Spider Man 2";
//        movieList.add(2, newMovie);
        Node<String> spider2 = new Node<>("Spider Man 2");
        Node<String> pred = avenger.next;
        spider2.next = pred.next;           //"Spider Man 2"-Node -->"Star Wars"-Node
        pred.next = spider2;                //"Spider Man"-Node --> "Spider Man 2"-Node
        
        
        //Current movie list:
        //   [0]                   [1]                  [2]                            [3]
        //"Avengers"-Node --> "Spider Man"-Node -->  "Spider Man 2"-Node  -->   "Star Wars"-Node
        //    ^                  ^                        ^                              ^
        //    |                  |                        |                              |
        //firstNodeInMovieList   |                        |                              |
        //   avenger            spider                  spider2                        starW
        //                    avenger.next              avenger.next.next       avenger.next.next.next  
        //                     pred                     pred.next                       

//        System.out.println(movieList);
        //traverse nodes
        current2 = avenger;
        while (current2 != null) {
            System.out.println(current2.data);
            current2 = current2.next;
        }
        System.out.println("");

        //Current movie list:
        //   [0]                   [1]                  [2]                            [3]
        //"Avengers"-Node --> "Spider Man"-Node -->  "Spider Man 2"-Node  -->   "Star Wars"-Node
        //    ^                  ^                        ^                              ^
        //    |                  |                        |                              |
        //firstNodeInMovieList   |                        |                              |
        //   avenger            spider                  spider2                        starW
        //                    avenger.next              avenger.next.next       avenger.next.next.next  
        //                     pred                     pred.next               pred.next.next 
        
//		movieList.remove(2);
        pred.next = pred.next.next;     //"Spider Man"-Node --> "Star Wars"-Node
        //or avenger.next.next = avenger.next.next.next;


        //Current movie list:
        //   [0]                   [1]                  [2]
        //"Avengers"-Node --> "Spider Man"-Node --> "Star Wars"-Node
        //    ^                  ^                        ^
        //    |                  |                        |
        //firstNodeInMovieList   |                        |
        //   avenger            spider                  starW
        //                    avenger.next              avenger.next.next
        //                     pred                     pred.next
        
//        System.out.println(movieList);    
        current2 = avenger;
        while (current2 != null) {
            System.out.println(current2.data);
            current2 = current2.next;
        }
        System.out.println("");        
        
        //test get2, set2
        SingleLinkedList<String> sweets = new SingleLinkedList<>();
        sweets.add("cake");
        sweets.add("donut");
        sweets.add("cookie");
        System.out.println(sweets.get(1));
        sweets.set(2, "icecream");
        
    }

    //Question 3:
    //rewrite get, set method so they don't call any other method.
    //      public E get(int index) 
    //      public E set(int index, E item)
    //then test them in main()

    //Solution: 
    public E get2(int index) {
        //check if index is invalid   
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        //locate the target node at [index]
        Node<E> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        //current references the node at [index]   
        //return the data in target node
        return current.data;
    }
       
    public E set2(int index, E item) {
        //check if index is invalid
        if (index < 0 || index >= size ) {
            throw new IndexOutOfBoundsException(index);
        }
        
        //locate the target node at [index]
        Node<E> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }        
        //current references the target node at [index]
        E oldItem = current.data;   //save old item
        current.data = item;        //update data at target node
        return oldItem;     
    }     
    
    //-------Week 3 Linked List Practice END------------//    
    
    
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> targetNode = getNode(index);
        return targetNode.data;
    }

    public E set(int index, E item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> targetNode = getNode(index);
        E result = targetNode.data;
        targetNode.data = item;
        return result;
    }


    private static class Node<E> {

        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
            next = null;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }

    }    
    
    
    private Node<E> head;
    private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    //[10, 20, 30]
    @Override
    public String toString() {
        StringBuilder listInfo = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            listInfo.append(current.data + ", ");
            current = current.next;
        }
        listInfo.append("]");
        return listInfo.toString();
    }

    public boolean add(E newItem) {
        Node<E> temp = new Node<>(newItem);

        if (head == null) {
            head = temp;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }

        size++;
        return true;
    }

    private void addAfter(Node<E> node, E data) {
        node.next = new Node<>(data, node.next); // surprised to not see node.next = temp or something like that ... I suppose Java allows this kind of assignment.. (order of resolving the input matters here)
        size++;
    }

    private Node<E> getNode(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> predecessorNode = getNode(index - 1);
            addAfter(predecessorNode, item);
        }
    }

}
