package AdtTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import src.no.hvl.dat102.mengde.adt.MengdeADT;

public abstract class MengdeADTtest {
	
	private MengdeADT<Integer> testmengde;
	private MengdeADT<Integer> testmengde1;
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	
	
	protected abstract MengdeADT<Integer> reset();
	
	@BeforeEach
	public  void setUp() {
		testmengde = reset();
		testmengde1 = reset();
	}
	
	@Test
	public void UnionTestFelles() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde.leggTil(e2);
		testmengde1.leggTil(e0);
		testmengde1.leggTil(e1);
		testmengde1.leggTil(e3);
		
		MengdeADT<Integer> unionmengde = testmengde.union(testmengde1);
		assertTrue(unionmengde.inneholder(e0));
		assertTrue(unionmengde.inneholder(e1));
		assertTrue(unionmengde.inneholder(e2));
		assertTrue(unionmengde.inneholder(e3));
		assertEquals(unionmengde.antall(), 4);
	}
	
	@Test
	public void snittTestFelles() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde.leggTil(e2);
		testmengde1.leggTil(e0);
		testmengde1.leggTil(e1);
		testmengde1.leggTil(e3);
		
		MengdeADT<Integer> snittmengde = testmengde.snitt(testmengde1);
		
		assertTrue(snittmengde.inneholder(e0));
		assertTrue(snittmengde.inneholder(e1));
		assertFalse(snittmengde.inneholder(e2));
		assertFalse(snittmengde.inneholder(e3));
		assertEquals(snittmengde.antall(), 2);
	}
	
	@Test
	public void differensTestFelles() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde.leggTil(e2);
		testmengde1.leggTil(e0);
		testmengde1.leggTil(e1);
		testmengde1.leggTil(e3);
		
		MengdeADT<Integer> differensmengde = testmengde.differens(testmengde1);
		
		assertFalse(differensmengde.inneholder(e3));
		assertFalse(differensmengde.inneholder(e0));
		assertFalse(differensmengde.inneholder(e1));
		assertTrue(differensmengde.inneholder(e2));
		assertEquals(differensmengde.antall(), 1);
	}
	@Test
	public void UnionTestDisjunkt() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde1.leggTil(e2);
		testmengde1.leggTil(e3);
		
		MengdeADT<Integer> unionmengde = testmengde.union(testmengde1);
		
		assertTrue(unionmengde.inneholder(e0));
		assertTrue(unionmengde.inneholder(e1));
		assertTrue(unionmengde.inneholder(e2));
		assertTrue(unionmengde.inneholder(e3));
		assertEquals(unionmengde.antall(), 4);
	}
	@Test
	public void SnittTestDisjunkt() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde1.leggTil(e2);
		testmengde1.leggTil(e3);
		
		MengdeADT<Integer> snittmengde = testmengde.snitt(testmengde1);
		
		assertFalse(snittmengde.inneholder(e0));
		assertFalse(snittmengde.inneholder(e1));
		assertFalse(snittmengde.inneholder(e2));
		assertFalse(snittmengde.inneholder(e3));
		assertEquals(snittmengde.antall(), 0);
	}
	@Test
	public void differensTestdisjunkt() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde1.leggTil(e2);
		testmengde1.leggTil(e3);
		
		MengdeADT<Integer> differensmengde = testmengde.differens(testmengde1);
		
		assertTrue(differensmengde.inneholder(e0));
		assertTrue(differensmengde.inneholder(e1));
		assertFalse(differensmengde.inneholder(e2));
		assertFalse(differensmengde.inneholder(e3));
		assertEquals(differensmengde.antall(), 2);
	}
	
	@Test
	public void erUnderMengde() {
		testmengde.leggTil(e0);
		testmengde.leggTil(e1);
		testmengde.leggTil(e3);
		testmengde1.leggTil(e0);
		testmengde1.leggTil(e3);
		
		assertTrue(testmengde1.undermengde(testmengde));
		assertFalse(testmengde.undermengde(testmengde1));
		
	}

}
