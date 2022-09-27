package Sorterer;

public class Sorter<T> {
	
	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a) {
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
	
	

public static <T extends Comparable<?super T>> void Utvalgssortering(T[] a) {
	
	for (int i = 0; i<a.length; i++) {
		T minste = a[i];
		int funnetindeks = -1;
		int o = i;
		while(o<a.length) {
			if (a[o].compareTo(minste)<0 ) {
				minste = a[o];
				funnetindeks = o;
			}
			o++;
		}
		if (funnetindeks>=0) {
		a[funnetindeks] = a[i];
		a[i] = minste;}
	}
	
}

public static <T extends Comparable<?super T>> void mergeSort(T[] a, int start, int slutt) {
	
	
	
	 if (start<slutt) {
	int mid = start + (slutt - start)/2; 
	mergeSort(a,  start,mid);
	mergeSort(a,  mid + 1,slutt);
	merge(a,start,mid,slutt);
	 } else {
		 return;	
	 }
}





public static <T extends Comparable<? super T>>void quickSort(T[] a, int start, int slutt){
	
	if (start<slutt) {
	
	int pi = partition( a, start, slutt);
	quickSort (a , start, pi-1);
	quickSort(a, pi+1, slutt);
	} else {
		return;
	}
}

private static <T extends Comparable<? super T>> int partition(T[] a, int start , int slutt) {
	
	//Choosing a pivot

	
	if (a[start].compareTo(a[(slutt-start)/2])>0) {
		bytt(a, start, (slutt-start)/2);
	}
	
	if (a[(slutt-start)/2].compareTo(a[slutt])>0) {
		bytt(a, slutt, (slutt-start)/2);
	}
	
	bytt(a, (slutt-start)/2, slutt-1);
	T pivot = a[slutt-1];
	
	
	int fraVenstre = start;
	int fraHøgre = slutt-1;
	
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
	bytt(a, slutt-1, fraVenstre);
	return fraVenstre;
}
	


private static <T> void bytt (T[] a, int b, int c) {
	
	T temp = a[b];
	a[b] = a[c];
	a[c] = temp;
}

private static <T extends Comparable<?super T>> void merge (T[] a, int start, int mid, int slutt) {
	
	int venstrestart = 1 + mid -start;
	int høgrestart = slutt- mid;
	
	@SuppressWarnings("unchecked")
	T[] subArrayOne = (T[]) new Comparable<?>[venstrestart];
	@SuppressWarnings("unchecked")
	T[] subArrayTwo = (T[]) new Comparable<?>[høgrestart];
	
	//Kopierer data til temp tabellene
	
	for (int i = 0; i<venstrestart; i++) {
		subArrayOne[i] = a[start + i];
	}
	
	for (int j = 0; j<høgrestart; j++) {
		subArrayTwo[j] = a[mid + 1 + j];
	}
	
	int i = 0;
	int j = 0;
	int k = start;
	
	while(i<venstrestart&&j<høgrestart) {
		if (subArrayOne[i].compareTo(subArrayTwo[j])<=0) {
			a[k] = subArrayOne[i];
			i++;
		} else {
			a[k] = subArrayTwo[j];
			j++;
		}
		k++;
	}
	
	while (i<venstrestart) {
		a[k] = subArrayOne[i];
		i++;
		k++;
	}
	
	while (j<høgrestart) {
		a[k] = subArrayTwo[j];
		j++;
		k++;
	}
	
	
	
}

}
