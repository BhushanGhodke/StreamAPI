package com.demo.employee.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>(Arrays.asList(
				
				new Employee (1,"Akash",25000),
				new Employee (3,"Pritesh",40000),
				new Employee (5,"Ram",48000),
				new Employee (8,"Ramesh",34000),
				new Employee (2,"Sam",20000))
				);
		
		list .add(new Employee(10,"Tom",54000));
		list.add((new Employee (6,"Rohan",27000)));
		list.add((new Employee (7,"Akshay",39000)));
		
		System.out.println("List of Employee Before Convert to Map");
	     list.forEach(a->System.out.println(a));
		
		// List of Employee comvert to map 
		Map<Integer, String> map1= 
		list.
		stream().
		collect(Collectors.toMap(p->p.getEmployeeId(), p->p.getEmployeeName()));
	
		System.out.println("List of employee convert to map ");
		map1.forEach((k,v)->System.out.println("Employee Id: "+k+ " Employee Name :"+v) );
	
	 
		//List of Employee convert to map if salary greater than 30000
		Map<Integer, String> map2= 
		list.
		stream().
		filter(a->a.getSalary()>=30000).
		collect(Collectors.toMap(a->a.getEmployeeId(), a->a.getEmployeeName()));
	
		System.out.println("List of Employee to map whose salary grater than 30000");
		map2.forEach((k,v)->System.out.println("Employee Id: "+k+ " Employee Name: "+v));
		
		
		// List of Employee convert to map if Name="Akshay" or "Rohan"
		Map<Integer, String> map3=
		list.stream().filter(a->
		(a.getEmployeeName().equals("Akshay"))
		||
		(a.getEmployeeName().equals("Rohan"))
		).collect(Collectors.toMap(a->a.getEmployeeId(), a->a.getEmployeeName()));
		
		System.out.println("List of Employee to map if name =Akshay or Rohan");
		map3.forEach((k,v)->System.out.println("Employee Id: "+k+ " Employee Name: "+v));
		
		System.out.println("Stream Api Project");
	 
	
	
	}
}
