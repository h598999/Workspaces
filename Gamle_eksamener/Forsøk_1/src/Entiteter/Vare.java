package Entiteter;

public class Vare {
	
	private int EAN;
	private String navn;
	private Kategori kategori;
	private int antall;
	
	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public Vare(int EAN, String navn, Kategori kategori) {
		this.EAN = EAN;
		this.navn = navn;
		this.kategori = kategori;
	}

	public int getEAN() {
		return EAN;
	}

	public void setEAN(int eAN) {
		EAN = eAN;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

}
