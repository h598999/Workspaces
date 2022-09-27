package no.hvl.dat102.labyrint;

public class Labyrint {
	private static final int TRIED = 2;
	private static final int PATH = 3;
	private int antallRekker;
	private int antallKolonner;
	private int[][] gridd = { { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 1, 1 } };

	// Vi kunne lest inn labyrinten fra fil. Her har vi kodet
	// labyrinten direkte i klassen. Vi kan bare gå til celler
	// med 1 og må gå enten opp, ned, til venstre eller høyre

	public Labyrint() {
		antallRekker = gridd.length;
		antallKolonner = gridd[0].length;
	}

	public int getRekker() {
		return antallRekker;
	}

	public int getKolonner() {
		return antallKolonner;
	}

	public void provPosijon(int r, int k) {
		gridd[r][k] = TRIED;
	}

	public void markerSti(int r, int k) {
		gridd[r][k] = PATH;
	}

	public boolean lovlegPosisjon(int r, int k) {
		boolean innanforBrett = (r >= 0) && (r <= antallRekker) && (k >= 0) && (k < antallKolonner);

		// NB! kan ikkje byte rekkefølge. Går i så fall galt om vi er utanfor griddet
		return innanforBrett && gridd[r][k] == 1;
	}

	@Override
	public String toString() {
		String resultat = "\n";
		for (int r = 0; r < antallRekker; r++) {
			for (int k = 0; k < antallKolonner; k++) {
				resultat += gridd[r][k] + " ";
			}
			resultat += "\n";
		}
		return resultat;
	}
}
