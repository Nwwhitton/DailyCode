// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class JavaQuickMaths {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        
        
        System.out.println("Looping from 1.0 to 5.0 with rounding methods: ");
        for (double i = 1.0; i <= 5; i += 0.5) {
            System.out.printf("Number: %.1f Ceil: %.1f Floor: %.1f Rint: %.1f Round: %d\n", i, Math.ceil(i), Math.floor(i), Math.rint(i), Math.round(i));
        }
        System.out.println();
        
        
        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("Enter a decimal number: ");
        double decimalNumber = input.nextDouble();
        System.out.printf("Ceil: %.1f Floor: %.1f Rint: %.1f Round: %d\n", Math.ceil(decimalNumber), Math.floor(decimalNumber), Math.rint(decimalNumber), Math.round(decimalNumber));
        String inputBuffer = input.nextLine();
        System.out.println();
        
         // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.print("Enter an integer: ");
        int integerNumber = input.nextInt();
        inputBuffer = input.nextLine();
        System.out.print("Enter a string: ");
        String UserString = input.nextLine();
        System.out.printf("You entered integer: %d\n", integerNumber);
        System.out.printf("You entered string: %s\n", UserString);
        System.out.println();
        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        double implicitDouble = integerNumber;
        System.out.printf("Implicit cast (int → double): %.1f\n", implicitDouble);
        System.out.printf("Explicit cast (double → int): %d\n", (int)decimalNumber);
        System.out.printf("Casting int to char (ASCII): %c\n", (char)integerNumber);
        
        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.print("Enter a character: ");
        char UserChar = input.nextLine().charAt(0);
        System.out.printf("ASCII value of '%c' is: %d \n", UserChar, (int)UserChar);
        
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        String str1 = "MyString";
        String str2 = "MyString";
        String str3 = new String("MyString");

        System.out.println();
        System.out.printf("str1 == str2: %b\n", str1 == str2);
        System.out.printf("str1 == str3: %b\n", str1 == str3);
        System.out.printf("str1.equals(str3): %b", str1.equals(str3));
        
        // Close the scanner object
        input.close();        

        
    }
}
