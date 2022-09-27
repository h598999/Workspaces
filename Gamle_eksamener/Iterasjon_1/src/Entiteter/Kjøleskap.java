package Entiteter;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import ADT.Kj�leskapADT;
import JPA.VareGetter;

public class Kj�leskap implements Kj�leskapADT{

	private HashMap<Vare, Integer> varer = new HashMap<Vare, Integer>();
	
	public Kj�leskap() {
		
	}
	
	@Override
	public void leggTil(int id) throws IOException, InterruptedException  {
		Vare vare = VareGetter.getVare(id);
		if (inneholder(vare)) {
			int forrigevalue = varer.get(vare);
			varer.put(vare, forrigevalue+1);
		} else {
			varer.put(vare, 1);
		}
		
	}

	@Override
	public boolean fjern(int id) throws IOException, InterruptedException {
		Vare vare = VareGetter.getVare(id);
		if (!inneholder(vare))
			return false;
		else if (varer.get(vare)==1) {
			varer.remove(vare);
			return true;
			
		}else {
			int forrigeValue = varer.get(vare);
			varer.put(vare, forrigeValue-1);
			return true;
		}
	}

	@Override
	public int fjernFlere(int id, int antall) throws IOException, InterruptedException  {
		boolean finnes = true;
		int antallfjernet = 0;
		while(finnes) {
			finnes = fjern(id);
			if (finnes)
			antallfjernet++;
		}
		return antallfjernet;
		
	}

	@Override
	public Set<Vare> getAlle() {
		Set<Vare> alle = varer.keySet();
		return alle;
	}

	@Override
	public void redigerAntall(Vare vare, int antall) {
		if (!inneholder(vare))
			return;
		varer.put(vare, antall);
		
	}
	
	public int getAntallAvVare(int id) throws IOException, InterruptedException {
		Vare vare = VareGetter.getVare(id);
		return varer.get(vare);
		
	}
	
	public boolean inneholder(Vare vare)  {
		return varer.containsKey(vare);
	}

}
