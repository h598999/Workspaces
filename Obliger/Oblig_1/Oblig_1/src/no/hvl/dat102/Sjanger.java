package no.hvl.dat102;

public enum Sjanger{
	
	Skrekk,komedie,Action;
	
	//Gir antall enum-objekter dvs. antall sjangre
	public int lengde() {
		int lengde = Sjanger.values().length;
		return lengde;
	}
	
	//Gir en tabell av referanser til enum-objekter som er opprettet
	public Sjanger[] getSjangerTab() {
		Sjanger[] sjangtab = Sjanger.values();
		return sjangtab;
	}
	
	public String toString(Sjanger sjanger) {
		String string = sjanger.toString();
		return string;
	}
	
}
