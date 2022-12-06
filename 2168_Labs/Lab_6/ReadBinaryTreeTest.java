// CIS2168
// Section: 003
// Assignment 6
// File: ReadBinaryTreeTest.java
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

/** ReadBinaryTreeTest.java
 * Lab8Assign5 Template
 * To be modified by you
 *
 * Read a text file that contains the preorder traversal sequence of the data items in a binary tree
 *    The preorder traversal sequence also shows the structure of the tree.
 * Construct the binary tree accordingly.
 * Display the preorder traversal sequence of the data items in the constructed binary tree,
 *     which is the same as what is in the text file when the tree is constructed correctly.
 */
package Lab_6;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Your name
 */
public class ReadBinaryTreeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creating empty binarty tree, then populating it using 'readBinaryTree(Scanner)' method
        BinaryTree<String> binaryTree1 = new BinaryTree<>();

        try {
            Scanner input = new Scanner(new File("C:\\Users\\mrtne\\Documents\\GitHub\\Java_2168\\2168_Labs\\Lab_6/WordBT_Data.txt")); 
            // NOTE TO SELF: alright so my working directory is naturally set to the parent folder being browsed in VS code ... also can just 'pwd' in terminal to see
            binaryTree1 = BinaryTree.readBinaryTree(input);
            input.close();
            System.out.println(binaryTree1.toString());

            // TEST CODE BELOW: -------------------------------------------------------------------
            System.out.println("preOrder traversal: " + binaryTree1.preOrderTraverse());
            System.out.println("inOrder traversal: " + binaryTree1.inOrderTraverse());
            System.out.println("postOrder traversal: " + binaryTree1.postOrderTraverse());
            System.out.println("size() test, should be 5 : " + binaryTree1.size());
            System.out.println("height() test, should be 3 : " + binaryTree1.height());
          
        } catch (FileNotFoundException e) { //handle the case when Fig_6_12.txt is not found.
            e.printStackTrace();    //Print the error stack: this exception, and its backtrace for the cause of this exception.
            System.exit(1);         //terminate this program with the status code 1, indicating abnormal termination.
        }
    }
}


/*----Your output for the BT read from WordBT_Data.txt:
house
  dog
    cat
      null
      null
    null
  kiss
    null
    man
      null
      null

Preorder traversal:   house  dog  cat  kiss  man
Inorder traversal:   cat  dog  house  kiss  man
postorder traversal:   cat  dog  man  kiss  house
size: 5
height: 3

*/