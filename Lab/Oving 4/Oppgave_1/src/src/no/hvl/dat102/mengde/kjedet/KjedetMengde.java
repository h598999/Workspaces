package src.no.hvl.dat102.mengde.kjedet;

//********************************************************************
// Kjedet implementasjon av en mengde. 
//********************************************************************
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

import src.no.hvl.dat102.exception.EmptyCollectionException;
import src.no.hvl.dat102.mengde.adt.MengdeADT;

public class KjedetMengde<T> implements MengdeADT<T> {
	private static Random rand = new Random();
	private int antall; // antall elementer i mengden
	private LinearNode<T> start;

	/**
	 * Oppretter en tom mengde.
	 */
	public KjedetMengde() {
		antall = 0;
		start = null;
	}//

	@Override
	public void leggTil(T element) {
		if (!(inneholder(element))) {
			LinearNode<T> node = new LinearNode<T>(element);
			node.setNeste(start);
			start = node;
			antall++;
		}
	}

	@Override
	public void leggTilAlle(MengdeADT<T> m2) {
		Iterator<T> teller = m2.oppramser();
		while (teller.hasNext()) {
			leggTil(teller.next());
		}
	}

	@Override
	public T fjernTilfeldig() {
		if (erTom())
			throw new EmptyCollectionException("mengde");

		LinearNode<T> forgjenger, aktuell;
		T resultat = null;

		int valg = rand.nextInt(antall) + 1;
		if (valg == 1) {
			resultat = start.getElement();
			start = start.getNeste();
		} else {
			forgjenger = start;
			for (int nr = 2; nr < valg; nr++) {
				forgjenger = forgjenger.getNeste();
			}
			aktuell = forgjenger.getNeste();
			resultat = aktuell.getElement();
			forgjenger.setNeste(aktuell.getNeste());
		}
		antall--;

		return resultat;

	}//

	@Override
	public T fjern(T element) {

		if (erTom())
			throw new EmptyCollectionException("mengde");

		boolean funnet = false;
		LinearNode<T> forgjenger, aktuell;
		T resultat = null;
		if (start.getElement().equals(element)) {// Sletter foran
			resultat = start.getElement();
			start = start.getNeste();
			antall--;
		} else {// Gjennomg�r den kjedete strukturen
			forgjenger = start;
			aktuell = start.getNeste();
			for (int sok = 2; sok <= antall && !funnet; sok++) {
				if (aktuell.getElement().equals(element))
					funnet = true;
				else {
					forgjenger = aktuell.getNeste();
				}
			}
			if (funnet) {
				resultat = aktuell.getElement();
				forgjenger.setNeste(aktuell.getNeste()); // Slette midt inni/bak
				antall--;
			}
		}
		return resultat;

	}//

	@Override
	public boolean inneholder(T element) {
		boolean funnet = false;
		LinearNode<T> aktuell = start;
		for (int soek = 0; soek < antall && !funnet; soek++) {
			if (aktuell.getElement().equals(element)) {
				funnet = true;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return funnet;
	}
	/*
	 * N�r vi overkj�rer (ovverride) equals- meteoden er det anbefalt at vi ogs�
	 * overkj�rer hashcode-metoden da en del biblioteker bruker hascode sammen med
	 * equals. Vi kommer tilbake til forklaring og bruk av hashcode senere i faget.
	 */

	@Override
	public int hashCode() {
		return Objects.hash(antall, start);
	}

	@Override
	public boolean equals(Object obj) {
		boolean lik = false;
		if (this == obj)
			lik = true;
		if (obj == null)
			lik =  false;
		if (obj.getClass()!=getClass())
			lik =  false;
		return lik;
	}

	@Override
	public boolean erTom() {
		return antall == 0;
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public MengdeADT<T> union(MengdeADT<T> m2) {
		// TODO
		MengdeADT<T> union = new KjedetMengde<T>();
		LinearNode<T> aktuell = start;

		while (aktuell!=null) {
			((KjedetMengde<T>) union).settInn(aktuell.getElement());
			aktuell = aktuell.getNeste();
		}
		Iterator<T> teller = m2.oppramser();
		
		while(teller.hasNext()) {
			T element = teller.next();
			//test p� om element i m2 ikke fins i m1(this)
			//m1 er den samme hele tiden
			if (!this.inneholder(element))
				((KjedetMengde<T>)union).settInn(element);
		}

		return union;
	}//

	@Override
	public MengdeADT<T> snitt(MengdeADT<T> m2) {
		// TODO
		MengdeADT<T> snittmengde = new KjedetMengde<T>();
		Iterator<T> iterator = m2.oppramser();
		while (iterator.hasNext()) {
			T element = iterator.next();
			if (this.inneholder(element)) {
				((KjedetMengde<T>) snittmengde).settInn(element);
			}
		}
		return snittmengde;
	}

	@Override
	public MengdeADT<T> differens(MengdeADT<T> m2) {
		// TODO
		MengdeADT<T> differensM = new KjedetMengde<T>();
		Iterator<T> iterator = this.oppramser(); 
		while(iterator.hasNext()){
			T element = iterator.next();
			if (!m2.inneholder(element)) {
				((KjedetMengde<T>)differensM).settInn(element);
			}
				
		}
		return differensM;
	}

	@Override
	public boolean undermengde(MengdeADT<T> m2) {
		// TODO
		boolean erUnderMengde = true;
		Iterator<T> iterator = this.oppramser();
		while(iterator.hasNext()&&erUnderMengde) {
			if (!m2.inneholder(iterator.next())) {
				erUnderMengde = false;
		}
	}
		return erUnderMengde;
	}

	@Override
	public Iterator<T> oppramser() {
		return new KjedetIterator<T>(start);
	}
	
	public void skrivUt() {
		Iterator<T> iterator = this.oppramser();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private void settInn(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		nyNode.setNeste(start);
		start = nyNode;
		antall++;
	}
	
	public String toString() {
		String resultat = "";
		LinearNode<T> aktuell = start;
		while(aktuell!=null) {
			resultat += aktuell.getElement().toString() + "\t";
			aktuell = aktuell.getNeste();
		}
		return resultat;
	}


	

}// class
