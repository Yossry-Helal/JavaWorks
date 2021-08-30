package org;

public class Main {

	public static void main(String[] args) {

		/*
		 * Electronics elct1 = new Electronics(12, "Tvs", 670.45, true); Electronics
		 * elct2 = new Electronics(5, "DVD's", 120.45, false);
		 * 
		 * 
		 * Apparel appr1 = new Apparel("Jeans", 12.50, 2.30, "new"); Apparel appr2 = new
		 * Apparel("Tshirts", 8.50, 0, "outlet");
		 * 
		 * System.out.println(elct1.printIt()); System.out.println(elct1.toString());
		 * System.out.println(elct2.toString());
		 * 
		 * System.out.println(appr1.printIt()); System.out.println(appr1.toString());
		 * System.out.println(appr2.toString());
		 */

		/*
		 * javaCourse course1 = new javaCourse(); course1.printName();
		 * course1.printWelcomeMesg();
		 */

		
		// after created nestedClass we have to take new object of the main class then of the nested class
		Apparel a1 = new Apparel("قميص", 25.0, 0.0, "new");
		Apparel.Shirt s = a1.new Shirt();
		s.printTag();
	}

}
