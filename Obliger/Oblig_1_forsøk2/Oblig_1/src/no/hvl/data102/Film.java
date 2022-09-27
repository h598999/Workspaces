package no.hvl.data102;

import no.hvl.data102.adt.Sjanger;

public class Film {
	private int filmnr;
	private String produsent;
	private String tittel;
	private int lansering;
	private Sjanger sjanger;
	private String Filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int lansering, Sjanger sjanger, String filmselskap) {
		this.filmnr=filmnr;
		this.produsent=produsent;
		this.tittel=tittel;
		this.lansering=lansering;
		this.sjanger=sjanger;
		this.Filmselskap=filmselskap;
	}
	
	@Override
	public boolean equals(Object film) {
		if(!(film instanceof Film)) {
			return false;
		} else {
			Film f = (Film) film;
			if (f.getFilmnr()==filmnr)
				return true;
			else
				return false;
		}	
	}
	
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
	
	@Override
	public String toString() {
	String str = filmnr + ", " + produsent + ", " + tittel + ", " + lansering + ", " + sjanger.toString();
	return str;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLansering() {
		return lansering;
	}

	public void setLansering(int lansering) {
		this.lansering = lansering;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return Filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		Filmselskap = filmselskap;
	}

}
