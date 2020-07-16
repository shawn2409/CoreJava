package com.map.method.signature.service;

public class Employee {

	private Integer id;
	private String name;

	public Employee() {
		
	}
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Practice [id=" + id + ", name=" + name + "]";
	}

}