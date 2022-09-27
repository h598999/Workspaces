package no.hvl.dat102.kjedet;

import no.hvl.dat102.adt.DobbelKjedetOrdnetListeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

public class DobbelKjedetOrdnetListe<T extends Comparable<T>> implements DobbelKjedetOrdnetListeADT<T> {
	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;

	public DobbelKjedetOrdnetListe(T minVerdi, T maksVerdi) {
		foerste = new DobbelNode<>(minVerdi);
		siste = new DobbelNode<>(maksVerdi);
		foerste.setNeste(siste);
		siste.setForrige(foerste);
		antall = 2;
		
	}

	@Override
	public void leggTil(T el) {
		DobbelNode<T> nyNode = new DobbelNode<T>(el);
		DobbelNode<T> aktuell = foerste.getNeste();
		while ((el.compareTo(aktuell.getElement()) > 0)) {
			aktuell = aktuell.getNeste();
		}
		// Legg inn foran aktuell
		nyNode.setNeste(aktuell);
		nyNode.setForrige(aktuell.getForrige());
		aktuell.getForrige().setNeste(nyNode);
		aktuell.setForrige(nyNode);
		antall++;

	}

	public boolean fins(T element) {
		DobbelNode<T> fins = foerste.getNeste();
		boolean finnes = false;
		while(fins!=null&&!finnes&&fins!=siste) {
			if (fins.getElement()==element) {
				finnes = true;
			} else {
				fins = fins.getNeste();
			}
		}
		return finnes;
	}
	
	@Override
	public T fjern(T el) {
		T resultat = null;
		if (erTom())
			throw new EmptyCollectionException("dobbelkjedet ordnet liste er tom");
		DobbelNode<T> aktuell = finn(el);
		if (aktuell != null) {// returner og slett
			resultat = aktuell.getElement();
			aktuell.getForrige().setNeste(aktuell.getNeste());
			aktuell.getNeste().setForrige(aktuell.getForrige());

		}

		return resultat;

	}

	/*
	 * Returnerer referansen til noden hvis el fins, ellers returneres
	 * null-referansen
	 */
	private DobbelNode<T> finn(T el) {
		boolean funnet = false;
		DobbelNode<T> aktuell = foerste;
		while (aktuell!=null&&!funnet) {
			if (aktuell.getElement().equals(el)) {
				funnet = true;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		if (funnet) {
			return aktuell;
		} else {
			return null;
		}
		

	}

	@Override
	public boolean erTom() {
		return (foerste.getNeste()==siste);
	}

	@Override
	public int antall() {
		return antall;
	}

	public String toString() {
		String resultat = "";
		DobbelNode<T> aktuell = foerste.getNeste();
		while (aktuell != siste) {

			resultat = resultat + aktuell.getElement().toString();
			aktuell = aktuell.getNeste();
		}

		return resultat;
	}

	public String tilStrengBaklengs() {
		String resultat = "";
		DobbelNode<T> aktuell = siste.getForrige();
		while (aktuell != foerste) {

			resultat = resultat + aktuell.getElement().toString();
			aktuell = aktuell.getForrige();
		}

		return resultat;

	}

	@Override
	public void visListe() {
		int i = 0;
		DobbelNode<T> aktuell = foerste.getNeste();
		while(aktuell!=null&&aktuell!=siste) {
			System.out.println(aktuell.getElement().toString());
			if (i<antall-2)
				aktuell = aktuell.getNeste();
				i++;
				}
		
	}

}