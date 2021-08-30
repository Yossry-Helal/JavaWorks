package org;

public class Main {

	public static void main(String[] args) {
		Course c1 = Course.Math;
		Course c2 = Course.Math;

		System.out.println(c2.compareTo(c1));
		System.out.println(c1.equals(c2));

		// System.out.println(c1.toString());
		// System.out.println(c1.ordinal());

	}

}
