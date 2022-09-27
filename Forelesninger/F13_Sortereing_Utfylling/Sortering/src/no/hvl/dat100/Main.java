package no.hvl.dat100;

public class Main {

	public static void main(String[] args) {
		Integer[] tab = {7, 4, 1, 9, 5, 2};
		
		
		//SorterTabell.utvalgssortering(tab, tab.length);
		 SorterTabell.sorteringVedInssetting(tab, tab.length);
		
		for (Integer e : tab) {
			System.out.print(e + " ");
		}
		
		System.out.println();

	}

}
