package com.firstRepeat;

import java.util.HashMap;

public class FirstRepeatMap {

	public static char firstNonRepeatingChar(String word) {

		char c = 0;

		HashMap<Character, Integer> s = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			c = word.charAt(i);

			if (s.containsKey(c)) {
				s.put(c, s.get(c) + 1);
			} else {
				s.put(c, 1);
			}

		}

		for (int i = 0; i < word.length(); i++) {

			c = word.charAt(i);
			if (s.get(c) > 1) {
				break;

			}

		}
		return c;
	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingChar("geeksforgeeks"));

	}

}
