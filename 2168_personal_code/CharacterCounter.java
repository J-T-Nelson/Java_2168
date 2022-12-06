import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

    private Map<Character, Integer> charDict;
    private String filePath;

    public CharacterCounter(){
        this.charDict = new HashMap<>();
        this.filePath = "";
    }
    public CharacterCounter(String filePath){
        this.charDict = new HashMap<>();
        this.filePath = filePath;
    }

    
    public void countChars() {

        Scanner scanFile = null;
        try {
          scanFile = new Scanner(new FileReader(new File(this.filePath)));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file");
            //print the error stack content
            e.printStackTrace();
            //terminate the program with error code 1
            System.exit(1);
        }

        String s = "";
        // putting all lines into a single string
        while(scanFile.hasNextLine()){
            s += scanFile.nextLine();
        }

        char[] fileChars = new char[s.length()+1]; // not sure if I need +1 .. remove it once things work to see if its essential. I believe its unnecessary 
        
        s.getChars(0, s.length(), fileChars, 0);

        // go through every char in the char[], add them to the HashMap (charDict) and add 1 each time a char comes up to the value of the key:value pairs in the dict. 
        for(char c : fileChars){
            if(this.charDict.containsKey(c)){
                int update = this.charDict.get(c) + 1;
                this.charDict.put(c, update);
            } else {
                this.charDict.put(c, 1);
            }
        }
    }

    @Override
    public String toString() {
        return this.charDict.toString(); //Not sure if this will work well.. 
    }

    // getters setters then main()
    public Map<Character, Integer> getCharDict() {
        return charDict;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public void setCharDict(Map<Character, Integer> charDict) {
        this.charDict = charDict;
    }


    public static void main(String[] args) {
        
    }
}

/* PSEUDOCODE STRATEGY: 
 * 
 *  INSTRUCTIONS: 
 *   - Read and compute the frequency of characters in a text document
 *   - Store in a HashMap or TreeMap 
 *   - This program could extend into behaving like a Huffman tree
 * 
 *  STRATEGY / PLANNING: 
 * Have to enter a file which is then scanned by a scanner character by character. It should scan until there is no more text available. 
 * Each character that isnt whitespace will be added to dictionary type object that has the key be the characer itself and the value will be updated each time the key comes up. 
 * 
 * So each new character, add a new key and add value 1. 
 * Each time a key which already exists comes up increment the value of that key. 
 * 
 * At the end of tallying a file report the key value pair back using a map printing method. 
 */