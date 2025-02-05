import java.util.Random; // importing random class to use random.nextInt(num)
import java.util.Scanner; // import Scanner class to get user input
public class Main // Main class
{
    static void RepeatAddition() { // Method for the user to guess the sum of 2 random numbers 0-9 
        System.out.println("Add numbers you're in school.");
        Random RNG = new Random(); // New random object
        Scanner input = new Scanner(System.in); new scanner object

        int rand1 = RNG.nextInt(10); // random number 0-9
        int rand2 = RNG.nextInt(10); // random number 0-9
        
        System.out.printf("What is %d + %d? ", rand1, rand2);
        int Answer = input.nextInt(); // user input
        while (Answer != rand1 + rand2) { // checks if user answers the wrong number, otherwise finishes the loop
            System.out.printf("Wrong, try again. What is %d + %d? ", rand1, rand2);
            Answer = input.nextInt(); // re enter input
        }
        System.out.print("Yayyyyy, you got it right!!");

    }
    static void GuessNumber(){ // Method where user guesses a number 1-100 until they get it right
        System.out.println("Guess the Number.");
        Random guess = new Random(); // other Random object
        Scanner input = new Scanner(System.in);
        
        int GuessIt = guess.nextInt(101); // Random number 0-100
        

        System.out.print("Guess a magic number (1-100)! ");
        int Answer = input.nextInt();
        while (Answer != GuessIt) { // While the answer isn't the random number it goes through the loop
            if (Answer < GuessIt) { // If the answer is less than the random number it says it is too low and lets them input again
                System.out.print("Too low! Guess again! ");
                Answer = input.nextInt();
            } else if (Answer > GuessIt) { // If the answer is less than the random number it says it is too low and lets them input again
                System.out.print("Too high! Guess again! ");
                Answer = input.nextInt();
            } else {
                continue;
            }
        }
        System.out.println("You got it right! ");
        
    }
    static void EnterPositive(){ // method to validate a positive input
        System.out.println("Validating Positive Number Input.");
        int count = 1; // Please count
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number. ");
        int UserInput = input.nextInt();
        while (UserInput < 0){ // while the user enters anything less than 0 it repeats
            System.out.print("Please ".repeat(count) + "enter a positive number. ");
            UserInput = input.nextInt();
            count++;
        }
        System.out.printf("You entered: %d.", UserInput); // saying what the user input
        
    }
    static void For20No3(){ // Method to iterate through 20 skipping anything divisible by 3
        System.out.println("Skipping Multiples of 3.");
        for (int i = 1; i<=20; i++){ // iterate through 20
           while (i % 3 != 0) { // print i whenever it isn't divisible by 3
               System.out.println(i);
               i++;
           }
        }
        
    }
	public static void main(String[] args) {
		RepeatAddition(); // calling the RepeatAddition method
		GuessNumber(); // calling the GuessNumber method
		EnterPositive(); // calling the EnterPositive method
		For20No3(); // calling the For20No3 method
		
	}
}
