import java.util.Iterator;

public class Main {
	
	/*
	 * the mayor has an array of integers from 1 to 10 find the sum of the Odd and
	 * Even numbers inside the curly braces then print the result
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSum = evenSum + arr[i]; // evenSum=0+2
			} else {
				oddSum = oddSum + arr[i]; // oddSum=1
			}
		}
		System.out.println("The sum of event numbers : " + evenSum);
		System.out.println("The sum of odd numbers : " + oddSum);

	}

}
