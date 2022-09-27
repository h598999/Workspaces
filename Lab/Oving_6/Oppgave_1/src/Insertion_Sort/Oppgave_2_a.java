package Insertion_Sort;

public class Oppgave_2_a {
	
	public static  <T extends Comparable<? super T>> void Sorteringvedinnsettingmedtoelementer(T[] a, int n) {
		Sorteringvedinnsettingmedtoelementer(a, 0, n - 1);
	}
	
	public static  <T extends Comparable<? super T>> void Sorteringvedinnsettingmedtoelementer(T[] a, int start, int slutt) {
	 
		Sorter.swap(a, start ,Sorter.finnMinstePos(a, start, slutt));
		for (int i = start+2; i<=slutt; i++) {
			T temp = a[i];
			T temp2 = a[i+1];
			T størst;
			T minst;
			
			if (temp.compareTo(temp2)<0) {
			størst = temp2;
			minst = temp;
			} else {
				minst =temp2;
				størst = temp;
			}
			int j = i-1;
			boolean avsluttet = false;
			while(j>=0&&!avsluttet) {
				T temporary = a[j];
				if (størst.compareTo(a[j])<0) {
					a[j+2] = a[j];
					j--;}
		
					
					else if (minst.compareTo(a[j])<0) {
						a[j+1] = a[j];
						j--;
				} else {
					avsluttet = true;
				}
			}
		}
		
	}
	

}
