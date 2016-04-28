package com.misc.common;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// http://www.mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/

public class CollectorsGroupingByExample {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("mkyong", "new york"),
				new Person("mkyong", "chicago"),
				new Person("mkyong", "new york"));

		Map<String, List<Person>> collect = 
				persons.stream().collect(Collectors.groupingBy(Person::getCity));
		System.out.println(collect);

		//multi-level reduction, toSet()
		//{chicago=[mkyong], new york=[mkyong]}
		Map<String, Set<String>> collect1 = 
				persons.stream().collect(Collectors.groupingBy(Person::getCity,
						Collectors.mapping(Person::getName, Collectors.toSet())));
		System.out.println(collect1);

		//multi-level reduction, toList()
		//{chicago=[mkyong], new york=[mkyong, mkyong]}
		Map<String, List<String>> collect2 = 
				persons.stream().collect(Collectors.groupingBy(Person::getCity,
						Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(collect2);
	}
}
