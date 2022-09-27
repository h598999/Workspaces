package no.hvl.data102klient;
import no.hvl.data100.Film;
import no.hvl.data100.Filmarkiv;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private Filmarkiv filmarkiv;
	
	public Meny(Filmarkiv filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv=filmarkiv;
	}
	
	public void start() {
	Film film1 = tekstgr.lesFilm();
	Film film2 = tekstgr.lesFilm();
	Film film3 = tekstgr.lesFilm();
	filmarkiv.leggTilFilm(film1);
	filmarkiv.leggTilFilm(film2);
	filmarkiv.leggTilFilm(film3);
	}
}
