package no.hvl.dat102;

public class RekursivMetode<T extends Comparable<? super T>> {

	//Når du jobber med rekursjon.
	//Deler du opp problemstillingen i mindre problem
	//Løyser dei enkelte problema
	
	//Oppgave: Finn den største noden
	
	
	//Krav om minst eit element
	public T finnStørste(LinearNode<T> start) {
		
		//Basis steget
		if (start.getNeste()== null) {
			return start.getElement();
		}
		//Rekursivt steg
		T resten = finnStørste(start.getNeste());
		if (resten.compareTo(start.getElement())>0) {
			return resten;
		} else {
			return start.getElement();
		}
	}
	
}
