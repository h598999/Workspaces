package no.hvl.dat102;
import no.hvl.dat102.Sjanger;

public class Film {
	
	private int filmnr;
	private String produsent;
	private String tittel;
	private int lansering;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int lansering, Sjanger sjanger, String filmselskap) {
		this.filmnr=filmnr;
		this.produsent=produsent;
		this.tittel=tittel;
		this.lansering=lansering;
		this.sjanger=sjanger;
		this.filmselskap=filmselskap;
		
	}
	
	public boolean equals(Film film) {
		if (film.getFilmnr()==filmnr)
			return true;
			else
				return false;
	}
	@Override
	public String toString() {
		String str = filmnr + ", "  + produsent + ", " + tittel + ", " + lansering + sjanger.toString(getSjanger()) + filmselskap;
		return str;
	}
	
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
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
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	

	
	

}
