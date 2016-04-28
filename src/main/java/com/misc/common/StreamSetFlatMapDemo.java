package com.misc.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetFlatMapDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("mkyong");
		s1.addBook("Java 8 in Action");
		s1.addBook("Spring Boot in Action");
		s1.addBook("Effective Java (2nd Edition)");

		Student s2 = new Student();
		s2.setName("zilap");
		s2.addBook("Learning Python, 5th Edition");
		s2.addBook("Effective Java (2nd Edition)");

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);

		List<String> collect = list.stream()
				.map(x -> x.getBook())
				.flatMap(x -> x.stream())
				.distinct()
				.collect(Collectors.toList());

		collect.forEach(x -> System.out.println(x));
	}
}
