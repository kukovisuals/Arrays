import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("Eneter count: \r");
		int count = sc.nextInt();
		
		int[] returnedArray = readIntegers(count);
		
		int returnMin = findMin(returnedArray);
		
		System.out.println("Min = "+ returnMin);
	}
	
	// return an int[] Array 
	public static int[] readIntegers(int count) {
		// create an array and initialize the elements 
		int[] array = new int[count];
		//read all the numbers from input 
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter number: \r");
			int number = sc.nextInt();
			sc.nextLine();
			array[i] = number;
		}
		return array;
	}
	
	// find the minimum number in the array
	public static int findMin(int[] array) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i < array.length; i++) {
			// element to compare 
			int value = array[i];
			if(value < min) {
				min = value;
			}
		}
		
		return min;
		
	}
	
}
