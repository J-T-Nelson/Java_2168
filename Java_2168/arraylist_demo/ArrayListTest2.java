package arraylist_demo;

import java.util.ArrayList;

public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        int[] intArr = {5, 7, 2, 15};
        for (int i = 0; i < intArr.length; i++) {
            intList.add(intArr[i]);  
        }
        System.out.println(intList);   
        

        int[] intArr2 = {10, 20, 30, 40};
        //self-practice
        //use for each loop to do what is done by the above regular for loop
                
        int sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum += intList.get(i);
        }
        System.out.println("sum is " + sum);    //sum is 129
        //self-practice
        //use for each loop to do what is done by the above regular for loop
        
    }
}
