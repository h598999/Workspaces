package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

public class TabellBag<T> implements BagADT<T> {
	private static final int STDK = 100; // Standardkapasitet
	//private static final int IKKE_FUNNET = -1;
	private int antall;
	private T[] bag;

	public TabellBag() {
		this(STDK);
	}

	public TabellBag(int start) {
		antall = 0;
		bag = (T[]) (new Object[start]);
	}

	/**
	 * @return the antall
	 */
	public int getAntall() {
		return antall;
	}

	/**
	 * @return returnerer tabellen
	 */
	public T[] getBag() {
		return bag;
	}

	/**
	 * @param bag the bag to set
	 */
	public void setBag(T[] bag) {
		this.bag = bag;
	}

	public void leggTil(T el) {
		if (antall == bag.length) {
			utvidKapasitet();
		}
		bag[antall] = el;
		antall++;
	}

	private void utvidKapasitet() {
		T[] hjelpebag = (T[]) (new Object[2 * bag.length]);
		for (int i = 0; i < bag.length; i++) {
			hjelpebag[i] = bag[i];
		}
		bag = hjelpebag;
	}

	@Override
	public T fjern(T el) {
		if (erTom())
			throw new EmptyCollectionException("tom bag ");

		boolean funnet = false;
		T svar = null;

		for (int i = 0; (i < antall && !funnet); i++) {
			if (bag[i].equals(el)) {
				svar = bag[i];
				bag[i] = bag[antall - 1];
				bag[antall - 1] = null;
				antall--;
				funnet = true;
			}
		}
		return svar;

	}

	@Override
	public boolean inneholder(T el) {
		boolean funnet = false;
		for (int i = 0; (i < antall) && (!funnet); i++) {
			if (bag[i].equals(el)) {
				funnet = true;
			}
		}
		return (funnet);

	}

	@Override
	public void nullstill() {
		for (int i = 0; i < antall; i++) {
			bag[i] = null;
		}
		antall = 0;
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public boolean erTom() {
		return antall == 0;

	}

	@Override
	public T[] tilTabell() {
		T[] nyBag = (T[]) new Object[antall];
		for (int i = 0; i < antall; i++) {
			nyBag[i] = bag[i];
		}
		return nyBag;

	}

	public void skriv() {
		for (int i = 0; i < antall; i++) {
			System.out.println(bag[i]);

		}
	}

	public void skrivnyBag() {
		T[] nyBag = tilTabell();
		for (T el : nyBag) {
			System.out.println(el);

		}
	}

}
