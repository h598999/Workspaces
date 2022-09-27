package Oppgave_2;

public class Sorter<T> {
	
	public static<T extends Comparable<T>> void insertionsort(T[] a) {
		
		for (int i = 0; i<a.length; i++) {
			
			T temp = a[i];
			int j = i-1;
			boolean avsluttet = false;
			while (j>=0&&!avsluttet) {
				if (temp.compareTo(a[j])<0) {
					a[j+1] = a[j];
					j--;
				} else {
					avsluttet = true;
				}				
			}
			a[j+1] = temp;
		}
		
	}
	
	public static<T extends Comparable<T>> void quickSort(T[] data) {
		quickSort(data, 0, data.length-1);
	}
	
	private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
		
		int Partition = partition(data, min, max);
		quickSort(data, min, Partition-1);
		quickSort(data, Partition+1, max);
	}
	
	private static<T extends Comparable<T>> int partition(T[] data, int min, int max) {
		int x = 0;
		return x;
	}

}
