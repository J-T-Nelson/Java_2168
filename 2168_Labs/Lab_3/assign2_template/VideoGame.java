package Lab_3.assign2_template;

//newer Java API for handling date values
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class VideoGame implements Comparable<VideoGame>, Comparator<VideoGame> {

    //2.2.1 Entity Class - VideoGame
    
    private static final int DEFAULT_NUMBER_OF_PLATFORMS = 5;    

    //data fields
    private String title;
    private String developer;     //lead developer 
    private String platforms[];
    private LocalDate releaseDate;

    
    @Override
    public String toString() { //Standard toString() method for viewing all details of VideoGame objects
      
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");  //formatting for date in American style
        
        String vgInfo = "Title: " + title + "\nLead Developer: " + developer +
          "\nRelease Date: " + dateFormatter.format(releaseDate) + "\nPlatforms: " + Arrays.toString(platforms) + "\n";

        return vgInfo;
    }

    @Override
    public boolean equals(Object otherObject) {
        // comparing two VideoGame objects based only on title
        if(otherObject == null | this.getClass() != otherObject.getClass()){
            return false;  // varifying that otherObject isnt null and also is of the same class as the videoGame calling .equals()
        }
        if(this == otherObject){  // checking if the same object is referenced by both variables
            return true; 
        }

        VideoGame other = (VideoGame) otherObject; // Type casting for final comparison
        return this.title.equals(other.title);
    }  
    
    // returns int which captures relative relation of two VideoGame's release dates
    // returns -int if this came out before otherGame ... 0 if same date, and +int otherwise
    public int compareDates(VideoGame otherGame){
        return this.releaseDate.compareTo(otherGame.releaseDate);
    }

    @Override // comparator method for sorting lists of video games for the addGameAlphabetically method
    public int compare(VideoGame vg1, VideoGame vg2){
        return vg1.title.compareTo(vg2.title);
    } 

    //******The following code doesn't need to be changed.*****//
    
    //You don't need to change this method.
    //This method is used in addVideoGameIn.
    @Override 
    public int compareTo(VideoGame other) {
        return this.title.compareTo(other.title);
    }   
    
    //no-argument constructor
    public VideoGame() {
        platforms = new String[DEFAULT_NUMBER_OF_PLATFORMS];
    }    
    
    //constructor taking in values for all data fields
    public VideoGame(String title, String developer, String[] platforms, LocalDate releaseDate) {
        this.title = title;
        this.developer = developer;
        this.platforms = platforms;
        this.releaseDate = releaseDate;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getDeveloper() {
        return developer;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }    
}
