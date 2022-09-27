package no.hvl.dat102.stiar;

public class Stiar {
	
	static int antallStiar(int rekker, int kolonne, int m, int  n ){  // parameterliste = start posisjon og mål
		//basis
		if (rekker == m || kolonne == n) {//når vi enten er nede til venstre eller oppe til høgre
			return 1;
		}
		//Rekursjon
		//Eit steg til høgre
		int sH = antallStiar(rekker, kolonne+1, m, n);
		//Eit steg ned
		int sN = antallStiar(rekker+1, kolonne, m,n);
		
		return sH + sN;
	}

	public static void main(String[] args) {
		int rekker = 2;
		int kolonner = 2;
		
		// antal stiar frå (1,1) til (4,3)
		System.out.println(antallStiar(1,1,rekker,kolonner));   

	}

}
