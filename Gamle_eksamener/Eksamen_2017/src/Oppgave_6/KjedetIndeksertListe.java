package Oppgave_6;

public class KjedetIndeksertListe<T>{
private LinearNode<T> f�rste = null;
private LinearNode<T> siste = null;
private int antall;
/* Konstrukt�r */
KjedetIndeksertListe() {
//Oppretter f�rste og siste

antall = 0;
}

KjedetIndeksertListe(LinearNode<T> f�rste, LinearNode<T> siste){
	this.f�rste = f�rste;
	this.siste = siste;
	antall = 0;
}

public void leggTilForan(T element) {
	
	LinearNode<T> nyNode = new LinearNode<T>(element);
	
	if (erTom()) {
		siste = nyNode;
	}
	nyNode.setNeste(f�rste);
	f�rste = nyNode;
	antall++;
	
}

public void fjernDelListe(int indeks, int n) {
		
	if (indeks < 0 || indeks>=antall) {
		System.out.println("Ulovlig indeks");
	} else {
		LinearNode<T> forrigeStart = f�rste;
		LinearNode<T> start = f�rste;
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
		
		if (start==f�rste) {
			if(slutt==siste) {
				f�rste= null;
				siste = null;
			} else {
				f�rste = slutt.getNeste();
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

