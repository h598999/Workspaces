package Oppgaver;

import java.util.Random;

public class Oppgave_4 {

	final int n = 100;
	int[] tab = new int[n];
	int[] sum = new int[n];
	Random tilf = new Random();
	
	public void tilføring() {
		
	
	for (int i = 0; i<n; i++) {
		tab[i] = tilf.nextInt(100);
		sum[i] = 0;
		for (int j=0; j<=i; j++) {
			sum[i] = sum[i]+tab[j]; 
		}
	}
	
}
}