// CIS2168
// Section: 003
// Assignment 6
// File: BinaryTree.java
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

package Lab_6;

import java.util.Scanner;

/**
 * Class for a binary tree that stores type E objects.
 *
 * @author Koffman and Wolfgang & Cindy & Your Name
 *
 */
public class BinaryTree<E> {

    public static void main(String[] args) {

        //create 2 leaf nodes
        Node<Character> x = new Node<>('x');
        Node<Character> y = new Node<>('y');
        //create the parent node of x and y:
        Node<Character> plus = new Node<>('+');
        //connect + and x, y:

        // building out the tree as specified. 
        Node<Character> star = new Node<Character>('*');
        Node<Character> forwardSlash = new Node<Character>('/');
        Node<Character> a = new Node<Character>('a');
        Node<Character> b = new Node<Character>('b');
        star.left = plus;
        star.right = forwardSlash;
        forwardSlash.left = a;
        forwardSlash.right = b;
        plus.left = x;
        plus.right = y;

        //create a binary tree named exprBT that is rooted at +
        BinaryTree<Character> exprBT = new BinaryTree<>(plus);
        //or:
        //create an empty binary tree: exprBT
        BinaryTree<Character> exprBT2 = new BinaryTree<>();
        //make + as the root of the BT: exprBT       
        exprBT2.root = plus;
        //call toString() to verify the tree structure
        System.out.println(exprBT);
        System.out.println(exprBT2.toString());

        // TESTING CODE BELOW : ---------------------------------------------------------

        BinaryTree<Character> myBT1 = new BinaryTree<>(star);
        System.out.println(myBT1); // This tree looks like it should. Very good.
        
        String myTree_1 = myBT1.preOrderTraverse();
        System.out.println("Printing my preOrder Tree just below here:");
        System.out.println(myTree_1);

        String myTree_2 = myBT1.inOrderTraverse();
        System.out.println("\nPrinting my inOrder Tree just below here:");
        System.out.println(myTree_2);
        
        String myTree_3 = myBT1.postOrderTraverse();
        System.out.println("\nPrinting my postOrder Tree just below here:");
        System.out.println(myTree_3);

        System.out.println("Testing size(), size of myBT1 should be 7, RESULT: " + myBT1.size());

        System.out.println("Testing height() for myBT1, height should be 3: " + myBT1.height());
        
        Node<Character> carrot = new Node<Character>('^');
        x.right = carrot;

        System.out.println("Testing height() for myBT1 after adding new char, height should be 4: " + myBT1.height());

        Node<Character> carrot2 = new Node<Character>('^');
        carrot.left = carrot2;        
        System.out.println("Testing height() for myBT1 after 2 new chars added, height should be 5: " + myBT1.height());

        System.out.println("\nPrinting new tree just to see it: " + myBT1.toString());
    }

    
    
