package no.hvl.dat102.kjedet;

import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

public class KjedetBag<T> implements BagADT<T> {
	private int antall;
	private LinearNode<T> forste;

	public KjedetBag() {
		antall = 0;
		forste = null;
	}

	@Override
	public void leggTil(T el) {
		LinearNode<T> nynode = new LinearNode<T>(el);
		nynode.setNeste(forste);
		forste = nynode;
		antall++;

	}

	@Override
	public T fjern(T el) {
		T resultat = null;
		if (erTom())
			throw new EmptyCollectionException("bag");
		LinearNode<T> node = finnNode(el);
		if (node != null) {
			resultat = node.getElement();
			T forsteEl = forste.getElement();
			node.setElement(forsteEl);
			forste = forste.getNeste();
			antall--;

		}
		return resultat;
	}

	private LinearNode<T> finnNode(T el) {
		boolean funnet = false;
		LinearNode<T> node = null;
		LinearNode<T> aktuell = forste;
		for (int soek = 0; soek < antall && !funnet; soek++) {
			if (aktuell.getElement().equals(el)) {
				funnet = true;
				node = aktuell;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return node;
	}

	@Override
	public boolean inneholder(T el) {
		boolean funnet = false;
		LinearNode<T> aktuell = forste;
		for (int soek = 0; soek < antall && !funnet; soek++) {
			if (aktuell.getElement().equals(el)) {
				funnet = true;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return funnet;
	}

	@Override
	public void nullstill() {
		while (!erTom()) {
			fjern();
		}
	}

	private void fjern() {
		if (forste != null) {
			forste = forste.getNeste(); // Fjerner forste node
			antall--;
		}

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
		T[] tabell = (T[]) new Object[antall];
		int i = 0;
		LinearNode<T> aktuell = forste;
		while (aktuell != null) {
			tabell[i] = aktuell.getElement();
			i++;
			aktuell = aktuell.getNeste();
		}
		return tabell;
	}

	public void skriv() {
		LinearNode<T> aktuell = forste;
		while (aktuell != null) {
			System.out.println(aktuell.getElement());
			aktuell = aktuell.getNeste();
		}
	}

	public void skrivnyBag() {
		T[] nyBag = tilTabell();
		for (T el : nyBag) {
			System.out.println(el);

		}

	}

}// class
