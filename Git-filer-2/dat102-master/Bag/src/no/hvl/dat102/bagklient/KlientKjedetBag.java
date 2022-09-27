package no.hvl.dat102.bagklient;

import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.kjedet.KjedetBag;

public class KlientKjedetBag {
	static Person personer[] = { new Person("Berit", 4), new Person("Kamil", 2), new Person("Eirik", 1),
			new Person("Alina", 3), new Person("Marius", 5) };

	public static void main(String[] args) {

// Noe enkel og mangelfull testing

		BagADT<Person> bag = new KjedetBag<>();
		// Legger til personer
		for (int i = 0; i < personer.length; i++) {
			bag.leggTil(personer[i]);
		}
		// Skriver ut samlingen
		((KjedetBag<Person>) bag).skriv();

// Fjerner personen i posisjon i = 2 fra samlingen som fins
		Person resultat = null;
		Person person = personer[2];
		if (!bag.erTom()) {
			resultat = bag.fjern(person);
		}
		if (resultat != null) {
			System.out.println("\nPersonen " + person + " ble fjernet");
		} else {
			System.out.println("\nPersonenen " + person + " er ikke i samlingen");
		}

//Bør også teste når personen ikke fins i samlingen

// Test på inneholder
		person = new Person("Berit", 4);
		if (bag.inneholder(person)) {
			System.out.println("\nSamlingen inneholder " + person);
		} else {
			System.out.println("\nSamlingen inneholder ikke " + person);
		}
// Bør også teste på en person som ikke er med i samlingen

		// Alt1: Skriver ut en full tabell (mangler en person som er fjernet)
		System.out.println("\nAlternativ1\n");
		((KjedetBag<Person>) bag).skrivnyBag();

		System.out.println("\nAlternativ2\n");

		Object[] Personer = (Object[]) bag.tilTabell();
		// Utskrift
		for (Object pers : Personer) {
			System.out.println(pers);
		}

		// Nullstiller bag'en
		bag.nullstill();
		if (bag.erTom()) {
			System.out.println("\nBagen er nullstilt");
		} else {
			System.out.println("\nNullstilling feiler");

		}
	}// main

}// class
