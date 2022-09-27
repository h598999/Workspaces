package Oppgave_4;

import Ekstra.LinearNode;

public class KjedetUordnetListe<T extends Comparable<T>> {
private int antall;
private LinearNode<T> foerste;
public KjedetUordnetListe() {
antall = 0;
foerste = null;
}

public void settInn(T el) {
	LinearNode<T> nyNode = new LinearNode<T>(el);
	if (antall==0) {
		foerste = nyNode;
		antall++;
	} else {
		nyNode.setNeste(foerste);
		foerste = nyNode;
	}
}

public void fluttFoersteTilSiste() {
	LinearNode<T> temp = foerste;
	while(temp.getNeste()!=null) {
		temp = temp.getNeste();
	}
	T mid = temp.getElement();
	temp.setElement(foerste.getElement());
	foerste.setElement(mid);
}

public T finnNestMinste() {
	if (antall>2) {
		return null;
	} else {
		LinearNode<T> minste = foerste;
		LinearNode<T> nestMinste = foerste;
		LinearNode<T> denne = foerste.getNeste();
		while (denne!=null) {
			if (denne.getElement().compareTo(minste.getElement())<0) {
				nestMinste = minste;
				minste = denne;
			} else {
				if (denne.getElement().compareTo(nestMinste.getElement())<0) {
					nestMinste = denne;
				}
			}
			denne = denne.getNeste();
		}
		return nestMinste.getElement();
}
}
public String toString() {
	return toString(foerste);
}

	private String toString(LinearNode<T> p) {
		
		String str = "";
		if (p!=null) {
			str += p.getElement().toString() + "\n" + toString(p.getNeste());
		}
		return str;
	}
}

