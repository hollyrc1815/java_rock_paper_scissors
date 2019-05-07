import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
        String compChoice1 = "";//randomChoice();
        String showplayerChoice =""; //playersChoice();
        String playAgain1 = "yes"; //playGame(compChoice1, showplayerChoice);
		//myFunc1();
        //playersChoice(showplayerChoice);
        //myFunc2(compChoice1);
        while(playAgain1.equalsIgnoreCase("yes")) {
        compChoice1 = randomChoice();
        showplayerChoice = playersChoice();
        playAgain1 = playGame(compChoice1, showplayerChoice);
        
        }

	}
//    public static void myFunc1() {
//
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
//
//    }
    
    public static String randomChoice() {

    	Random rand = new Random();
        int compChoice = rand.nextInt(5);
        String compChoice1 = "";
        
        if (compChoice == 0) {
        	compChoice1 = "rock";
        }
        if (compChoice == 1) {
        	compChoice1 = "paper";
        }
        if (compChoice == 2) {
        	compChoice1 = "scissors";
        }
        if (compChoice == 3) {
        	compChoice1 = "lizard";
        }
        if (compChoice == 4) {
        	compChoice1 = "spock";
        }
        //System.out.println("Computer Choice is: " + compChoice1);
        return compChoice1;
    	}
    	
    public static String playersChoice() {
    	Scanner playerChoice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you Choose Rock, Paper, Scissors, Lizard or Spock?");
        String showplayerChoice = "";
        showplayerChoice = playerChoice.nextLine();  // Read user input
        //System.out.println("User choice is: " + showplayerChoice); // Output user input
        
        return showplayerChoice; 
        

    }
       
    
    public static String playGame(String compChoice1, String showplayerChoice) {
    	
        if(compChoice1.equalsIgnoreCase("rock") && showplayerChoice.equalsIgnoreCase("paper")) {
        	System.out.println("Computer chose rock, you win!");       	
        }
        else if(compChoice1.equalsIgnoreCase("rock") && showplayerChoice.equalsIgnoreCase("scissors")) {
        	System.out.println("Computer chose rock, you lose!");
        }
        else if(compChoice1.equalsIgnoreCase("paper") && showplayerChoice.equalsIgnoreCase("rock")) {
        	System.out.println("Computer chose paper, you lose!");
        }
        else if(compChoice1.equalsIgnoreCase("paper") && showplayerChoice.equalsIgnoreCase("scissors")) {
        	System.out.println("Computer chose paper, you win!");
        }
        else if(compChoice1.equalsIgnoreCase("scissors") && showplayerChoice.equalsIgnoreCase("rock")) {
        	System.out.println("Computer chose scissors, you win!");
        }
        else if(compChoice1.equalsIgnoreCase("scissors") && showplayerChoice.equalsIgnoreCase("paper")) {
        	System.out.println("Computer chose scissors, you lose!");
        }
        else if(compChoice1.equalsIgnoreCase("spock") && showplayerChoice.equalsIgnoreCase("lizard")) {
        	System.out.println("Computer chose spock, you win!");
        } 
        else if(compChoice1.equalsIgnoreCase("spock") && showplayerChoice.equalsIgnoreCase("scissors")) {
        	System.out.println("Computer chose spock, you lose!");
        } 
        else if(compChoice1.equalsIgnoreCase("spock") && showplayerChoice.equalsIgnoreCase("paper")) {
        	System.out.println("Computer chose spock, you win!");
        } 
        else if(compChoice1.equalsIgnoreCase("spock") && showplayerChoice.equalsIgnoreCase("rock")) {
        	System.out.println("Computer chose spock, you lose!");
        }  
        else if(compChoice1.equalsIgnoreCase("lizard") && showplayerChoice.equalsIgnoreCase("spock")) {
        	System.out.println("Computer chose lizard, you lose!");       	
        } 
        else if(compChoice1.equalsIgnoreCase("scissors") && showplayerChoice.equalsIgnoreCase("spock")) {
        	System.out.println("Computer chose scissors, you win!");
        } 
        else if(compChoice1.equalsIgnoreCase("paper") && showplayerChoice.equalsIgnoreCase("spock")) {
        	System.out.println("Computer chose paper, you lose!");
        } 
        else if(compChoice1.equalsIgnoreCase("rock") && showplayerChoice.equalsIgnoreCase("spock")) {
        	System.out.println("Computer chose rock, you win!");
        } 
        else if(compChoice1.equalsIgnoreCase("lizard") && showplayerChoice.equalsIgnoreCase("rock")) {
        	System.out.println("Computer chose lizard, you win!");
        }
        else if(compChoice1.equalsIgnoreCase("rock") && showplayerChoice.equalsIgnoreCase("lizard")) {
        	System.out.println("Computer chose rock, you lose!");
        }
        else if(compChoice1.equalsIgnoreCase("lizard") && showplayerChoice.equalsIgnoreCase("paper")) {
        	System.out.println("Computer chose lizard, you lose!");
        }
        else if(compChoice1.equalsIgnoreCase("paper") && showplayerChoice.equalsIgnoreCase("lizard")) {
        	System.out.println("Computer chose paper, you win!");
        }
        else if(compChoice1.equalsIgnoreCase("lizard") && showplayerChoice.equalsIgnoreCase("scissors")) {
        	System.out.println("Computer chose lizard, you win!");
        }
        else if(compChoice1.equalsIgnoreCase("scissors") && showplayerChoice.equalsIgnoreCase("lizard")) {
        	System.out.println("Computer chose scissors, you lose!");
        }
        else if(compChoice1.equalsIgnoreCase(showplayerChoice)) {
        	System.out.println("It was a tie, try again!!");
        }
        else {System.out.println(showplayerChoice + " is an invaild choice");
        
        }
        
        Scanner playAgain = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to play again?");
        String playAgain1 = "";
        playAgain1 = playAgain.nextLine();  // Read user input
        //System.out.println("User choice is: " + showplayerChoice); // Output user input
        return playAgain1; 
        //System.out.println("Sheldon's Choice Was " + compChoice1);
    	//System.out.println(showplayerChoice);

        }//end of myfunc3
    }//end of main class
        

        
        	
        	
            







