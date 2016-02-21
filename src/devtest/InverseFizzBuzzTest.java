package devtest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class InverseFizzBuzzTest {

	@Test
	public void test() {
		System.out.println(Arrays.asList(sequence(new String[] { "fizz" })));
		assertArrayEquals(new Integer[] { 3 }, sequence(new String[] { "fizz" }));
		assertArrayEquals(new Integer[] { 5 }, sequence(new String[] { "buzz" }));
		assertArrayEquals(new Integer[] { 9, 10 }, sequence(new String[] { "fizz", "buzz" }));
		assertArrayEquals(new Integer[] { 6, 7, 8, 9 }, sequence(new String[] { "fizz", "fizz" }));
		assertArrayEquals(new Integer[] { 5, 6 }, sequence(new String[] { "buzz", "fizz" }));
		assertNull(sequence(new String[] { "buzz", "buzz" }));
	}

	private Integer[] sequence(String[] args) {
		return new InverseFizzBuzz(args).sequence();
	}
}
