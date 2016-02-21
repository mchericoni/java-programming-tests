package betterprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Tasks {

	public static int[] removeDuplicates(int[] a) {
		/*
		 * Please implement this method to remove all duplicates from the
		 * original array. Retain the order of the elements and always retain
		 * the first occurrence of the duplicate elements. For example,
		 * parameter: {2,1,2,3}, result: {2,1,3}
		 */

		List<Integer> items = new ArrayList<Integer>();

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i])) {
				// do nothing, it's a duplicate
			} else {
				set.add(a[i]);
				items.add(a[i]);
			}
		}
		int[] result = new int[items.size()];
		for (int i = 0; i < items.size(); i++)
			result[i] = (Integer) items.get(i);
		return result;
	}

	public static List<Integer> getPerfectNumbers(int from, int to) {
		/*
		 * Please implement this method to return a list of all perfect numbers
		 * in the given range inclusively. A perfect number is defined as a
		 * positive integer which is the sum of its positive divisors not
		 * including the number itself. For example: 6 is a perfect number
		 * because 6 = 1 + 2 + 3 (1, 2, 3 are divisors of 6) 28 is also a
		 * perfect number: 28 = 1 + 2 + 4 + 7 + 14
		 */
		List<Integer> list = new ArrayList<Integer>();
		for (int n = from; n <= to; n++) {
			if (isPerfectNumber(n))
				list.add(new Integer(n));
		}
		return list;
	}

	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		// TODO
		for (int divisor = 1; divisor < n; divisor++) {
			if (n % divisor == 0)
				sum += divisor;
		}

		return n == sum;
	}

	// Please do not change this interface
	public static interface Node {
		int getValue();

		List<Node> getChildren();
	}

	public static List<Node> traverseTreeInWidth(Node root) {
		/*
		 * Please implement this method to traverse the tree in width and return
		 * a list of all passed nodes.
		 * 
		 * The list should start with the root node, next it should contain all
		 * second-level nodes, then third-level nodes etc.
		 * 
		 * The method shall work optimally with large trees.
		 */

		// TODO
		return null;
	}

	public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
		/*
		 * Please implement this method to return a Set equal to the
		 * intersection of the parameter Sets The method should not change the
		 * content of the parameters.
		 */
		Set<Object> result = new HashSet<Object>();
		Iterator<Object> i = a.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (b.contains(o))
				result.add(o);
		}

		// No need to do the following
		/*
		 * Iterator<Object> i2 = b.iterator(); while (i2.hasNext()) { Object o =
		 * i2.next(); if (a.contains(o)) result.add(o); }
		 */
		return result;
	}

	public static Set<Object> getUniqueElements(Set<Object> a, Set<Object> b) {
		/*
		 * Please implement this method to return a set of elements that can be
		 * found only in set a or set b, but not in both Sets. The method should
		 * not change the content of the parameters.
		 */
		Set<Object> result = new HashSet<Object>();

		Iterator<Object> i = a.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (!b.contains(o))
				result.add(o);
		}
		i = b.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (!a.contains(o))
				result.add(o);
		}
		return result;
	}

	public static String getBinaryRepresentation(int n) {
		/*
		 * Please implement this method to return a String with the binary
		 * representation of any number n, where n >= 0. Example: "101" is a
		 * binary representation of 5
		 */
		String result = "";

		System.out.println("log base2 of " + n + " is " + Math.log(n)
				/ Math.log(2));
		double power = Math.floor((Math.log(n) / Math.log(2)));
		while (power >= 0) {
			if (n >= Math.pow(2, power)) {
				n -= Math.pow(2, power);
				result += "1";
			} else
				result += "0";
			power--;
		}
		return result;
	}

	public static int[] retainPositiveNumbers(int[] a) {
		/*
		 * Please implement this method to return a new array with only positive
		 * numbers from the given array. The elements in the resulting array
		 * shall be sorted in the ascending order.
		 */

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				list.add(a[i]);
		}
		int[] result = new int[list.size()];
		Iterator<Integer> it = list.iterator();
		int idx = 0;
		while (it.hasNext()) {
			result[idx] = it.next();
			idx++;
		}
		Arrays.sort(result);

		return result;
	}

	public static int getSumOfNumbers(String s) {
		/*
		 * Please implement this method to return the sum of all integers found
		 * in the parameter String. You can assume that integers are separated
		 * from other parts with one or more spaces (' ' symbol). For example,
		 * s="12 some text 3  7", result: 22 (12+3+7=22)
		 */
		if (s == null)
			return 0;
		int result = 0;
		StringTokenizer tokenizer = new StringTokenizer(s, " ");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (!token.equals(" ")) {
				try {
					int n = Integer.parseInt(token);
					result += n;
				} catch (NumberFormatException e) {
					// Not very nice
					System.err.println(e.getMessage());
				}
			}
		}
		return result;
	}

	public static int sumOfTwoLargestElements(int[] a) {
		/*
		 * Please implement this method to return the sum of the two largest
		 * numbers in a given array.
		 */
		int result = 0;
		if ((a != null) && (a.length > 1)) {
			Arrays.sort(a);
			result += a[a.length - 1] + a[a.length - 2];
		}
		return result;
	}

	public static int sumOfTwoLargestElements_2(int[] a) {
		/*
		 * Please implement this method to return the sum of the two largest
		 * numbers in a given array.
		 */
		/*
		 * A different implementation that doesn't require sorting the array.
		 */
		int first = 0, second = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > first)
				first = a[i];
			else if (a[i] > second)
				second = a[i];
		}
		return first + second;
	}
}