package Klient;

import hjelpeklasser.LinearNode;

public class KjedetOrdnetListe<T extends Comparable<T>>  {
private int antall;
private LinearNode<T> første;
//Konstruktør
public KjedetOrdnetListe() {
antall = 0;
første = null;
}
//… get- og set-metoder som kan du anta hvis nødvendig
//Andre metoder
public boolean inneholder(T element) {

	LinearNode<T> temp = første;
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
	
	if (element.compareTo(første.getElement())<0) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		nyNode.setNeste(første);
		første = nyNode;
		antall++;
	} else {
	
	LinearNode<T> temp = første.getNeste();
	LinearNode<T> forrige = første;
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