package no.hvl.dat102.mengde.klient;

public class Bingokule {
// Til � representer 'bingo-verdier' B10, N43, ... osv
//
	private char bokstav;
	private int tall;

	/**
	 * Konstrukt�r
	 * 
	 * @param verdi mellom 1 og 75
	 */
	public Bingokule(int verdi) {
		tall = verdi;
		if (verdi <= 15)
			bokstav = 'B';
		else if (verdi <= 30)
			bokstav = 'I';
		else if (verdi <= 45)
			bokstav = 'N';
		else if (verdi <= 60)
			bokstav = 'G';
		else
			bokstav = 'O';
	}

	/**
	 * Tester om to bingokuler er like
	 * 
	 * @param k2 bingokule
	 **/
	// hashCode er tema senere.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bokstav;
		result = prime * result + tall;
		return result;
	}

	@Override
	public boolean equals(Object ny) {
		if (this == ny) {
			return true;
		}
		if (ny == null) {
			return false;
		}
		if (getClass() != ny.getClass()) {
			return false;
		}

		Bingokule b2 = (Bingokule) ny; // N�dvendig typekonvertering
		return (tall == b2.tall && bokstav == b2.bokstav);
	}

	/**
	 * Strengrepresentasjon av bingokule
	 * 
	 */
	@Override
	public String toString() {
		return bokstav + " " + tall;
	}
}// class
