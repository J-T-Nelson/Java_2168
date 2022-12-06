//This class tests the implementation of SummaryGenerator class.
//It creates a BufferedReader to read from the data file purchases.csv,
//  creates an object of SummaryGenerator,
//  uses this object to call createCountsByCountry method and pass 
//     the BufferedReader object br to this method,
//  uses this object to call showCountsByCountry method, which displays the summary.


package Lab_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SummaryGeneratorTest {

    public static void main(String[] args) {
        try {
            //create a BufferedReader to read from file purchases.csv
            BufferedReader br = new BufferedReader(new FileReader("Java_2168\\2168_Labs\\Lab_8\\purchases.csv"));
          
            //----Assign 7 Begin ------------//
            SummaryGenerator sg1 = new SummaryGenerator();         
            
            sg1.createCountsByCountry(br);
            System.out.println("Using showCountssByCountry() for sg1: ");
            sg1.showCountsByCountry();

        } catch (IOException ioe) {
            System.out.println("file input error.");
            ioe.printStackTrace();
            System.exit(1);
        }
    }

}

