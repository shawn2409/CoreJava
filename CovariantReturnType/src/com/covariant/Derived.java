package com.covariant;

public class Derived extends Base {

	B fun() {

		System.out.println("Derived fun()");

		return new B();
	}

}
