package InvokeValueWithKeyNotPrintingKey;

import java.util.HashMap;

/*
 * Basic HashMap example 
 * 
 */


public class HashingTest {

	public static void main(String[] args) {
		
		// initialization of our map
		HashMap<String, String> student = new HashMap<>();
		
		// adding elements to our hashmap
		student.put("age", "32");
		student.put("gender","male");
		student.put("name","Ryan");
		student.put("birthday","May 12, 1982");
		
		// getting the contents of our hashmap
		System.out.println("Name:"+student.get("name"));
		System.out.println("Name:"+student.get("age"));
		System.out.println("Name:"+student.get("gender"));
		System.out.println("Name:"+student.get("birthday"));
		
	}

}