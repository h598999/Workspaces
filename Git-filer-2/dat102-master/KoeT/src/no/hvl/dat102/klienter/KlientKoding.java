package no.hvl.dat102.klienter;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;
import no.hvl.dat102.tabell.TabellSirkulaerKoe;

public class KlientKoding {
	// eks listing 5.1 i boken,
	public static void main(String[] a) {
		int[] noekkel = { 5, 12, -3, 8, -9, 4, 10 };
		String dekodet = "", kodet = "";
		String melding = "Dette er en proeve på en tekst";
		KoeADT<Integer> koe1 = new TabellSirkulaerKoe<>();
		KoeADT<Integer> koe2 = new TabellSirkulaerKoe<>();
		// Bytte ut med anne implementasjon
		int kodeVerdi;

		/*
		 * Legger kodeverdiene inn i to køer.
		 * Tenker oss at sender som koder har en kø og mottaker som dekoder har en kø
		 * Køene blir operert "synkront" , tar ut og legger inn tilsvarende noekkelelement i de
		 * to køene og vi er garantert riktig resultat. Vi går ikke rundt alfabetet i
		 *  denne kodingen.
		 */

		for (int i = 0; i < noekkel.length; i++) {
			koe1.innKoe(noekkel[i]);
			koe2.innKoe(noekkel[i]);
		}

		// Koding av melding
		for (int i = 0; i < melding.length(); i++) {
			kodeVerdi = koe1.utKoe();
			kodet = kodet + (char) (melding.charAt(i) + kodeVerdi);
			koe1.innKoe(kodeVerdi);
		}

		System.out.println("\nKodet melding blir:\n" + kodet + "\n");
		// Vi kan tenke oss at den kodete meldingen blir sendt over nettverket

		// Dekoding av meldingen
		for (int i = 0; i < kodet.length(); i++) {
			kodeVerdi = koe2.utKoe();
			dekodet = dekodet + (char) (kodet.charAt(i) - kodeVerdi);
			koe2.innKoe(kodeVerdi);
		}

		System.out.println("Dekodet melding blir:\n" + dekodet + "\n");
	}
}
