//CharacerCount.java
//* Read and compute the frequency of characters in a text document
//* Store them in a HashMap
//* This program is the starting point for building the Huffman tree


package Lab_8_helpers.hashmap_use;

import java.io.BufferedReader;
import java.io.IOException;

import java.util.Map;
import java.util.HashMap;

public class CharacterCount {
    //the HashMap for the character counts. It's initially empty
    private Map<Character, Integer> frequencies =
           new HashMap<Character, Integer>();  // HashMap of character frequencies.
    
    /*<listing chapter="7" number="12">*/
    public void buildCharacterCount(BufferedReader chInput) {
        try {
            int nextChar;   // For storing the next character as an int
            //read() returns the code of the next character that is read from the file
            while ((nextChar = chInput.read()) != -1) {  // Test for more data
                Character next = (char) nextChar;
                // Get the current count
                Integer count = frequencies.get(next);
                if (count == null) {
                    count = 1;   // First occurrence.
                } else {
                    count++;    //not the first occurrence
                }

                // Store updated count.
                frequencies.put(next, count);
            }
            chInput.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /*</listing>*/ 
    
    //accessor for the data field frequencies
    public Map<Character, Integer> getFrequencies() {
        return frequencies;
    }
}
