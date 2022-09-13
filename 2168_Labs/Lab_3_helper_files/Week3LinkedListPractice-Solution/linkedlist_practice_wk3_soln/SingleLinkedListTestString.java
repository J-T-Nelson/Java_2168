package linkedlist_practice_wk3_soln;


public class SingleLinkedListTestString {
    public static void main(String[] args) {
        SingleLinkedList<String> movieList = new SingleLinkedList<>();

        movieList.add("Avengers: End Game");
        movieList.add("Spider Man: Far From Home");
        movieList.add("Star Wars: The Rise of Skywalker");
        System.out.println(movieList);

        //System.out.println(movieList.get(1));

        String newMovie = "Spider man: No Way Home";
        //movieList.add(2, newMovie);
        System.out.println(movieList);
    }     
}
