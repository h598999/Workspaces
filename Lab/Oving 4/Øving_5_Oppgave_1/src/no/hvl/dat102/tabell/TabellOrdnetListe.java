package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.OrdnetListeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

public class TabellOrdnetListe<T extends Comparable<T>> implements OrdnetListeADT<T> {

	private final static int STDK = 100;
	private final static int IKKE_FUNNET = -1;
	private int bak;
	private T[] liste;

	public TabellOrdnetListe() {
		this(STDK);
	}

	@SuppressWarnings("unchecked")
	public TabellOrdnetListe(int startKapasitet) {
		bak = 0;
		liste = (T[]) (new Comparable[startKapasitet]);
	}

	@Override
	public T fjernSiste() {
		if (erTom())
			throw new EmptyCollectionException("ordnet liste");

		T resultat = siste();
		fjern(resultat);
		return resultat;
	}

	@Override
	public T fjernFoerste() {
		if (erTom())
			throw new EmptyCollectionException("ordnet liste");

		T resultat = foerste();
		fjern(resultat);
		return resultat;
	}

	@Override
	public T foerste() {
		if (erTom())
			throw new EmptyCollectionException("ordnet liste");

		T resultat = liste[0];
		return resultat;
	}

	@Override
	public T siste() {
		if (erTom())
			throw new EmptyCollectionException("ordnet liste");
		
		T resultat = liste[bak-1];
		

		return resultat;
	}

	@Override
	public boolean erTom() {
		return (bak == 0);
	}

	@Override
	public int antall() {
		return bak;
	}

	@Override
	public void leggTil(T element) {
		if (bak == liste.length-1) {
			utvid();
		}
		
		liste[bak] = element;
		bak++;
		utvalgssortering(liste,bak);
		
		
	}
		
	

	@Override
	public boolean inneholder(T element) {
		boolean funnet = false;
		int i = 0;
		while(i<bak&&!funnet) {
			if (liste[i].equals(element)) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	@Override
	public T fjern(T element) {
		int funnetindeks = -1;
		T slettet = null;
		if (inneholder(element)) {
		int i = 0;
		while(i<bak&&funnetindeks<0) {
			if (liste[i]==element) {
				slettet = liste[i];
				funnetindeks = i;
			} else {
				i++;
			}
		}
		if (funnetindeks==-1) {
			liste[bak] = null;
			return liste[bak];
		} else {
		
		for (int o = i; o<bak-1; o++) {
			
			liste[o] = liste[o+1];
			}}
		bak--;
	}
		return slettet;
	}

	private int finn(T el) {
		int i = 0, resultat = IKKE_FUNNET;
		while (i<bak&&resultat==IKKE_FUNNET) {
			if (liste[i]==el) {
				resultat = i;
			}
			i++;
		}
		return resultat;
		
	}

	public String toString() {
		String resultat = "";

		for (int i = 0; i < bak; i++) {
			resultat = resultat + liste[i].toString() + "\n";
		}
		return resultat;
	}

	private void utvid() {
		@SuppressWarnings("unchecked")
		T[] hjelpeTabell = (T[]) (new Comparable[liste.length * 2]);

		for (int i = 0; i < liste.length; i++) {
			hjelpeTabell[i] = liste[i];
		}

		liste = hjelpeTabell;
	}
	
	
	
	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int start, int slutt) {
		for (int i = start+1; i <= slutt; i++) {
			T temp = a[i];
			//Sjekke
			int j = i-1;
			boolean avsluttet = false;
			while(j>=0&&!avsluttet) {
				if (temp.compareTo(a[j])< 0) {
					a[j+1] = a[j];
					j--;
				} else {
					avsluttet = true;
				}
		}
			a[j+1] = temp;
	} 
	}

	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static<T extends Comparable<? super T>> void utvalgssortering(T[] a, int n) {
		//Ytre løkke må starte ved 0 og kan slutte ved i<n-1, siden siste element vil automatisk være størst
		for (int i = 0; i<n-1; i++) {
			//finne den minste
			int minstepos = finnMinstePos(a, i, n-1);
			//Plasserer i neste ledige i sortert del.
			swap(a, i, minstepos);
		}
	}
	
	private static <T extends Comparable<? super T>> int finnMinstePos(T[] a, int fra, int til) {
		//setter minste til start pos;
		int p = fra;
		// Sjekker fra start pos til og med slutten av tabellen om det finnes eit mindre tal enn a[p].
		for (int i = fra+1; i<=til; i++) {
			//Viss a[i] er mindre enn a[p] setter med minstepos til i.
			if (a[i].compareTo(a[p])<0) {
				p = i;
			}
		}
		//returnerer p som er minstepos.
		return p;
	}


	


}
// class
