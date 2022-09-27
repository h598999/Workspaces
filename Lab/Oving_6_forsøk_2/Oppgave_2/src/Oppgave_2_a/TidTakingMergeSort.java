package Oppgave_2_a;

import java.util.Random;

import Sorterer.QuickSort;
import Sorterer.Sorter;

public class TidTakingMergeSort {
	
public static void main(String[] args) {
		
		
	
	double totaltid;
	Long tidf�r;
	Long tidetter;
	tidf�r = System.currentTimeMillis();
	for (int i = 0; i<10; i++) {
		
		Integer[] tabletest = stokk(32000);
		Sorter.mergeSort(tabletest, 0, tabletest.length-1);
		
	}
	tidetter = System.currentTimeMillis();
	totaltid = (tidetter-tidf�r)/10;
		 
 
	double c =  (totaltid/32000);
		
	
	
		
		Long tidf�r32000 = System.currentTimeMillis();
		for (int i = 0; i<10; i++) {
		Integer[] table1 = stokk(32000);
		Sorter.mergeSort(table1, 0, table1.length-1);
		
		}
		Long tidetter32000 = System.currentTimeMillis();
		double total3200 = (tidetter32000-tidf�r32000)/10.0;
	
	
		Long tidf�r64000 = System.currentTimeMillis();
		for (int o = 0; o<10; o++) {
			Integer[] table2 = stokk(64000);
			Sorter.mergeSort(table2, o, table2.length-1);
		}
		Long tidetter64000 = System.currentTimeMillis();
		double total64000 = (tidetter64000-tidf�r64000)/10.0;
		
		Long tidf�r128000 = System.currentTimeMillis();
		for (int o = 0; o<10; o++) {
			Integer[] table2 = stokk(128000);
			Sorter.mergeSort(table2, o, table2.length-1);
		}
		Long tidetter128000 = System.currentTimeMillis();
		double total128000 = (tidetter128000-tidf�r128000)/10.0;
		
		
		
		
		System.out.println("Antall element = " + 32000 );
		System.out.println("Antall m�linger = 10 " );
		System.out.println("Tid rekna = " + c*(32000.0 * log2(32000)) );
		System.out.println("Tid m�lt = " + total3200);
		
		System.out.println();
		
		System.out.println("Antall element = " + 64000 );
		System.out.println("Antall m�linger = 10 " );
		System.out.println("Tid rekna = " + c*(64000.0 * log2(64000)) );
		System.out.println("Tid m�lt = " + total64000);
		
		System.out.println();
		
		System.out.println("Antall element = " + 128000 );
		System.out.println("Antall m�linger = 10 " );
		System.out.println("Tid rekna = " + c*(128000 * log2(128000)) );
		System.out.println("Tid m�lt = " + total128000);
		
		
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
public static double log2(int N)
{

    // calculate log2 N indirectly
    // using log() method
    int result = (int)(Math.log(N) / Math.log(2));

    return result;
}

}
