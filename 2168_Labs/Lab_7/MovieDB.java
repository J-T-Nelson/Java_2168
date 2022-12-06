// CIS2168
// Section: 003
// Assignment 7
// File: MovieDB.java
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

package Lab_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MovieDB {

    //----------Assign 6 Begin ----------------//
    //movie database, to be implemented as an array list (better)
    private List<Movie> movieDB;
    //initial capacity of the movie database (max number of movies can be stored initially) 
    private static final int INITIAL_CAPACITY = 20;
    //the number of movies in the starter movie database
    private static final int STARTER_MOVIEDB_SIZE = 15;

    //decare a data field named titleIndex for the movie title index
    //must use both Set interface and TreeSet class in Java API
    //add your code here:
    private Set<IndexEntry> titleIndex;


    //constructor of MovieDB
    public MovieDB() {
        movieDB = new ArrayList<>(INITIAL_CAPACITY);
        titleIndex = new TreeSet<>();
    }

    //create a starter movie DB:
    public void createStartMovieDB() {
        int counter = 0;
        HashSet<Integer> uniqueSet = new HashSet<>();
        Random rng = new Random();
        // First while() loop works to ensure STARTER_MOVIEDB_SIZE amount of movie objects are generated
        while(counter < STARTER_MOVIEDB_SIZE){
            int randNum = rng.nextInt(STARTER_MOVIEDB_SIZE); 
            
            // Second while loop has the purpose of ensuring uniqueness of entries into the database by using the HashSet collections unique property 
            while(!uniqueSet.add(randNum)){ // if the number is already in the set, grab a new number and attempt to add it. 
                randNum = rng.nextInt(STARTER_MOVIEDB_SIZE);
            }
            
            // Movie generation and addition done below before looping back around.
            int rYear = rng.nextInt(2022);
            Movie randomMovie = new Movie("Title"+randNum, "Director"+randNum, rYear);
            movieDB.add(randomMovie);
            counter ++;
        }
    }

    //display the movies in the database in a nice tabular format by String.format()
    public void showMovieDB() {

        System.out.println("Movie Database:\n");
        System.out.println("            Title       Director      Year");
        System.out.println("-----------------------------------------");

        for(Movie m : movieDB){
            System.out.println(String.format("            %s      %2$s     %3$s", m.getTitle(), m.getDirector(), m.getYear()));
        }
    }

    //create the index tree for all unique titles in the current movieDB
    public void createIndex() {
        int location = 0;
        // for() loop generates IndexEntry objects and adds them to the titleIndex TreeSet field
        for(Movie m : movieDB){
            IndexEntry index = new IndexEntry(m.getTitle(), location);
            titleIndex.add(index);
            location++; 
        }
    }

    //display the title index in in a tabular format
    public void showIndex() {
        System.out.println("Title Index:\n");
        System.out.println("            Title    Location");
        System.out.println("-------------------------------");
        // for loop prints out formatted information about the titles and their locations within the DB 
        for(IndexEntry e : titleIndex){
            System.out.println(String.format("            %s   %2$s", e.getTitle(), e.getLocation()));
        }
    }    
    
    //----------Assign 6 End ----------------// 
    
    
    //code below might be helpful to you.
    public static void main(String[] args) {
        //create a random number generator
        Random randomNumberGenerator = new Random();
        //get a random integer between 0 (inclusive) and 200 (exclusive)
        // 0, 1, 2, ... ,199
        int randomNumber = randomNumberGenerator.nextInt(200);
        System.out.println(randomNumber);  
        //get a random integer between 1 (inclusive) and 200 (inclusive)
        // 1, 2, 3, ...., 200
        randomNumber = randomNumberGenerator.nextInt(200) + 1;
        System.out.println(randomNumber);
    }

}
