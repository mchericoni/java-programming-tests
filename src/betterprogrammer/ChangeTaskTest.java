package betterprogrammer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import betterprogrammer.ChangeTask.Change;

public class ChangeTaskTest {

	@Test
	public void testGetCorrectChange() {
		Change change = ChangeTask.getCorrectChange(164);
		System.out.println(change);
		assertEquals(1, change.getDollars());

		change = ChangeTask.getCorrectChange(300);
		System.out.println(change);
		assertEquals(3, change.getDollars());
	}
}
