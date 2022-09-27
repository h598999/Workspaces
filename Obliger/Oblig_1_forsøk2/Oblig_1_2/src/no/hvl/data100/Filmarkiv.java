package no.hvl.data100;

import no.hvl.data102ADT.FilmarkivADT;
import no.hvl.data102ADT.Sjanger;

public class Filmarkiv implements FilmarkivADT{
	
	private Film[] filmtab;
	private int størrelse;
	private int antall;
	
	public Filmarkiv(int størrelse) {
		this.størrelse=størrelse;
		filmtab = new Film[størrelse];
		antall=0;
	}

	@Override
	public Film finnFilm(int nr) {
		int i = 0;
		boolean funnet = false;
		while (i<antall&&!funnet) {
			if (filmtab[i].getFilmnr()==nr) {
				funnet = true;
			} else {
				i++;
			}
		}
		if (funnet)
		return filmtab[i];
		else
			return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		utvid();
		filmtab[antall] = nyFilm;
		antall++;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		int funnetindeks = -1;
		boolean slettet = false;
		int i = 0;
		while(i<antall&&!slettet) {
			if (filmtab[i].getFilmnr()==filmnr) {
				funnetindeks = 1;
				slettet = true;
			} else 
				i++;
		}
		if (slettet) {
			filmtab[funnetindeks] = filmtab[antall-1];
			filmtab[antall-1] = null;
			antall--;
		}
		return slettet;
		
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film[] titteltab = new Film[antall];
		int antalltab = 0;
		for (int i = 0; i<antall; i++) {
			if (filmtab[i].getTittel().contains(delstreng)) {
				titteltab[antalltab]=filmtab[i];
				antalltab++;
			}
		}
		return trimTab(titteltab,antalltab);
		
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antallsjanger = 0;
		for (int i = 0; i<antall; i++) {
			if (filmtab[i].getSjanger()==sjanger)
				antallsjanger++;
		}
		return antallsjanger;
		
	}

	@Override
	public int antall() {
		return antall;
	}
	private void utvid() {
		if (antall-1==størrelse) {
			størrelse = antall*2;
			Film[] nytab = new Film[størrelse];
			for (int i = 0; i<antall; i++) {
				nytab[i]=filmtab[i];
			}
			filmtab = nytab;
		}
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
