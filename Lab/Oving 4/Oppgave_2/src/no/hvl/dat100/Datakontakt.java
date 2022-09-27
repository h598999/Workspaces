package no.hvl.dat100;

import no.hvl.dat102.ADT.DataKontaktADT;

public class Datakontakt implements DataKontaktADT {
	private static final int STANDARD_VALUE = 100;
	private Medlem[] medlemmer = new Medlem[STANDARD_VALUE];
	private int antall;
	
	public Datakontakt() {
		antall = 0;
	}
	
	@Override
	public void leggtil(Medlem medlem2) {
		utvid();
		medlemmer[antall] = medlem2;
		antall++;
	}

	@Override
	public int finnMedlemsIndeks(String medlemsnavn) {
		int funnetindeks = -1;
		int i = 0;
		while(i<antall&&funnetindeks<0) {
			if (medlemmer[i].getNavn()==medlemsnavn) {
				funnetindeks = i;
			}
			i++;
		}
		return funnetindeks;
	}

	public Medlem[] getMedlemmer() {
		return medlemmer;
	}

	public void setMedlemmer(Medlem[] medlemmer) {
		this.medlemmer = medlemmer;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	@Override
	public int finnPartnerFor(String medlemsnavn) {
		int funnetindeks = -1;
		int i = 0;
		int medlemsindeks = finnMedlemsIndeks(medlemsnavn);
		try {
		while (i<antall&&funnetindeks<0) {
			if (medlemmer[i].passerTil(medlemmer[medlemsindeks])) {
				medlemmer[i].setStatusIndeks(medlemsindeks);
				medlemmer[medlemsindeks].setStatusIndeks(i);
				funnetindeks = i;
			}
			i++;
		}
		return funnetindeks;
		} catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		}
	}

	@Override
	public void tilbakestillStatusIndeks(String medlemsnavn) {
		try  {
		medlemmer[medlemmer[finnMedlemsIndeks(medlemsnavn)].getStatusIndeks()].setStatusIndeks(-1);	
		medlemmer[finnMedlemsIndeks(medlemsnavn)].setStatusIndeks(-1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Medlemmet finnes ikkje i samlingen eller har ingen partner");
		}
		
			
	}
	
	private void utvid() {
		if (antall==medlemmer.length-1) {
			Medlem[] temp = new Medlem[antall*2];
			for (int i = 0; i<antall; i++) {
				temp[i] = medlemmer[i];
			}
			medlemmer = temp;
		}
	}

}
