package com;

import java.util.StringTokenizer;

public class StringToken {
public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("my name is shawn");
	
	System.out.println(st.nextToken());
	
	while (st.hasMoreElements()) {
		
		System.out.println(st.nextToken());
	}
	
}
}
