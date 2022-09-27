package Oppgave1;

import Ekstra.LinearNode;

public class KjedetStabel<T>  {
private LinearNode<T> topp;
private int antall;
public KjedetStabel() {
topp = null;
antall = 0;
}

public void push(T el) {
	LinearNode<T> nyNode = new LinearNode<T>(el);
	nyNode.setNeste(topp);
	topp = nyNode;
	antall++;
}

public T pop() {
	if (erTom()) {
		System.out.println("Stabelen er tom");
		return null;
	} else {
		T el = topp.getElement();
		topp = topp.getNeste();
		antall--;
		return el;
	}
}

public T peek() {
	if (erTom()) {
		System.out.println("Stabelen er tom");
		return null;
	} else {
		return topp.getElement();
	}
}

public boolean erTom() {
 return (antall == 0);
}
// andre metoder gitt i spørsmålene nedenfor
}//class
