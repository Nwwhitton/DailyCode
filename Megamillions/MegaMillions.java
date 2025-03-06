import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MegaMillions {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	static double balance;
	static double totalWinnings = 0;
	static double totalSpent = 0;

	public static void main(String[] args) {
		initializeGame();

		// TODO: Run the game loop until the player can no longer play

		// printGameSummary();
	}

	public static void initializeGame() { // TODO: Initialize the game (set balance, print welcome message)
        System.out.printf("%30s%10s%n", "WELCOME TO MEGA MILLIONS!", "");
        System.out.println("===================================");

	}

	public static void runGame() { // TODO: Run the game loop (handle multiple rounds of play)

	}

	public static void playRound() { // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)

	    
	}
    
    public static void updateBalance() { // TODO: Update balance after ticket purchase and winnings

	    
	}
	
    public static void printGameSummary() { // TODO: Print game summary (total spent, total winnings, final balance)
       
    }
	
    public static void generateNumbers() { // TODO: Generate an array of 5 unique random numbers (1-70)
        
    }
	
    public static void getValidNumber() {	// TODO: Get a valid number input from the user within a given range

        
    }
    public static void contains() { // TODO: Check if an array contains a specific number
        
    }
	
    public static void countMatches() { // TODO: Count matching numbers between user and winning numbers
        
    }
	
    public static void getPrize() { // TODO: Determine the prize amount based on matches
        
    }
	
    public static void getRandomMegaplier() { // TODO: Get a random Megaplier value (2x, 3x, 4x, or 5x)
        
    }
	
}
