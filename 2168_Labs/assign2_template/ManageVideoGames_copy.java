package assign2_template;

import java.time.LocalDate;
//import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ManageVideoGames_copy {

    public static void main(String[] args) {
        // Below is some mock video game constructs I used for testing. Leaving them here in case the code is useful. 

        // String[] platforms1 = {"x-bac", "ham cat", "play men 22", "cream corn seller station"};
        // String[] platforms2 = {"x-bac", "ham cat", "play men 22", "cream corn seller station", "sleepModeActivate"};
        // String[] platforms3 = {"X-Box", "Wii", "Playstation 2", "Playstation 4", "Windows"};
        
        // LocalDate date1 = LocalDate.of(1999, 9, 23);
        // LocalDate date2 = LocalDate.of(2051, 11, 20);

        // VideoGame vg1 = new VideoGame("Dog smash", "jim thorpe", platforms1, date1); 
        // VideoGame vg2 = new VideoGame("Dog mans", "Criminal lawyer", platforms2, date2);
        // VideoGame vg3 = new VideoGame("Do a good", "Criminal lawyer II", platforms3, date2);
        // gameCollection.add(vg1);
        // gameCollection.add(vg2);
        // gameCollection.add(vg3);

        //List<VideoGame> gameCollection = new LinkedList<>(); 

        LinkedList<VideoGame> gameCollection = new LinkedList<>();

        int userResponse = 0;
        while(userResponse != 6){

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
        

        // MY OWN TESTING SPACE HERE
        // TESTING SORTING METHOD FOR LINKED LISTS 
        // System.out.println("original order of gameCollection: \n" + gameCollection.toString());
            
        // addGameAlphabetically(gameCollection);
        
        // System.out.println("\n\nHypothetically sorted order of gameCollection: \n" + gameCollection.toString());
    }

    public static void displayMenu() { // menu display for video game management tool 
    
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
              userSelection.equals("4") |userSelection.equals("5") |userSelection.equals("6")) ){ // Would it be possible to make a boolean comparison of userSelection to an array from 1 to 6 as an argument in Java? (I can do this in R.. but don't know the syntax in Java)
                System.out.println("Enter a number to select an option from the menu");

                userSelection = input.next();
                System.out.println("You entered: " + userSelection);

                if( !(userSelection.equals("1") | userSelection.equals("2") |userSelection.equals("3") |
                userSelection.equals("4") |userSelection.equals("5") |userSelection.equals("6")) ){
                    System.out.println("Input is not valid, enter a number 1-6 to select a menu option.");
                }
        }
        //input.close();
        int selection = Integer.parseInt(userSelection); //casting user input to int for valid return value 
        return selection;
    }    
    
    
    //static method to get user input for creating and returning a videoGame object
    public static VideoGame getNewGame() { //TEST THIS METHOD FOR CORRECT OUTPUT AND CORRECT NUMBER OF INPUTS TAKEN AND HANDLING INCORRECT INPUT

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a game title: ");
        String gameTitle = input.nextLine();

        System.out.println("Enter the developer of the video game: ");
        String gameDeveloper = input.nextLine();
        
        System.out.println("Enter the number of platforms this game can be played on: ");
        while(!input.hasNextInt()){ //varifying input is an int before accepting it
            System.out.println("That is not a valid entry, try entering a number instead!");
            input.next();
        }
        int numPlatforms = input.nextInt(); // thinking this will result in too many scans for getting the number... TEST THIS! 
        input.nextLine(); // debugging 
        System.out.println("printing to debug: numPlatforms: " + numPlatforms);
        String[] gamePlatforms = new String[numPlatforms];
        for(int i = 1; i <= numPlatforms; i++){
            System.out.println("Enter platform number: "+ i);
            gamePlatforms[i-1] = input.nextLine();
            System.out.println("printing to debug: gamePlatforms: #" +i+ gamePlatforms[i-1]);
        }

        System.out.println("Enter the release date of the game in numeric form\n"+"Month: ");
        while(!input.hasNextInt()){ 
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
        
        // int numPlatforms = 0;
        // while(numPlatforms == 0){
            //     try { // try catch block works to catch input which cannot be converted to integers and re-requests input from the user
                //         numPlatforms = Integer.parseInt(input.nextLine());
                //     }
                //     catch (NumberFormatException e) {
                    //         numPlatforms = 0;
                    //         System.out.println("Input was not valid, please enter a whole number");
                    //     }
                    // }
                    
        VideoGame newGame = new VideoGame(gameTitle, gameDeveloper, gamePlatforms, gameRelease);        
        //input.close();
        System.out.println("Adding the game: " + newGame.getTitle() + "to your collection!");

        return newGame;
    }     
    
    // adds new game to the specified gameRepository
    public static void addVideoGame(LinkedList<VideoGame> gameRepository){
        VideoGame newGame = getNewGame();
        gameRepository.add(newGame);
    }
    
    // Removes VideoGame from gameRepository, user is prompted to enter the game title they wish to remove, valid input is assumed. (ASK IF YOU SHOULD ALWAYS PROGRAMMATICALLY VALIDATE INPUT IN THIS CLASS)
    public static void removeVideoGame(LinkedList<VideoGame> gameRepository){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the game Title which you wish to remove from the collection please: \n Game titles are: ");
        for(VideoGame game : gameRepository){
            System.out.println(game.getTitle());
        }
        String gTitle = input.nextLine();

        VideoGame newGame = gameRepository.getFirst(); //assigning default value to variable to satisfy initialization requirement 
        // ^^^^ .... TEST IF THIS IS NECESSARY
        for(VideoGame game : gameRepository){
            if(gTitle.equals(game.getTitle())){
                newGame = game;
                break;
            }
        }
        //input.close();
        gameRepository.remove(newGame);
    }   

    public static String displayGameCollection(LinkedList<VideoGame> gameRepository){
        String games = "";
        for(VideoGame game : gameRepository){
            games = games + game.toString();
        }
        return games;
    }

    public static String getLatestRelease(LinkedList<VideoGame> gameRepository){
        // if current latest release (curLR) come before the next game in the linked list gameRepository, update curLR to the more recent date 
        VideoGame curLR = gameRepository.getFirst();
        for(int i = 1; i < gameRepository.size(); i++){
            if(curLR.compareDates(gameRepository.get(i)) < 0){ 
                // .compareDates() is defined in VideoGame class and will return a negative integer if the VideoGame used to call the method predates the VideoGame argument.
                curLR = gameRepository.get(i);
            }
        }
        String latestRelease = curLR.getTitle();
        
        return latestRelease;
    }
    //method to find the game with latest release date
    //add your own code    
    /*
    find game with latest release date
       simple assumption: only one game has the latest release date.
       need to loop through the collection and find the latest release date                                                        (largest)
            while looping, 
               record and update the current latest release date value 
                   and the corresponding VideoGame object.

       compare dates: isBefore, isAfter, or compareTo
           TestDate.java    
    */    
    
    
    //OPTIONAL BONUS:
    //  method to add a video game in alphabetical order of game titles
    //add your own code   
    /*    
     add new game in alphabetical order of game titles
        Do not append the new game to the current collection and then sort the entire collection. 
	Instead,
           start with the first game, 
           loop through the collection and 
               find the first game whose title is alphabetically larger than the new game. 
               Then insert the new game at the location of this target.
           If no existing game title is larger than the new game,
               append the new game to the end of game collection list.    
   */  
    // Method to sort the linked list alphabetically according to title and to then insert a new game according to its alphabetical index. 
    public static void addGameAlphabetically(LinkedList<VideoGame> gameRepository){

        Collections.sort(gameRepository, new VideoGame()); // sorting list such that alphabetical order is instantiated to start
        VideoGame newGame = getNewGame();

        for(VideoGame vg : gameRepository){
            if(newGame.compareTo(vg) < 0){
                // get index of vg being compared to, and insert newGame at that index, thus shifting the rest of the list backwards relative to where newGame is inserted. 
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
