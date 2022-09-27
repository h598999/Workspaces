package no.hvl.dat102.klienter;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;
import no.hvl.dat102.kjedet.KjedetKoe;
import no.hvl.dat102.tabell.TabellSirkulaerKoe;

public class KlientKoe {

	public static void main(String[] args) {
		KoeADT<Character> tegnKoe = new TabellSirkulaerKoe<>();
		//KoeADT<Character> tegnKoe = new KjedetKoe<>();
		//Bytte ut med KjedetKoe og med SirkulaerKoe
		String streng = " Denne koen er en FIFO datastruktur.";
		int lengde = streng.length();
		for (int i = 0; i < lengde; i++) {
			tegnKoe.innKoe(streng.charAt(i));
		}
		System.out.println(tegnKoe); // kall på toString()
		try {
			while (!tegnKoe.erTom()) {
				char tegn = tegnKoe.utKoe();
				System.out.print(tegn);
			}
		} catch (EmptyCollectionException e) {
			System.out.print(e.getMessage());

		}
	}

}
