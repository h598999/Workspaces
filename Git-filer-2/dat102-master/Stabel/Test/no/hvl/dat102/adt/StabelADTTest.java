package no.hvl.dat102.adt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import no.hvl.dat102.exception.EmptyCollectionException;
import no.hvl.dat102.adt.StabelADT;

/**
 * Test for StabelADT.
 * 
 * @author Ole Olsen
 */
public abstract class StabelADTTest {

	// Referanse til stabel
	private StabelADT<Integer> stabel;

	// Testdata
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;

	protected abstract StabelADT<Integer> reset();

	/**
	 * Hent en ny stabel for hver test.
	 * 
	 * @return
	 */
	@BeforeEach
	public void setup() {
		stabel = reset();
	}

	/**
	 * Test på at en ny stabel er tom.
	 */
	@Test
	public void nyStabelErTom() {
		assertTrue(stabel.erTom());
	}

	/**
	 * Test på push and pop.
	 */
	@Test
	public void pushOgPop() {

		stabel.push(e0);
		stabel.push(e1);
		stabel.push(e2);
		stabel.push(e3);

		try {
			assertEquals(e3, stabel.pop());
			assertEquals(e2, stabel.pop());
			assertEquals(e1, stabel.pop());
			assertEquals(e0, stabel.pop());
		} catch (EmptyCollectionException e) {
			fail("pop feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Test på push og pop med duplikate verdier.
	 */
	@Test
	public void pushOgPopMedDuplikater() {

		stabel.push(e0);
		stabel.push(e1);
		stabel.push(e1);
		stabel.push(e2);

		try {
			assertEquals(e2, stabel.pop());
			assertEquals(e1, stabel.pop());
			assertEquals(e1, stabel.pop());
			assertEquals(e0, stabel.pop());
		} catch (EmptyCollectionException e) {
			fail("pop feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Testing på peek.
	 */
	@Test
	public void pushPopPushPushPopPeek() {
		try {
			stabel.push(e2);
			stabel.pop();
			stabel.push(e3);
			stabel.push(e4);
			stabel.pop();
			assertEquals(e3, stabel.peek());

		} catch (EmptyCollectionException e) {
			fail("pop eller peek feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Test på at en stabel med noen elementer ikke er tom.
	 */
	@Test
	public final void erIkkeTom() {
		stabel.push(e0);
		stabel.push(e1);
		assertFalse(stabel.erTom());
	}

	/**
	 * Test på at en stabel med null elementer er tom.
	 */
	@Test
	public void pushPopErTom() {
		try {
			stabel.push(e0);
			stabel.pop();
			assertTrue(stabel.erTom());

		} catch (EmptyCollectionException e) {
			fail("push eller pop feilet uventet " + e.getMessage());
		}
	}

	
	/**
	 * Forsøk på pop av en tom stabel skal gi "underflow excepton" *
	 * 
	 * @throws EmptyCollectionException expected exception
	 */
	@Test
	public void popFromEmptyIsUnderflowed() {
		/*
		 * Assertions.assertThrows(EmptyCollectionException.class, new Executable() {
		 * 
		 * @Override public void execute() throws Throwable { stabel.pop(); } });
		 */

		Assertions.assertThrows(EmptyCollectionException.class, () -> {
			stabel.pop();
		});
	}
}
