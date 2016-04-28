package com.misc.common;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "e"};
		
		//Arrays.stream
		System.out.println("Array Stream : ");
		Stream<String> stream1 = Arrays.stream(array);
		stream1.forEach(x -> System.out.println(x));

		//Stream.of
		System.out.println("Stream Of : ");
		Stream<String> stream2 = Stream.of(array);
		stream2.forEach(x -> System.out.println(x));
		
		
	}
}
