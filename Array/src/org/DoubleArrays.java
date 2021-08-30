package org;

public class DoubleArrays {

	public static void main(String[] args) {
		String[][] cartoons = { { "Filnstons", "Fred", "Willma", "Pebbles", "Dino" }, { "Rubbles", "Barney", "Betty" },
				{ "jetsons", "George", "Jane" }, { "Scooby Doo Gang", "Scooby Doo", "Shaggy" } };

		for (int i = 0; i < cartoons.length; i++) {
			System.out.print(cartoons[i][0] + ";");

			for (int j = 1; j < cartoons[i].length; j++) {
				System.out.print(cartoons[i][j] + ";");

			}
		}
	}

}
