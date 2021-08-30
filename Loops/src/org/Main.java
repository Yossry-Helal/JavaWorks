package org;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
		/*
		 * for (int i = 0; i < months.length; i++) { // in order
		 * System.out.println(months[i]); }
		 */
		
		
		
		/*
		 * for (int i = months.length - 1; i >= 0; i--) { // in reverse order
		 * System.out.println(months[i]);
		 * 
		 * }
		 */

		/*
		 * for (String month:months) { System.out.println(month); }
		 */
		
		/*
		 * int counter =0; while (counter<months.length) {
		 * System.out.println(months[counter]); counter++; }
		 */
		
		int counter=0;
		do {
			System.out.println(months[counter]);
			counter++;
		}while(counter<months.length);
		
		
		
	}

}
