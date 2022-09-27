package Entiteter;

import java.util.ArrayList;
import java.util.List;

public class Kjøleskap {
	
	private String navn;
	private List<Vare> varer;
	private int antall;
	
	public Kjøleskap(String navn) {
		this.varer = new ArrayList<Vare>();
		antall = 0;
	}
	
	public void leggTil(Vare vare) {
		if (inneholder(vare)) {
			vare.setAntall(vare.getAntall()+1);
			antall++;
		} else {
			varer.add(vare);
			antall++;
		}
	}
	
	public void fjern(Vare vare) {
		if (inneholder(vare)) {
			if (vare.getAntall())
		}
	}
	
	public boolean inneholder(Vare vare) {
		return varer.contains(vare);
	}
	

}
