package com.misc.common;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrimitiveFlatMapToInt {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5, 6};
		
		Stream<int[]> streamArray = Stream.of(intArray);
		
		IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
		
		intStream.forEach(x -> System.out.println(x));
	}
}
