package com.shawn;

public class EqualHash {
	int amount;
	String currencyCode;

	public EqualHash(int amount, String currencyCode) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	public boolean equal(Object obj) {
		if(this==obj) {
		return true;
}if(!(obj instanceof EqualHash)) {
	
}
		return false;
	
	}
	
	
	
	public static void main(String[] args) {

		Object obj = null;
		
		
		EqualHash eh = new EqualHash(55, "USD");
		EqualHash expense = new EqualHash(55, "USD");
		eh=(EqualHash) obj;
		
		
		System.out.println(eh.hashCode());
		System.out.println(expense.hashCode());

		System.out.println(eh.equals(expense));

	}
}
