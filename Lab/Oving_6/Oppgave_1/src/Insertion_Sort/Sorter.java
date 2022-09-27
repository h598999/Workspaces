package Insertion_Sort;

public class Sorter {
	
	// Sortering ved innsetting (Insertion sort)
		public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int n) {
			sorteringVedInssetting(a, 0, n - 1);
		}

		// Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
		public static <T extends Comparable<? super T>> void sorteringVedInssettingmodifisert(T[] a, int start, int slutt) {
			swap(a, start, finnMinstePos(a, start,slutt-1));
			for (int i = start+2; i <= slutt; i++) {
				T temp = a[i]; 
				//Sjekke
				int j = i-1;
				boolean avsluttet = false;
				while(j>0&&!avsluttet) {
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
		
		public static <T extends Comparable<? super T>> int finnMinstePos(T[] a, int fra, int til) {
			//setter minste til start pos;
			int p = fra;
			// Sjekker fra start pos til og med slutten av tabellen om det finnes eit mindre tal enn a[p].
			for (int i = fra+1; i<=til; i++) {
				//Viss a[i] er mindre enn a[p] setter med minstepos til i.
				if (a[i].compareTo(a[p])<0) {
					p = i;
				}
			}
			return p;
		
	}
		public static void swap(Object[] a, int i, int j) {
			Object temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}	
		


public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int start, int slutt) {
	for (int i = start+1; i <= slutt; i++) {
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
}






