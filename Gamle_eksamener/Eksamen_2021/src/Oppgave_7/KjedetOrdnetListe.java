package Oppgave_7;

import Ekstra.LinearNode;

public class KjedetOrdnetListe<T extends Comparable<T>> {
private int antall;
private LinearNode<T> foerste;
private LinearNode<T> siste;

//get – og set-metoder kan du anta
public void snu() {

	LinearNode<T> aktuell = null;
	LinearNode<T> forrige = null;
	LinearNode<T> temp = foerste;
	siste = foerste;
	while(temp!=null) {
		forrige = temp;
		temp = temp.getNeste();
		forrige.setNeste(aktuell);
		aktuell = forrige;
	}
	foerste = aktuell;
	
}

public LinearNode<T> finnNySiste() {
	LinearNode<T> temp = foerste;
	while(temp.getNeste()!=null) {
		temp = temp.getNeste();
	}
	return temp;
}
public boolean erLike(KjedetOrdnetListe<T> denAndre) {
if (antall == denAndre.antall){
return erLikeRek(foerste, denAndre.foerste);
} else {
return false;
}
}
public boolean erLikeRek(LinearNode<T> foerste, LinearNode<T> denAndreFoerste) {
	
	if (foerste == null) {
		return true;
	} else {
		if (foerste.getElement().equals(denAndreFoerste.getElement())) {
			return erLikeRek(foerste.getNeste(),denAndreFoerste.getNeste());
		} else {
			return false;
		}
	}
}

public T finnNestMinste() {
	LinearNode<T> minste = foerste;
	LinearNode<T> nestMinst = foerste;
	LinearNode<T> aktuell = foerste.getNeste();
	while(aktuell!=null) {
		if (minste.getElement().compareTo(aktuell.getElement())<0) {
			nestMinst = minste;
			minste = aktuell;
		} else {
			if(nestMinst.getElement().compareTo(aktuell.getElement())<0) {
				nestMinst = aktuell;
			}
		}
		aktuell = aktuell.getNeste();
	}
	return nestMinst.getElement();
}

public boolean likeRek(LinearNode<T> foerste, LinearNode<T> denAndreFoerste) {
	if (foerste == null) {
		return true;
	} else {
		if (foerste.getElement().equals(denAndreFoerste.getElement())) {
			return likeRek(foerste.getNeste(), denAndreFoerste.getNeste());
		} else {
			return false;
		}
	}
}

}