package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ordered Data");

		List<String> list = new ArrayList<>();
		list.add("California");
		list.add("Oregeon");
		list.add("Washington");

		System.out.println("toString() output");
		System.out.println(list);
		System.out.println(" ");

		// ------------------------------------------------

		System.out.println("ArrayList iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		System.out.println(" ");

		// -----------------------------------------------

		System.out.println("ArrayList ForEach");
		for (String value : list) {
			System.out.println(value);
		}
		System.out.println(" ");

		// -------------------------------------------------------

		System.out.println("Java 8 method refernces");
		list.forEach(System.out::println);
		System.out.println(" ");

		System.out.println("Unordered data");
		Map<String, String> map = new HashMap<String, String>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		System.out.println(" ");

		System.out.println("HashMap Iterator");
		Set<String> keys = map.keySet();
		Iterator<String> ierator1 = keys.iterator();
		while (ierator1.hasNext()) {
			String key = ierator1.next();
			System.out.println("The Capital Of " + key + "is " + map.get(key));
		}
		System.out.println(" ");

		System.out.println("HashMap forEach");
		for (String key: keys) {
			System.out.println("The Capital Of " + key + "is " + map.get(key));

		}
		System.out.println(" ");

	}

}
