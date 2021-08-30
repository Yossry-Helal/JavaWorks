package org;

import java.util.Scanner;

public class Main {
	// take two numbers from the user then add both of them together
	// then multiply them

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second Number");
		int num2 = scanner.nextInt();

		int AdditionResult = num1 + num2;
		int Multiplication = num1 * num2;
		System.out.println("Addition Result : " + AdditionResult);
		System.out.println("Multiplication Result : " + Multiplication);

	}

}
