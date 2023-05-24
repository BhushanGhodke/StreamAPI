package com.demo.sort.map;

import java.util.HashMap;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		hmap.put(10, 100);
		hmap.put(40, 400);
		hmap.put(20, 200);
		hmap.put(50, 500);
		hmap.put(90, 900);
		hmap.put(60, 600);

		System.out.println("Before Sorting HashMap");
		hmap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

		System.out.println("After Sorting HashMap in ascending order");
		hmap.
		entrySet().
		stream().
		sorted((p1, p2) -> p1.getKey().compareTo(p2.getKey())).
		forEach(k -> System.out.println("key: " + k.getKey() + " Value :" + k.getValue()));
	}
}
