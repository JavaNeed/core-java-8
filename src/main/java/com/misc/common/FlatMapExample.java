package com.misc.common;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		// 1. Stream + String[] + flatMap
		// 1.1 The below example will print an empty result, because filter() has no 
		// idea how to filter a stream of String[].
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		// stream 
		Stream<String[]> temp = Arrays.stream(data);
		
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
		Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
        stream.forEach(System.out::println);
	}
}
