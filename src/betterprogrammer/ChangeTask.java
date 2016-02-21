package betterprogrammer;

public class ChangeTask {
	public static Change getCorrectChange(int cents) {
		/*
		 * Please implement this method to take cents as a parameter and return
		 * an equal amount in dollars and coins using the minimum number of
		 * coins possible. For example: 164 cents = 1 dollar, 2 quarters, 1 dime
		 * and 4 cents. Return null if the parameter is negative.
		 */
		if (cents < 0)
			return null;

		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;

		while (cents - 100 >= 0) {
			dollars++;
			cents -= 100;
		}

		while (cents - 25 >= 0) {
			quarters++;
			cents -= 25;
		}

		while (cents - 10 >= 0) {
			dimes++;
			cents -= 10;
		}

		while (cents - 5 >= 0) {
			nickels++;
			cents -= 5;
		}

		return new Change(dollars, quarters, dimes, nickels, cents);
	}

	// Please do not change this class
	static class Change {
		private final int _dollars;
		private final int _quarters; // 25 cents
		private final int _dimes; // 10 cents
		private final int _nickels; // 5 cents
		private final int _cents; // 1 cent

		public Change(int dollars, int quarters, int dimes, int nickels,
				int cents) {
			_dollars = dollars;
			_quarters = quarters;
			_dimes = dimes;
			_nickels = nickels;
			_cents = cents;
		}

		public int getDollars() {
			return _dollars;
		}

		public int getQuarters() {
			return _quarters;
		}

		public int getDimes() {
			return _dimes;
		}

		public int getNickels() {
			return _nickels;
		}

		public int getCents() {
			return _cents;
		}

		@Override
		public String toString() {
			return "$" + _dollars + " " + _quarters + " " + _dimes + " "
					+ _nickels + " " + _cents;
		}

	}
}
