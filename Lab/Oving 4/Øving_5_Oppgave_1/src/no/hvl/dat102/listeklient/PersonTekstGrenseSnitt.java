package no.hvl.dat102.listeklient;

import java.util.Scanner;

public class PersonTekstGrenseSnitt {
	
	public PersonTekstGrenseSnitt () { 
		
	}
	
	public Person lesPerson() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("skriv inn fornavnet p� personen");
		String fornavn = scan.nextLine();
		System.out.println("Skriv inn etternavnet p� personen");
		String etternavn = scan.nextLine();
		System.out.println("Skriv inn f�dsels�ret");
		int f�dselsaar = scan.nextInt();
		return new Person(fornavn, etternavn, f�dselsaar);
	}

}
