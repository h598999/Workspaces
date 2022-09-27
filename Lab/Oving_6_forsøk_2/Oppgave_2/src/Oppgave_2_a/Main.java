package Oppgave_2_a;



import java.util.Random;


import Sorterer.Sorter;

public class Main {
	
	public static void main(String[] args) {
	
		Integer[] table1 = stokk();
		Integer[] table2 = table1;
		Integer[] table3 = table1;
		Integer[] table4 = table1;
		
		Long tidførInsertion = System.currentTimeMillis();
		
			Sorter.sorteringVedInssetting(table1);
		
		Long tidetterInsertion = System.currentTimeMillis();
		Long totalTidInsertion = (tidetterInsertion-tidførInsertion);
		
		Long tidførUtvalgssortering = System.currentTimeMillis();
	
			Sorter.Utvalgssortering(table2);
			
		Long tidEtterUtvalgssortering = System.currentTimeMillis();
		
		Long totaltidUtvalgssortering = tidEtterUtvalgssortering-tidførUtvalgssortering;
		
		Long tidførMergeSort = System.currentTimeMillis();
		
			Sorter.mergeSort(table3, 0, table3.length-1);
		
		Long tidetterMergeSort = System.currentTimeMillis();
		Long totaltidMergeSort = tidetterMergeSort-tidførMergeSort;
		
		Long tidførQuickSort = System.currentTimeMillis();
		
			Sorterer.QuickSort.quickSortYoutube(table4, 0, table4.length-1);
		
		
		Long tidetterQuickSort = System.currentTimeMillis();
		Long totaltidQuickSort = tidetterQuickSort-tidførQuickSort;
		
		System.out.println("Tid Insertion = "  + totalTidInsertion + " ms");
		System.out.println("Tid Utvalgssortering = " + totaltidUtvalgssortering + " ms");
		System.out.println("Tid MergeSort = " + totaltidMergeSort + " ms");
		System.out.println("Tid quickSort = " + totaltidQuickSort+" ms");
		
	}
	
	public static Integer[] stokk() {

		Random tilfeldig = new Random();
		int n = 32000;
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
