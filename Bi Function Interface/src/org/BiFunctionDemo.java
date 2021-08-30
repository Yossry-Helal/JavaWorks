package org;

import java.util.function.BiFunction;
/*
 * public class BiFunctionDemo implements BiFunction<Integer, Integer, Integer>
 * {
 * 
 * @Override public Integer apply(Integer t, Integer u) { // TODO Auto-generated
 * method stub return (t + u); }
 * 
 * public static void main(String[] args) { BiFunction<Integer, Integer,
 * Integer> biFunction = new BiFunctionDemo();
 * System.out.println(biFunction.apply(10, 20));
 * System.out.println(biFunction.apply(100, 200));
 * 
 * }
 * 
 * }
 * 
 */

public class BiFunctionDemo {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return (t + u);
			}
		};
		System.out.println(biFunction.apply(10, 20));
		System.out.println(biFunction.apply(100, 200));

	}
}