package no.hvl.data100;

import no.hvl.data102ADT.FilmarkivADT;
import no.hvl.data102ADT.LinearNode;
import no.hvl.data102ADT.Sjanger;

public class Filmarkiv_2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv_2() {
		antall = 0;	
	}

	@Override
	public Film finnFilm(int nr) {
		LinearNode<Film> finn = start;
		boolean funnet = false;
		int i = 0;
		
		while (!funnet&&i<antall) {
			if (finn.getElement().getFilmnr()==nr) {
				funnet = true;
			} else {
				finn = finn.getNeste();
			}	
		}
		if (funnet)
			return finn.getElement();
		else
			return null;
		
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> neste = new LinearNode<Film>(nyFilm);
	
		neste.setNeste(start);
		start = neste;
		antall++;
;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> leite = start;
		LinearNode<Film> forrige = new LinearNode<Film>();
		boolean slettet = false;
		int i = 0;
		while(i<antall&&!slettet) {
			if (filmnr==leite.getElement().getFilmnr()) {
				slettet = true;
			} else {
				forrige = leite;
				leite = leite.getNeste();
				i++;
			}
		}
		if (leite==start&&slettet) {
			start = start.getNeste();
			antall--;
		} else if (slettet) {
			forrige.setNeste(leite.getNeste());
			antall--;
		}
		
		return slettet;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		LinearNode<Film> tittelnode = start;
		Film[] titteltab = new Film[antall];
		int antaltitteltab = 0;
		for (int i = 0; i<antall; i++) {
			if (tittelnode.getElement().getTittel().contains(delstreng)) {
				titteltab[antaltitteltab] = tittelnode.getElement();
				antaltitteltab++;
			}
			tittelnode = tittelnode.getNeste();
		}
		return trimTab(titteltab, antaltitteltab);
		
	}

	@Override
	public int antall(Sjanger sjanger) {
		int sjangerantall = 0;
		LinearNode<Film> sjangernode = start;
		for (int i = 0; i<antall; i++) {
			if (sjangernode.getElement().getSjanger()==sjanger) {
				sjangerantall++;
			}
			sjangernode = sjangernode.getNeste();
		}
		return sjangerantall;
	}

	@Override
	public int antall() {
		return antall;
	}
	
	public LinearNode<Film> getStart() {
		return start;
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
