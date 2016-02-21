package betterprogrammer.console;

import java.util.Iterator;
import java.util.List;

public class Dumper {
	public static void dumpArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void dumpArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static <E> void dumpList(List<E> list) {
		Iterator<E> li = list.iterator();
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println();
	}

}
