package Oppgave_5;

public class Sorter<T> {

	
	public void MergeSort(T[] tabell, int forste, int siste) {
		
		
		if (forste<siste) {
			int midten = (forste+siste)/2;
			MergeSort(tabell, forste,midten);
			MergeSort(tabell,midten+1,siste);
			Merge(tabell,forste,midten,siste);
			
		} else {
			return;
		}
		
		
	}
	
	private void Merge(T[] tabell, int fortste, int midten, int siste) {
		
	}
	
	
}
