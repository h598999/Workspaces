package no.hvl.dat102.listeklient;

import java.util.Scanner;

import no.hvl.dat102.adt.OrdnetListeADT;
import no.hvl.dat102.kjedet.KjedetOrdnetListe;

//Turnering.java
//
//Demonstrerer første runde av en turnering ved hjelp av ordnet liste.

public class Turnering {

	public void settOpp() {

		OrdnetListeADT<Lag> turnering = new KjedetOrdnetListe<Lag>();
		String lag1, lag2, navn;
		int antallSeire = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Turnering\n");
		System.out.println("Oppgi et partall lik antall lag:");
		int antallLag = in.nextInt();
		in.nextLine();

		for (int antall = 1; antall <= antallLag; antall++) {
			System.out.print("Oppgi navn til lag:");
			navn = in.nextLine();  //Kunstig innlesing
			System.out.print("Oppgi antall seire:");
			antallSeire = in.nextInt();
			in.nextLine();			
			turnering.leggTil(new Lag(navn, antallSeire));
		}

		System.out.println("\n Første turneringsrunde:");
		int n = antallLag/2;
		for (int antall = 1; antall <= n; antall++) {
			lag1 = (turnering.fjernFoerste()).getNavn();
			lag2 = (turnering.fjernSiste()).getNavn();
			System.out.println("Spill " + antall + " er " + lag1 + " mot " + lag2);
			System.out.println(" vinneren skal spille  mot vinneren av spill" + (((antallLag/2) + 1) - antall) + "\n");
		} // for

	}// metode

}// class
