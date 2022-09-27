package no.hvl.dat102.klient;

import javax.swing.JOptionPane;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Tekstgrensesnitt {
	
	//lese opplysningene om en FILM fra tastatur
	public Film lesFilm(FilmarkivADT filmarkiv) {
		String input = JOptionPane.showInputDialog("Skriv inn nummeret på filmen, produsenten, eller tittelen på filmen");
		Film film = new Film();
		int x = Integer.parseInt(input);
		if (x>=0) {
			film = filmarkiv.visFilm(x);
		} else if(filmarkiv.soekTittel(input)!=null) {
			film=filmarkiv.soekTittel(input)[0];
		} else {
			int i = 0;
			boolean funnet = false;
			while ( i<filmarkiv.antall()&&!funnet) {
				if (filmarkiv.getTab()[i].getProdusent().contains(input)) {
					film = filmarkiv.getTab()[i];
					funnet = true;
				} else {
					i++;
				}
			}
		}
				
		
		return film;
		
	}
	
	//vise en film med alle opllysninger på skjerm ( husk tekst for sjanger)
	public void visFilm(Film film) {
		System.out.println(film.toString());
	}
	
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
	Film[] utskrift = filma.soekTittel(delstreng);
	for (int i = 0; i<utskrift.length; i++) {
		System.out.println(utskrift[i].toString());
	}
	}
	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
	
	for (int i = 0; i<filma.antall(); i++) {
		if (filma.getTab()[i].getProdusent().contains(delstreng)||filma.getTab()[i].getFilmselskap().contains(delstreng)) {
			System.out.println(filma.getTab()[i].toString());
		}
	}
		
	}
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
	String str = "Det finnes "  + filma.antall() + "antall filmer i dette arkivet";
	String sjangerer = "Det finnes " + filma.antallsjanger(Sjanger.Action) + "Actionfilmer" + "," + filma.antallsjanger(Sjanger.komedie) + " komedier" + "," + filma.antallsjanger(Sjanger.Skrekk) + " Skrekkfilmer";
	System.out.println(str);
	System.out.println(sjangerer);
	
	}
	

	
	

}
