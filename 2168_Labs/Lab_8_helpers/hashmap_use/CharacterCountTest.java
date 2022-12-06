//CharacterCountTest.java
//* The client of class CharacterCount.
//* Create an object of CharacterCount,
//* call its buildCharacterCount(...) to compute the character counts,
//* Get the counts and print them.

package Lab_8_helpers.hashmap_use;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Map;

public class CharacterCountTest {

    public static void main(String[] args) {
        //create an object of CharacterCount
        CharacterCount chCount = new CharacterCount();

        try {
            //create a character input stream to read the specifid file character by character
            BufferedReader chInput
                    = new BufferedReader(new FileReader("test_4_char_count.txt"));
            //call its buildCharacterCount(...) to compute the character counts
            chCount.buildCharacterCount(chInput);

            //get the characters and their counts
            Map<Character, Integer> frequencies = chCount.getFrequencies();

            //Solution 1: print all entries in the map in a nice tabular format
            //  use for-each loop to get each entry in the map
            for (Map.Entry<Character, Integer> e : frequencies.entrySet()) {
                //print the character and its count in the current entry in a nice foemat
                System.out.printf("%-10s%5d%n", e.getKey(), e.getValue());
            }
            
            System.out.println("*********************");
            
            //solution 2: print all entries in the map in a nice tabular format
            //  use for-each loop to get each key in the set of keys in the map
            for (char currentChar : frequencies.keySet()) {
                //look up the count (value in the entry) based on currentChar (key)
                int currentCount = frequencies.get(currentChar);
                System.out.printf("%-10s%5d%n", currentChar, currentCount);
            }
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
    }
}
/* ---Program Output----
R             1
             21
a            14
b             1
c             7
d             4
e            13
f             7
g             2
h             4
i             7
,             3
l             1
m             2
-             1
n             6
.             1
o             6
p             2
r            14
s             8
t            10
u             2
v             1
x             1
y             1
*********************
R             1
             21
a            14
b             1
c             7
d             4
e            13
f             7
g             2
h             4
i             7
,             3
l             1
m             2
-             1
n             6
.             1
o             6
p             2
r            14
s             8
t            10
u             2
v             1
x             1
y             1
*/