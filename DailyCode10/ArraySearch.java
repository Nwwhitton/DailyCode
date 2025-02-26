// necessary imports go here
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class ArraySearch {

    public static void main(String[] args) {
        // TODO: Get array size from user using Scanner
        int arraySize;
        do {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a positive integer: ");
            arraySize = input.nextInt();
        } while (arraySize <= 0);
        // TODO: Validate input to ensure a positive integer for array size

        // TODO: Create an array of the specified size and fill with random numbers
        Random rand = new Random();
        int[] MyArray = new int[arraySize];
        for (int i = 0; i<MyArray.length; i++) {
            MyArray[i] = rand.nextInt(1000) + 1;
        }
        // TODO: Get target number from user using Scanner
        // TODO: Validate input to ensure a positive integer for the target number if found, -1 if not

        int targetNumber;
        do {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a positive integer: ");
            targetNumber = input.nextInt();
        } while (targetNumber <= 0);


        
        // Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();
        if (linearSearch(MyArray, targetNumber) == -1) {
            System.out.println("Integer " + targetNumber + " is not in the array.");
        } else {
            System.out.println("Integer " + targetNumber + " found at index " + linearSearch(MyArray, targetNumber));
        }
        

        // TODO: Implement linear search to find the index of the target number

        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");

        // Sort the array using built-in method of the Arrays class
        System.out.println("Sorting the array...");
        Arrays.sort(MyArray);
        // TODO: Sort the array as specified above

        // Binary Search
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();

        if (linearSearch(MyArray, targetNumber) == -1) {
            System.out.println("Integer " + targetNumber + " is not in the array.");
        } else {
            System.out.println("Integer " + targetNumber + " found at index " + binarySearch(MyArray, targetNumber));
        }

        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");

        // TODO: Display the result of the binary search (index or not found)

        // TODO: Display results specified in Display Output section
        
        if ((binaryEndTime - binaryStartTime) > (linearEndTime - linearStartTime)) {
            System.out.println("Binary Search took longer than Linear Search.");
        } else if ((binaryEndTime - binaryStartTime) < (linearEndTime - linearStartTime)) {
            System.out.println("Binary Search took less time than Linear Search.");
        } else {
            System.out.println("Binary Search took the same amount of time as Linear Search.");
        }
        
    }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
            }
        return -1;
    }
    public static int binarySearch(int[] list, int key) {
      int low = 0;
      int high = list.length - 1;
  
      while (high >= low) {
        int mid = (low + high) / 2;
        if (key < list[mid])
          high = mid - 1;
        else if (key == list[mid])
          return mid;
        else
          low = mid + 1;
      }
  
      return -low - 1; // Now high < low
    }
}
