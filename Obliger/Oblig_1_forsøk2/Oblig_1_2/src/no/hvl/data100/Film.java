package no.hvl.data100;

import no.hvl.data102ADT.Sjanger;

public class Film {
	
	private int filmnr;
	private String produsent;
	private String tittel;
	private int Lanseringår;
	private Sjanger sjanger;
	private String Filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int Lanseringår, Sjanger sjanger, String filmselskap) {
		this.filmnr=filmnr;
		this.produsent=produsent;
		this.tittel=tittel;
		this.Lanseringår=Lanseringår;
		this.sjanger=sjanger;
		this.Filmselskap=filmselskap;
	}
	
	@Override
	public boolean equals(Object film) {
		Film nyfilm = (Film)film;
		if(nyfilm.getFilmnr()==filmnr)
			return true;
		else
			return false;
	}
	
	@Override
	public  int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
		
	}
	
	@Override
	public String toString() {
	String str = filmnr + ", " + produsent + ", " + tittel + ", " + Lanseringår + ", " + sjanger.toString();
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

	public int getLanseringår() {
		return Lanseringår;
	}

	public void setLanseringår(int lanseringår) {
		Lanseringår = lanseringår;
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
