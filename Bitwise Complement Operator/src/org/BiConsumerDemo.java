package org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//BiConsumer takes two arguments and return nothing

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		BiConsumer<Integer, Integer> Substraction = (a, b) -> System.out.println(a - b);
		BiConsumer<Integer, Integer> multiplication = (a, b) -> System.out.println(a * b);

		biConsumer.accept(10, 20);
		Substraction.accept(10, 20);
		multiplication.accept(10, 20);

	

	Map<Integer, String> map = new LinkedHashMap<>();
	map.put(1, "Java");
	map.put(2, "C++");
	map.put(3, "Rust");
	map.put(4, "JavaScript");
	map.put(5, "GO");
	
	map.forEach((k,v) -> {
	System.out.println(k);
	System.out.println(v);
	
	});
}
	}