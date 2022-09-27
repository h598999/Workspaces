package no.hvl.dat102.klient;

public class Labyrint {
	
	private final int FORSOEKT = 2;
	//Blir ikke brukt i denne implementasjonen
	private static final int STI = 3;

	private int[][] gridd = {
			{ 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 }, 
			{ 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0 }, 
			{ 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1 }, 
			{ 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
			
	 
	/**
	 * Marker posisjonen som forsøkt
	 */
	public void forsoekPosisjon(int rekke, int kolonne) {
		gridd[rekke][kolonne] = FORSOEKT;
	}

	/**
	 * 
	 * @return antall rekker
	 */
	public int getRekker() {
		return gridd.length;
	}

	/**
	 * 
	 * @return antall kolonner
	 */
	public int getKolonner() {
		return gridd[0].length;
	}

	/**
	 * Marker posisjonen som del av stien
	 * Blir ikke brukt i denne implementasjonen
	 */
	public void markerSti(int rekke, int kolonne) {
		gridd[rekke][kolonne] = STI;
	}

	public boolean gyldigPosisjon(int rekke, int kolonne) {
		boolean resultat = false;
		// sjekk på innenfor griddet
		if (rekke >= 0 && rekke < gridd.length && kolonne >= 0 && kolonne < gridd[rekke].length) {
			// sjekk på ikke-sperret og ikke forsøkt
			
			if (gridd[rekke][kolonne] == 1) {
				resultat = true;
			}
		}
		return resultat;
	}

	/**
	 * /* Returnerer en strengrepresentasjon av labyrinten.
	 * 
	 */
	@Override
	public String toString() {
		String resultat = "\n";
		for (int rekke = 0; rekke < gridd.length; rekke++) {
			for (int kolonne = 0; kolonne < gridd[rekke].length; kolonne++) {
				resultat += gridd[rekke][kolonne] + "";
			}
			resultat += "\n";
		}
		return resultat;
	}
}// class
