package Oppgave_1_A;

public class Sorter {

	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a) {
		bytt(a, finnMinstePos(a), 0);
		for (int i = 1; i <a.length-1; i++) {
			T temp = a[i];
			//Sjekke
			int j = i-1;
			boolean avsluttet = false;
			while(j>=0&&!avsluttet) {
				if (temp.compareTo(a[j])< 0) {
					a[j+1] = a[j];
					j--;
				} else {
					avsluttet = true;
				}
		}
			a[j+1] = temp;
	} 
	}
	
	private static <T extends Comparable<? super T>> int finnMinstePos(T[] a) {
		T minste = a[0];
		int minstepos = 0;
		for (int i = 0; i<a.length; i++) {
			if (a[i].compareTo(minste)<0) {
				minste = a[i];
				minstepos = i;
			}
		}
		return minstepos;
	}
	
	private static <T extends Comparable<? super T>> void bytt(T[] a, int b, int c) {
		T temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	}
	

