package Oppgave_3;

import Ekstra.BinaerTreNode;

public class KjedetBSTre<T extends Comparable<T>> {
private int antall;
private BinaerTreNode<T> rot;
/******************************************************************
* Oppretter et tomt binært søketre.
******************************************************************/
public KjedetBSTre() {
 antall = 0;
 rot = null;
}
/******************************************************************
* Oppretter et binært søketre med en node..
******************************************************************/
public KjedetBSTre(T element) {
 antall = 1;
 rot = new BinaerTreNode<T>(element);
}
 // hent – og setmetoder kan du anta
/***********************************************************************
* Returnerer sann hvis bs-treet er tomt, elles usann.
**********************************************************************/
public boolean erTom() {
 return (antall == 0);
}
/************************************************************************
* Returnerer det minste elementet fra bs-treet.
*************************************************************************/
public T finnMin() {
 
	if (erTom()) {
		return null;
	} else {
		BinaerTreNode<T> temp = rot;
		while(temp.getVenstre()!=null) {
			temp = temp.getVenstre();
		}
		return temp.getElement();
	}
	
}
/*********************************************************************
* finner antall elementer mindre enn elmenentet gitt som parameter
**********************************************************************/
public int antallMindreEnn(T element) {
 return antallMindre(rot, element);
 }
private int antallMindre(BinaerTreNode<T> t, T element) {
	
	int mindre = 0;
	if (t != null) {
		
		mindre = antallMindre(t.getVenstre(), element);
		if (t.getElement().compareTo(element)<0) {
			mindre += 1+ antallMindre(t.getHoyre(), element);
		}
	}
	return mindre;
	
	
 }
}//class
