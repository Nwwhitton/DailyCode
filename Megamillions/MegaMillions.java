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
    playRound();
		// TODO: Run the game loop until the player can no longer play

		// printGameSummary();
	}

	public static void initializeGame() { // TODO: Initialize the game (set balance, print welcome message)
        System.out.printf("%30s%10s%n", "WELCOME TO MEGA MILLIONS!", "");
        System.out.println("===================================");
        balance = 50.00;
        System.out.printf("You start with $%.2f.", balance);
        System.out.println();

	}

	public static void runGame() { // TODO: Run the game loop (handle multiple rounds of play)
    while (balance >= 2) {
      
    }
	}

	public static void playRound() { // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)
    System.out.println("-----------------------------------");
    System.out.printf("Current Balance: $%.2f\n", balance);
    System.out.println("-----------------------------------");
    System.out.print("Do you want Quick Pick? (yes/no): ");
    String Qpick;
    do {
      Qpick = scanner.nextLine();
      
      if (Qpick.equals("yes")) {
        int[] quickPick = new int[5];
        for (int i = 0; i < 5; i++ ) {
          quickPick[i] = random.nextInt(70)+1;
        }
        System.out.print("Your Quick Pick: " + Arrays.toString(quickPick));
      } 
      
      else if (Qpick.equals("no")) {
        int userNums;
        int[] userPick = new int[5];
        for (int i = 0; i < 5; i++ ) {
            System.out.print("Type your number for spot " + i + ": ");
            userPick[i] = scanner.nextInt();
        }
        System.out.print("Your Numbers Are: " + Arrays.toString(userPick));
      } 
      
      else {
        System.out.println("Please choose a valid option.");
        System.out.print("Do you want Quick Pick? (yes/no): ");

      }
    } while ((Qpick.equals("no")|| Qpick.equals("yes")) != true);
    

	    
	}
    
  public static void updateBalance(double updatedBalance) { // TODO: Update balance after ticket purchase and winnings
    balance = updatedBalance;
	}
	
  public static void printGameSummary() { // TODO: Print game summary (total spent, total winnings, final balance)
    System.out.printf("%30s%10s%n", "GAME OVER", "");
    System.out.println("===================================");
    
  }

  public static void generateNumbers() { // TODO: Generate an array of 5 unique random numbers (1-70)
    int[] numbersWin = new int[5];
    for (int i = 0; i < 5; i++ ) {
      numbersWin[i] = random.nextInt(70)+1;
    }
    Arrays.sort(numbersWin);
    System.out.println(Arrays.toString(numbersWin));
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
