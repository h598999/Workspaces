package Oppgave_1_B;

import java.util.Random;



public class Maintest {

	public static void main(String[] args) {
		
		Random tilfeldig = new Random();
		int n = 32000;
		int antal = 10;
		
		Integer[][] a = new Integer[antal][n];
		Integer[][] b = new Integer[antal][n];
		
		for (int i = 0; i<antal; i++) {
			for (int j = 0; j<n; j++) {
				int r = tilfeldig.nextInt();
				a[i][j] = r;
				b[i][j] = r;
			}
		}
		Long tidfør = System.currentTimeMillis();
		Sorterer.sorteringVedInnsettingModifisert(a[antal-1]);
		Long tidetter = System.currentTimeMillis();
		System.out.println((tidetter-tidfør));
	}
		

	}


