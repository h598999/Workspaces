package no.hvl.dat102.adt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.exceptions.EmptyCollectionException;

public abstract class OrdnetListeADTTest {

	/**
	 * Test av OrdnetListe med heltall.
	 * 
	 * @author Ole Olsen
	 */

	private OrdnetListeADT<Integer> liste;

	// Test data
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	private Integer e5 = 6;

	/**
	 * Opprett en tom liste for hver test.
	 * 
	 *
	 */

	protected abstract OrdnetListeADT<Integer> reset();

	@BeforeEach
	public final void setup() {
		liste = reset();
	}

	/**
	 * Tester om en ny liste er tom.
	 */
	@Test
	public final void nyListeErTom() {
		assertTrue(liste.erTom());
	}

	/**
	 * Tester leggTil og fjern.
	 */
	@Test
	public final void leggTilOgFjern() {
		liste.leggTil(e0);
		liste.leggTil(e1);
		liste.leggTil(e2);
		liste.leggTil(e3);
		liste.leggTil(e4);
		liste.leggTil(e5);
		assertEquals(e5, liste.fjern(e5));
		assertEquals(e4, liste.fjern(e4));
		assertEquals(e3, liste.fjern(e3));
		assertEquals(e2, liste.fjern(e2));
		assertEquals(e1, liste.fjern(e1));
		assertEquals(e0, liste.fjern(e0));
	}

	/**
	 * Tester ordning ikke-avtagende
	 * 
	 */
	@Test
	public final void viseOrdnetIkkeAvtagende() {
		// ... Fyll ut
		// ... Legg til elementer og bruk fjernFoerste
	}

	@Test
	public final void viseOrdnetIkkeStigende() { // 4 >= 5 >= 5 >= 5 >= 6 ...
		liste.leggTil(e1);
		liste.leggTil(e2);
		liste.leggTil(e5);
		liste.leggTil(e0);
		liste.leggTil(e4);
		liste.leggTil(e3);
		assertEquals(e5, liste.fjernSiste());
		assertEquals(e4, liste.fjernSiste());
		assertEquals(e3, liste.fjernSiste());
		assertEquals(e2, liste.fjernSiste());
		assertEquals(e1, liste.fjernSiste());
		assertEquals(e0, liste.fjernSiste());
	}

	/**
	 * Tester leggTil og fjern med like verdier.
	 */
	@Test
	public final void leggTilOgfjernMedDuplikater() {
		// ... Fyll ut med å legge til passende elementer

		assertEquals(e0, liste.fjern(e0));
		assertEquals(e1, liste.fjern(e1));
		assertEquals(e4, liste.fjern(e4));
		assertEquals(e1, liste.fjern(e1));
		assertEquals(e2, liste.fjern(e2));
		assertEquals(e3, liste.fjern(e3));

	}

	/**
	 * Tester leggTil og inneholder
	 */
	@Test
	public final void leggTilOgInnholder() {
		liste.leggTil(e2);
		liste.leggTil(e1);
		liste.leggTil(e4);
		liste.leggTil(e0);
		liste.leggTil(e3);

		assertTrue(liste.inneholder(e0));
		assertTrue(liste.inneholder(e1));
		assertTrue(liste.inneholder(e2));
		assertTrue(liste.inneholder(e3));
		assertTrue(liste.inneholder(e4));
		assertFalse(liste.inneholder(e5));

	}

	/**
	 * Tester om listen med verdier ikke er tom.
	 */
	@Test
	public final void erIkkeTom() {
		liste.leggTil(e1);
		liste.leggTil(e3);
		liste.leggTil(e2);
		liste.leggTil(e4);
		liste.leggTil(e5);
		assertFalse(liste.erTom());
	}

	/**
	 * Tester om leggTil-fjern på en tom liste gir en tom liste.
	 */
	@Test
	public final void leggTilFjernErTom() {
		// ...Fyll ut. Legg inn elementer og fjern de
	}

	/**
	 * Prøver å ta ut et element fra en tom liste.
	 * 
	 */
	@Test
	
	public void fjernFraTomListe() {	
		Assertions.assertThrows(EmptyCollectionException.class, () -> {
			liste.fjernFoerste();
		});
	}
	

}
