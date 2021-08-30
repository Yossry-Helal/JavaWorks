package org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the First Decimal Number");
		double num1=scanner.nextDouble();
		
		System.out.println("Enter the Second Decimal Number");
		double num2=scanner.nextDouble();
		
		sum(num1,num2);
		minus(num1,num2);
		Multiply(num1,num2);
		modulus(num1,num2);
		divid(num1,num2);
		}

	private static void divid(double num1, double num2) {
		System.out.println("The divided number is " + (num1 / num2));

	}

	private static void modulus(double num1, double num2) {
		System.out.println("The modulus number is " + (num1 % num2));

	}

	private static void Multiply(double num1, double num2) {
		System.out.println("The Multiplynumber is " + (num1 * num2));

	}

	private static void minus(double num1, double num2) {
		System.out.println("The minus number is " + (num1 - num2));

	}

	private static void sum(double num1, double num2) {
		System.out.println("The sumnumber is " + (num1 + num2));
	}

}
