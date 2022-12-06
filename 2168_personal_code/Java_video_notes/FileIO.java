package Java_video_notes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("./Java_2168/2168_personal_code/Java_video_notes/output.txt"));
        // buffered writer can write to many different things... a file is just one of them, which is why we must specify what the BufferedWriter is writing to. 
            // FileWriter within BufferedWriter is specifying that we are writing to a file, and is able to generate a file I think? 
            // I am not sure why we need 2 classes to write to a file still? Why does FileWriter NOT satisfy all filewriting needs? Is there modular use in having multiple classes which play a role in file writing? What is that purpose? What different tools exist? 
            writer.write("Writing some string to a file");
            writer.write("Writing some string to a file. this is the second line. I am really writing this bitch rn. \n doing a new line you bitch");
          
            // ^^ if you don't close a file writer in Java, the file will be created but nothing will be written to it (why?) ... so remember this for when file output doesn't occur as expected. 

            // THE FILE WAS WRITTEN TO 'Java_files_code' folder directly... as I suppose its my working directory when autorunning the code. Moved it to this files folder

            String[] strangs = {"strung","strungs","dung","flung"};

            for(String s : strangs){
                writer.write("\n"+s);
            }

            writer.close();

        /* READING FILES NOW */
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Programming\\Java_files_code\\Java_2168\\2168_personal_code\\dummyFile_1.txt"));
        System.out.println(reader.readLine());
        reader.close();
            // similar nested class structure for the bufferedReader(FileReader) and writers... I still don't get why this nested structure is necessary... the video tutorial is increasing my comfor with just stating and using these incantations though... 


        
    }
}
