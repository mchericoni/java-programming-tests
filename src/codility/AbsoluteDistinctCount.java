package codility;

import java.util.HashSet;
import java.util.Set;

public class AbsoluteDistinctCount {
	/**
	 * @param inputArray
	 *            assume that the array is sorted in ascending order
	 * 
	 * @return count the number of elements in an array a which are absolute
	 *         distinct
	 */
	// TODO Consider that the array is sorted in ascending order
	public static int absDistinctCount(int[] inputArray) {
		if (inputArray == null)
			return -1;
		int length = inputArray.length;
		if (length == 0)
			return -1; // or zero
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < length; i++) {
			int value = Math.abs(inputArray[i]);
			if (!set.contains(Integer.valueOf(value)))
				set.add(Integer.valueOf(value));
		}
		return set.size();
	}

	public static int countDistinctUsingSet(int[] nums) {
		Set<Integer> s = new HashSet<Integer>();
		for (int n : nums)
			s.add(Math.abs(n));
		int count = s.size();
		return count;
	}

}
