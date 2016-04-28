package com.misc.common;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(null);
		integers.add(2);
		integers.add(2);
		integers.add(null);
		integers.add(null);
		System.out.println(integers);
		System.out.println("Size : "+integers.size());
		
		integers.add(2, 7);
		System.out.println(integers);
		
		integers.remove(1);
		System.out.println(integers);
	}
}
