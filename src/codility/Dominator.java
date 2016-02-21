package codility;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
	public static int getIndexFrom(int[] A) {
		if (A == null)
			return -1;
		int length = A.length;
		if (length == 0)
			return -1;
		double threshold = length / 2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			Integer value = new Integer(A[i]);
			System.out.println(value);
			Integer counter;
			if (map.containsKey(value)) {
				counter = map.get(value) + 1;
			} else
				counter = 1;
			if (counter > threshold) {
				// We found a dominator. The last position is i, but we have to
				// search again its first position
				for (int j = 0; j < length; j++) {
					if (value == A[j])
						return j;
				}
			}
			map.put(value, counter);
		}

		return -1;
	}
}
