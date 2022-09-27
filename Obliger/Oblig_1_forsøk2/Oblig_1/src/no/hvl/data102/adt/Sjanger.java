package no.hvl.data102.adt;

public enum Sjanger {
	ACTION, SKREKK, DRAMA, History, SCIFI;

	//Gir antall enum-objekter dvs. antall sjangre
	
	public int getAntallsjangere() {
		int lengde = Sjanger.values().length;
		return lengde;
	}
	
	public Sjanger[] getSjangre() {
		Sjanger[] sjangtab = Sjanger.values();
		return sjangtab;
	}
	
	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		for (Sjanger sj: Sjanger.values()) {
			if(sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		
		return sjang;
	}
	
}
