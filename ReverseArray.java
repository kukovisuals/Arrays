import java.util.Arrays;
import java.util.Scanner;

public class ReverArray {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int[] array = {1, 5, 3, 7, 11, 9, 15};
		System.out.println("Array: " + Arrays.toString(array));
		
		reverse(array);
		
		System.out.println("Reversed array= " + Arrays.toString(array));
		
	}
	//write a method call reverse 
	public static void reverse(int[] array) {
		//maxIndex we can use
		int maxIndex = array.length -1;
		//half of the array
		int halfLength = array.length/2;
		// iterate through all the numbers start at the end 
		for(int i =0; i < halfLength; i++) {
			int temp = array[i];
			//swap the first element with the last 
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}
