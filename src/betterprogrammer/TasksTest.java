package betterprogrammer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import betterprogrammer.console.Dumper;

public class TasksTest {

	@Test
	public void testGetPerfectNumbers() {
		List<Integer> list = Tasks.getPerfectNumbers(0, 8);
		Dumper.dumpArray(list.toArray());
		list = Tasks.getPerfectNumbers(10, 30);
		Dumper.dumpArray(list.toArray());
	}

	@Test
	public void testIsPerfectNumber() {
		assertTrue(Tasks.isPerfectNumber(6));
		assertTrue(Tasks.isPerfectNumber(28));
		assertFalse(Tasks.isPerfectNumber(5));
	}

	@Test
	public void testRemoveDuplicates() {
		int[] result = Tasks.removeDuplicates((new int[] { 2, 1, 2, 3 }));
		assertTrue(result.length == 3);
		Dumper.dumpArray(result);
	}

	@Test
	public void testGetIntersection() {
		Set<Object> a = new HashSet<Object>(Arrays.asList("a", "b", "c"));
		Set<Object> b = new HashSet<Object>(Arrays.asList("c", "d", "e"));
		Set result = Tasks.getIntersection(a, b);
		Dumper.dumpArray(result.toArray());
		assertTrue(result.size() == 1);
	}

	@Test
	public void testGetBinaryRepresentation() {
		assertEquals("101", Tasks.getBinaryRepresentation(5));
		assertEquals("111", Tasks.getBinaryRepresentation(7));
		assertEquals("1001", Tasks.getBinaryRepresentation(9));
	}

	@Test
	public void testRetainPositiveNumbers() {
		int[] result = Tasks
				.retainPositiveNumbers((new int[] { -2, 5, 1, -4, 3 }));
		Dumper.dumpArray(result);
		assertTrue(result.length == 3);
	}

	@Test
	public void testGetSumOfNumbers() {
		assertEquals(22, Tasks.getSumOfNumbers("12 some text 3  7"));
	}

	@Test
	public void testSumOfTwoLargestElements() {
		assertEquals(9,
				Tasks.sumOfTwoLargestElements(new int[] { 1, 5, 0, 4, 3 }));
		assertEquals(9,
				Tasks.sumOfTwoLargestElements_2(new int[] { 1, 5, 0, 4, 3 }));
		assertEquals(15,
				Tasks.sumOfTwoLargestElements(new int[] { 7, 8, 0, 4, 3 }));
		assertEquals(15,
				Tasks.sumOfTwoLargestElements_2(new int[] { 7, 8, 0, 4, 3 }));
		assertEquals(17,
				Tasks.sumOfTwoLargestElements(new int[] { 8, 7, 9, 4, 3 }));
		assertEquals(17,
				Tasks.sumOfTwoLargestElements_2(new int[] { 8, 7, 9, 4, 3 }));
	}
}
