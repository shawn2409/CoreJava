package com.map.method.signature.service;

import java.util.HashMap;
import java.util.Map;

public class Service {
	/*
	 * Employee e1 = new Employee(1, "shawn"); 
	 * Employee e2 = new Employee(2, "john");
	 */

	public Map<Integer, Employee> getEmployeeMap(Integer ii, Employee m2) {
		Map<Integer, Employee> m = new HashMap<Integer, Employee>();
		m.put(ii, m2);
		m.put(ii, m2);

		for (Map.Entry k : m.entrySet()) {
			Employee e3 = (Employee) k.getValue();

			System.out.println(k.getKey() + " " + e3.getId() + " " + e3.getName());
		}

		return m;

	}

}
