package com.firstRepeat;

import java.util.HashSet;

public class FirstRepeatSet {

	static char firstRepeating(char str[]) {

		HashSet<Character> h = new HashSet<Character>();
		for (int i = 0; i < str.length; i++) {

			char c = str[i];

			if (h.contains(c))
				return c;
			else
				h.add(c);
		}

		return '\0';
	}

	public static void main(String[] args) {

		String str = "geeksofrgeeks";
		char[] arr = str.toCharArray();
		System.out.println(firstRepeating(arr));

	}

}
