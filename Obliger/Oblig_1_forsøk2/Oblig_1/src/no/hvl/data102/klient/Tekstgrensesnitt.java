package no.hvl.data102.klient;

import javax.swing.JOptionPane;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.Sjanger;

public class Tekstgrensesnitt {
	
	public Film lesFilm() {
		String filmnummerString = JOptionPane.showInputDialog("Skriv inn nummeret på filmen");
		String produsent = JOptionPane.showInputDialog("Skriv inn navnet på produsenten ");
		String tittel = JOptionPane.showInputDialog("Skriv inn tittelen til filmen");
		String lanseringString = JOptionPane.showInputDialog("Skriv inn lanseringsåret til filmen");
		String sjangerString = JOptionPane.showInputDialog("Skriv inn sjangeren til filmen");
		String filmselskap = JOptionPane.showInputDialog("Skriv navnet på filmselskapte som publisertefilmen");
		int filmnr = Integer.parseInt(filmnummerString);
		int lansering = Integer.parseInt(lanseringString);
		Sjanger sjanger = Sjanger.valueOf(sjangerString.toUpperCase());
		Film film = new Film(filmnr,produsent,tittel,lansering,sjanger,filmselskap);
		return film;
		
		
	}
	
	//vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		System.out.println(film.toString());
	}
	
	public void skrivUtFilmDelStrengItittel(Filmarkiv filmer, String delstreng) {
	Film[] utskrifttab = filmer.soekTittel(delstreng);
	for (int i = 0; i<utskrifttab.length; i++) {
		System.out.println(utskrifttab[i].toString());
	}
	}
	
	//Skriver ut alle Filmer av en produsent
	public void skrivUtFilmProdusent(Filmarkiv filmer, String delstreng) {
		Film[] produsenttab = filmer.soekProdusent(delstreng);
		for (int i = 0; i<produsenttab.length; i++) {
			System.out.println(produsenttab[i].toString());
		}
	}
	
	//Skriver ut en enkel statistikk som inneholder antall Filmere totalt
	//og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(Filmarkiv filmer) {
		System.out.println("Det finnes " + filmer.antall() + " filmer i samlingen");
		System.out.println("Det finnes " + filmer.antall(Sjanger.ACTION) + " actionfilmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.DRAMA) + " dramafilmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.History) + " historiefilmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.SCIFI) + " SciFi filmer");
		System.out.println("Det finnes " + filmer.antall(Sjanger.SKREKK) + " Skrekkfilmer");
	}
	

}
