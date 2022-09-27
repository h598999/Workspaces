package OPpgave_5;

import Ekstra.LinearNode;

public class KjedetOrdnetListe<T extends Comparable<T>> {
private int antall; // antall elementer
private LinearNode<T> foerste, siste;
/**
* Lager en ny tom liste.
*/
public KjedetOrdnetListe() {
 antall = 0;
 foerste = null;
 siste = null;
}
 //�
 public int finnAntallMindre(T element) {
	 int antallMindre = 0;
	 LinearNode<T> temp = foerste;
	 for (int i = 0; i<antall; i++) {
		 if (temp.getElement().compareTo(element)<0) {
			 antallMindre++;
		 }
	 }
	 return antallMindre;
}
 public void fjernDuplikater() {
	 
	 LinearNode<T> denne = foerste;
	 LinearNode<T> p = null;
	 LinearNode<T> etterfoelger = null;
	 
	 while(denne!=null) {
		  p = denne;
		  etterfoelger = denne.getNeste();
		 
	  while (etterfoelger != null && denne.getElement().equals(etterfoelger.getElement())) {
		 p = etterfoelger;
		 etterfoelger = etterfoelger.getNeste();
	 }
	 
	 if (p!=denne) {
		 denne.setNeste(p.getNeste());
		 denne = etterfoelger;
	 } else {
		 denne = denne.getNeste();
	 }
	 
}
	 
	 if (p.getNeste()==null) {
		 siste = denne;
	 }
	 
}
}