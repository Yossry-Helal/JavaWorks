package org;

public class TestSrray5 {
	public static void main(String[] args) {

		// declare a string with initial size
		String[] schoolbag = new String[4];

		// add elements to the array
		schoolbag[0] = "Books";
		schoolbag[1] = "Pens";
		schoolbag[2] = "pencils";
		schoolbag[3] = "Notebooks";

		String[] schoolbag2 = { "Books", "Pens", "pencils", "Notebooks" };

		int size = schoolbag2.length;
		System.out.println("The Size Of Array Variable is "+ size);
		
		for (int i = 0; i < size; i++) {
			System.out.print("index [" +i+ "] = " + schoolbag2[i]);
			System.out.print("\n");
			
		}

	}
}
