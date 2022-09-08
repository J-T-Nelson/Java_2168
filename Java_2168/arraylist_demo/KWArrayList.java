package arraylist_demo;

import java.util.Arrays;

public class KWArrayList<E> {
    private static final int  INITIAL_CAPACITY = 10;
    
    private E[] theData;   
    private int size;   
    private int capacity; 
    
    public KWArrayList(){
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }
   
    //book exercise    
    public KWArrayList(int capacity){
        //add your own code.
    } 
    
    public boolean add(E anEntry){
        if (size == capacity) {
            reallocate();
        }
            
        theData[size] = anEntry;
        size++;
        return true;
    }
    
    private void reallocate(){
        capacity = 2 * capacity;
        theData =  Arrays.copyOf(theData, capacity);
    }
    
    public void add(int index, E anEntry){
        if (index < 0 || index > size) { 
            throw new ArrayIndexOutOfBoundsException(index);
        }
        
        if (size == capacity) {
            reallocate();
        }
        
        //shift elements to make room
        for (int i = size - 1; i >= index; i--){
            theData[i+1] = theData[i];
        }
        
        theData[index] = anEntry;
        size++;
    }   

    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E valueDeleted = theData[index];       
        
        //shift elements to fill the hole
        for (int i = index + 1; i < size; i++) {
            theData[i-1] = theData[i];
        }
        size--;
        return valueDeleted;
       
    }    
    
    public int size(){
        return size;
    }    
    
    public E get(int index){
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theData[index];
    }
    
    public E set(int index, E newValue){
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }        
        
        E oldValue = theData[index];
        theData[index] = newValue;
        return oldValue;
    }
  
    
    //book exercise
    public int indexOf(Object o){
        //add your own code.
        return 0;
    }    
   
}
