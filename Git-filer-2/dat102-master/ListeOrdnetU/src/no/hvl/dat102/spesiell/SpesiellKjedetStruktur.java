package no.hvl.dat102.spesiell;

public class SpesiellKjedetStruktur<T> {
	private int antall; // antall elementer i mengden
	private LinearNode<T> start;

	public SpesiellKjedetStruktur() {
		antall = 0;
		start = null;
	}

	public void leggTil(T element) {

		LinearNode<T> nyNode = new LinearNode<T>(element);

		nyNode.setNeste(start);
		start = nyNode;
		antall++;
	}

	public boolean erTom() {
		return (antall() == 0);
	}

	public int antall() {
		return antall;
	}

	public String toString() {
		String resultat = "";
		LinearNode<T> aktuell = start;
		while (aktuell != null) {

			resultat = resultat + aktuell.getElement().toString();
			aktuell = aktuell.getNeste();
		}

		return resultat;
	}

	public void snuKjedetStruktur() {

		              // s peker på første noden i strukturen som
		     		 // skal snues(reverseres).
		             // initier r, den reverserte strukturen,
					// til den tomme listen
		            // så lenge ulik null{
		            // La n peke på s sin første node
			        // La nå s peke på resten av strukturen
			        // Kjed n til resten av r
			       //  og la r peke på dens nye første node
	               // }
		          // Til slutt, la start peke på den reverserte
					// kjedete strukturen.
		
		LinearNode<T> r, n, s;
	}// metode

	public int finnAntallLike(T el) {
		LinearNode<T> p = start;
		int antallLike = 0;

		while (p != null) {
			if (p.getElement().equals(el)) {//

				antallLike++;
			}
			p = p.getNeste();
		} // while
		return antallLike;
	}

	public void leggTilBak(T el, T nyttElement) {
		/*
		 * som legger til en ny node med elementet nyttElement rett bak noden med
		 * elementet el. Dersom el ikke fins i strukturen, skal den nye noden plasseres
		 * inn helt framme.
		 */

		LinearNode<T> p = start;
		boolean funnet = false;
		LinearNode<T> nyNode = new LinearNode<T>(nyttElement);

		if (p == null) {// Tom struktur
			start = nyNode;
		} else {// Ikke-tom struktur
			while (p != null && !funnet) {
				//...
			} // while

			if (!funnet) {// Innsetting foran
				nyNode.setNeste(start);
				start = nyNode;
			}
			antall++;
		} // metode
	}

}
