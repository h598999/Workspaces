package no.hvl.dat100;

public class Hobby {
	
	private String hobbyNavn;
	public Hobby(String hobby) {
		hobbyNavn = hobby;
	}
	
	public String toString() {
		String str = "<" + hobbyNavn + ">";
		return str;
	}

}
