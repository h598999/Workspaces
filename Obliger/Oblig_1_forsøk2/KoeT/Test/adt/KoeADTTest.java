package adt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public abstract  class KoeADTTest{
	
	private KoeADT<Integer> Koe;
	
	//Testdata
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;

	protected abstract KoeADT<Integer> reset();
	
	/**
	 * Hent en ny Koe for hver test  
	 */
	
	@BeforeEach
	public void setup(){
		Koe = reset();
	}
	
	/**
	 * Tester at en ny stabel er tom
	 */
	@Test
	public void nyStabelErTom() {
		assertTrue(Koe.erTom());
	}
	
	/**
	 * Test på innKoe
	 */
	@Test
	public void innKoe() {
		Koe.innKoe(e1);
		assertEquals(e1,Koe.getBak());
		Koe.innKoe(e0);
		assertEquals(e0,Koe.getBak());
		Koe.innKoe(e2);
		assertEquals(Koe.foerste(), e1);
		assertEquals(Koe.getBak(), e2);
	}
	
	
	/**
	 * Tester utKoe
	 */
	@Test
	public void utKoe() {
		Koe.innKoe(e0);
		Koe.innKoe(e1);
		Koe.innKoe(e2);
		assertEquals(e0, Koe.foerste());
		Koe.utKoe();
		assertFalse(e0==Koe.foerste());
		assertTrue(e1==Koe.foerste());
		Koe.utKoe();
		assertTrue(e2==Koe.foerste());
		Koe.utKoe();
		assertTrue(Koe.erTom());
	}
	/**
	 * Tester getBak metoden
	 */
	@Test
	public void getBaktest() {
		Koe.innKoe(e0);
		Koe.innKoe(e1);
		assertEquals(e1,Koe.getBak());
	}
	@Test
	public void getFoersteTest() {
		Koe.innKoe(e0);
		Koe.innKoe(e1);
		assertEquals(e0,Koe.foerste());
		assertFalse(e1==Koe.foerste());
	}
				
	
}