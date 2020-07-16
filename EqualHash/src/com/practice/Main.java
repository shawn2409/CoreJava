package com.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		// creating the Objects of Geek class.
		/*
		 * Student g1 = new Student("aa", 1); Student g2 = new Student("aa", 2);
		 */
		 Student e1 = new Student();
		 Student e2 = new Student();
	 
		 e1.setId(100);
	        e2.setId(100);
	 
	        //Prints 'true'
	        System.out.println(e1.equals(e2));
	 
	        Set<Student> employees = new HashSet<Student>();
	        employees.add(e1);
	        employees.add(e2);
	         
	        System.out.println(employees);  //Prints two objects
	    }
	
	
}