    /**
     * get a string containing all data items in this binary tree. The string is
     * a preorder traversal sequence of this binary tree.
     *
     * @return the preorder traversal sequence of this binary tree as a string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //call the private recursive method to do the real job.
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }

    /**
     * Perform a preorder traversal of the binary tree rooted at node.
     *
     * @param node The local root (i.e. the current root node)
     * @param depth The depth of the local root
     * @param sb The string buffer to save the output
     */
    private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
        //add a number of spaces that is proportial to the depth value
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {         //current root node does not exist
            sb.append("null\n");
        } else {
            sb.append(node.toString()); //add current root node's data
            sb.append("\n");
            //recursively preorder traverse the left subtree of current root node
            preOrderTraverse(node.left, depth + 1, sb);
            //recursively preorder traverse the right subtree of current root node            
            preOrderTraverse(node.right, depth + 1, sb);
        }
    }    

    //public wrapper of preOrderTraverse.
    // calls recursive 'preOrderTraverse(Node<E>, StringBuilder)' to produce string representation of preorder traversal of a Binary tree
    public String preOrderTraverse() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, sb);
        return sb.toString();
    }

    // recursive counterpart 
    // this function recursively calls itself and appends the current root to the string being built by StringBuilder sb, 
    //   after appending current root it attempts to appdn the leftmost root before the rightmost, 
    //   'null' is appended whenever a node that doesn't yet exist is referenced. 
    //   Reaching a null reference in a tree acts as the base case for this recursive method. 
    private void preOrderTraverse(Node<E> currentRoot, StringBuilder currentResultSB) {
        if(currentRoot == null){
            currentResultSB.append("null");
            currentResultSB.append("  ");
        } else {
            currentResultSB.append(currentRoot);
            currentResultSB.append("  ");
            preOrderTraverse(currentRoot.left, currentResultSB);
            preOrderTraverse(currentRoot.right, currentResultSB);
        }
    }

    //public wrapper of inOrderTraverse.
    public String inOrderTraverse() {
        StringBuilder sb = new StringBuilder();
        inOrderTraverse(root, sb);
        return sb.toString();
    }

    // see comments for 'preorderTraverse(Node<E>, StringBuilder)' ... only difference is ordering of recursive calls and thus ordering ofoutput string. 
    private void inOrderTraverse(Node<E> currentRoot, StringBuilder currentResultSB) {
        if(currentRoot == null){
            currentResultSB.append("null");
            currentResultSB.append("  ");
        } else {
            inOrderTraverse(currentRoot.left, currentResultSB);
            currentResultSB.append(currentRoot);
            currentResultSB.append("  ");
            inOrderTraverse(currentRoot.right, currentResultSB);
        }
    }
    
    //public wrapper of postOrderTraverse.
    public String postOrderTraverse() {
        StringBuilder sb = new StringBuilder();
        postOrderTraverse(root, sb);
        return sb.toString();
    }

    // see comments for 'preorderTraverse(Node<E>, StringBuilder)' ... only difference is ordering of recursive calls and thus ordering ofoutput string. 
    private void postOrderTraverse(Node<E> currentRoot, StringBuilder currentResultSB) {
        if(currentRoot == null){
            currentResultSB.append("null");
            currentResultSB.append("  ");
        } else {
            postOrderTraverse(currentRoot.left, currentResultSB);
            postOrderTraverse(currentRoot.right, currentResultSB);
            currentResultSB.append(currentRoot);
            currentResultSB.append("  ");
        }
    }

    //traversal-based processing of BT
    //return the total number of data items in this BinaryTree
    //public wrapper of size().
    public int size() {
        int totalSize = size(root);
        return totalSize;
    }

    // recursive counterpart to size()
    private int size(Node<E> currentRoot) {
        int totalSize = 0;

        if(currentRoot == null){
            return totalSize;
        } else {
            int leftSubtreeSize = size(currentRoot.left);
            int rightSubtreeSize = size(currentRoot.right);
            totalSize = 1 + leftSubtreeSize + rightSubtreeSize;
        }
        return totalSize;
    }    
    
    //Return the height of this BinaryTree.
    //public wrapper of height.
    public int height() { 
        int height = height(root);
        return height;
    }

    // recursive counterpart to height
    private int height(Node<E> currentRoot) {
        int greatestHeight = 0;
        if(currentRoot == null){
            return greatestHeight;
        } else {
            int leftTreeHeight = 1 + height(currentRoot.left);
            int rightTreeHeight = 1 + height(currentRoot.right);

            if(leftTreeHeight > rightTreeHeight){
                greatestHeight = leftTreeHeight;
            } else {
                greatestHeight = rightTreeHeight;
            }
        }
        return greatestHeight;
    }    
    
    //--------Lab8Assign5 End ---------//
    
    
    /*<listing chapter="6" number="1">*/
    /**
     * Class to encapsulate a tree node.
     */
    protected static class Node<E> {
        // Data Fields

        /**
         * The information stored in this node.
         */
        protected E data;
        /**
         * Reference to the left child.
         */
        protected Node<E> left;
        /**
         * Reference to the right child.
         */
        protected Node<E> right;

        // Constructors
        /**
         * Construct a node with given data and no children.
         *
         * @param data The data to store in this node
         */
        //This constructor should be protected, not public,
        // because classes that are not subclasses of BinaryTree do not directly use Node.
        protected Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }

        // Methods
        /**
         * Returns a string representation of the node.
         *
         * @return A string representation of the data fields
         */
        //must be public because it overrides what's in class Object.
        @Override
        public String toString() {
            return data.toString();
        }
    }
    /*</listing>*/

    // Data Field
    /**
     * The root of the binary tree
     */
    //use the access modifier protected to give family member classes the direct access
    //   to the root data field.
    protected Node<E> root;

    /**
     * Construct an empty BinaryTree1
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Construct a BinaryTree with a specified root. Should only be used by
     * subclasses.
     *
     * @param root The node that is the root of the tree.
     */
    //Use the access modifier protected because we want to hide details of Node class
    //   from non-family member classes (i.e. classes that are not subclasses of BinaryTree).
    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Constructs a new binary tree with data in its root,leftTree as its left
     * subtree and rightTree as its right subtree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        root = new Node<E>(data);           //new node: right, left are both null
        if (leftTree != null) {
            root.left = leftTree.root;
        } else {
            root.left = null;               //don't have to do this, root.left is already null
        }
        if (rightTree != null) {
            root.right = rightTree.root;
        } else {
            root.right = null;              //don't have to do this, root.right is already null.
        }
    }

    /**
     * Return the left subtree.
     *
     * @return The left subtree or null if either the root or the left subtree
     * is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.left != null) { //if there is a left subtree
            return new BinaryTree<E>(root.left);
        } else {
            return null;
        }
    }

    /**
     * Return the right sub-tree
     *
     * @return the right sub-tree or null if either the root or the right
     * subtree is null.
     */
    public BinaryTree<E> getRightSubtree() {
        if (root != null && root.right != null) {   //if there is a right subtree
            return new BinaryTree<E>(root.right);
        } else {
            return null;
        }
    }

    /**
     * Return the data in the root node
     *
     * @return the data in the root node or null if the root is null
     */
    public E getData() {
        if (root != null) {
            return root.data;
        } else {
            return null;
        }
    }

    /**
     * Determine whether this tree is a leaf.
     *
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        //empty tree or 1-node tree
        return (root == null || (root.left == null && root.right == null));
    }

//    /**
//     * get a string containing all data items in this binary tree. The string is
//     * a preorder traversal sequence of this binary tree.
//     *
//     * @return the preorder traversal sequence of this binary tree as a string.
//     */
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        //call the private recursive method to do the real job.
//        preOrderTraverse(root, 1, sb);
//        return sb.toString();
//    }
//
//    /**
//     * Perform a preorder traversal of the binary tree rooted at node.
//     *
//     * @param node The local root (i.e. the current root node)
//     * @param depth The depth of the local root
//     * @param sb The string buffer to save the output
//     */
//    private void preOrderTraverse(Node<E> node, int depth,
//            StringBuilder sb) {
//        //add a number of spaces that is proportial to the depth value
//        for (int i = 1; i < depth; i++) {
//            sb.append("  ");
//        }
//        if (node == null) {         //current root node does not exist
//            sb.append("null\n");
//        } else {
//            sb.append(node.toString()); //add current root node's data
//            sb.append("\n");
//            //recursively preorder traverse the left subtree of current root node
//            preOrderTraverse(node.left, depth + 1, sb);
//            //recursively preorder traverse the right subtree of current root node            
//            preOrderTraverse(node.right, depth + 1, sb);
//        }
//    }

    /*<listing chapter="6" number="2">*/
    /**
     * Method to read a binary tree.
     *
     * @pre The input consists of a preorder traversal of the binary tree. The
     * line "null" indicates a null tree.
     * @param scan the Scanner attached to the input file
     * @return The binary tree
     */
    public static BinaryTree<String> readBinaryTree(Scanner scan) {
        // Read a line and trim leading and trailing spaces.
        String data = scan.nextLine().trim();
        if (data.equals("null")) { //data (i.e. current root node's data) is "null"
            return null;
        } else {
            //recursively keep reading and building the left subtree of current root node until it's done.
            BinaryTree<String> leftTree = readBinaryTree(scan);
            //recursively keep reading and building the right subtree of current root node until it's done.
            BinaryTree<String> rightTree = readBinaryTree(scan);
            //build and return a new binary tree that has root data in variable data, leftTree as left subtree, rightTree as right subtree.
            return new BinaryTree<String>(data, leftTree, rightTree);
        }
    }
    /*</listing>*/
}
/*</listing>*/
