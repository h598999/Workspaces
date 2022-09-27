package Oppgave_2;

public class QuickSort {
	
	// ingen spørsmål knyttet til denne metoden
	public static <T extends Comparable<T>> void kvikkSort(T[] data) {
	 kvikkSort(data, 0, data.length-1);
	}
	private static <T extends Comparable<T>> void
	 kvikkSort(T[] data, int min, int max) {
	 if (min<max) {
		 
		 int pivot = partition(data,min,max);
		 kvikkSort(data,min, pivot-1);
		 kvikkSort(data,pivot+1,max);
		 
	 }
	}
	private static <T extends Comparable<T>> int 
	 partition(T[] data, int min, int max) {
	 return 1;
	}


}
