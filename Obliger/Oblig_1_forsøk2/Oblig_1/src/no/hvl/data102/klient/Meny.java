package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.Sjanger;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private Filmarkiv filmarkiv;
	
	public Meny(Filmarkiv filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv=filmarkiv;
	}
	
	public void start() {
		Film HarryPotter = new Film(1,"J.K Rowling","Harry Potter", 2002, Sjanger.ACTION, "Warner Bros");
		Film StarWars = new Film(2,"George Lucas","Star Wars", 1990, Sjanger.ACTION, "Disney");
		Film SpiderMan = new Film(3,"Stan Lee", "Spider Man", 2000, Sjanger.ACTION, "Marvel");
		filmarkiv.leggTilFilm(SpiderMan);
		filmarkiv.leggTilFilm(StarWars);
		filmarkiv.leggTilFilm(HarryPotter);
	}
	
	public Tekstgrensesnitt getTekst() {
		return tekstgr;
	}

}
