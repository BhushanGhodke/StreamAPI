package com.demo.objectMapping.to.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductMain {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>(Arrays.asList(
				new Product(1,"Laptop",50000),
				new Product(3,"Mobile",25000),
				new Product(5,"TV",30000),
				new Product(2,"Shoes",5000)
				));
		
		list.add(new Product(4,"Cloths",7000 ));
		
		//Convert to Map
		Map<Integer,String > map=
		list.
		stream().
		collect(Collectors.toMap(p1->p1.getProductId(),p1->p1.getProductName()));
		
		//Print the map value
		map.forEach((k,v)->System.out.println("Product Id: "+k+ " Product Name: "+v));

	
	}
}
