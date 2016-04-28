package com.misc.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();
		listDevs.sort((Developer d1, Developer d2) -> d1.getAge()-d2.getAge());
		listDevs.forEach((developer) -> System.out.println(developer));
		
		// sort by age
		System.out.println("-----------------------");
		listDevs.sort((d1, d2) -> d1.getAge()-d2.getAge());
		listDevs.forEach((developer) -> System.out.println(developer));
		
		// sort by name
		System.out.println("------------------------");
		listDevs.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
		listDevs.forEach((developer) -> System.out.println(developer));
		
		// sort by salary
		System.out.println("------------------------");
		listDevs.sort((Developer o1, Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));
		listDevs.forEach((developer) -> System.out.println(developer));
	}

	public static List<Developer> getDevelopers(){
		List<Developer> result = new ArrayList<>();
		
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;
	}
}
