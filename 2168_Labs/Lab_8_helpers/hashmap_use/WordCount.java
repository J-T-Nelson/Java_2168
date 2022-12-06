package Lab_8_helpers.hashmap_use;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
// import java.util.Map;
// import java.util.HashMap;

public class WordCount {

    //define the data field named counts
    // the map for storinging the words and their counts
    
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new FileReader("test_4_char_count.txt"));
            buildWordCounts(scan);
            //uncomment the lines below after completing the coding of data field and 
            //   method buildWordCounts(...)
            //for (Map.Entry<String, Integer> e : counts.entrySet()) {
            //    System.out.printf("%-15s%5d%n", e.getKey(), e.getValue());
            //}
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
    }

    /**
     *  Method to read each word in a data file and compute the number
     *  of times it occurs
     *  @post count contains each word in lowercase form and the number
     *  of times it occurs.
     *  @param scan A Scanner object that references the file
     */
    public static void buildWordCounts(Scanner scan) {
            //add your own code here
    }

}
