package com.misc.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//http://www.mkyong.com/java8/java-8-convert-list-to-map/

public class ListToMap {
	public static void main(String[] args) {
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", new Date()));
		list.add(new Hosting(2, "linode.com", new Date()));
		list.add(new Hosting(3, "digitalocean.com", new Date()));

		//example 1
		Map<Integer, String> result1 = list.stream().collect(
				Collectors.toMap(Hosting::getId, Hosting::getName));

		System.out.println("Result 1 : " + result1);

		//example 2
		Map<Integer, String> result2 = list.stream().collect(
				Collectors.toMap(x -> x.getId(), x -> x.getName()));

		System.out.println("Result 2 : " + result2);
	}
}
