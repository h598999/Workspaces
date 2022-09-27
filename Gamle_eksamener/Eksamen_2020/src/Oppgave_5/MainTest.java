package Oppgave_5;

import Ekstra.BinaerTreNode;

public class MainTest {
	
	public static void main(String[] args) {
		
		KjedetBSTre<Integer> Tre = new KjedetBSTre<Integer>();
		Tre.leggTil(3);
		Tre.leggTil(4);
		Tre.leggTil(2);
		Tre.leggTil(1);
		System.out.println(Tre.toString());
	
		
	}

}
