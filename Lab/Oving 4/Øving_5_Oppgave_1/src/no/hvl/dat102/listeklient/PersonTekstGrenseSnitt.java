package no.hvl.dat102.listeklient;

import java.util.Scanner;

public class PersonTekstGrenseSnitt {
	
	public PersonTekstGrenseSnitt () { 
		
	}
	
	public Person lesPerson() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("skriv inn fornavnet på personen");
		String fornavn = scan.nextLine();
		System.out.println("Skriv inn etternavnet på personen");
		String etternavn = scan.nextLine();
		System.out.println("Skriv inn fødselsåret");
		int fødselsaar = scan.nextInt();
		return new Person(fornavn, etternavn, fødselsaar);
	}

}
