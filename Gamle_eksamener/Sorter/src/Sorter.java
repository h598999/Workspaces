import static org.junit.jupiter.api.Assertions.assertTrue;

import Ekstra.LinearNode;

public class Sorter {

	public static <T extends Comparable<? super T>> void IterativeSelectionSort(T[] a) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			int minste = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j].compareTo(a[minste]) < 0) {
					minste = j;
				}
			}
			swap(a, i, minste);
		}
	}

	public static <T extends Comparable<? super T>> void SelectionSortRek(T[] a) {
		recursionSelectionSort(a, 0, a.length - 1);
	}

	public static <T extends Comparable<? super T>> void IterativeInsertionSort(T[] a) {

		for (int i = 1; i < a.length; i++) {

			T temp = a[i];
			int j = i - 1;
			boolean funnet = false;
			while (j >= 0 && !funnet) {

				if (a[j].compareTo(temp) > 0) {
					a[i] = a[j];
					a[j] = temp;
					j--;
				} else {
					funnet = true;
				}
			}
			a[j + 1] = temp;
		}

	}

	public static <T extends Comparable<? super T>> void recInsertionSort(T[] a) {

		recursionInsertionSort(a, 0, a.length - 1);

	}

	public static <T extends Comparable<? super T>> void LinkedInsertionSort(LinearNode<T> rot) {
		if (rot != null) {
			LinearNode<T> Temp = rot;
			LinearNode<T> forrige = null;
			boolean funnet = false;
			while (!funnet && Temp.getNeste() != null) {
				if (rot.getElement().compareTo(Temp.getElement()) > 0) {
					forrige = Temp;
					Temp = Temp.getNeste();
				} else {
					funnet = true;
				}
			}
			if (forrige != null) {
				forrige.setNeste(rot);
				rot.setNeste(Temp);
			}
			LinkedInsertionSort(rot.getNeste());
		}
	}

	public static <T extends Comparable<? super T>> void IterativeShellSort(T[] a) {

		int space = a.length / 2;

		for (int gap = space; gap > 0; gap = gap / 2) {

			for (int i = gap; i < a.length; i++) {
				T temp = a[i];
				boolean funnet = false;
				int j = i;
				while (j >= gap && !funnet) {
					if (a[j - gap].compareTo(temp) > 0) {
						a[j] = a[j - gap];
						j = j - gap;
					} else {
						funnet = true;
					}
				}
				a[j] = temp;
			}

		}

	}

	public static <T extends Comparable<? super T>> boolean erSortert(LinearNode<T> rot) {
		boolean erSortert = true;
		while (rot.getNeste() != null) {
			if (rot.getElement().compareTo(rot.getNeste().getElement()) > 0) {
				return false;
			} else {
				return erSortert(rot.getNeste());
			}
		}
		return erSortert;
	}
	
	public static <T extends Comparable<?super T>> void mergeSort(T[] a) {
		recursiveMergeSort(a, 0, a.length-1);
	}
	
	private static <T extends Comparable<?super T>> void recursiveMergeSort(T[] a, int first, int last) {
		
		if (last-first<1) {
			return;
		} else {
			
			int midten = (first+last)/2;
			recursiveMergeSort(a,first,midten);
			recursiveMergeSort(a,midten+1,last);
			Merge(a,first,midten,last);
		}
		
	}

	public static <T extends Comparable<? super T>> boolean erSortert(T[] a) {
		boolean erSortert = true;
		int i = 0;
		while (erSortert && i < a.length - 1) {
			if (a[i].compareTo(a[i + 1]) > 0) {
				erSortert = false;
			} else {
				i++;
			}
		}
		return erSortert;

	}
	
	@SuppressWarnings("unchecked")
	private static <T extends Comparable<?super T>> void Merge(T[] a,  int first, int midten, int last) {
		Object[] temp  =  new Object[last-first+1];
		int beginhalf1 = first;
		int beginhalf2 = midten+1;
		int index = 0;
		while((beginhalf1<=midten)&&(beginhalf2<=last)) {
			if (a[beginhalf1].compareTo(a[beginhalf2])<=0) {
				temp[index] = a[beginhalf1];
				beginhalf1++;
			} else {
				temp[index] = a[beginhalf2];
				beginhalf2++;
			}
			index++;
		}
		
		
			if ((beginhalf1<=midten)&&(beginhalf2>last)) {
			while((beginhalf1<=midten)) {
			temp[index++] = a[beginhalf1++];
			} 
			} else {
				while(beginhalf2<=last) {
					temp[index++] = a[beginhalf2++];
				}
			}
			
		for (index = 0; index<temp.length; index++) {
			a[index+first] = (T) temp[index];
		}
		
	}

	private static <T extends Comparable<? super T>> void recursionInsertionSort(T[] a, int start, int slutt) {

		if (start <= slutt) {

			T temp = a[start];
			int j = start - 1;
			boolean funnet = false;
			while (j >= 0 && !funnet) {
				if (a[j].compareTo(temp) > 0) {
					a[start] = a[j];
					a[j] = temp;
					j--;
				} else {
					funnet = true;
				}
			}
			a[j + 1] = temp;
			recursionInsertionSort(a, start + 1, slutt);

		}
	}

	private static <T extends Comparable<? super T>> void recursionSelectionSort(T[] a, int first, int last) {

		if (first <= last) {
			int minste = first;
			for (int i = first; i <= last; i++) {
				if (a[minste].compareTo(a[i]) > 0) {
					minste = i;
				}
			}
			swap(a, minste, first);
			recursionSelectionSort(a, first + 1, last);
		}

	}

	private static <T extends Comparable<? super T>> void swap(T[] a, int b, int c) {
		T temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}

}