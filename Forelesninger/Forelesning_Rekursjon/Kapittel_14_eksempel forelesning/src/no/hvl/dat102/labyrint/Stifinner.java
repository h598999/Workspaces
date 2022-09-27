package no.hvl.dat102.labyrint;

public class Stifinner {
	private Labyrint labyrint;
	
	public Stifinner(Labyrint labyrint) {
		this.labyrint = labyrint;
	}
	
	public boolean finnSti(int r, int k) { // Parameterliste = posisjonen vår i labyrinten gitt ved r og k
		boolean ferdig = false;
		// basissteget blir når posisjon ikkje er lovleg
		if (labyrint.lovlegPosisjon(r, k)) {
			labyrint.provPosijon(r, k);
			if (r == labyrint.getRekker()-1 && k == labyrint.getKolonner()-1) {
				ferdig = true;
			}
		 else {
			ferdig = finnSti(r+1, k);
			if (!ferdig) {
				ferdig = finnSti(r-1,k);
			}
			else if (!ferdig) {
				ferdig = finnSti(r, k+1);
			}
			else if (!ferdig) {
				ferdig = finnSti(r, k-1);
			}
			if (ferdig) {
				labyrint.markerSti(r, k);
			}
		}
		}
		// Rekursive kall
		
		return ferdig;
	}
}


