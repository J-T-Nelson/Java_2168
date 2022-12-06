
package DiscussionAssignments;

import java.io.FileNotFoundException;

public class testUniqueVisitors{
    public static void main(String[] args) throws FileNotFoundException {
        
        UniqueVisitors tester = new UniqueVisitors("Java_2168\\2168_Labs\\DiscussionAssignments\\visitors.log");

        System.out.println("Testing the counting function, we should see 6 unique Strings counted: " + tester.countUniqueVisitors());
        System.out.println("checking the contents of the set: " + tester.toString()); 
        System.out.println("Size of tester: " + tester.getUniqueVisitors().size());

        UniqueVisitors tester2 = new UniqueVisitors();
        System.out.println("Checking for contents of empty UniqueVisitors object, first checking isEmpty(): " + tester2.getUniqueVisitors().isEmpty());
        System.out.println("Checking size: " + tester2.getUniqueVisitors().size());

        //after testing its clear that somehow we are grabbing an empty entry from the file... I suppose I could just hardcode to remove empty string from the set, as its clearly not a usual part of the set. 
        // Great! removing empty string "" worked as desired. Getting the right count now. 
    }
}