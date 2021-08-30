package org;

public class TestArray {

	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };

		// To print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + "");

		}
		// Summing of all arrays
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
			

		}
		System.out.print("The Sum of all the arrays is " + total);
	}

}
