package no.hvl.data102klient;
import javax.swing.JOptionPane;

import no.hvl.data100.Film;
import no.hvl.data100.Filmarkiv;
import no.hvl.data102ADT.Sjanger;
public class Tekstgrensesnitt {
	


	
	//lese opplysningene om en Film fra tastatur
	public Film lesFilm() {
		String filmnrString = JOptionPane.showInputDialog("Skriv inn nummeret til filmen");
		String produsent = JOptionPane.showInputDialog("Skriv inn navnet på personen som produserer filmen");
		String tittel = JOptionPane.showInputDialog("Skriv inn tittelen på filmen");
		String lanseringString = JOptionPane.showInputDialog("Skriv inn lanseringsåret til filmen");
		String sjangerString = JOptionPane.showInputDialog("Skriv inn sjangeren til filmen");
		String filmselskap =JOptionPane.showInputDialog("Skriv inn navnet på filmselskapet som har lagd denne filmen");
		int filmnr =Integer.parseInt(filmnrString);
		int lansering = Integer.parseInt(lanseringString);
		Sjanger sjanger = Sjanger.valueOf(sjangerString.toUpperCase());
		Film film = new Film(filmnr, produsent, tittel, lansering, sjanger , filmselskap);
		return film;
		}
	
	public void visFilm(Film film) {
		System.out.println(film.toString());
	}
	
	//vise en film med alle opplysninger på skjerm(husk tekst for sjanger
	public void skrivUtFilmDelstrengITittel(Filmarkiv filmer, String delstreng) {
		Film[] titteltab = filmer.soekTittel(delstreng);
		for (int i = 0; i<titteltab.length; i++) {
			System.out.println(titteltab[i].toString());
		}
	}
	//Skrive ut en enkel statistikk som inneholder antall filmer totalt
	//og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(Filmarkiv filmer) {
		System.out.println("Det finnes " + filmer.antall() + " filmer i samlingen");
		System.out.println("Det finnes " + filmer.antall(Sjanger.ACTION) + " actionfilmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.DRAMA) + " dramafilmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.HISTORIE) + " historiefilmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.SCI_FI) + " SciFi filmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.SKREKK) + " Skrekkfilmer");
	}
}
