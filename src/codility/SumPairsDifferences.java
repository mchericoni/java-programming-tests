package codility;

/**
 * Given an array, find the sum of the absolute difference of every pair of
 * integers.
 * 
 * @author mchericoni
 * 
 */
public class SumPairsDifferences {

	public static int sumOfDifferences(int[] inputArray) {
		if (inputArray == null)
			return -1;
		int length = inputArray.length;
		if (length < 2)
			return -1; // at least 2 elements

		// brute force
		int runningTotal = 0;
		for (int i = 0; i < length; i++) {
			int currentValue = inputArray[i];
			for (int j = 0; j < i; j++) {
				runningTotal += currentValue - inputArray[j];
			}
		}
		return runningTotal;
	}

	// TODO Find a better implementation, not O(n^2)
	public static int sumOfDifferences_2(int[] inputArray) {
		if (inputArray == null)
			return -1;
		int length = inputArray.length;
		if (length < 2)
			return -1; // at least 2 elements

		int runningTotal = 0;
		for (int i = 0; i < length; i++) {
			int currentValue = inputArray[i];
			for (int j = 0; j < i; j++) {
				runningTotal += currentValue - inputArray[j];
			}
		}
		return runningTotal;
	}
}
