package no.hvl.dat102.listeklient;

import java.util.Scanner;

import no.hvl.dat102.adt.OrdnetListeADT;
import no.hvl.dat102.kjedet.KjedetOrdnetListe;

public final class KlientOrdnetListe {

	/**
	 * Hindrer muligheten til å instansiere denne klassen.
	 */
	private KlientOrdnetListe() {
	}

	/**
	 * Hovedprogrammet.
	 *
	 * @param args
	 *            ikke i bruk
	 */
	public static void main(String[] args) {
		

		 OrdnetListeADT<String> navneListe1 = new KjedetOrdnetListe<String>();
		 OrdnetListeADT<String> navneListe2 = new KjedetOrdnetListe<String>();

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String navn, svar;

		do {
			System.out.println("Oppgi navn?:");
			navn = in.nextLine();
			// Legger navnene sortert inn i navnelistene
			navneListe1.leggTil(navn);
			navneListe2.leggTil(navn);

			System.out.print("Oppgi flere navn [J/N]?:");
			svar = in.nextLine();

		} while (svar.equals("j") || svar.equals("J"));

		// Skriver navnene ut i stigende ordning
		System.out.println("\n\nNavnelisten i stigende ordning:");

		while (navneListe1.antall() > 0) {
			System.out.print(navneListe1.fjernFoerste() + " ");
		}

		// Skriver ut navnen i avtagende ordning
		System.out.println("\n\nNavnelisten i fallende ordning:");

		while (navneListe2.antall() > 0) {
			System.out.print(navneListe2.fjernSiste() + " ");
		}

	}

}
