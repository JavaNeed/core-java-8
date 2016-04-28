package com.misc.common;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
	public static void main(String[] args) {
		// (1) Join String by a delimiter
		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		System.out.println(sj.toString());
		
		// Join String by a delimiter and starting with a supplied prefix and 
		// ending with a supplied suffix.
		// CharSequence delimiter, CharSequence prefix, CharSequence suffix
		StringJoiner strjoi = new StringJoiner("/", "prefix-", "-suffix");
		strjoi.add("2016");
		strjoi.add("02");
		strjoi.add("26");
		System.out.println(strjoi.toString());
		
		
		// (2) Join String by a delimiter.
		// CharSequence delimiter, CharSequence... elements
		String result = String.join("-", "2015", "10", "31");
		System.out.println("Result : "+result);
		
		String result2 = String.join("-", "2015", "10", "31","Prateek", "Savani");
		System.out.println("Result-2  : "+result2);
		
		// Join a List by a delimiter.
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		String output = String.join(",", list);
		System.out.println("Output : "+output);
		
		// (3) Collectors.joining
		List<String> listStr = Arrays.asList("java", "python", "nodejs", "ruby");
		String res = listStr.stream().map(x -> x).collect(Collectors.joining("|"));
		System.out.println("New Result : "+res);
		
		
	}
}
