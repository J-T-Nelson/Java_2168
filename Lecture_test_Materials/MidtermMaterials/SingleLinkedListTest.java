package midtermprep_demo;

public class SingleLinkedListTest {

    public static void main(String[] args) {

        SingleLinkedList<String> movieList
                = new SingleLinkedList<String>();

        movieList.add("Avengers: End Game");
        movieList.add("Spider Man: Far From Home");
        movieList.add("Star Wars: The Rise of Skywalker");

        System.out.println("\nMovies in the single linked list: \n"
                + movieList);

    }

}
