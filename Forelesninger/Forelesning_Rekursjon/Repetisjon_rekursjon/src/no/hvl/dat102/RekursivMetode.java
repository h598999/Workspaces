package no.hvl.dat102;

public class RekursivMetode<T extends Comparable<? super T>> {

	//N�r du jobber med rekursjon.
	//Deler du opp problemstillingen i mindre problem
	//L�yser dei enkelte problema
	
	//Oppgave: Finn den st�rste noden
	
	
	//Krav om minst eit element
	public T finnSt�rste(LinearNode<T> start) {
		
		//Basis steget
		if (start.getNeste()== null) {
			return start.getElement();
		}
		//Rekursivt steg
		T resten = finnSt�rste(start.getNeste());
		if (resten.compareTo(start.getElement())>0) {
			return resten;
		} else {
			return start.getElement();
		}
	}
	
}
