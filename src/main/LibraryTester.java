package main;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LibraryTester {
	
	int[] arrAscending, arrDescending;
	
	@Before
	public void setUp() throws Exception {
		arrAscending = new int[] {1, 2, 3, 4, 5};
		arrDescending = new int[] {5, 4, 3, 2, 1};
	}

	@Test
	public void computeOneWithValidInput() {
		assertEquals(1, Library.computeOne());
	}
	
	@Test
	public void isItTrueWithValidInput() {
		assertTrue(Library.isItTrue());
	}
	
	@Test
	public void sortDescendingOrder() {
		assertArrayEquals(arrAscending, Library.sort(arrDescending));
	}
	
	@Test
	public void sortAscendingOrder() {
		assertArrayEquals(arrAscending, Library.sort(arrAscending));
	}

	@Test
	public void isEvenNumReturnTrue() {
		assertTrue(Library.isEvenNumber(2));
	}	
	
}