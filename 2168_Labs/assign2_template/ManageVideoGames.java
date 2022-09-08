package assign2_template;

import java.time.LocalDate;
//import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ManageVideoGames {

    public static void main(String[] args) {
        //List<VideoGame> gameCollection = new LinkedList<>(); 

        LinkedList<VideoGame> gameCollection = new LinkedList<>();

        int userResponse = 0;
        while(userResponse != 6){ // while loop + switch work to mediate the user interface of this program. Probing for input and responding accordingly. 

            userResponse = getUserChoice();
            switch(userResponse){
                case 1: gameCollection.add(getNewGame());
                        break;
                case 2: removeVideoGame(gameCollection);
                        break;
                case 3: System.out.println(displayGameCollection(gameCollection));
                        break;
                case 4: System.out.println(getLatestRelease(gameCollection));
                        break;
                case 5: addGameAlphabetically(gameCollection);
                        break;
                case 6: break;
            }
        }
    }

    public static void displayMenu() { // Interactive menu display for video game management tool 
    
        String menu = "--Video Game Management Tool Main Menu--\n\n"+
            "1. Add new game\n2. Remove existing game\n3. Display ordered list of games\n"+
            "4. Find most recently released game\n5. Add new game in alphabetical order\n" +
            "6. Exit\n\n";  
        System.out.println(menu);
    }    
    
    public static int getUserChoice() { // gets user input for making a choice in the displayMenu 
        displayMenu();
        Scanner input = new Scanner(System.in);
        String userSelection = "0";
        while( !(userSelection.equals("1") | userSelection.equals("2") |userSelection.equals("3") |
              userSelection.equals("4") |userSelection.equals("5") |userSelection.equals("6")) ){ 
                // Would it be possible to make a boolean comparison of userSelection to an array from 1 to 6 as an argument in Java? (I can do this in R.. but don't know the syntax in Java)
                System.out.println("Enter a number to select an option from the menu");

                userSelection = input.next();
                System.out.println("You entered: " + userSelection);

                // if statement controls for invalid input
                if( !(userSelection.equals("1") | userSelection.equals("2") |userSelection.equals("3") |
                userSelection.equals("4") |userSelection.equals("5") |userSelection.equals("6")) ){
                    System.out.println("Input is not valid, enter a number 1-6 to select a menu option.");
                }
        }
        int selection = Integer.parseInt(userSelection); //casting user input to int for valid return value 
        return selection;
    }    
    
    
    //static method to get user input for creating and returning a videoGame object
    public static VideoGame getNewGame() { 

        Scanner input = new Scanner(System.in);

        // following code block prompts the user for fields of VideoGame to be added into a collection
        System.out.println("Enter a game title: ");
        String gameTitle = input.nextLine();
        System.out.println("Enter the developer of the video game: ");
        String gameDeveloper = input.nextLine();
        
        System.out.println("Enter the number of platforms this game can be played on: ");
        while(!input.hasNextInt()){ //varifying input is an int before accepting it
            System.out.println("That is not a valid entry, try entering a number instead!");
            input.next();
        }
        int numPlatforms = input.nextInt(); 
        input.nextLine(); 
        System.out.println("printing to debug: numPlatforms: " + numPlatforms);
        String[] gamePlatforms = new String[numPlatforms];

        for(int i = 1; i <= numPlatforms; i++){ // for loop retrieves names of each platform and will ask for x platforms where x is specified by the user.
            System.out.println("Enter platform number: "+ i);
            gamePlatforms[i-1] = input.nextLine();
            System.out.println("printing to debug: gamePlatforms: #" +i+ gamePlatforms[i-1]);
        }

        System.out.println("Enter the release date of the game in numeric form\n"+"Month: ");
        while(!input.hasNextInt()){ //varifying input is an int before accepting it
            System.out.println("That is not a valid entry, try entering a number instead!");
            input.next();
        }
        int month = input.nextInt();
        System.out.println("Now enter the Day: ");
        while(!input.hasNextInt()){ //varifying input is an int before accepting it
            System.out.println("That is not a valid entry, try entering a number instead!");
            input.next();
        }
        int day = input.nextInt();
        System.out.println("and finally the Year: ");
        while(!input.hasNextInt()){ //varifying input is an int before accepting it
            System.out.println("That is not a valid entry, try entering a number instead!");
            input.next();
        }
        int year = input.nextInt();
        LocalDate gameRelease = LocalDate.of(year, month, day);
                    
        VideoGame newGame = new VideoGame(gameTitle, gameDeveloper, gamePlatforms, gameRelease);        

        System.out.println("Adding the game: " + newGame.getTitle() + "to your collection!");

        return newGame;
    }     
    
    // adds new game to the specified gameRepository
    public static void addVideoGame(LinkedList<VideoGame> gameRepository){
        VideoGame newGame = getNewGame();
        gameRepository.add(newGame);
    }
    
    // Removes VideoGame from gameRepository, user is prompted to enter the game title they wish to remove, valid input is assumed. 
    public static void removeVideoGame(LinkedList<VideoGame> gameRepository){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the game Title which you wish to remove from the collection please: \n Game titles are: ");
        for(VideoGame game : gameRepository){ //printing the game titles so the user has an easier time making a choice
            System.out.println(game.getTitle());
        }
        String gTitle = input.nextLine();

        VideoGame newGame = gameRepository.getFirst(); //assigning default value to variable to satisfy initialization requirement 
        for(VideoGame game : gameRepository){
            if(gTitle.equals(game.getTitle())){
                newGame = game;
                break;
            }
        }
        gameRepository.remove(newGame);
    }

    // Method to display the game collection by using toString() on all items in list
    public static String displayGameCollection(LinkedList<VideoGame> gameRepository){
        String games = "";
        for(VideoGame game : gameRepository){
            games = games + game.toString();
        }
        return games;
    }

    // Method to return the title and release date of the game with the latest release
    public static String getLatestRelease(LinkedList<VideoGame> gameRepository){
        // if current latest release (curLR) comes before the next game in the linked list gameRepository, update curLR to the more recent date 
        VideoGame curLR = gameRepository.getFirst();
        for(int i = 1; i < gameRepository.size(); i++){
            if(curLR.compareDates(gameRepository.get(i)) < 0){ 
                // .compareDates() is defined in VideoGame class and will return a negative integer if the VideoGame used to call the method predates the VideoGame argument.
                curLR = gameRepository.get(i);
            }
        }
        String latestRelease = "Game title: " + curLR.getTitle() + 
                                "Game date" + curLR.getReleaseDate();
        
        return latestRelease;
    }
    
    // Method to sort the linked list alphabetically according to title and to then insert a new game according to its alphabetical index. 
    public static void addGameAlphabetically(LinkedList<VideoGame> gameRepository){

        Collections.sort(gameRepository, new VideoGame()); // sorting list such that alphabetical order is instantiated to start
        VideoGame newGame = getNewGame();

        for(VideoGame vg : gameRepository){
            if(newGame.compareTo(vg) < 0){
                // get index of VideoGame (vg) being compared to, and insert newGame at that index, thus shifting the rest of the list backwards relative to where newGame is inserted. 
                int insertionPoint = gameRepository.indexOf(vg);
                gameRepository.add(insertionPoint, newGame);
                break;
            }
            if(gameRepository.indexOf(vg) == (gameRepository.size()-1)){
                gameRepository.add(newGame);
                break;
            }
        } 
    }
}
