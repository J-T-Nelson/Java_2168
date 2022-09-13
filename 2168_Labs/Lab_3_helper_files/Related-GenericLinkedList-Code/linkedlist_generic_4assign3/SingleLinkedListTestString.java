//package linkedlist_generic;
package linkedlist_generic_4assign3;

/**
 * Test the implementation and usage of class SingleLinkedList<E>.
 * Create and use a single linked list of String objects.
 * @author Cindy Li
 */
public class SingleLinkedListTestString {

    public static void main(String[] args) {
	//create an empty linked list and make movieList reference it.
        SingleLinkedList<String> movieList = new SingleLinkedList<String>();
      
        //add data to the end of the list
        movieList.add("Avengers: End Game");
        movieList.add("Spider Man: Far From Home");
        movieList.add("Star Wars: The Rise of Skywalker");
        //print all data in the linked list
        System.out.println("\nMovies in the single linked list: \n" 
                + movieList.toString());

        //get the second movie and print it
        System.out.println("\nThe second movie: \n" 
                + movieList.get(1));

        //add new movie at index 2
        String newMovie = "Spider Man: No Way Home";
        movieList.add(2, newMovie);
        //print all data in the linked list
        System.out.println("\nAfter adding a new movie, movies in the single linked list: \n" 
                + movieList.toString());           
    }
    
}
