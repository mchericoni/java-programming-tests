package codility;

public class PairSumEvenCount {

	// TODO Find a better implementation, not O(n^2)
	public static int countPairs(int[] inputArray) {
		if (inputArray == null)
			return 0;
		int length = inputArray.length;
		if (length == 0)
			return 0;

		int counter = 0;
		for (int i = 0; i < length; i++) {
			int firstValue = inputArray[i];
			for (int j = 0; j < i; j++) {
				int secondValue = inputArray[j];
				if ((firstValue + secondValue) % 2 == 0)
					counter++;
			}
		}
		return counter;
	}
}
