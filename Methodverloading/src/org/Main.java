package org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str1 = getInput("Enter Value 1: ");
		String str2 = getInput("Enter Value 2: ");
		String str3 = getInput("Enter Value 3: ");

		double result = addValues(str1, str2);
		System.out.println("The answer is " + result);

		double result2 = addValues(str1, str2, str3);
		System.out.println("The answer for 3 values is  " + result);

		double result3 = addValues(str1, str2, str3, str1, str2, str3);
		System.out.println("The answer for many values is " + result3);

	}
	// ------------------------------------------
	// create first method called getInput from the user

	static String getInput(String prompt) {

		System.out.println(prompt);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();

	}
	// --------------------------------------------

	// create another method called addValues to count the two number entered by the
	// user

	static double addValues(String str1, String str2) {
		double d1 = Double.parseDouble(str1);
		double d2 = Double.parseDouble(str2);

		double result = d1 + d2;
		return result;
	}

	// --------------------------------------------------------------
	static double addValues(String str1, String str2, String str3) {
		double d1 = Double.parseDouble(str1);
		double d2 = Double.parseDouble(str2);
		double d3 = Double.parseDouble(str3);

		double result = d1 + d2 + d3;
		return result;
	}
	// ---------------------------------------------------------------

	static double addValues(String... values) {// the ... means the user can add as many values as they want
		double result = 0; //Declare a value of 0
		for (String value : values){// get name value from values 
			
			
//Declare a value double name d and will get the value from Double.parseDoublethen pass 
// in the value variable
			
			double d = Double.parseDouble(value); 
			result += d;  // add the value to the existing result

		}
		return result;  //return the result

	}
}
