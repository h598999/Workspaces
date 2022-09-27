package no.hvl.dat102;
import no.hvl.dat102.adt.FilmarkivADT;
public class Filmarkiv implements FilmarkivADT{
	
	private Film[] filmtab;
	private int antall;
	
	public Filmarkiv(int størrelse) {
		filmtab = new Film[størrelse];
		antall = 0;
	}
	
	
	

	@Override
	public Film visFilm(int nr) {
		Film film = new Film();
		boolean funnet = false;
		int i = 0;
		while (i<antall&&!funnet) {
			if (filmtab[i].getFilmnr()==nr) {
				film = filmtab[i];
				funnet = true;
			} else
				i++;
		}
		if (funnet)
			return film;
		else {
			System.out.println("Filmen finnes ikkje");
			return null;}
		
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
		boolean funnet = false;
		boolean slettet = false;
		int i = 0;
		while (i<antall&&!funnet) {
			if (filmtab[i].getFilmnr()==filmnr){
				funnetindeks = i;
				funnet = true;
			} else 
				i++;
		}
		if (funnet) {
			filmtab[funnetindeks] = filmtab[antall];
			antall--;
			slettet = true;
		}
		return slettet;
		}

	@Override
	public Film[] soekTittel(String delstreng) {
		int nyantall=0;
		Film[] titteltab = new Film[antall];
		for (int i =0; i<antall; i++) {
			if (filmtab[i].getTittel().contains(delstreng)) {
				titteltab[nyantall] = filmtab[i];
				nyantall++;
			}
		}
		Film[] returntab = trimTab(titteltab, nyantall);
		return returntab;
	}

	@Override
	public int antallsjanger(Sjanger sjanger) {
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
	
	public void utvid() {
		if (filmtab.length<=antall) {
			Film[] nyfilmtab = new Film[antall*2];
			for (int i = 0; i<antall; i++) {
				nyfilmtab[i] = filmtab[i];
			}
			
			filmtab = nyfilmtab;
		}
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		Film[] nytab = new Film[n];
		int i = 0;
		while(i<n) {
			nytab[i] = tab[i];
			i++;
		}
		return nytab;
	}
	
	public Film[] getTab() {
		return filmtab;
	}
	

}
