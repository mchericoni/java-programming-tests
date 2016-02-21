package devtest;

import java.util.LinkedList;

/**
 * See http://www.jasq.org/just-another-scala-quant/inverse-fizzbuzz
 * 
 * @author massimo
 */
public class InverseFizzBuzz {

	private String[] list;

	public InverseFizzBuzz(String[] list) {
		// Initialize the class
		this.list = list;
	}

	public Integer[] sequence() {
		Sequence seq = process(this.list);
		return (seq != null ? seq.toArray() : null);
	}

	public Sequence process(String[] args) {
		Sequence shortest = null;
		for (int i = 3; i <= 100; i++) {
			for (int j = i; j < 100; j++) {
				InverseFizzBuzz.Sequence seq = new InverseFizzBuzz.Sequence(i, j);
				if (shortest != null && seq.length() > shortest.length())
					continue; // already have a better solution
				if (seq.matches(args)) {
					if (shortest == null || shortest.length() > seq.length())
						shortest = seq; // found a solution
				}
			}
		}
		return shortest;
	}

	private String toFizzbuzz(int num) {
		return (num % 3 == 0 && num % 5 == 0) ? "fizzbuzz" : (num % 3 == 0) ? "fizz" : (num % 5 == 0) ? "buzz" : null;
	}

	/**
	 * Inner class representing a sequence of numbers between start and end
	 * (inclusive).
	 */
	public class Sequence {
		int start, end;

		public Sequence(int start, int end) {
			if (end < start)
				throw new IllegalArgumentException();
			this.start = start;
			this.end = end;
		}

		public int length() {
			return end - start + 1;
		}

		public Integer[] toArray() {
			Integer[] array = new Integer[this.length()];
			for (int i = 0; i < this.length(); i++) {
				array[i] = this.start + i;
			}
			return array;
		}

		/**
		 * Check if this sequence of numbers matches the fizz-buzz list.
		 */
		public boolean matches(String[] strings) {
			LinkedList<String> ll = new LinkedList<String>();
			for (String string : strings) {
				ll.add(string);
			}
			for (int i = this.start; i <= this.end; i++) {
				if (toFizzbuzz(i) == null)
					continue;
				if (ll.isEmpty())
					return false;
				if (toFizzbuzz(i).equals(ll.getFirst())) {
					ll.pop();
				} else
					return false;
			}

			return ll.isEmpty();
		}
	}
}
