package org;

public class Bank {

	public static void main(String[] args) {
		int dollars = 500;
		System.out.println("Dollars before reassigned " + dollars);
		dollars = 600;
		System.out.println("Dollars after reassigned " + dollars);

		final double $rate = 61.5;
		System.out.println("$ rate is Dollar " + $rate);
		//$rate = 65;

	}

}
