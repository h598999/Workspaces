package no.hvl.dat102.adt;
import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
public interface FilmarkivADT {
	/**
	 * Viser en film
	 * @param nr nummer p� film som skal vises. Om nummeret ikke finnes,
	 * skrives en feilmelding
	 * @return viss filmen finnes returneres filmen med gitt nummer, elles returneres null
	 */
	Film visFilm(int nr);
	
	/**
	 * Legger til en ny film
	 * @param nyFilm
	 */
	void leggTilFilm(Film nyFilm);
	
	/**
	 * Sletter en film med gitt filmnr
	 * @param filmnr nr p� film som skal slettes
	 * @return true dersom filen ble slettet, false ellers
	 */
	boolean slettFilm(int filmnr);
	/**
	 * S�ker og henter Filmer med en gitt delstreng i tittelen
	 * @param delstreng som m� v�re i tittel
	 * @return tabell med filmer som har delstreng i tittelen
	 */
	Film[] soekTittel(String delstreng);
	
	/**
	 * Finner antall filmer med gitt sjanger
	 * @param sjanger
	 * @return antall filmer av gitt sjanger
	 */
	int antallsjanger(Sjanger sjanger);
	/**
	 * 
	 * @return antall filmer i arkivet
	 */
	int antall();
	
	/**
	 * 
	 * @return tabellen i filmarkivet
	 */
	Film[] getTab();
}
