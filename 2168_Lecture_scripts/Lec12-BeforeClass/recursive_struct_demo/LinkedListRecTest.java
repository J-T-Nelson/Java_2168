package recursive_struct_demo;

/**
 *
 * @author cindy
 */
public class LinkedListRecTest {

    public static void main(String[] args) {
        LinkedListRec<Integer> numbers = new LinkedListRec<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println(numbers);   
        
        int size = numbers.size();  
        System.out.println(size); 
    }
}
