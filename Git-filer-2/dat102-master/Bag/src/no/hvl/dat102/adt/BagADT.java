package no.hvl.dat102.adt;

import no.hvl.dat102.exceptions.EmptyCollectionException;

public interface BagADT<T> {

	/*
	 * Modifisert noe i forhold til boken
	 */
	/**
	 * Legger til et nytt element.
	 * 
	 * @param el er objektet som blir lagt til.
	 */
	public void leggTil(T el);

	/**
	 * Fjerner en forekomst av el hvis den eksisterer.
	 * 
	 * @param el er objektet som fjernes hvis det eksisterer
	 * @return el er elmentet som fjernes hvis det fins ellers null-referanse
	 * @exception EmptyCollectionException når samlingen er tom
	 */
	public T fjern(T el);

	/**
	 * Teller antall ganger el fins.
	 * 
	 * @param el er objektet som fins
	 * @return Antall ganger el fins i bag'en.
	 */
	// TODO public int hyppighet(T el);

	/**
	 * Undersøker om bag'en inneholder el.
	 * 
	 * @param el er objektet det søkes etter
	 * @return sann hvis bag'en inneholder el, ellers usann
	 */
	public boolean inneholder(T el);

	/**
	 * Fjerner all elementene i bag'en.
	 */

	public void nullstill();

	/**
	 * Gir antall elementer i bag'en.
	 * 
	 * @return antall elementer i bag'en
	 */

	public int antall();

	/**
	 * Undersøker om bag'en er tom
	 * 
	 * @return Sann hvis bag'en er tom, ellers usann.
	 */

	public boolean erTom();

	/**
	 * Gir en tabell av elementer i bag'en.
	 * 
	 * @return en tabell av elementene i bag'en
	 */

	public T[] tilTabell();

} //
