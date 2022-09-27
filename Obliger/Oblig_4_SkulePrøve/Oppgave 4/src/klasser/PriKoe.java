package klasser;

import ADT.PriKoeADT;

public class PriKoe<T extends Comparable<T>> implements PriKoeADT<T> {
	// Implementerer prioritetsk� vha en haug
	// Prioritet er det vi tester p� i compareTo-metoden
	// Objekt med like prioritetsverdier kan bli
	// tatt ut i vilk�rlig rekkef�lge
	//
	private TabellHaug<T> koe;
	public PriKoe() {
	koe = new TabellHaug<T>();
	}
	@Override
	public void settInn(T el) {
	koe.leggTilElement(el);
	}
	@Override
	public T neste() {
	return koe.finnMinste();
	}
	@Override
	public T fjern() {
	return koe.fjernMinste();
	}
	@Override
	public boolean erTom() {
	return koe.erTom();
	}
	@Override
	public int antall() {
	return koe.antall();
	}
}