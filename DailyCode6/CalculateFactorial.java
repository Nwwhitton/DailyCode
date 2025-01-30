
import java.util.Scanner;

class CalculateFactorial {
    static void factorial(long num) {
        long product = 1;
        long Samenum = num;
        if (num == 1){
            System.out.println(num);
        } else if (num == 0) {
            System.out.println(1);
        } else if (num > 20) {
            System.out.println("I'm not good at big numbers. :[");
        } else if (num < 0) {
            System.out.println("The factorial of " + Samenum + " is undefined.");
        } else {
            for (int i = 1; i < Samenum; i++) {
                product *= num;
                num -= 1;
            }
            System.out.println("The factorial of " + Samenum + " is " + product + ".");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int GetFactorialOf = input.nextInt();  
        factorial(GetFactorialOf);
    
    }
}
