package DiscussionAssignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueVisitors {

    private Set<String> uniqueVisitors; 
    private String filePath;


    public int countUniqueVisitors() throws FileNotFoundException{

        uniqueVisitors = new HashSet<>();
        Scanner scan = new Scanner(new FileReader(new File(this.filePath)));
        String s;

        while(scan.hasNextLine()){
            s = scan.nextLine();
            uniqueVisitors.add(s);
        }

        uniqueVisitors.remove("");
       
        return uniqueVisitors.size();
    }

    public UniqueVisitors(){
        this.uniqueVisitors = new HashSet<>();
        this.filePath = "";
    }
    public UniqueVisitors(String filePath){
        this.uniqueVisitors = new HashSet<>();
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return this.uniqueVisitors.toString();
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public Set<String> getUniqueVisitors() {
        return uniqueVisitors;
    }
    public void setUniqueVisitors(Set<String> uniqueVisitors) {
        this.uniqueVisitors = uniqueVisitors;
    }
    
}

/* PSUEDOCODE: 
 * import log file as a file within fileReader within Scanner.
 * Scan in each line of the file and add it to a set. (the act of adding to the set will produce all unique entries.)
 * return or print out the set. 
 * 
 * HashSet offers constant time for add operation ... we can use size() to see how many unique entries exist. 
 */