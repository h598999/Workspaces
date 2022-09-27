package Oppgave_2;

public class DobbeltKjedetOrdnetListe<T extends Comparable <T>> {
private DobbelNode<T> foerste;
private DobbelNode<T> siste;
private int antall;

	
	public DobbeltKjedetOrdnetListe(T minverdi, T maksverdi) {
		foerste = new DobbelNode<T>(minverdi);
		siste = new DobbelNode<T>(maksverdi);
		foerste.setNeste(foerste);
		siste.setForrige(foerste);
		antall = 0;
	}
	
	public void leggTil(T el) {
		
		if (el.compareTo(foerste.getElement())<0||el.compareTo(siste.getElement())>0) {
			System.out.println("Ulovlig verdi");
		}
		
		DobbelNode<T> nyNode = new DobbelNode<T>(el);
		DobbelNode<T> temp = foerste.getNeste();
		while (el.compareTo(temp.getElement())>0) {
			temp = temp.getNeste();
		}
		nyNode.setForrige(temp.getForrige());
		nyNode.setNeste(temp);
		temp.getForrige().setNeste(nyNode);
		temp.setForrige(nyNode);
		
	}
	
	public boolean erTom() {
		return antall==0;
	}


}