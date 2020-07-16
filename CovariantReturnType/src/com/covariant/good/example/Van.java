package com.covariant.good.example;

public class Van extends Vehicle {

	// Covariant return type in action!!!
	public Van getInstance() {
		System.out.println(this);
		return this;
	}

	public void move() {
		System.out.println("Van is moving ...");
	}

}
