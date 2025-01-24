import java.util.Scanner;  // Import the Scanner class

class Stairs { // Stairs class, because of the file name
  public static void main(String[] args) {
      
    Scanner singleChar = new Scanner(System.in); // scanner for char
    System.out.println("Enter a character, (it will take only the first letter you give)");
    
    char character = singleChar.next().charAt(0); // Reading char
    
    Scanner numOfSteps = new Scanner(System.in); // scanner for number
    System.out.println("Enter a number");
    
    int num = numOfSteps.nextInt(); // Reading Number
    
    for (int i = 1; i < num+1; i++) { // For loop for however many steps
        
        String stringyChar = character + ""; // Changing the char into a string
        System.out.println(" ".repeat( num-i ) + stringyChar.repeat( i )); // Repeat spaces for how many steps minus the amount steps counted already, then concatenating the amount of steps
    }    
    
    
  }
}
