package Oppgave_6;

import Ekstra.LinearNode;

public class KjedetOrdnetListe<T extends Comparable<T>> 
{
private int antall;
private LinearNode<T> foerste;
private LinearNode<T> siste;


public KjedetOrdnetListe(T minverdi, T maksverdi) {
	foerste = new LinearNode<T>(minverdi);
	siste = new LinearNode<T>(maksverdi);
	foerste.setNeste(siste);
	antall = 0;
}

public T finnMaks() {
	if (erTom()) {
		System.out.println("listen er tom");
		return null;
	} else {
		LinearNode<T> temp = foerste.getNeste();
		while(temp.getNeste()!=siste) {
			temp = temp.getNeste();
		}
		return temp.getElement();
	}
}

public boolean fjernAlle(T el) {
	if (erTom()) {
		System.out.println("Listen er tom");
		return false;
	} else {
		LinearNode<T> temp = foerste.getNeste();
		
		while(temp.getElement().compareTo(el)<0) {
			temp = temp.getNeste();
		}
		LinearNode<T> neste = temp.getNeste();
		if (temp.getElement().equals(el)) {
			int antalllike = 1;
			boolean erLike = true;
			while(erLike&&neste!=null) {
				if (!(neste.getElement().equals(el))) {
					erLike = false;
				} else {
					
					neste = neste.getNeste();
					antalllike++;
				}
			}
			temp.setNeste(neste);
			antall = antall-antalllike;
			
		}
	}
}

public int antall() {
return antall;
}
public boolean erTom() {
return antall == 0;
}
//… andre metoder
}

