package com.set;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {

		Student student1 = new Student("ABC", "001", "III");
		Student student2 = new Student("ABC", "001", "III");

		System.out.println(student1.equals(student2));

		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(student1);
		studentSet.add(student2);

		HashSet<Object> objetSet = new HashSet<Object>();
		objetSet.add("abc");
		objetSet.add("abc");

		for (Object obj : objetSet) {
			System.out.println(obj.toString());
		}

		for (Student s : studentSet) {
			System.out.println("id= " + s.getId() + ", Name= " + s.getName() + ", Std= " + s.getStd());
		}

	}
}
