package com.misc.common;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveArrays {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 1. Arrays.stream -> IntStream
		System.out.println("Arrays Stream : ");
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));

        // 2. Stream.of -> Stream<int[]>
        System.out.println("Stream Of :");
        Stream<int[]> temp = Stream.of(intArray);

        // Can't print Stream<int[]> directly, convert / flat it to IntStream
        System.out.println("--------------");
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));
	}	
}
