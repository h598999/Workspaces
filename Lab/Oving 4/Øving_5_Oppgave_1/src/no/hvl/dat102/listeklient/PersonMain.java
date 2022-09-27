package no.hvl.dat102.listeklient;

import no.hvl.dat102.adt.OrdnetListeADT;
import no.hvl.dat102.kjedet.KjedetOrdnetListe;
import no.hvl.dat102.tabell.TabellOrdnetListe;

public class PersonMain  {

	public static void main(String[] args) {
	
		
		
		PersonTekstGrenseSnitt grensesnitt = new PersonTekstGrenseSnitt();
		Person person1 = grensesnitt.lesPerson();
		Person person2 = grensesnitt.lesPerson();
		Person person3 = grensesnitt.lesPerson();
		Person person4 = grensesnitt.lesPerson();
		Person person5 = grensesnitt.lesPerson();
		Person person6 = grensesnitt.lesPerson();
		
		OrdnetListeADT<Person> kjedet = new KjedetOrdnetListe<>();
		OrdnetListeADT<Person> tabell = new TabellOrdnetListe<>();
		
		kjedet.leggTil(person1);
		kjedet.leggTil(person2);
		kjedet.leggTil(person3);
		kjedet.leggTil(person4);
		kjedet.leggTil(person5);
		kjedet.leggTil(person6);
		
		tabell.leggTil(person1);
		tabell.leggTil(person2);
		tabell.leggTil(person3);
		tabell.leggTil(person4);
		tabell.leggTil(person5);
		tabell.leggTil(person6);
		
		System.out.println(kjedet.fjernSiste().toString());
		System.out.println(kjedet.fjernSiste().toString());
		System.out.println(kjedet.fjernSiste().toString());
		System.out.println(kjedet.fjernSiste().toString());
		System.out.println(kjedet.fjernSiste().toString());
		System.out.println(kjedet.fjernSiste().toString());
		System.out.println();
		System.out.println(tabell.fjernSiste().toString());
		System.out.println(tabell.fjernSiste().toString());
		System.out.println(tabell.fjernSiste().toString());
		System.out.println(tabell.fjernSiste().toString());
		System.out.println(tabell.fjernSiste().toString());
		System.out.println(tabell.fjernSiste().toString());
	}

}
