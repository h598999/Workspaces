package no.hvl.data100;


import no.hvl.data102ADT.LinearNode;
import no.hvl.data102ADT.Sjanger;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Filmarkiv_2 filmarkiv = new Filmarkiv_2();
		Film HarryPotter = new Film(1,"J.K Rowling","Harry Potter", 2002, Sjanger.ACTION, "Warner Bros");
		Film StarWars = new Film(2,"George Lucas","Star Wars", 1990, Sjanger.ACTION, "Disney");
		Film SpiderMan = new Film(3,"Stan Lee", "Spider Man", 2000, Sjanger.ACTION, "Marvel");
	
		filmarkiv.leggTilFilm(SpiderMan);
		filmarkiv.leggTilFilm(StarWars);
		filmarkiv.leggTilFilm(HarryPotter);
		System.out.println(filmarkiv.antall());
		filmarkiv.slettFilm(2);
		System.out.println(filmarkiv.antall());
		filmarkiv.slettFilm(1);
		LinearNode<Film> neste = filmarkiv.getStart();
		for (int i = 0; i<filmarkiv.antall(); i++) {
			System.out.println(neste.getElement().toString());
			neste = neste.getNeste();
		} 
		System.out.println(filmarkiv.antall());
		}
		

	}


