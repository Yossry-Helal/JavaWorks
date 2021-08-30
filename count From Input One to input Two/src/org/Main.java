package org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);

		System.out.print("Please Enter the first number ");
		int n1 = ui.nextInt();

		System.out.print("Please Enter the second Number");
		int n2 = ui.nextInt();
		
		for(int x=n1;x<=n2;++x){
			System.out.println(x);
		}

	}

}
