//package 2168_personal_code;

import java.util.Map;
import java.util.Set;

public class CharCounterTest{
    public static void main(String[] args) {
        CharacterCounter testCounter = new CharacterCounter("Java_2168\\2168_personal_code\\dummyFile_1.txt");

        testCounter.countChars();
        System.out.println(testCounter.toString());

        // Once its clear the reading and storing functions of the class are working I will 
        // attempt to find the best means of printing strings of the contents... There is the 
        // 'entrySet()' method for HashMaps, and also the toString() method for HashMaps.. 

        // I should make a very easy to verify file for testing this class too. 

        CharacterCounter tCounter2 = new CharacterCounter("Java_2168\\2168_personal_code\\countThis.txt");

        tCounter2.countChars();
        System.out.println(tCounter2.toString());
        System.out.println(tCounter2.getCharDict().entrySet());
        // ^^ so HashMap.toString() seems to output extactly what HashMap.entrySet() outputs. ... I think the difference may just be one explicitely returns a String, while the other is actually returning a 'set view' ... which may be an actual set? 

        Set<Map.Entry<Character,Integer>> tSet = tCounter2.getCharDict().entrySet();
        // ^^ looks like entrySet() is indeed returning a set. 
        //   Set<Map.Entry<Character,Integer>> tSet = tCounter2.toString();
        //    ^^ this creates a compiler error, thus I was correct in my assumption. 

        System.out.println("returning hashCode val for tSet: " + tSet.hashCode());
        System.out.println("returning toString for tSet: " + tSet.toString());

        //tSet.remove('a'); <- this doesnt work .. not sure what a proper removal looks like here.. I think I need to know the object type of the set. ... How to do this again? 
        System.out.println("returning toString for tSet after removal of object: " + tSet.toString());
        System.out.println("removal failed... I think the types of objects that make up the set aren't chars... ");

        System.out.println("printing set in array form: " + tSet.toArray().toString());
            // can't get the above line to actually print an array... not sure what is up. (casting didn't work)

        System.out.println("Checking object type of tSet: " + tSet.getClass());
        System.out.println("size of tSet: " + tSet.size());

        String tString = "dogsBeGud";
        System.out.println("checking type of tString: " + tString.getClass());
    }
}