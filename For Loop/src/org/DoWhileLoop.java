package org;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = input.nextInt();

		} while (value != 5);
		System.out.println("Got5!");

	}

}
