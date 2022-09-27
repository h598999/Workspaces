package Oppgave_2;

public class BS {

	
	public static <T extends Comparable<T>> boolean binaerSokRek(T[] data, int min, int maks, T el) {
		
		if (min>maks) {
			return false;
		} else {
			int midten = (maks+min)/2;
			if (data[midten].compareTo(el)==0) {
				return true;
			}
			
			else if (data[midten].compareTo(el)<0) {
				return binaerSokRek(data, min, midten, el);
			} else {
				return binaerSokRek(data,midten,maks,el);
			}
		}
		
	}
	
}