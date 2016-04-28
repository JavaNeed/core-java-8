package com.misc.common;

import java.util.ArrayList;
import java.util.List;

public class ForEachAndList {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// Lambda
		items.forEach(itemList -> System.out.println(items));

		// Check for C
		items.forEach(item -> {
			if("C".equalsIgnoreCase(item)){
				System.out.println("The output : "+item);
			}
		});

		// method reference
		System.out.println("The output via method reference ::");
		items.forEach(System.out::println);
		
		// Steam and filter
		System.out.println("Stream and Filters");
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
}
