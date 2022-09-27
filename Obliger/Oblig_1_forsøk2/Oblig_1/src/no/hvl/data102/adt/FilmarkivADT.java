package no.hvl.data102.adt;

import no.hvl.data102.Film;

public interface FilmarkivADT {
/**
* Viser en film
* @param nr nummer på film som skal vises. Om nummeret ikke finnes,
* skrives en feilmelding.
*/
void visFilm(int nr);
/**
* Legger til en ny film.
* @param nyFilm
*/
void leggTilFilm(Film nyFilm);
/**
* Sletter en fil med gitt nr
* @param filmnr nr på film som skal slettes
* @return true dersom filmen ble slettet, false ellers
*/
boolean slettFilm(int filmnr);

/**
* Søker og henter Filmer med en gitt delstreng i tittelen.
* @param delstreng som må være i tittel
* @return tabell med filmer som har delstreng i tittel
*/
Film[] soekTittel(String delstreng);
/**
* Finner antall filmer med gitt sjanger
* @param sjanger 
* @return antall filmer av gitt sjanger.
*/
int antall(Sjanger sjanger);
/**
* 
* @return antall filmer i arkivet
*/
int antall();

}