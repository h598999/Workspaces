package Oppgave_2;

public class DobbeltKjedetOrdnetListe<T extends Comparable<T>> {
	
	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;
	
	public DobbeltKjedetOrdnetListe(T minVerdi, T maksVerdi) {
		
		foerste = new DobbelNode<T>(minVerdi);
		siste = new DobbelNode<T>(maksVerdi);
		antall = 0;
		
		foerste.setNeste(siste);
		siste.setForrige(foerste);
		
	}
	
	public void leggTil(T el) {
	
		if (el.compareTo(foerste.getElement())<=0||el.compareTo(siste.getElement())>=0) {
			System.out.println("Ulovlig verdi");
			return;
		}
		
		DobbelNode<T> nyNode = new DobbelNode<T>(el);
	
		if (erTom()) {
			foerste.setNeste(nyNode);
			nyNode.setForrige(foerste);
			nyNode.setNeste(siste);
			siste.setForrige(nyNode);
			antall++;
		} else {
			DobbelNode<T> temp = foerste.getNeste();
			DobbelNode<T> forrige = foerste;
			boolean funnet = false;
			int i = 0;
			while(!funnet&&i<antall) {
				if (el.compareTo(temp.getElement())<0) {
					forrige.setNeste(nyNode);
					nyNode.setForrige(forrige);
					nyNode.setNeste(temp);
					temp.setForrige(nyNode);
					antall++;
					funnet = true;
				} else {
					forrige = temp;
					temp = temp.getNeste();
					i++;
				}
			}
			if (!funnet) {
				DobbelNode<T> forrigeSiste = siste.getForrige();
				forrigeSiste.setNeste(nyNode);
				nyNode.setNeste(siste);
				nyNode.setForrige(forrigeSiste);
				siste.setForrige(nyNode);
				antall++;
			}
			
			
		}
		
	}
	
	public void skrivUt() {
		DobbelNode<T> temp = foerste.getNeste();
		for (int i = 0; i<antall; i++) {
			System.out.println(temp.getElement());
			temp = temp.getNeste();
		}
	}
	
	public boolean erTom() {
		return antall==0;
	}
	

}
