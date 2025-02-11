import java.util.Scanner; 
public class AllInOne {
    public static int CalculateSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
    
    public static int GetMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    
    public static int GetMin(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    
    public static double GetAverage(int num1, int num2, int num3) {
        double average = CalculateSum(num1, num2, num3) / 3.0;
        return average;
    }
    
    public static boolean CheckAllPositive(int num1, int num2, int num3) {
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
    
    public static void PrintMethod(int num1, int num2, int num3) {
        System.out.println("Sum: " + CalculateSum(num1, num2, num3));
        System.out.println("Max: " + GetMax(num1, num2, num3));
        System.out.println("Min: " + GetMin(num1, num2, num3));
        System.out.println("Average: " + GetAverage(num1, num2, num3));
        System.out.println("All numbers are positive: " + CheckAllPositive(num1, num2, num3));
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + CalculateSum(num1, num2, num3) + ".");
        System.out.println();
    }
    
    public static void processNumbers(int num1, int num2, int num3) {
        PrintMethod(num1, num2, num3);
        
    }
    
    public static void ValidateAndGetUserInput() {
        while (true) {
            try {
                System.out.println("Type 3 valid integers first try, and I will display the sum, max, min, avg, and check if all are positive.");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter first number: ");
                int userNum1 = input.nextInt();
                System.out.print("Enter second number: ");
                int userNum2 = input.nextInt();
                System.out.print("Enter third number: ");
                int userNum3 = input.nextInt();
                processNumbers(userNum1, userNum2, userNum3);
                break;
            } catch(Exception e) {
                System.out.println("Not a valid integer.");
            }
        }
    }
    
    public static void main(String[] args) {
        ValidateAndGetUserInput();
        
    }
}
