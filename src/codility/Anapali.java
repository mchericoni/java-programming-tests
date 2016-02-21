package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anapali {
	/**
	 * Check whether a string is an anagram of a palindrome.
	 * 
	 * TODO This implementation checks if a string is an anagram of another, but
	 * it doesn't take into consideration the fact that one is a palindrome.
	 */
	public static boolean check(String aString, String palindrome) {
		if ((aString == null) || (palindrome == null)
				|| (aString.length() != palindrome.length()))
			return false;

		char[] arr1 = aString.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = palindrome.toCharArray();
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	public static boolean check2(String aString, String palindrome) {
		if ((aString == null) || (palindrome == null)
				|| (aString.length() != palindrome.length()))
			return false;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < aString.length(); i++) {
			Character aChar;
			Integer counter;

			aChar = new Character(aString.charAt(i));
			if (map.containsKey(aChar)) {
				counter = map.get(aChar) + 1;
			} else
				counter = 1;
			map.put(aChar, counter);

			aChar = new Character(palindrome.charAt(i));
			if (map.containsKey(aChar)) {
				counter = map.get(aChar) + 1;
			} else
				counter = 1;
			map.put(aChar, counter);
		}

		// Dump map
		Iterator<Character> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			Character c = keys.next();
			System.out.println(c + " " + map.get(c));
		}

		// Verify results collected in map
		System.out.println("-----");
		boolean twoFound = false;
		Iterator<Integer> it = map.values().iterator();
		while (it.hasNext()) {
			Integer cnt = it.next();
			if (cnt % 2 != 0)
				return false;
			if (cnt == 2) {
				if (twoFound)
					return false;
				twoFound = true;
			}
		}
		return true;
	}
}
