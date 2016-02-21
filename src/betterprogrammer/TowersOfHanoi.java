package betterprogrammer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import betterprogrammer.console.Dumper;

public class TowersOfHanoi {
	public static <E> List<String> transferFromAtoC(int n) {
		/*
		 * Towers Of Hanoi. There are three pegs: A, B and C. There are n disks.
		 * All disks are different in size. The disks are initially stacked on
		 * peg A so that they increase in size from the top to the bottom. The
		 * goal is to transfer the entire tower from the A peg to the C peg. One
		 * disk at a time can be moved from the top of a stack either to an
		 * empty peg or to a peg with a larger disk than itself on the top of
		 * its stack.
		 * 
		 * The method should return a sequence of disk moves, each move is a
		 * String with two letters (A, B or C) corresponding to the peg the disk
		 * moves from and the peg it moves to. For example, the move "AC" means
		 * that a top disk from peg A should be moved to peg C.
		 */

		/*
		 * Iterative Solution: Alternating between the smallest and the
		 * next-smallest disks, follow the steps for the appropriate case:
		 * 
		 * For an even number of disks:
		 * 
		 * make the legal move between pegs A and B
		 * 
		 * make the legal move between pegs A and C
		 * 
		 * make the legal move between pegs B and C
		 * 
		 * repeat until complete.
		 * 
		 * For an odd number of disks:
		 * 
		 * make the legal move between pegs A and C
		 * 
		 * make the legal move between pegs A and B
		 * 
		 * make the legal move between pegs B and C
		 * 
		 * repeat until complete.
		 */
		List<String> result = new ArrayList<String>();

		LinkedList<Integer> A = new LinkedList<Integer>(); // tower A
		LinkedList<Integer> B = new LinkedList<Integer>(); // tower B
		LinkedList<Integer> C = new LinkedList<Integer>(); // tower C

		List<LinkedList<Integer>> towers = new ArrayList<LinkedList<Integer>>();
		towers.add(A);
		towers.add(B);
		towers.add(C);

		for (int i = 0; i < n; i++) {
			A.add(n - i);
		}

		while ((!A.isEmpty()) || (!B.isEmpty())) {
			Dumper.dumpList(A);
			Dumper.dumpList(B);
			Dumper.dumpList(C);
			System.out.println("---");
			if (n % 2 == 0) {
				// Even number of disks
				move(towers, 0, 1, result);
				if (A.isEmpty() && B.isEmpty())
					break;
				move(towers, 0, 2, result);
				if (A.isEmpty() && B.isEmpty())
					break;
				move(towers, 1, 2, result);
			} else {
				// Odd number of disks
				move(towers, 0, 2, result);
				if (A.isEmpty() && B.isEmpty())
					break;
				move(towers, 0, 1, result);
				if (A.isEmpty() && B.isEmpty())
					break;
				move(towers, 1, 2, result);
			}
		}

		Dumper.dumpList(A);
		Dumper.dumpList(B);
		Dumper.dumpList(C);

		List<String> resultWithChars = new ArrayList<String>();
		Iterator<String> it = result.iterator();
		while (it.hasNext()) {
			resultWithChars.add(it.next().replaceAll("0", "A")
					.replaceAll("1", "B").replaceAll("2", "C"));
		}
		return resultWithChars;
	}

	private static void move(List<LinkedList<Integer>> towers, int start,
			int end, List<String> result) {
		if (!moveIfLegal(towers, start, end)) {
			moveIfLegal(towers, end, start);
			result.add(Integer.toString(end) + Integer.toString(start));
		} else
			result.add(Integer.toString(start) + Integer.toString(end));
	}

	private static boolean moveIfLegal(List<LinkedList<Integer>> towers,
			int start, int end) {
		Integer startElement = null;
		Integer endElement = null;
		if (!(towers.get(start)).isEmpty())
			startElement = (Integer) (towers.get(start)).getLast();
		if (startElement == null)
			return false;
		if (!(towers.get(end)).isEmpty())
			endElement = (Integer) (towers.get(end)).getLast();
		if ((endElement == null) || (startElement < endElement)) {
			(towers.get(start)).removeLast();
			(towers.get(end)).addLast(startElement);
			return true;
		} else
			return false;
	}
}
