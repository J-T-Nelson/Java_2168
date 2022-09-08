package arraylist_demo;

import java.util.ArrayList;

public class PhoneDirectory {
    private ArrayList<DirectoryEntry> theDirectory = new ArrayList<>();
    
    public boolean addEntry(String name, String newNumber) {
        
        for (DirectoryEntry de : theDirectory) {
            if (de.getName().equals(name)) {
                return false;
            }
        }
        theDirectory.add(new DirectoryEntry(name, newNumber));
        
        return true;
    }
    
    //public boolean indexOf()
    
    
    //book exercise
    public String addOrChangeEntry(String name, String newNumber) {
        //you add the code        
        return "";
    }
    
    //book exercise
    public DirectoryEntry removeEntry(String aName) {
        //you add the code
        return null;
    }    
}
