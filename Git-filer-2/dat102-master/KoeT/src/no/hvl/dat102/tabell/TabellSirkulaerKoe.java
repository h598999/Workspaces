/**
 * 
 */
package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

/**
 * @author Ole Olsen
 * @param <T>
 * 
 */
public class TabellSirkulaerKoe<T> implements KoeADT<T> {

	private final static int STDK = 100;
	private int foran, bak;
	private T[] koe;

	public TabellSirkulaerKoe() {
		this(STDK);
	}

	public TabellSirkulaerKoe(int startKapasitet) {
		koe = ((T[]) (new Object[startKapasitet + 1]));
		foran = 0;
		bak = startKapasitet;
	}

	public void innKoe(T element) {
		if (foran == ((bak + 2) % koe.length))
			utvid();
		bak = (bak + 1) % koe.length;
		koe[bak] = element;

	}

	public T utKoe() {
		if (erTom())
			throw new EmptyCollectionException("koe");

		T resultat = koe[foran];
		koe[foran] = null;
		foran = (foran + 1) % koe.length;
		return resultat;
	}

	public T foerste() {
		if (erTom())
			throw new EmptyCollectionException("koe");

		T resultat = koe[foran];
		return resultat;
	}

	public boolean erTom() {
		return (foran == (bak + 1) % koe.length);
	}

	private void utvid() {
		T[] hjelpetabell = (T[]) (new Object[koe.length * 2]);
		int gmlLengde = koe.length;
		for (int i = 0; i < gmlLengde - 1; i++) {
			hjelpetabell[i] = koe[foran];
			foran = (foran + 1) % koe.length;
		}
		foran = 0;
		bak = gmlLengde - 2;
		koe = hjelpetabell;
	}
}// class
