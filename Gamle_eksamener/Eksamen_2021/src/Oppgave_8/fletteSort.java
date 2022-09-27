package Oppgave_8;

public class fletteSort<T> {
	
	public void FletteSort(T[] tabell, int forste, int siste) {
		
		if (forste<siste) {
		int midten = (forste+siste)/2;
		FletteSort(tabell,forste,midten);
		FletteSort(tabell,midten+1,siste);
		Flette(tabell,forste,midten,siste);
		}
	}

}
