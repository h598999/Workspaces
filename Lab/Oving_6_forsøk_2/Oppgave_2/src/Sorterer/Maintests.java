package Sorterer;

import java.util.Random;

public class Maintests {

	public static void main(String[] args) {
	Integer[] table1 = stokk();
	Integer[] table2 = table1;
	

	QuickSort.quickSortYoutube(table1, 0, table1.length-1);
	for (int i = 0; i<table1.length; i++) {
		System.out.println(table1[i]);
	}
	System.out.println();
	Sorter.mergeSort(table2, 0, table2.length-1);
	for (int o = 0; o<table2.length; o++) {
		System.out.println(table2[o]);
	}
	
	System.out.println();
	
	
	
}


public static Integer[] stokk() {

	Random tilfeldig = new Random();
	int n = 10;
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


