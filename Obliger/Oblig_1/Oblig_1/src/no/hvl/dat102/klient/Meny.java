package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv=filmarkiv;
	}
	
	//legger inn en del forhåndsdefinerte filmer
	public void start() {
	Film HarryPotter = new Film(1,"Warner Bros", "HarryPotter", 2000, Sjanger.Action, "Warner Bros");
	Film StarWars = new Film(2,"Disney", "StarWars", 2017, Sjanger.Action, "Disney");
	filmarkiv.leggTilFilm(StarWars);
	filmarkiv.leggTilFilm(HarryPotter);
	}

}
