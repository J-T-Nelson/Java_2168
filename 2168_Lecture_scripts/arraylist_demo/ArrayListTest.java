package arraylist_demo;

import java.util.ArrayList;
// import java.util.List;
// import java.util.LinkedList;

public class ArrayListTest {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        for (int value : numbers) {
            System.out.println(value);
        }

        //numbers[3] = 10;
        numbers = new int[10];

        //create a list of integers
        
        //call basic list methods
        
        //capacity control in ArrayList

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(5);
        intList.add(53);
        intList.add(55);
        intList.add(57);
        intList.add(575);

        System.out.println(intList.toString()); //SUCCESS
        
        intList.add(2, 1000);
        System.out.println(intList.toString()); //adding to specific indexes works!
        intList.remove(0);
        System.out.println(intList.toString()); 
        intList.set(2, 51428581);
        System.out.println(intList.toString()); 

        System.out.println("this is th thang at index 2 in my int List: "+intList.get(2));

        System.out.println("this is the index of 1000 in my list thang... " + intList.indexOf(1000));
        
        intList.add(1000);
        intList.add(1000);
        intList.add(1000);
        System.out.println("this is the index of 1000 in my list thang after adding more values to it " + intList.indexOf(1000)+ "this is the whole jawn" +intList.toString());

        
    }
}
