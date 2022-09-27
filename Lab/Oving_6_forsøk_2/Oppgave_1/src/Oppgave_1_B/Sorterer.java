package Oppgave_1_B;

public class Sorterer {

	private static <T extends Comparable<? super T>> int finnMinstePos(T[] a, int fra, int til) {
		//setter minste til start pos;
		int p = fra;
		// Sjekker fra start pos til og med slutten av tabellen om det finnes eit mindre tal enn a[p].
		for (int i = fra+1; i<=til; i++) {
			//Viss a[i] er mindre enn a[p] setter med minstepos til i.
			if (a[i].compareTo(a[p])<0) {
				p = i;
			}
		}
		//returnerer p som er minstepos.
		return p;
	}

	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static <T extends Comparable<? super T>> void sorteringVedInnsettingModifisert (T[] a) {
		swap(a, 0, finnMinstePos(a,0,a.length-1));
		
		for (int i = 2; i<a.length-1; i+=2) {
			T x = a[i];
			T y = a[i+1];
			T størst;
			T minst;
			
			if (x.compareTo(y)<0) {
				minst = x;
				størst = y;
				
			} else {
				størst = x;
				minst = y;
				
			}
		
					
			int j = i-1;
			while (j>=0&& størst.compareTo(a[j])<0) {
				a[j+2] = a[j];
				j--;	
			}
			a[j+2] = størst;
			
			while (j>=0&&minst.compareTo(a[j])<0) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = minst;
			
			if (i == a.length-1) {
				T bruk = a[i];
				int o = i-1;
				while (j>=0&&bruk.compareTo(a[o])<0) {
					a[j+1] = a[j];
					j--;
				}
				a[j+1] = bruk;
			}
			
			
		}
	}
}
		
	
	
	

