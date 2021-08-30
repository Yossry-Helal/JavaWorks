package org;

import java.util.Scanner;

public class Main {
	double input1;
	double input2;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The first decimal number");
		double input1 = scanner.nextDouble();

		System.out.println("Enter the second decimal number here");
		double input2 = scanner.nextDouble();

		System.out.println("the sum of the two deceimal = " + (input1 + input2));
		System.out.println("the minus of the two deceimal = " + (input1 - input2));
		System.out.println("the multiply of the two deceimal = " + (input1 * input2));
		System.out.println("the divide of the two deceimal = " + (input1 / input2));
		System.out.println("the modules of the two deceimal = " + (input1 % input2));

	}

}
