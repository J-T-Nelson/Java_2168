// CIS2168
// Section: 003
// Assignment 8
// File: SummaryGenerator.java
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

//This class generates the data summary based on the data in the file purchases.csv
// and show such summaries. 
//Currently it only counts how many times each country appears. 

package Lab_8;


import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

public class SummaryGenerator {

    //the delimiter comma in the data file: purchases.csv
    private final String COMMA_DELIMITER = ",";
    
    //----Assign 7 BEGIN ------------//    
    //add your code:  define a data field named countsByCountryMap, which must be a Map data structure.
    // (country-name, count)
        //Hint on Map
        //* It’s very similar to frequencies in the class CharacterCount in the package hashmap_use posted for Lec#21.

    private Map<String, Integer> countsByCountryMap;

    //add your code: define a no-argument constructor, 
    //  where you create a new HashMap or TreeMap for the data summary. 
    //  You must add the code for creating each type of Map.
    //  Then you comment the code for one type, use the other type at a time.
    public SummaryGenerator() {
        this.countsByCountryMap = new HashMap<String, Integer>(); // she keeps mentioning both HashMap and TreeMap... no fucking idea why. Engrish hard.  
        //this.countsByCountryMap = new TreeMap<String, Integer>();
    }      

    
    //takes in a BufferedReader object that is already associated with
    //   the file purchases.csv, reads the data line by line,
    //   creates the country summary and saves the summary entries in the summary map.
    public void createCountsByCountry(BufferedReader br) {      
        //build country summary
        List<String> purchases = new ArrayList<>();
        try {
            String line;
            //read the first line (column heading), and do not do anything with it.
            br.readLine();
            //read line by line until file reading is completed            
            while ((line = br.readLine()) != null) {
                //split values in each line using the delimiter comma,
                //  store values as String in a String array.
                String[] fields = line.split(COMMA_DELIMITER);
                //convert the array to an ArrayList
                purchases = Arrays.asList(fields);
                //System.out.println(purchase);

                // getting country from ArrayList as a variable to simply following code and improve efficiency
                String country = purchases.get(purchases.size()-1);

                    // checking if the key is already contained within the map. If so, increment and continue the while loop, else add it to the map with starting value 1.
                if(countsByCountryMap.containsKey(country)){
                    int incrementCount = countsByCountryMap.get(country) + 1;
                    countsByCountryMap.put(country, incrementCount);
                    continue;
                }

                countsByCountryMap.put(country, 1);          
            }
        } catch (IOException ioe) { 
            System.out.println("file input error.");
            ioe.printStackTrace();
            System.exit(1);
        } catch (PatternSyntaxException pse) {
            System.out.println("pattern specification error.");            
            pse.printStackTrace();
            System.exit(1);            
        }
    }
    
    //---- Assign 7 Continues ------------//
    
    //print the content of the data summary map in the format given in the sample output
    public void showCountsByCountry(){

        System.out.println("Country                      Count");
        System.out.println("-----------------------------------------------------");
        String stars = "";
        // iterating over the HashMaps entrySet and priting keys and values. 
        for(Map.Entry<String, Integer> countries : countsByCountryMap.entrySet()){
            stars = printNChars('*', countries.getValue());
            System.out.printf("%-15s              %-15s", countries.getKey(), stars);

            // System.out.print(countries.getKey() + "                       ");
            // printNChars('*', countries.getValue());
            System.out.println(); // creating a new line.. 
        }        
        //use a foreach loop
        //   do the following in each loop run
        //      get the curernt data summary entry: country, count
        //      print the country
        //      call printNChars to print the count as a sequence of stars.
        //           count of 5 means 5 stars.
        
        //Hints:
	//* Display data summary entry information in the format similar to the sample output
	//* You can use System.out.printf(…) method.
	//* See the class CharacterCountTest in the package hashmap_use posted for Lec#21.
        
    }
    
    //prints a specified character n times. 
    private String printNChars(char ch, int n) {
        String s = "";
        for(int i = 1; i < n; i++){
            s += ch; 
        }
        return s;
    }
}