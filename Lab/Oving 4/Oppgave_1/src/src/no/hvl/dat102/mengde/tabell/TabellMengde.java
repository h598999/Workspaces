package src.no.hvl.dat102.mengde.tabell;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

import src.no.hvl.dat102.exception.EmptyCollectionException;
import src.no.hvl.dat102.mengde.adt.MengdeADT;


public class TabellMengde<T> implements MengdeADT<T> {
	// ADT-en Mengde implementert som tabell
	//
	private final static Random tilf = new Random();
	private final static int STDK = 100;
	private int antall;
	private T[] tab;

	public TabellMengde() {
		this(STDK);
	}

	@SuppressWarnings("unchecked")
	public TabellMengde(int start) {
		antall = 0;
		tab = (T[]) (new Object[start]);
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public boolean erTom() {
		return (antall == 0);
	}

	@Override
	public void leggTil(T element) {
		if (!inneholder(element)) {
			if (antall == tab.length) {
				utvidKapasitet();
			}
			tab[antall] = element;
			antall++;
		}
	}

	@SuppressWarnings("unchecked")
	private void utvidKapasitet() {
		T[] hjelpetabell = (T[]) (new Object[2 * tab.length]);
		for (int i = 0; i < tab.length; i++) {
			hjelpetabell[i] = tab[i];
		}
		tab = hjelpetabell;
	}

	@Override
	public T fjernTilfeldig() {
		if (erTom())
			throw new EmptyCollectionException("mengde");

		T svar = null;
		int indeks = tilf.nextInt(antall);
		svar = tab[indeks];
		tab[indeks] = tab[antall - 1];
		tab[antall-1]= null;
		antall--;

		return svar;
	}

	@Override
	public T fjern(T element) {
		//TODO
		// Søker etter og fjerner element. Returnerer null-ref ved ikke-funn

		if (erTom())
			throw new EmptyCollectionException("mengde");

		boolean funnet = false;
		T svar = null;
		for(int i = 0; (i < antall && !funnet);i++) {
			if(tab[i].equals(element)) {
				svar = tab[i];
				tab[i] = tab[antall-1];
				tab[antall-1] = null;
				antall--;
				funnet = true;
				
			}
		}
		return svar;
	}

	@Override
	public boolean inneholder(T element) {
		boolean funnet = false;
		for (int i = 0; (i < antall) && (!funnet); i++) {
			if (tab[i].equals(element)) {
				funnet = true;
			}
		}
		return (funnet);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(tab);
		result = prime * result + Objects.hash(antall);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object m2) {
		boolean erlik = true;
		try {
		TabellMengde<T> compare = (TabellMengde<T>) m2;
		return (this.antall()==compare.antall()&&compare.undermengde(this));
		}catch(ClassCastException e ) {
			System.out.println("kan ikke sammenligne da objektene er ulike");
		}
		return erlik;
	}

	@Override
	public void leggTilAlle(MengdeADT<T> m2) {
		Iterator<T> teller = m2.oppramser();
		while (teller.hasNext())
			leggTil(teller.next());
	}

	/*
	 * Denne versjonen av unionen er lite effektiv
	 * 
	 * @Override public MengdeADT<T> union(MengdeADT<T> m2) { TabellMengde<T> begge
	 * = new TabellMengde<T>(); for (int i = 0; i < antall; i++) {
	 * begge.leggTil(tab[i]); } Iterator<T> teller = m2.oppramser();
	 * 
	 * while (teller.hasNext()) { begge.leggTil(teller.next()); } return
	 * (MengdeADT<T>)begge; }
	 */
	
	@Override

	public MengdeADT<T> union(MengdeADT<T> m2) {
		MengdeADT<T> begge = new TabellMengde<T>();
		for (int i = 0; i<antall; i++) {
			((TabellMengde<T>) begge).settInn(tab[i]);
		}
		Iterator<T> iterator = m2.oppramser();
		while(iterator.hasNext()) {
			T element = iterator.next();
			if (!begge.inneholder(element))
				((TabellMengde<T>) begge).settInn(element);
		}
		
		
		return begge;
	}//

	@Override
	public MengdeADT<T> snitt(MengdeADT<T> m2) {
		MengdeADT<T> snittM = new TabellMengde<T>();
		Iterator<T> iterator = m2.oppramser();
		while (iterator.hasNext()) {
			T element = iterator.next();
			if (this.inneholder(element)) {
				((TabellMengde<T>) snittM).settInn(element);}
		}
		return snittM;
	}

	@Override
	public MengdeADT<T> differens(MengdeADT<T> m2) {
		//TODO
		MengdeADT<T> differensM = new TabellMengde<T>();
		Iterator<T> iterator = this.oppramser();
		while (iterator.hasNext()) {
			T element = iterator.next();
			if (!m2.inneholder(element)) {
				((TabellMengde<T>) differensM).settInn(element);
			}
		}
		return differensM;
	}

	@Override
	public boolean undermengde(MengdeADT<T> m2) {
		//TODO
		boolean erUnderMengde = true;
		Iterator<T> iterator = this.oppramser();
		while(iterator.hasNext()&&erUnderMengde) {
			if (!m2.inneholder(iterator.next())){
				erUnderMengde = false;
			}
		}
		return erUnderMengde;
	}
	@Override
	public Iterator<T> oppramser() {
		return new TabellIterator<T>(tab, antall);
	}

	private void settInn(T element) {
		if (antall == tab.length) {
			utvidKapasitet();
		}
		tab[antall] = element;
		antall++;
	}

	@Override
	public void skrivUt() {
		for (int i = 0; i<antall; i++) {
			System.out.println(tab[i].toString());
		}
		
	}
		
		public String toString() {
			String resultat = "";
			for (int i = 0; i<antall; i++) {
				resultat += tab[i].toString() + "\t";
			}
		return resultat;
		
	}

	


}// class
