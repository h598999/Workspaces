package no.hvl.data100;

import no.hvl.data102ADT.FilmarkivADT;
import no.hvl.data102ADT.Sjanger;
import no.hvl.data102ADT.LinearNode;

public class Filmarkiv_2_2 implements FilmarkivADT {
	
	private int antall;
	private LinearNode<Film> start;

	@Override
	public Film finnFilm(int nr) {
		LinearNode<Film> film = start;
		boolean funnet = false;
		int i = 0;
		while(i<antall&&!funnet) {
			if (film.getElement().getFilmnr()==nr) {
				funnet = true;
			} else {
				film = film.getNeste();
				i++;
			}
		}
		if (funnet)
			return film.getElement();
		else
			return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> film = new LinearNode<Film>(nyFilm);
		film.setNeste(start);
		start = film;
		antall++;
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean slettet = false;
		LinearNode<Film> film = new LinearNode<Film>(finnFilm(filmnr));
		LinearNode<Film> temp = start;
		LinearNode<Film> forrige = null;
		int i = 0;
			while(i<antall&&!slettet&&finnFilm(filmnr)!=null) {
				if (temp == film) {
					slettet = true;
			} else {
				forrige = temp;
				temp = temp.getNeste();
				i++;
			}
		}
			if (temp==start&&slettet) {
				start = start.getNeste();}
			else if (slettet) {
					forrige.setNeste(temp.getNeste());
				}
			return slettet;
			}
		
	

	@Override
	public Film[] soekTittel(String delstreng) {
		int tittelantall = 0;
		Film[] titteltab = new Film[antall];
		LinearNode<Film> film = start;
		for (int i = 0; i<antall; i++) {
			if (film.getElement().getTittel().contains(delstreng)){
				titteltab[tittelantall] = film.getElement();
				tittelantall++;
			}
			film = film.getNeste();
		}
		return trimTab(titteltab, tittelantall);
	}

	@Override
	public int antall(Sjanger sjanger) {
		int sjangerantall = 0;
		LinearNode<Film> film = start;
		for (int i = 0; i<antall; i++) {
			if (film.getElement().getSjanger()==sjanger) {
				sjangerantall++;
			}
			film = film.getNeste();
		}
		return sjangerantall;
	}

	@Override
	public int antall() {
		return antall;
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		// n er antall elementer 
		Film[] nytab = new Film[n];
		int i = 0;
		while (i < n) {
		nytab[i] = tab[i];
		i++;
		}
		return nytab;
		}

}
