package Oppgave_4;

import java.util.Scanner;

public class Oppgave_b {

	private static Scanner scanner = new Scanner(System.in);
	private static String input = "";
	private static Stokker stokker;
	
	public static void main(String[] args) {
		
	while (!input.equals("Avslutt")) {
		
		System.out.println("Hvor mange elementer ønsker du å legge til i treet");
		input = scanner.next();
		int antallnoder = Integer.parseInt(input);
		stokker = new Stokker(antallnoder);
		stokker.stokkTre();
		
		System.out.println("Trykk 1 for å skrive ut alt");
		
		System.out.println("Trykk 2 for å skrive ut kun gjennomsnittshøgde");
		
		input = scanner.next();
		
		if (input.equals("1")) {
			stokker.printAlle();
		}
		else if (input.equals("2")) {
			stokker.printTotalhøgde();
		}
	}
	
	System.out.println("Ha det bra");
		
		
		
	}
	
}
	
	  