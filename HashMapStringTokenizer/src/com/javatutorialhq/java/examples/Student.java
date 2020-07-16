package com.javatutorialhq.java.examples;

import java.util.StringTokenizer;

public class Student {
	String age;
	String birthday;
	String course;
	String gender;
	String studentid;

	public Student(String s) {

		/*
		 * Pattern is id|name|bday|age|course
		 */

		// initializer our tokenizer
		StringTokenizer st = new StringTokenizer(s, "|");
		// set the values
		this.setStudentid(st.nextToken());
		this.setName(st.nextToken());
		this.setBirthday(st.nextToken());
		this.setAge(st.nextToken());
		this.setCourse(st.nextToken());

	}

	public Student() {
		super();
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

}