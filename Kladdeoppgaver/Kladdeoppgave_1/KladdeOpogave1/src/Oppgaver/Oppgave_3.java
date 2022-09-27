package Oppgaver;

public class Oppgave_3 {
	private int[][] dobbeltab = new int[4][5];
	//skrive ein metode som seier om ein tabell er symmetrisk eller ikkje
	
	public boolean erSymmetrisk(int j, int x) {
		boolean symmetrisk = true;
		
		for (int i = 0; i<j; i++) {
			for (int o = i+1; o<j; o++) {
				if (dobbeltab[i][o]!=dobbeltab[o][i]) {
					symmetrisk = false;
				}
			}
		}
return symmetrisk;
}
}