package org;

import java.util.Scanner;

/* A switch Statement examines a single value then compare it to multiple possibilities 
and you can control the flow of execution based on the two values match */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scanner.nextLine();

		//int monthNumber = Integer.parseInt(input);

		switch (input) {
		case "Jan":
			System.out.println("The Month is January");
			break;
		case "Feb":
			System.out.println("The Month is Febraury");
			break;
		case "Mar":
			System.out.println("The Month is March");
			break;
			default:
				System.out.println("Please Choose another Month ");
			
			

		}

	}

}
