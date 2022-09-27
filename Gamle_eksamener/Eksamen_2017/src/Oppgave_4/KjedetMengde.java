package Oppgave_4;

import java.util.Iterator;

public class KjedetMengde<T> implements MengdeADT<T> {
private int antall; // antall elementer i mengden
private LinearNode<T> start;
public KjedetMengde() {
	start = null;
	antall = 0;
}

 
public boolean inneholder(T element){
	LinearNode<T> temp = start;
	int i = 0;
	boolean funnet = false;
	while(!funnet&&i<antall) {
		if (temp.getElement().equals(element)) {
			funnet = true;
		} else {
			temp = temp.getNeste();
			i++;
		}
	}
	return funnet;
}

 public boolean underMengde(MengdeADT<T> m2) {
	 
	 boolean erUnderMengde = true;
	 Iterator<T> oppramser = m2.oppramser();
	 
	 while (erUnderMengde&&oppramser.hasNext()) {
		 if (!this.inneholder(oppramser.next())) {
			 erUnderMengde = false;
		 } 
	 }
	 return erUnderMengde;
	 
 }
public boolean erTom() {return antall == 0;}
public int antall() {return antall;}
 //… Andre metoder


@Override
public boolean undermengde(MengdeADT<T> m2) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterator<T> oppramser() {
	// TODO Auto-generated method stub
	return null;
}
}// class
