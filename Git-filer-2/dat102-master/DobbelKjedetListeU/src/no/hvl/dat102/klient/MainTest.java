package no.hvl.dat102.klient;

import no.hvl.dat102.adt.DobbelKjedetOrdnetListeADT;
import no.hvl.dat102.kjedet.DobbelKjedetOrdnetListe;

public class MainTest {

	public static void main(String[] args) {
		
		DobbelKjedetOrdnetListeADT<Integer> liste = new DobbelKjedetOrdnetListe<>(-1,101);
		liste.leggTil(1);
		liste.leggTil(2);
		liste.leggTil(3);
		liste.leggTil(4);
		System.out.println(liste.fins(0));
		System.out.println(liste.fins(2));
		System.out.println(liste.fjern(3));
		System.out.println(liste.fins(3));
		System.out.println(liste.fins(-1));
		liste.visListe();
		liste.fjern(1);
		liste.fjern(2);
		liste.fjern(4);
		System.out.println(liste.erTom());
		
		

	}

}
