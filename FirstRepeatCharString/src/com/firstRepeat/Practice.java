package com.firstRepeat;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static Character getFirstRepeatChar(String str) {

		char firstRepeat = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			firstRepeat = str.charAt(i);

			if (map.containsKey(firstRepeat)) {
				map.put(firstRepeat, map.get(firstRepeat) + 1);
			} else {
				map.put(firstRepeat, 1);
			}

		}

		for (int i = 0; i < str.length(); i++) {
			firstRepeat = str.charAt(i);
			if (map.get(firstRepeat) > 2) {
				break;
			}

		}
		return firstRepeat;
	}

	public static void main(String[] args) {
		System.out.println(getFirstRepeatChar("gsskgesf"));
	}

}
