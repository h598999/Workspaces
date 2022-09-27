package Sorter;

public class InserttionSort {
	
	public static <T extends Comparable<T>> void InsertionSort(T[] data) {
		
		for (int i = 0; i<data.length; i++) {
			
			T temp = data[i];
			
			int o = i-1;
			boolean avsluttet = false;
			
			while(o>=0&&!avsluttet) {
				if (temp.compareTo(data[o])<0) {
					data[o+1] = data[o];
					o--;
				}
				
				else {
					avsluttet = true;
				}
			}
			data[o+1] = temp;
		}
		
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] data, int min, int maks) {
		
		if (min<maks) {
			int pi = partition(data, min, maks);
			quickSort(data, min, pi-1);
			quickSort(data,pi+1,maks);
		} else {
			return;
		}
		
	}
	
	private static <T> int partition(T[] data, int min, int maks) {
		
		return 0;
		
	}

}
