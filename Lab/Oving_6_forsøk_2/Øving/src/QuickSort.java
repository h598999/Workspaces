
public class QuickSort {
	
	public static  <T extends Comparable<? super T>>  void quickSort(T[] a, int start, int slutt) {
		
		if (start<slutt) {
		int partitionIndex = Partition(a, start, slutt);
		quickSort(a, start, partitionIndex-1);
		quickSort(a, partitionIndex+1, slutt);}
		else {
			return;
		}
	}
	
	private static <T extends Comparable <? super T>> int Partition(T[] a, int start, int slutt) {
		//Choosing a pivot

		
		if (a[start].compareTo(a[(slutt+start)/2])>0) {
			bytt(a, start, (slutt+start)/2);
		}
		
		if (a[(slutt+start)/2].compareTo(a[slutt])>0) {
			bytt(a, slutt, (slutt+start)/2);
		}
		
		bytt(a, (slutt+start)/2, slutt-1);
		T pivot = a[slutt-1];
		int pivotIndex = slutt-1;
		
		int fraVenstre = start+1;
		int fraHøgre = slutt-2;
		
		boolean ferdig = false;
		while (!ferdig) {
			
			while (a[fraVenstre].compareTo(pivot)<0) {
				fraVenstre++;
			}
			while (a[fraHøgre].compareTo(pivot)>0&&fraHøgre>0) {
				fraHøgre--;
			}
			if (fraVenstre<fraHøgre) {
				bytt(a, fraVenstre, fraHøgre);
			} else {
				ferdig = true;
			}
		}
		bytt(a, fraVenstre, slutt-1);
		pivotIndex = fraVenstre;
		return pivotIndex;
		
		
	}
	
	private static <T> void bytt (T[] a, int b, int c) {
		
		T temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	

}
