package Klient;

import hjelpeklasser.LinearNode;

public class KjedetOrdnetListe<T extends Comparable<T>>  {
private int antall;
private LinearNode<T> f�rste;
//Konstrukt�r
public KjedetOrdnetListe() {
antall = 0;
f�rste = null;
}
//� get- og set-metoder som kan du anta hvis n�dvendig
//Andre metoder
public boolean inneholder(T element) {

	LinearNode<T> temp = f�rste;
	boolean finnes = false;
	int i = 0;
	while(i<antall&&!finnes) {
	if (temp.getElement().equals(element)) {
		finnes = true;
	} else {
		i++;
	}
	}
	return finnes;
	
} 
public void settInn(T element){
	
	if (element.compareTo(f�rste.getElement())<0) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		nyNode.setNeste(f�rste);
		f�rste = nyNode;
		antall++;
	} else {
	
	LinearNode<T> temp = f�rste.getNeste();
	LinearNode<T> forrige = f�rste;
	LinearNode<T> nyNode = new LinearNode<T>(element);
	boolean funnet = true;
	int i = 0;
	while (i<antall&&!funnet) {
		if (element.compareTo(temp.getElement())<=0) {
			forrige.setNeste(nyNode);
			nyNode.setNeste(temp);
			antall++;
			funnet = true;
		} else {
			i++;
		}
	}
	if (!funnet) {
		temp.setNeste(nyNode);
		antall++;
	}
	
	}
}

}//clas