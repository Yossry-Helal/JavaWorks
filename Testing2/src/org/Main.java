package org;

import java.util.Scanner;

public class Main {
	String s1 = getInput("Enter a numeric value: ");
	String s2 = getInput("Enter a numeric value: ");
	String op = getInput("Choose an operation (+ - * /)");

	double result=0;

	try
	{
		switch (op) {
		case "+":
			result = addValues(s1, s2);
			break;
		case "-":
			result = substractValues(s1, s2);
			break;
		case "*":
			result = multiplyValues(s1, s2);
		case "/":
			result = divideValues(s1, s2);
			break;
		default:
			System.out.println("Unrecognized operation !");
			return;
		}
		System.out.println("The answer is " + result);

	}
	catch(Exception e){
	                  System.out.println("Number formating exception " + e.getMessage());
	}

}


private static double addValues(String s1,String s2) {
	double d1=Double.parseDouble(s1);
	double d2=Double.parseDouble(s2);
	return d1+d2;
	
}

private static double substractValues(String s1,String s2) {
	double d1=Double.parseDouble(s1);
	double d2=Double.parseDouble(s2);
	return d1-d2;
	
}

private static double multiplyValues(String s1,String s2) {
	double d1=Double.parseDouble(s1);
	double d2=Double.parseDouble(s2);
	return d1*d2;
	
}

private static double divideValues(String s1,String s2) {
	double d1=Double.parseDouble(s1);
	double d2=Double.parseDouble(s2);
	return d1/d2;
	
}

	public static void main(String[] args) {

		

	}

}

// Enter a numeric value:
//Enter a numeric value:

//Choose an Operation(+ - * /);

// Number formatting exception for input string : "x" if the user add wrong formating number

//get back the result