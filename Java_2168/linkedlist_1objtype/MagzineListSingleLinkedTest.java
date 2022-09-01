package linkedlist_1objtype;

/**
 * The class MagzineListSingleLinkedTest is the driver of class MagazineListSingleLinked.
 * It tests the implementation of class MagazineListSingleLinked.
 * Create, populate, and display contents of a magazine collection (single linked list of Magazine objects).
 */
public class MagzineListSingleLinkedTest {

    public static void main(String[] args) {
        //create an empty magazine collection: an empty single linked list of Magazine objects
        MagazineListSingleLinked myMagList = new MagazineListSingleLinked();
        
        //add three magazines Times, Vogue, Reader Digest into the collection
        myMagList.add(new Magazine("Times", "Edward Felsenthal"));
        myMagList.add(new Magazine("Vogue", "Anna Wintour"));
        myMagList.add(new Magazine("Reader's Digest", "Bruce Kelley"));

        //print the information about all magazines in the collection
        System.out.println(myMagList);
        //above line equivalent to: System.out.println(myMagList.toString());
    }

}
