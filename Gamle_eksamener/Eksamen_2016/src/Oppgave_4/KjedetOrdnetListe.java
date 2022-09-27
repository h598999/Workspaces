package Oppgave_4;

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
	
	boolean funnet = false;
	int i = 0;
	LinearNode<T> temp = f�rste;
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
	LinearNode<T> temp = f�rste;
	LinearNode<T> forrige = temp;
	
	if (element.compareTo(f�rste.getElement())<=0) {
		nyNode.setNeste(f�rste);
		f�rste = nyNode;
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
	LinearNode<T> temp = L2.f�rste;
	for (int i = 0; i<L2.antall; i++) {
		this.settInn(temp.getElement());
		temp = temp.getNeste();
	}
	L2.reset();
}

public void setF�rste(T el) {
	f�rste = new LinearNode<T>(el);
}

public void reset() {
	f�rste = null;
	antall = 0;
}

}//class