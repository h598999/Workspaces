package Oppgave_2_a;

import java.util.Random;

import Sorterer.Sorter;

public class TidtakingInsertionSort {

	public static void main(String[] args) {
		
		double totaltid;
		Long tidfør;
		Long tidetter;
		tidfør = System.currentTimeMillis();
		for (int i = 0; i<10; i++) {
			
			Integer[] tabletest = stokk(32000);
			Sorter.sorteringVedInssetting(tabletest);
			
		}
		tidetter = System.currentTimeMillis();
		totaltid = (tidetter-tidfør)/10;
			 
	 
		double c =  (totaltid/32000);
			
		
		Long tidfør32000 = System.currentTimeMillis();
		for (int i = 0; i<10; i++) {
		Integer[] table1 = stokk(32000);
		Sorter.sorteringVedInssetting(table1);
		
		}
		Long tidetter32000 = System.currentTimeMillis();
		double total3200 = (tidetter32000-tidfør32000)/10.0;
	
	
		Long tidfør64000 = System.currentTimeMillis();
		for (int o = 0; o<10; o++) {
			Integer[] table2 = stokk(64000);
			Sorter.sorteringVedInssetting(table2);
		}
		Long tidetter64000 = System.currentTimeMillis();
		double total64000 = (tidetter64000-tidfør64000)/10.0;
		
		Long tidfør128000 = System.currentTimeMillis();
		for (int o = 0; o<10; o++) {
			Integer[] table2 = stokk(128000);
			Sorter.sorteringVedInssetting(table2);
		}
		Long tidetter128000 = System.currentTimeMillis();
		double total128000 = (tidetter128000-tidfør128000)/10.0;
		
		
		
		
		System.out.println("Antall element = " + 32000 );
		System.out.println("Antall målinger = 10 " );
		System.out.println("Tid rekna = " + (c)*32000.0 );
		System.out.println("Tid målt = " + total3200);
		
		System.out.println();
		
		System.out.println("Antall element = " + 64000 );
		System.out.println("Antall målinger = 10 " );
		System.out.println("Tid rekna = " + (c)*64000.0 );
		System.out.println("Tid målt = " + total64000);
		
		System.out.println();
		
		System.out.println("Antall element = " + 128000 );
		System.out.println("Antall målinger = 10 " );
		System.out.println("Tid rekna = " + (c)*128000.0 );
		System.out.println("Tid målt = " + total128000);
		
		
	}

public static Integer[] stokk(int n) {

	Random tilfeldig = new Random();
	int antal = 10;
	Integer[][] a = new Integer[antal][n]; 
	//Sette inn tilfeldige heltal i alle rekker
	for (int i = 0; i < antal; i++ ) {
		for (int j = 0; j<n; j++) {
			a[i][j] = tilfeldig.nextInt();
		}
		
	
}
	return a[0];

}
}
