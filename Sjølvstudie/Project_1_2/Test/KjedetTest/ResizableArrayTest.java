package KjedetTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Kjedet.ResizableArrayBag;

public class ResizableArrayTest<T> {
	
	private ResizableArrayBag<Integer> bag  = new ResizableArrayBag<Integer>();
	private Integer e1 = 1;
	private Integer e2 = 2;
	private Integer e3 = 3;
	
	public ResizableArrayBag<Integer> reset() {
		return new ResizableArrayBag<Integer>();
	}
	
	@BeforeEach
	public void setup() {
		bag = reset();
	}
	
	/**
	 * Tests if the erTom works
	 */
	@Test
	public void isEmptyTest() {
		assertTrue(bag.isEmpty());
	}
	
	/**
	 * Test getCurrentSize
	 */
	@Test
	public void getCurrentSizeTest() {
		bag.add(e1);
		bag.add(e2);
		bag.add(e3);
		assertEquals(3, bag.getCurrentSize());
	}
	
	@Test
	public void addTest() {
		assertTrue(bag.add(e1));
		assertFalse(bag.add(e1));
		assertTrue(bag.contains(e1));
	}
	
	@Test
	public void removeTest() {
		bag.add(e1);
		assertTrue(bag.remove(e1));
		assertFalse(bag.remove(e1));
		assertFalse(bag.contains(e1));
		assertEquals(0,bag.getCurrentSize());
	}
	
	/**
	 * Tests the clear method
	 */
	@Test
	public void clearTest() {
		bag.add(e1);
		bag.add(e2);
		bag.add(e3);
		bag.clear();
		assertFalse(bag.contains(e1));
		assertFalse(bag.contains(e2));
		assertFalse(bag.contains(e3));
		assertTrue(bag.isEmpty());
	
	}
	
	/**
	 * Tests the toArrayMethod
	 */
	@Test
	public void toArrayTest() {
		bag.add(e1);
		bag.add(e2);
		bag.add(e3);
		Integer[] sekk = new Integer[3];
		sekk[0] = e1;
		sekk[1] = e2;
		sekk[2] = e3;
		assertEquals(bag.toArray(), sekk);
	}
	
	
	
	
	

}
