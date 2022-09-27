package Oppgave_6;

public class KjedetIndeksertListe<T>{
private LinearNode<T> første = null;
private LinearNode<T> siste = null;
private int antall;
/* Konstruktør */
KjedetIndeksertListe() {
//Oppretter første og siste

antall = 0;
}

KjedetIndeksertListe(LinearNode<T> første, LinearNode<T> siste){
	this.første = første;
	this.siste = siste;
	antall = 0;
}

public void leggTilForan(T element) {
	
	LinearNode<T> nyNode = new LinearNode<T>(element);
	
	if (erTom()) {
		siste = nyNode;
	}
	nyNode.setNeste(første);
	første = nyNode;
	antall++;
	
}

public void fjernDelListe(int indeks, int n) {
		
	if (indeks < 0 || indeks>=antall) {
		System.out.println("Ulovlig indeks");
	} else {
		LinearNode<T> forrigeStart = første;
		LinearNode<T> start = første;
		int teller = 0;
		while(teller<indeks) {
			forrigeStart = start;
			start = start.getNeste();
			teller++;
		}
		LinearNode<T> slutt = start;
		int i = 0;
		while (i<n) {
			slutt = slutt.getNeste();
			i++;
		}
		
		if (start==første) {
			if(slutt==siste) {
				første= null;
				siste = null;
			} else {
				første = slutt.getNeste();
			}
		} else if (slutt == siste) {
			siste = forrigeStart;
			siste.setNeste(null);
		} else {
			forrigeStart.setNeste(slutt.getNeste());
		}
	}
	
}

public boolean erTom() {
	return antall==0;
}
//andre metoder
}

