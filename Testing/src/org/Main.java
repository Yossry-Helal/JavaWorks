package org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter the Numric value : ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();

		System.out.println("Enter the Numeric value : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Chooce one of the operstions (+),(-),(*),(/)");
		String input = scanner.nextLine();
		int operation = Integer.parseInt(input);
		
		switch (operation) {
		case 1:
			System.out.println("+");
			break;
		case 2:
			System.out.println("-");
			break;
		case 3:
			System.out.println("*");
			break;
		case 4:
			System.out.println("/");
			default:
				System.out.println("Please Enter different opertion");
			
			

		}


	}

}
// Enter a numeric value:
//Enter a numeric value:

//Choose an Operation(+ - * /);

// Number formatting exception for input string : "x" if the user add wrong formating number

//get back the result