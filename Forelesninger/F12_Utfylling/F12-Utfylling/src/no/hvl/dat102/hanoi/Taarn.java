package no.hvl.dat102.hanoi;

public class Taarn {
	private int antallRinger;

	// Setter opp spillet med spesifisert antall ringer.
	public Taarn(int startRinger) {
		antallRinger = startRinger;
	}

	// Utfører det første kallet til flyttRinger.
	// Flytter ringene fra tårn 1 til tårn 3 ved å bruke tårn 2.
	public void spill() {
		flyttRinger(antallRinger, 1, 3, 2);
	}

	// Flytter det spesifiserte antallet ringer fra et tårn til et annet ved å
	// flytte n-1 ringer, deretter flytte en ring og til slutt flytte den de n-1
	// ringene.
	private void flyttRinger(int antRinger, int start, int slutt, int temp) {
		if (antRinger == 1) {// Basistilfellet
			flyttEnRing(start, slutt);
		} else {// Rolleskifte fra, til, mellom,
			flyttRinger(antRinger - 1, start, temp, slutt);
			flyttEnRing(start, slutt);
			flyttRinger(antRinger - 1, temp, slutt, start);
		}
	}

	// Skriver ut mellomresultatene ved flytting.
	private void flyttEnRing(int start, int slutt) {
		System.out.println("Flytt  en ring fra " + start + " til " + slutt);
	}

}
