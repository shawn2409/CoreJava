package com.covariant;

public class Main {

	public static void main(String[] args) {

		Base base = new Base();

		base.fun();

		Derived derived = new Derived();
		derived.fun();
	}
}
