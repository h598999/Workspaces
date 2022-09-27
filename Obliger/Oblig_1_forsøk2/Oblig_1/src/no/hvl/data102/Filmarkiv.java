package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.adt.Sjanger;

public class Filmarkiv implements FilmarkivADT {
	private Film[] filmtab;
	private int størrelse;
	private int antall;
	
	public Filmarkiv(int størrelse) {
		this.størrelse=størrelse;
		filmtab = new Film[størrelse];
	}

	@Override
	public void visFilm(int nr) {
		boolean funnet = false;
		int funnetindeks = -1;
		int i = 0;
		while (i<antall&&!funnet) {
			if (filmtab[i].getFilmnr()==nr) {
				funnetindeks = i;
				funnet = true;
			} else {
				i++;
			}
		}
		if (funnet) {
			System.out.println(filmtab[funnetindeks].toString());
		} else
			System.out.println("finner ikkje filmen");	
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		utvid();
		filmtab[antall] = nyFilm;
		antall++;
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean slettet = false;
		
		int i = 0;
		while(i<antall&&!slettet) {
			if (filmtab[i].getFilmnr()==filmnr) {
				slettet = true;
			} else
				i++;
		}
		if (slettet) {
			filmtab[i] = filmtab[antall];
			filmtab[antall] = null;
			antall--;
		}
		return slettet;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] titteltab = new Film[antall];
		int titteltabantall = 0;
		for (int i = 0; i<antall; i++) {
			if (filmtab[i].getTittel().contains(delstreng)) {
				titteltab[titteltabantall] = filmtab[i];
				titteltabantall++;
			}
		}
		return trimTab(titteltab,titteltabantall);
	}
	
	public Film[] soekProdusent(String delstreng) {
		Film[] produsenttab = new Film[antall];
		int produsenttabantall = 0;
		for (int i = 0; i<antall; i++) {
			if (filmtab[i].getProdusent().equals(delstreng)) {
				produsenttab[produsenttabantall] = filmtab[i];
				produsenttabantall++;
			}
		}
		return trimTab(produsenttab,produsenttabantall);
	}

	@Override
	public int antall(Sjanger sjanger) {
		int sjangerantall = 0;
		for (int i = 0; i<antall; i++) {
			if (filmtab[i].getSjanger()==sjanger) {
				sjangerantall++;
			}
		}
		return sjangerantall;
	}

	@Override
	public int antall() {
		return antall;
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		//n er antall elementer
		Film[] nytab = new Film[n];
		int i = 0;
		while (i<n) {
			nytab[i] = tab[i];
		}
		return nytab;
	}
	private void utvid() {
		if (antall-1==filmtab.length) {
			Film[] nytab = new Film[størrelse*2];
			for (int i = 0; i<antall; i++) {
				nytab[i] = filmtab[i];
			}
			filmtab = nytab;
		}
	}

}
