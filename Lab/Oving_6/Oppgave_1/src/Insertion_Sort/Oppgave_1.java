package Insertion_Sort;

import java.util.Random;

public class Oppgave_1 {
	
	public static void main(String[] args) {
	
	Random tilfeldig = new Random();
	long l = 320000;
	Random random = new Random(l);
	int n = 320000;
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
	
	Long tidf�r = System.currentTimeMillis();
	
	
	for (int i = 0; i<antal; i++) {
		Sorter.sorteringVedInssetting(a[i], n);
	}
	Long tidetter = System.currentTimeMillis();
	System.out.println((tidetter-tidf�r));
	
Long tidf�r1 = System.currentTimeMillis();
	
	
	for (int i = 0; i<antal; i++) {
		Sorter.sorteringVedInssettingmodifisert(b[i], 0, n-1);
	}
	Long tidetter1 = System.currentTimeMillis();
	System.out.println((tidetter1-tidf�r1));
	
	

}
}
