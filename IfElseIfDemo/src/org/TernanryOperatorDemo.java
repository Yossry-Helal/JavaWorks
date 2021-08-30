package org;

public class TernanryOperatorDemo {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result;
        //short handed code
		result = a < b ? a : b;
		
		
		// this is long way cod with the same result as the logic above
		if(a<b) {
			result=a;
			
		}else {
			result =b;
		}

		System.out.println(result);

	}

}
