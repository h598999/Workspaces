package no.hvl.dat102;
import no.hvl.dat102.adt.ParADT;

public class Par<T extends Comparable<T>> implements ParADT<T> {
	private T foerste;
	private T andre;

	public Par() {
		foerste = null;
		andre = null;
	}

	public Par(T foerste, T andre) {
		this.foerste = foerste;
		this.andre = andre;
	}

	public T getFoerste() {
		return foerste;
	}

	public T getAndre() {
		return andre;
	}

	public void setFoerste(T nyFoerste) {
		foerste = nyFoerste;
	}

	public void setAndre(T nyAndre) {
		andre = nyAndre;
	}

	@Override
	public void bytte() {
		T temp = foerste;
		foerste = andre;
		andre = temp;
	}

	public String toString() {
		return "(" + foerste + "," + andre + ")";
	}

	@Override
	public T maks() {
		if (foerste.compareTo(andre) >= 0) {
			return foerste;
		} else {
			return andre;
		}

	} // metode
}// class
