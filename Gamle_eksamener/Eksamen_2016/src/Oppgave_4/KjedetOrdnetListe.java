package Oppgave_4;

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
	
	boolean funnet = false;
	int i = 0;
	LinearNode<T> temp = første;
	while(i<antall&&!funnet) {
		if (temp.getElement().equals(element)) {
			funnet = true;
		} else {
			temp = temp.getNeste();
			i++;
		}
	}
	return funnet;
}
public void settInn(T element){

	boolean sattinn = false;
	int i = 0;
	LinearNode<T> nyNode = new LinearNode<T>(element);
	LinearNode<T> temp = første;
	LinearNode<T> forrige = temp;
	
	if (element.compareTo(første.getElement())<=0) {
		nyNode.setNeste(første);
		første = nyNode;
		antall++;
	} else {
	
	while (i<antall&&!sattinn) {
		if (element.compareTo(temp.getElement())>0) {
		forrige = temp;
		temp = temp.getNeste();
		} else {
			forrige.setNeste(nyNode);
			nyNode.setNeste(temp);
			antall++;
			sattinn= true;
		}
	}
	}
}



public void flette(KjedetOrdnetListe<T> L2){
	LinearNode<T> temp = L2.første;
	for (int i = 0; i<L2.antall; i++) {
		this.settInn(temp.getElement());
		temp = temp.getNeste();
	}
	L2.reset();
}

public void setFørste(T el) {
	første = new LinearNode<T>(el);
}

public void reset() {
	første = null;
	antall = 0;
}

}//class