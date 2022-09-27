package HashMapSjølv;

public class Kunde {

	private int kundenr;
	private String kundenavn;
	private int antallbestillinger;
	
	public Kunde(int kundenr, String kundenavn, int antallbestillinger){
		this.kundenr=kundenr;
		this.kundenavn=kundenavn;
		this.antallbestillinger=antallbestillinger;
	}

	public int getKundenr() {
		return kundenr;
	}

	public void setKundenr(int kundenr) {
		this.kundenr = kundenr;
	}

	public String getKundenavn() {
		return kundenavn;
	}

	public void setKundenavn(String kundenavn) {
		this.kundenavn = kundenavn;
	}

	public int getAntallbestillinger() {
		return antallbestillinger;
	}

	public void setAntallbestillinger(int antallbestillinger) {
		this.antallbestillinger = antallbestillinger;
	}
	
	public String toString() {
		String str = kundenr + ", " + kundenavn + ", " + antallbestillinger;
		return str;
	}
	
}
