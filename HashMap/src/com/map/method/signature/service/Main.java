package com.map.method.signature.service;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Employee p1 = new Employee(1, "shawn");
		Employee p2 = new Employee(2, "john");

		Map<Integer, Employee> m = new HashMap<Integer, Employee>();
		m.put(1, p1);
		m.put(2, p2);
		m.putAll(m);
		

		Service s = new Service();

		s.getEmployeeMap(1, p1);
s.getEmployeeMap(2, p2);
		
		/*
		 * for (Map.Entry mk : m.entrySet()) {
		 * 
		 * Employee p3 = (Employee) mk.getValue();
		 * 
		 * System.out.println(mk.getKey() + " " + p3.getName() + " " + p3.getId());
		 * 
		 * 
		 * }
		 */
	}

}
