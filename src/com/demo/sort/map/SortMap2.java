package com.demo.sort.map;

import java.util.HashMap;

public class SortMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String > hmap = new HashMap<Integer, String >();
		hmap.put(10, "Karan");
		hmap.put(20, "Akshay");
		hmap.put(60, "Rohan");
		hmap.put(90, "Mangesh");
		hmap.put(80, "Yogesh");
		hmap.put(50, "Sam");
		
		System.out.println("Before Sorting HashMap");
		hmap.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));

		//Sort HashMap key in Ascending Order
        System.out.println("After sorting hashmap value in ascending order");
		hmap.
		entrySet().
		stream().
		sorted((p1,p2)->p1.getValue().compareTo(p2.getValue())).
		forEach(v->System.out.println("Key: "+v.getKey()+ " Value: "+v.getValue()));
		
		//Sort HashMap key in Descending Order
        System.out.println("After sorting hashmap value in descending order");
		hmap.
		entrySet().
		stream().
		sorted((p1,p2)->p2.getValue().compareTo(p1.getValue())).
		forEach(v->System.out.println("Key: "+v.getKey()+ " Value: "+v.getValue()));
		
		
	}
}
