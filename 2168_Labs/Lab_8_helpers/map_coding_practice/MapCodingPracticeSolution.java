
package Lab_8_helpers.map_coding_practice;

import java.util.Map;
import java.util.HashMap;
//import java.util.TreeMap;

/**
 * Coding Practice using Map,HashMap,TreeMap
 * 
 * @author Cindy
 */
public class MapCodingPracticeSolution {

    public static void main(String[] args) {
        //create an empty hashmap using both Map interface and HashMap class
        //use this map as a dictionary.
        Map<String, String> dictionary = new HashMap<>();
        
        //add the following entries into the map
        //     word        definition
        //    Halloween      the eve of All Saints' Day
        //    Thanksgiving   the act of giving thanks
        //    Valentine      a sweetheart chosen or greeted on this day
        dictionary.put("Halloween", "the eve of All Saints' Day");
        dictionary.put("Thanksgiving", "the act of giving thanks");
        dictionary.put("Valentine", "a sweetheart chosen or greeted on this day");
        
        //print the entire dictionary content using toString() method
        System.out.println(dictionary);
        
        //check if the word "Memorial" is in the dictionary
        System.out.println(dictionary.containsKey("Memorial"));
        
        //print the definition of the word Halloween
        System.out.println(dictionary.get("Halloween"));
        
        //update the definition of the word Valentine to:
        //    a sentimental card or message
        dictionary.put("Valentine", "a sentimental card or message");
        
        //print the definition of the word Valentine to verify the change
        System.out.println(dictionary.get("Valentine"));        
        
        //print the entire dictionary content nicely by
        //  iterating over each word in the map.
        for (String word : dictionary.keySet()) {
            String definition = dictionary.get(word);
            System.out.printf("%-15s %15s\n", word, definition);
        }
        
        //print the entire dictionary content nicely by
        //  iterating over each entry in the map.
        // for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        //     String word = entry.getKey();
        //     String definition = entry.getValue();
        // }
        
        //remove the word Valentine from the map.
        dictionary.remove("Valentine");
        System.out.println(dictionary.get("Valentine"));    
        
        //Repeat the above using TreeMap class.
        //Just replace HashMap in the following line by TreeMap:
        //     dictionary = new HashMap<>();
        //   ==>
        //    dictionary = new TreeMap<>();
        //The rest of the code don't need to change.
        
    }
    
}
