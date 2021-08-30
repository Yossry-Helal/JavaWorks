package org;

public class Main {

	public static void main(String[] args) {
		int intValue1 = 56;
		int intValue2 = intValue1;
		System.out.println("The Second Value is " + intValue2);

		long longValue1 = intValue1;
		System.out.println("The long Value is " + intValue1);

		short shortValue1 = (short) intValue1;
		System.out.println("The Short Value is " + intValue1);

		int intValue3 = 1024;
		byte byteValue=(byte) intValue3;
		System.out.println("The Byte Value is " + byteValue);
		
		double doubleValue=3.9999999d;
		int intValue4=(int) doubleValue;
		System.out.println("The Short Value is " + intValue4);

	}

}
