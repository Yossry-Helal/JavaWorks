package org;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class firstMLambda {

	public static void main(String[] args) {

		// supplier
		Supplier<String> supplier = ()-> //to add a second line I have to add the two lines between 
			//{};
		  {System.out.println("I am inside the Console");
			return "Hello!";
		};

		String string = supplier.get();
		System.out.println("String = " + string);

		// Consumer
		Consumer<String> consumer = (String s) -> 
			{System.out.println("I am inside the Console"); // here is another two lines between curley braces
			System.out.println(s);
		};

		consumer.accept("Hello");

	}
}
