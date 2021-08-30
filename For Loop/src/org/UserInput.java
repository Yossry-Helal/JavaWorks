package org;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first Name: ");
		String str1 = scanner.nextLine();

		System.out.println("Enter your last Name: ");
		String str2 = scanner.nextLine();

		System.out.println("Hello " + str1 +" "+ str2);

	}

}
