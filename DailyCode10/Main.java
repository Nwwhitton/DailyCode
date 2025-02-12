import java.util.Scanner; 
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		defaultValues();
		fillValues();
		AllOneLine();
		MultiplesOf3();
		charArrayMethod();
		RandomUserArray();
	}
	public static void defaultValues() {
	   int[] defArray = new int[5];
	   System.out.println("Showing the default values when creating an array with a size of 5.");
	   System.out.println("Element 0 is: " + defArray[0]);
	   System.out.println("Element 1 is: " + defArray[1]);
	   System.out.println("Element 2 is: " + defArray[2]);
	   System.out.println("Element 3 is: " + defArray[3]);
	   System.out.println("Element 4 is: " + defArray[4]);
	   System.out.println();

	}
	public static void fillValues() {
	   int[] defVals = new int[5];
	   defVals[0] = 21;
	   defVals[1] = 12;
	   defVals[2] = 22;
       defVals[3] = 11;
	   defVals[4] = 2;

	   System.out.println("Showing the values when creating an array with a size of 5 and assigning elements of the array to different numbers.");
	   System.out.println("Element 0 is: " + defVals[0]);
	   System.out.println("Element 1 is: " + defVals[1]);
	   System.out.println("Element 2 is: " + defVals[2]);
	   System.out.println("Element 3 is: " + defVals[3]);
	   System.out.println("Element 4 is: " + defVals[4]);
	   System.out.println();

	}
	public static void AllOneLine() {
	   int[] AllArray = {21, 12, 22, 11, 2};
	   System.out.println("Printing the values when creating an array with a size of 5 in one line.");
	   System.out.println("Element 0 is: " + AllArray[0]);
	   System.out.println("Element 1 is: " + AllArray[1]);
	   System.out.println("Element 2 is: " + AllArray[2]);
	   System.out.println("Element 3 is: " + AllArray[3]);
	   System.out.println("Element 4 is: " + AllArray[4]);
	   System.out.println();
	}
	public static void MultiplesOf3() {
	    int[] numbers = new int[5];
	    System.out.println("Assigning the values when creating an array, with multiples of 3.");
	    for (int i=1; i<6; i++) {
	        numbers[i-1] = i*3;
	        System.out.println("Element " + (i-1) + " is: " + numbers[i-1]);
	    }
	    System.out.println();
	}
	public static void charArrayMethod() {
	    char[] charArray = new char[5];
	    System.out.println("Assigning the values when creating an array, with the character + 2 each time starting with A.");

	    for (int i = 0; i<5; i++){
	        charArray[i] = (char)('A' + i*2);
	        System.out.println("Element " + (i) + " is: " + charArray[i]);
	    }
	    System.out.println();
	}
	public static void RandomUserArray() {
	    Scanner input = new Scanner(System.in); 
	    Random randNum = new Random();
	    System.out.print("Enter an array size and it'll make an array the size of the number you put in and fill it with random numbers: ");
	    int x = input.nextInt();
	    
	    int[] RandArray = new int[x];
	    for (int i = 0; i<x; i++) {
	        RandArray[i] = randNum.nextInt(101);
	        System.out.println("Element " + (i) + " is: " + RandArray[i]);
	    }
	}
}
