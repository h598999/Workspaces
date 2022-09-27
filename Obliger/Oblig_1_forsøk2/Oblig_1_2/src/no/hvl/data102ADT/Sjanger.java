package no.hvl.data102ADT;

public enum Sjanger {
	ACTION, SKREKK, SCI_FI, HISTORIE, DRAMA;
	
	public Sjanger tilSjanger(String txt) {
		String s = txt;
		Sjanger sjanger = Sjanger.valueOf(s);
		return sjanger;
	}
}
