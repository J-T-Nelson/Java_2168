package linkedlist_1objtype;

/**
 * Class MagazineListSingleLinked.
 * An object of this class represents a single
 *     magazine collection stored in a single linked list.
 * Example of a single linked list of objects of 1 specific type: Magazine.
 * 
 */
public class MagazineListSingleLinked {
    /** The head link, pointing to the first MagazineNode. */
    private MagazineNode head;
    private int size;

    /** The constructor to build an empty single linked list */
    public MagazineListSingleLinked() {
        head = null;
        size = 0;
    }

    /** 
     * Append the specific magazine: mag to the end of this collection.
     * Append the Magazine object referred to by mag to the end of this single linked list.
     */
    public boolean add(Magazine mag) {
        //create a new standalone MagazineNode for the Magazine object: mag
        MagazineNode newNode = new MagazineNode(mag);
        //the pointer referring to the current MagazineNode while searching this single linked list.
        MagazineNode current;

        //if the collection is empty
        if (head == null) {
            //make the new MagazineNode the first in the list
            head = newNode;
        } else {
            //search this single linked list for the last MagazineNode
            current = head;                 //start with the first MagazineNode
            while (current.next != null) {  //check if current MagazineNode is NOT the last one in this list
                current = current.next;     //move on to the next MagazineNode in this list
            }
            //make the new MagazineNode the new last node in this single linked list
            current.next = newNode;
        }
        //increament the list size
        size++;
        return true;
    }
    
    /**
     * @Override
     * Traverse each node in this linked list, generate and return the String
     *    consisting of information about all magazines in this collection.
     * @return the String consisting of information about all magazines in this collection.
     */
    @Override
    public String toString() {
        String listInfo = "";
        //current points to the current MagazineNode while traversing this single linked list.
        //current is set to point to the first MagazineNode.
        MagazineNode current = head;

        //cycle through each MagazineNode in the list
        while (current != null) { //while current MagazineNode exists
            //add current Magazine information to the resulting string
            listInfo += current.magazine.toString() + "-->\n";
            //move on to the next Magazine in the collection
            current = current.next;
        }
        return listInfo;
    }

    /**
     * Static nested class  MagazineNode represents a data node in the magazine linked list.
     * The class is placed inside the class MagazineListSingleLinked.
     */
    private static class MagazineNode {
        /**
         * magazine is a reference to a Magazine object, which represents a single magazine in a collection.
         */
        private Magazine magazine;
        private MagazineNode next;      //link to the successor MagazineNode

        /**Constructor
         * Create a new MagazineNode for the Magazine object referenced by mag.
         * This new MagazineNode is standalone and not linked to any other node.
         * @param mag - reference to a Magazine object
         */
        private MagazineNode(Magazine mag) {
            magazine = mag;
            next = null;
        }

    }

}
