package no.hvl.data102.klient;


import no.hvl.data102.Filmarkiv;

public class KlientFilmarkiv {
	
	public static void main(String[] args) {
		Filmarkiv filmer = new Filmarkiv(10);
		Meny meny = new Meny(filmer);
		meny.start();
		filmer.leggTilFilm(meny.getTekst().lesFilm());
		meny.getTekst().skrivUtStatistikk(filmer);
	}

}
