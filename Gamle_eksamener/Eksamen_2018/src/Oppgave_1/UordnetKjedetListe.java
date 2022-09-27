package Oppgave_1;

public class UordnetKjedetListe<T extends Comparable <T>>  {

	private int antall;
	private LinearNode<T> foerste;
	private LinearNode<T> siste;
	
	public UordnetKjedetListe () {
		antall = 0;
		foerste = null;
		siste = null;
	}
	
	public int antallLike(T el) {
		int antallLike = 0;
		LinearNode<T> temp = foerste;
		for (int i = 0; i<antall; i++) {
			
			if (temp.getElement().equals(el)) {
				antallLike++;
			} else {
				temp = temp.getNeste();
			}
			
		}
		return antallLike;
	}
	
	public void leggTil(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		if (erTom()) {
			foerste = nyNode;
			siste = nyNode;
			foerste.setNeste(siste);
			antall++;
		} else {
			siste.setNeste(nyNode);
			siste = nyNode;
			antall++;
		}
	}
	
	public T minste() {
	
		if (erTom()) {
			return null;
		} else {
			LinearNode<T> temp = foerste;
			T minste = temp.getElement();
			for (int i = 0; i<antall; i++) {
				temp = temp.getNeste();
				if (temp.getElement().compareTo(minste)<0) {
					minste = temp.getElement();
				}
			}
			return minste;
		}
		
	}
	
	public boolean inneholder(T element) {
		return inneholderRek(foerste, element);
	}
	
	private boolean inneholderRek(LinearNode<T> denne, T element) {
		
		if (denne.getElement().equals(element)) {
			return true;
		} else if(denne.getNeste()==null) {
			return false;
		} else {
			return (inneholderRek(denne.getNeste(), element));
		}
		
	}
			
	public boolean erTom() {
		return antall==0;
	}
	
	public int getAntall() {
		return antall;
	}
	
	public LinearNode<T> getFoerste() {
		return foerste;
	}
}
