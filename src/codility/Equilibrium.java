package codility;

/**
 * Equilibrium index of a sequence is an index such that the sum of elements at
 * lower indexes is equal to the sum of elements at higher indexes.
 */
public class Equilibrium {

	public static int equi(int[] inputArray) {
		if (inputArray == null)
			return -1;
		int length = inputArray.length;
		if (length == 0)
			return -1;
		if (length == 1)
			return 0;

		int sumHigher = sumValues(inputArray, length);
		int sumLower = 0;
		int previousValue = 0;
		for (int i = 0; i < length; i++) {
			sumLower += previousValue;
			previousValue = inputArray[i];

			sumHigher -= inputArray[i];

			if (sumLower == sumHigher)
				return i;
		}
		return -1;
	}

	private static int sumValues(int[] inputArray, int length) {
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += inputArray[i];
		}
		return sum;
	}
}
