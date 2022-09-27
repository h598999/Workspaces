package no.hvl.dat100;

public class SorterTabell {
	// Byter om a[i] og a[j]. Antar at både i og j er lovlege indeksar i tabellen.
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// Utvalgssortering / Plukksortering (DAT100) (Selction sort)
	// Sorterer dei første n elmementa i tabellen. Kanskje litt uvanlig
	// Kunne også utelatt n og sortert heile tabellen.

	public static <T extends Comparable<? super T>> void utvalgssortering(T[] a, int n) {
		//Ytre løkke må starte ved 0 og kan slutte ved i<n-1, siden siste element vil automatisk være størst
		for (int i = 0; i<n-1; i++) {
			//finne den minste
			int minstepos = finnMinstePos(a, i, n-1);
			//Plasserer i neste ledige i sortert del.
			swap(a, i, minstepos);
		}
	}
	
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

	// Sortering ved innsetting (Insertion sort)
	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int n) {
		sorteringVedInssetting(a, 0, n - 1);
	}

	// Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
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

