
package Lab_5;

import java.util.Dictionary;
import java.util.Hashtable;

public class TestDictionary {
    public static void main(String[] args) {

        Dictionary<String, Double> coins = new Hashtable<>();
        coins.put("DOLLAR", 1.00);
        coins.put("HALF_DOLLAR", 0.50);
        coins.put("QUARTER", 0.25);
        coins.put("DIME", 0.10);
        coins.put("NICKLE", 0.05);
        coins.put("PENNY", 0.01);

        System.out.println("testing dictionary (Hashtable) behavior.. testing get()\n" + coins.get("DOLLAR"));

        Integer[] testArray = {1, 2, 3};

        System.out.println("testing integer array, getting value at index 1, 0 , 2: \n"+ testArray[1] + " \n" +testArray[0] + " \n" +testArray[2]);
    }
}
