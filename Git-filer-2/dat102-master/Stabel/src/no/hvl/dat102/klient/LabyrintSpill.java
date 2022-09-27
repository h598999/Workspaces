package no.hvl.dat102.klient;

import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.kjedet.KjedetStabel;
import no.hvl.dat102.tabell.TabellStabel;

public class LabyrintSpill {
	private Labyrint labyrint;

	public LabyrintSpill(Labyrint labyrint) {
		this.labyrint = labyrint;
	}

	/**
	 * Forsøke å gjennomgå labyrinten
	 */

	public boolean gjennomgaa() {
		boolean ferdig = false;
		Posisjon pos = new Posisjon();
		//StabelADT<Posisjon> stabel = new TabellStabel<>();
		StabelADT<Posisjon> stabel = new KjedetStabel<>();
		stabel.push(pos);

		while (!stabel.erTom() && !(ferdig)) {
			pos = stabel.pop();
			labyrint.forsoekPosisjon(pos.getX(), pos.getY());
			if (pos.getX() == labyrint.getRekker() - 1 && pos.getY() == labyrint.getKolonner() - 1) {
				ferdig = true; // labyrinten er gjennomgått
			} else {
				push_ny_pos(pos.getX(), pos.getY() - 1, stabel);
				push_ny_pos(pos.getX(), pos.getY() + 1, stabel);
				push_ny_pos(pos.getX() - 1, pos.getY(), stabel);
				push_ny_pos(pos.getX() + 1, pos.getY(), stabel);
			}
		} // while

		return ferdig;
	}

	private void push_ny_pos(int x, int y, StabelADT<Posisjon> stabel) {
		Posisjon nypos = new Posisjon();
		nypos.setX(x);
		nypos.setY(y);
		if (labyrint.gyldigPosisjon(x, y)) {
			stabel.push(nypos);
		}
	}
}// class
