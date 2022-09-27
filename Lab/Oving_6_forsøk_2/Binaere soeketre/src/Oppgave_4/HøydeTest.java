package Oppgave_4;

import no.hvl.dat100.BS_Tre;


public class HøydeTest {
	
	public static void main(String[] args) {
		
		
		BS_Tre<Integer> tre = new BS_Tre<Integer>(1);
		tre.leggTil(1);
		tre.leggTil(2);
		tre.leggTil(3);
		tre.leggTil(4);
		tre.leggTil(10);
		System.out.println(tre.getHøgde());
		
		System.out.println();
		
		BS_Tre<Integer> tre2 = new BS_Tre<Integer>(10);
		tre2.leggTil(20);
		tre2.leggTil(15);
		tre2.leggTil(90);
		tre2.leggTil(100);
		tre2.leggTil(1);
		System.out.println(tre2.getHøgde());
		
	}
	

	
}
